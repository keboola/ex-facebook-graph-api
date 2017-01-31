[![Build Status](https://travis-ci.org/keboola/ex-facebook-graph-api.svg?branch=master)](https://travis-ci.org/keboola/ex-facebook-graph-api)

[![Docker Repository on Quay](https://quay.io/repository/keboola/ex-facebook-graph-api/status "Docker Repository on Quay")](https://quay.io/repository/keboola/ex-facebook-graph-api)

## Sample Nested Queries
##### the whole fb feed - all page posts, its likes, comments, likes of the comments, subcomments, likes of the subcomments
```
{
  "id": 1,
  "name": "scrape",
  "type": "nested-query",
  "query": {
    "path": "feed",
    "fields": "caption,message,created_time,type,description,likes{link,name,username},comments{message,created_time,from,likes{link,name,username},comments{message,created_time,from,likes{link,name,username}}}",
    "ids": "<page_id>"
}
```
##### extract page [metrics](https://developers.facebook.com/docs/graph-api/reference/insights) `page_impressions`, `page_fans` and `page_engaged_users` for last 5 days

```
{
  "id": 2,
  "name": "page_insights",
  "type": "nested-query",
  "query": {
    "path": "",
    "fields": "insights.since(5 days ago).metric(page_impressions,page_fans,page_engaged_users)",
    "ids": "<page_id>"
  }
}
```
According to the last facebook graph api all insights metrics that are needed to extract must be explicitely listed in the query, i.e., there is no general get-all-metrics data query type of call.
##### extract posts [metrics](https://developers.facebook.com/docs/graph-api/reference/insights) `page_posts_impressions` and `post_impressions` for all posts:
Note day we are using `since(now)` specification of insights time to get the most recent values, otherwise it may paginate over small periods of time and consume lots of request to facebook api.
```
{
  "id": 3,
  "name": "posts_insights",
  "type": "nested-query",
  "query": {
    "path": "feed",
    "fields": "insights.since(now).metric(page_posts_impressions,post_impressions)",
    "ids": "<page_id>"
  }
}
```

You can try the examples above by calling Facebook Graph api directly in a http client(e.g. Postman) as follows:
`GET https://graph.facebook.com/<api_version>/<path>?fields=<fields>&ids=<ids>&access_token=<access_token>`
You can get access token in [Graph Api Explorer](https://developers.facebook.com/tools/explorer).
# Configuration
## Facebook Graph API
This extractor extracts data from facebook graph api:
https://developers.facebook.com/docs/graph-api/
. You can try it live here: https://developers.facebook.com/tools/explorer


### Nested Query

Lets say that in Facebook Graph Api every endpoint represents a node in a graph. Example of a node could be /me - ie user info, me/posts - ie posts of the current user. To get data from a particullar endpoint one can make typical REST api call GET `me/posts` or make a **nested** api call that basically allows to extract the whole subtree of a node. for example GET `me?fields=posts,comments,likes` extracts all posts comments and likes of an id(in this case it is me - current user).
For more info see Making Nested Queries in https://developers.facebook.com/docs/graph-api/using-graph-api#reading
#### Configuring nested query
In configuration under parameters there is an array of `queries`(see sample configuration). Each query besides obvious properties such as `id`, `name`, `type`(currently only nested-query type), `disabled` also contains object `query` with the following properties:
- `path` : enpoint url so the absolute url will be like graph.facebook.com/version/path. Typically it is endpoint **feed**. Can be an empty string if we want to start extracting from the "root" node that is the page itself.
- `fields`: fields parameter of the graph api nested-query
- `ids`: comma separated list of ids(typically page-ids) that will be prepended with path. It is also a parameter of graph api. If empty string than all ids from `accounts` object will be used. Can also be completely removed from the query.
- `limit` - size of one page(response). Default is 25, maximum 100. Useful when fb api returns error that the request is "too big" - in such case use smaller limit. This parameter also affects the total number of request made to fb api.
- `since` - relates to the *created_time* of **path** parameter i.e., if path is "posts" then it takes all posts with *created_time* since the specified date in **since** parameter. If path is empty then it does not have any effect. Can be specified relatively, e.g. 10 days ago.
- `until` - same as since above but specifies date until data with *created_time* date.


 The most important parameter is `fields` - tells what is going to extract. so here are few hints:
 - you can specify additional params of a node with dot e.g to specify since and limit params of posts: `posts.limit(100).since(2016-12-24){message,likes,comments{comments}}`
 - you can also specify date range using `since` or/and `until` that accepts unix timestamp values(in seconds) or date in format **yyy-mm-dd** or relative values: e.g. all posts posted in last 10 days `posts.since(10 days ago){message,likes,comments}`
 - relative date specification is parsed by this cool PHP function [strtotime](http://php.net/manual/en/function.strtotime.php)
 - if an object(e.g comments) does not have nesting specified it will extract some of its columns but once the nesting is specified e.g commens{likes} then one has to explicitely specify all its column in the nesting e.g. `comments{from,message,created_time,likes}`
 - for each row id is extracted autmatically and no need to be specified in the query
 - to extract all posts with its comments, subcomments,likes and sublikes the query would look like this:
 ```
 {
   "fields": "posts{message,story,created_time,likes,comments{from,message,created_time,comments,likes}}",
   "path": "",
   "ids": "<some_page_id>"

 }
 ```

### Sample configuration:
Note that you can specify facebook api version via `api-version` parameter. Default is **v2.8**.
```
{
  "storage": {},
  "parameters": {
    "accounts": {
      "<pageId1>": {
        "id": "<pagId1>",
        "name": "my fancy page",
        "category": "entertainment"
      },
      "<pageId2>": {
        "id": "<pageId2>",
        "name": "keboola",
        "category": "software"
      }
    },
    "api-version": "v2.8",
    "queries": [
      {
        "id": 1,
        "name": "qname",
        "type": "nested-query",
        "query": {
          "path": "feed",
          "fields": "message,story,likes,comments{from}",
          "ids": "<pagId1>,<pageId2>"
        }
      }
    ]
  },
  "authorization": {
    "oauth_api": {
      "id": "{OAUTH_API_ID}"
      }
    }
  }
```

## Result tables description
For each query extractor generates a number of tables prefixed with query name. Each table represents one type of node so typically tables would be `queryname_post`, `queryname_likes`, `queryname_comments` `queryname_insights`. Same nested structure type will be in the same table. So for example comments and subcomments will be in the same table `comments`. Every table has different columns but the following columns will always be the same:
- **id**: unique id of the row, some tables may not have it, e.g. ads insights
- **parent_id**: the parent node id, e.g. comments parent-id refers to a post row id
- **ex_account_id**: top root source under the extraction is beign done, it could be a page id or ads account id and it is specified in config under `ids` property.
- **fb_graph_node**: describes the row "vertical position" of the resulting tree. e.g for comments it will be `page_feed_comments`, for subcomments(i.e. comments of comments) it will be `page_feed_comments_comments` etc
- insights data objects will be flatten into columns `key1`, `key2` and `value` along with columns metric name, title, description etc


# Authorization
Register component api to oauth-bundle-v2 by calling POST to https://syrup.keboola.com/oauth-v2/manage with manage-token, storage-api token in the header and body:

```
{
  "component_id": "keboola.ex-facebook-insights-v2",
  "friendly_name": "Facebook Insights",
  "app_key": "xxx",
  "app_secret": "xxx",
  "oauth_version": "facebook",
  "permissions": "manage_pages,public_profile,read_insights,pages_show_list",
  "graph_api_version": "v2.8"

}
```

more info about authorization registration here: https://github.com/keboola/oauth-v2-bundle


# Development
The app is written in Clojure(1.8), evaluated and build via [Boot-clj](https://github.com/boot-clj/boot#install) which requires [Java Development Kit](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html).
To try the app locally check target commands in the [Makefile](Makefile)
For example to build and run the app locally type from the repo root:

`make build-jar run-jar`
