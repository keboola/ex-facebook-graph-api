[![Build Status](https://travis-ci.org/keboola/ex-facebook-graph-api.svg?branch=master)](https://travis-ci.org/keboola/ex-facebook-graph-api)

# Configuration
## Facebook Graph API
This extractor extracts data from facebook graph api:
https://developers.facebook.com/docs/graph-api/

### Nested Query

Lets say that in Facebook Graph Api every endpoint represents a node in a graph. Example of a node could be /me - ie user info, me/posts - ie posts of the current user. To get data from a particullar endpoint one can make typical REST api call GET `me/posts` or make a **nested** api call that basically allows to extract the whole subtree of a node. for example GET `me?fields=posts,comments,likes` extracts all posts comments and likes of an id(in this case it is me - current user).
For more info see Making Nested Queries in https://developers.facebook.com/docs/graph-api/using-graph-api#reading
#### Configuring nested query
In configuration under parameters there is an array of `queries`(see sample configuration). Each query besides obvious properties `name`, `type`(currently only nested-query type), `api-version`(fb graph api version) contains object `query` with the following properties:
- `path` : enpoint url so the absolute url will be like graph.facebook.com/version/path. Typically this is an empty string as we want to start extracting from the "root" node.
- `fields`: fields parameter of the graph api nested-request
- `ids`: comma separated list of ids(typically page-ids) that will be prepended with path. It is also a parameter of graph api.
- `ids-title`: describes ids so we know what is the name of root node being extracted(typically set to "page")

 The most important parameter is `fields` - tells what is going to extract. so here are few hints:
 - you can specify additional params of a node with dot e.g to specify since and limit params of posts: `posts.limit(100).since(1477958400){message,likes,comments{comments}}`
 - if an object(e.g comments) does not have nesting specified it will extract all its columns but once the nesting is specified e.g commens{likes} then one has to explicitely specify all its column in the nesting e.g. `comments{from,message,created_time,likes}`
 - for each row id is extracted autmatically and no need to be specified in the query
 - to extract all posts with its comments, subcomments,likes and sublikes the query would look like this:
 ```
 {
   "fields": "posts{message,story,created_time,likes,comments{from,message,created_time,comments,likes}}",
   "path": "",
   ids:"some_page_id",
   ids-title: "page"
 }
 ```

### Sample configuration:
```
{
  "storage": {},
  "parameters": {
    "accounts": {
      "<pagId1>": {
        "id": "<pagId1>",
        "name": "hudebny sh"
      },
      "<pageId2>": {
        "id": "<pageId2>",
        "name": "keboola"
      }
    },

    "queries": [
      {
        "name": "qname",
        "type": "nested-query",
        "api-version": "v2.8",
        "query": {
          "path": "",
          "fields": "posts{message,story,likes,comments{from}}",
          "ids": "<pagId1>,<pageId2>..",
          "ids-title": "page"
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
For each query extractor generates a number of tables prefixed with query name. Each table represents one type of node so typically tables would be `queryname_post`, `queryname_likes`, `queryname_comments`. Same nested structure type will be in the same table. So for example comments and subcomments will be in the same table `comments`. Every table has different columns but the following columns will always be the same:
- **id**: unique id of the row
- **parent-id**: the parent node id, e.g. comments parent-id refers to a post row id
- **parent-type**: describes parent-id and its the "vertical position" of the resulting tree. e.g for comments it will be `page_posts_comments`, for subcomments(i.e. comments of comments) it will be `page_posts_comments_comments` etc


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
