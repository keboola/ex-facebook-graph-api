(ns keboola.regression-tests.adsinsights.apicalls)
(def recorded 
{
{:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMDEwNjQyMjI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2146,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.01,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "R4wwVXKvhYo9KynW1CUxowyimzj7Ry10WEwTPNnMM48h9JlKyJqegDL0TreJXV9DQU8uA/SVWG8kPO7n/DVOqw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"60af74782fa1ce4661f8a052187e1323f4f7d213\"",
  "x-fb-trace-id" "HM/Rzbh4m6C",
  "Date" "Sat, 15 Apr 2017 15:11:08 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6020106421470\"},{\"id\":\"6020106415470\"},{\"id\":\"6019995145670\"},{\"id\":\"6019995145470\"},{\"id\":\"6019995145270\"},{\"id\":\"6019973185670\"},{\"id\":\"6019973185470\"},{\"id\":\"6019973185870\"},{\"id\":\"6019815143870\"},{\"id\":\"6019815143670\"},{\"id\":\"6019815142870\"},{\"id\":\"6019815144470\"},{\"id\":\"6019815144270\"},{\"id\":\"6019815144670\"},{\"id\":\"6019815143070\"},{\"id\":\"6019815145470\"},{\"id\":\"6019815142470\"},{\"id\":\"6019815144070\"},{\"id\":\"6019815143470\"},{\"id\":\"6019815142670\"},{\"id\":\"6019751996470\"},{\"id\":\"6019751996270\"},{\"id\":\"6019751996670\"},{\"id\":\"6019681087470\"},{\"id\":\"6019681087270\"},{\"id\":\"6019681087670\"},{\"id\":\"6019661556070\"},{\"id\":\"6019661555870\"},{\"id\":\"6019661555670\"},{\"id\":\"6019644192270\"},{\"id\":\"6019644191870\"},{\"id\":\"6019644192070\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMDEwNjQyMTQ3MAZDZD\",\"after\":\"NjAxOTY0NDE5MjA3MAZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyMDEwNjQyMTQ3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMDEwNjQyMjI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMDU5MDMxMjI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2764,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "hH+S5bytKKu39NLhPfilPcqq0O1KI+7IOOdHxSubQF1llSs9tN3NpgZ0kseJDTx6+Q4AU3XQkN7IYBDa1xDBcA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"3409a00ac8836968cb1aee7bfafc3f3051e42e5a\"",
  "x-fb-trace-id" "DoxGVPXgsVc",
  "Date" "Sat, 15 Apr 2017 15:11:06 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6020590295070\"},{\"id\":\"6020590280470\"},{\"id\":\"6020590326070\"},{\"id\":\"6020590282270\"},{\"id\":\"6020590292870\"},{\"id\":\"6020590312070\"},{\"id\":\"6020590295270\"},{\"id\":\"6020590284870\"},{\"id\":\"6020590308070\"},{\"id\":\"6020590276870\"},{\"id\":\"6020492548070\"},{\"id\":\"6020492547870\"},{\"id\":\"6020492548270\"},{\"id\":\"6020492547670\"},{\"id\":\"6020492547470\"},{\"id\":\"6020492547270\"},{\"id\":\"6020469213270\"},{\"id\":\"6020469213470\"},{\"id\":\"6020469213070\"},{\"id\":\"6020445631670\"},{\"id\":\"6020445632070\"},{\"id\":\"6020416035070\"},{\"id\":\"6020416035270\"},{\"id\":\"6020416034870\"},{\"id\":\"6020445636270\"},{\"id\":\"6020445636470\"},{\"id\":\"6020445639470\"},{\"id\":\"6020445632870\"},{\"id\":\"6020445631870\"},{\"id\":\"6020416035470\"},{\"id\":\"6020416035870\"},{\"id\":\"6020416035670\"},{\"id\":\"6020411668870\"},{\"id\":\"6020411671070\"},{\"id\":\"6020411668670\"},{\"id\":\"6020411668470\"},{\"id\":\"6020354735670\"},{\"id\":\"6020354735470\"},{\"id\":\"6020354735870\"},{\"id\":\"6020293049270\"},{\"id\":\"6020293049070\"},{\"id\":\"6020293048670\"},{\"id\":\"6020293048870\"},{\"id\":\"6020293048470\"},{\"id\":\"6020293049470\"},{\"id\":\"6020269544670\"},{\"id\":\"6020269544470\"},{\"id\":\"6020269544270\"},{\"id\":\"6020106421070\"},{\"id\":\"6020106420870\"},{\"id\":\"6020106420670\"},{\"id\":\"6020106415670\"},{\"id\":\"6020106432470\"},{\"id\":\"6020106415270\"},{\"id\":\"6020106422270\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMDU5MDI5NTA3MAZDZD\",\"after\":\"NjAyMDEwNjQyMjI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMDEwNjQyMjI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyMDU5MDI5NTA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMDU5MDMxMjI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMDkxNzU1Njg3MAZDZD",
 :as :json}
(fn [req]{:request-time 1396,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "MACu7hEwXyIft1kpghO8bchnr1UWenyBkeZVndQCgqM4rWD0IXwDu5Jt2zViXftLo7U5qXUj3IyrppPuLzHXyg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"0a53ad8c6ae854f26e2b76caa7ed835f5d106205\"",
  "x-fb-trace-id" "AkXU6IjI0nh",
  "Date" "Sat, 15 Apr 2017 15:11:03 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6020917519270\"},{\"id\":\"6020917447670\"},{\"id\":\"6020917470070\"},{\"id\":\"6020917459070\"},{\"id\":\"6020917507870\"},{\"id\":\"6020917539870\"},{\"id\":\"6020917514670\"},{\"id\":\"6020917508070\"},{\"id\":\"6020917461070\"},{\"id\":\"6020917532070\"},{\"id\":\"6020917443270\"},{\"id\":\"6020917544670\"},{\"id\":\"6020916793070\"},{\"id\":\"6020916736070\"},{\"id\":\"6020916762670\"},{\"id\":\"6020916763470\"},{\"id\":\"6020916748270\"},{\"id\":\"6020698693070\"},{\"id\":\"6020698693670\"},{\"id\":\"6020698694470\"},{\"id\":\"6020663872470\"},{\"id\":\"6020470086870\"},{\"id\":\"6020470086470\"},{\"id\":\"6020470086270\"},{\"id\":\"6020470074870\"},{\"id\":\"6020470076270\"},{\"id\":\"6020470086670\"},{\"id\":\"6020470074470\"},{\"id\":\"6020470074070\"},{\"id\":\"6020470074670\"},{\"id\":\"6020470069270\"},{\"id\":\"6020470069070\"},{\"id\":\"6020470070670\"},{\"id\":\"6020664743670\"},{\"id\":\"6020664741270\"},{\"id\":\"6020664742270\"},{\"id\":\"6020663871670\"},{\"id\":\"6020663879070\"},{\"id\":\"6020663873270\"},{\"id\":\"6020606316070\"},{\"id\":\"6020606318470\"},{\"id\":\"6020606318070\"},{\"id\":\"6020606318270\"},{\"id\":\"6020606315270\"},{\"id\":\"6020606315470\"},{\"id\":\"6020590296870\"},{\"id\":\"6020590284670\"},{\"id\":\"6020590288070\"},{\"id\":\"6020590294070\"},{\"id\":\"6020590276670\"},{\"id\":\"6020590316870\"},{\"id\":\"6020590286470\"},{\"id\":\"6020590294870\"},{\"id\":\"6020590311670\"},{\"id\":\"6020590312270\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMDkxNzUxOTI3MAZDZD\",\"after\":\"NjAyMDU5MDMxMjI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMDU5MDMxMjI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyMDkxNzUxOTI3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMDkxNzU1Njg3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMTc4NTk4MjY3MAZDZD",
 :as :json}
(fn [req]{:request-time 1057,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "95q9DWW4DRCsfAuz6tfUwwiT+ekkqrWu+ohw8cHwR0ghBg9Jr6puIiV7cDKuhl/EeD1OgskZwNzijGvnHchGdg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"a75c1e06d251ab57e25336b8b9e4ab28edd51ba1\"",
  "x-fb-trace-id" "HFaH6yeA5Cl",
  "Date" "Sat, 15 Apr 2017 15:11:02 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6021754743470\"},{\"id\":\"6021754739870\"},{\"id\":\"6021754743670\"},{\"id\":\"6021754743870\"},{\"id\":\"6021127967070\"},{\"id\":\"6021127964070\"},{\"id\":\"6021127970470\"},{\"id\":\"6021127971670\"},{\"id\":\"6020917461670\"},{\"id\":\"6020917465870\"},{\"id\":\"6020917462470\"},{\"id\":\"6020916786270\"},{\"id\":\"6020916759070\"},{\"id\":\"6020916746470\"},{\"id\":\"6020916734870\"},{\"id\":\"6020917515870\"},{\"id\":\"6020917550670\"},{\"id\":\"6020917470270\"},{\"id\":\"6020917464870\"},{\"id\":\"6020917465670\"},{\"id\":\"6020917514070\"},{\"id\":\"6020916748470\"},{\"id\":\"6020917443070\"},{\"id\":\"6020917510070\"},{\"id\":\"6020917538070\"},{\"id\":\"6020917507270\"},{\"id\":\"6020917470470\"},{\"id\":\"6020917475670\"},{\"id\":\"6020917458270\"},{\"id\":\"6020917550470\"},{\"id\":\"6020917441670\"},{\"id\":\"6020916759670\"},{\"id\":\"6020916778870\"},{\"id\":\"6020916767870\"},{\"id\":\"6020916788670\"},{\"id\":\"6020916777270\"},{\"id\":\"6020916744470\"},{\"id\":\"6020916794870\"},{\"id\":\"6020916784070\"},{\"id\":\"6020916730270\"},{\"id\":\"6020916744870\"},{\"id\":\"6020916732870\"},{\"id\":\"6020916799270\"},{\"id\":\"6020917471070\"},{\"id\":\"6020916771270\"},{\"id\":\"6020917480870\"},{\"id\":\"6020917478270\"},{\"id\":\"6020917551870\"},{\"id\":\"6020916763870\"},{\"id\":\"6020917511870\"},{\"id\":\"6020917507670\"},{\"id\":\"6020917474470\"},{\"id\":\"6020917538670\"},{\"id\":\"6020917508270\"},{\"id\":\"6020917556870\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMTc1NDc0MzQ3MAZDZD\",\"after\":\"NjAyMDkxNzU1Njg3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMDkxNzU1Njg3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyMTc1NDc0MzQ3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMTc4NTk4MjY3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMjMwNjcxMTQ3MAZDZD",
 :as :json}
(fn [req]{:request-time 1039,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "d1VOIR3VanFSNCahX7t7esT6PP3/7t3VMYEf0uRLJV90NvvXVwHhUGM5PV/xj4KzZ9WEGkTV5/a7H7SHIlRwlw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"93a76bc9ac67b20d05e454be482500fe7142474b\"",
  "x-fb-trace-id" "G0OhNPy7YOD",
  "Date" "Sat, 15 Apr 2017 15:11:01 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6022306711670\"},{\"id\":\"6022306708670\"},{\"id\":\"6022238025470\"},{\"id\":\"6022238022870\"},{\"id\":\"6022238025670\"},{\"id\":\"6022234026070\"},{\"id\":\"6022234023470\"},{\"id\":\"6022234026270\"},{\"id\":\"6022151369470\"},{\"id\":\"6022151372070\"},{\"id\":\"6022151372270\"},{\"id\":\"6022121100470\"},{\"id\":\"6022121114270\"},{\"id\":\"6022121107270\"},{\"id\":\"6022121107470\"},{\"id\":\"6022121100870\"},{\"id\":\"6022121110070\"},{\"id\":\"6022121092270\"},{\"id\":\"6022121091070\"},{\"id\":\"6022121096470\"},{\"id\":\"6022090664670\"},{\"id\":\"6022090667470\"},{\"id\":\"6022090667270\"},{\"id\":\"6022044703470\"},{\"id\":\"6022044706270\"},{\"id\":\"6022044706470\"},{\"id\":\"6021988125070\"},{\"id\":\"6021988127870\"},{\"id\":\"6021988127670\"},{\"id\":\"6021974131470\"},{\"id\":\"6021974131670\"},{\"id\":\"6021974128670\"},{\"id\":\"6021965226870\"},{\"id\":\"6021965229670\"},{\"id\":\"6021965229470\"},{\"id\":\"6021839677870\"},{\"id\":\"6021839668470\"},{\"id\":\"6021839677670\"},{\"id\":\"6021839670270\"},{\"id\":\"6021839678070\"},{\"id\":\"6021839663870\"},{\"id\":\"6021839668270\"},{\"id\":\"6021839668070\"},{\"id\":\"6021786120070\"},{\"id\":\"6021786115070\"},{\"id\":\"6021786120270\"},{\"id\":\"6021786119870\"},{\"id\":\"6021786130270\"},{\"id\":\"6021786122670\"},{\"id\":\"6021786129870\"},{\"id\":\"6021786130070\"},{\"id\":\"6021785986070\"},{\"id\":\"6021785985870\"},{\"id\":\"6021785986270\"},{\"id\":\"6021785982670\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMjMwNjcxMTY3MAZDZD\",\"after\":\"NjAyMTc4NTk4MjY3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMTc4NTk4MjY3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyMjMwNjcxMTY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMjMwNjcxMTQ3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMjgyMDE2NDI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2027,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "CZ8p7pZ92TdVW87lCxhFgpFe2B0X6vf94DyXfTJP8b1NwbhTgdCvjtCGri8Xol4NdzwMgFVyJvhg+NykfwlSSg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"d97985077f949f3246e2e649d1365680ad19f3ef\"",
  "x-fb-trace-id" "Hros92J3/N2",
  "Date" "Sat, 15 Apr 2017 15:11:00 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6022820160870\"},{\"id\":\"6022819873870\"},{\"id\":\"6022819898070\"},{\"id\":\"6022819873670\"},{\"id\":\"6022819867470\"},{\"id\":\"6022819871070\"},{\"id\":\"6022819901470\"},{\"id\":\"6022819871270\"},{\"id\":\"6022819864870\"},{\"id\":\"6022819896870\"},{\"id\":\"6022819897070\"},{\"id\":\"6022819868270\"},{\"id\":\"6022819875870\"},{\"id\":\"6022819870670\"},{\"id\":\"6022819878270\"},{\"id\":\"6022819871670\"},{\"id\":\"6022819900470\"},{\"id\":\"6022819903870\"},{\"id\":\"6022819903670\"},{\"id\":\"6022818801270\"},{\"id\":\"6022818803670\"},{\"id\":\"6022818802470\"},{\"id\":\"6022818804270\"},{\"id\":\"6022736698270\"},{\"id\":\"6022736702070\"},{\"id\":\"6022736701470\"},{\"id\":\"6022736701670\"},{\"id\":\"6022694262270\"},{\"id\":\"6022694262470\"},{\"id\":\"6022694258270\"},{\"id\":\"6022694262670\"},{\"id\":\"6022569067870\"},{\"id\":\"6022569067670\"},{\"id\":\"6022569068070\"},{\"id\":\"6022569064070\"},{\"id\":\"6021919267670\"},{\"id\":\"6021919267270\"},{\"id\":\"6021919258870\"},{\"id\":\"6021919257270\"},{\"id\":\"6021919257070\"},{\"id\":\"6021919256470\"},{\"id\":\"6021919255470\"},{\"id\":\"6021919252470\"},{\"id\":\"6021919250470\"},{\"id\":\"6022421562870\"},{\"id\":\"6022421563270\"},{\"id\":\"6022421563070\"},{\"id\":\"6022421559470\"},{\"id\":\"6022306704870\"},{\"id\":\"6022306701470\"},{\"id\":\"6022306705070\"},{\"id\":\"6022315662470\"},{\"id\":\"6022315659070\"},{\"id\":\"6022315662270\"},{\"id\":\"6022306711470\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMjgyMDE2MDg3MAZDZD\",\"after\":\"NjAyMjMwNjcxMTQ3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMjMwNjcxMTQ3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyMjgyMDE2MDg3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMjgyMDE2NDI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyNDE0OTc0Mjg3MAZDZD",
 :as :json}
(fn [req]{:request-time 2455,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "DKcXM0Q52lmxH7Ct3nUEMNXyxGiyzYDQQXRNeFQF7T+kcp2MRZMfikj19qRFh0a1vzCLqfEzhZbgVc1v+GAupg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"4373fe153bdcbe46305452f8fcb201ed2350806a\"",
  "x-fb-trace-id" "GbMVEF1jTu1",
  "Date" "Sat, 15 Apr 2017 15:10:57 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6023826964070\"},{\"id\":\"6023826963470\"},{\"id\":\"6023826963870\"},{\"id\":\"6023826963670\"},{\"id\":\"6023497850270\"},{\"id\":\"6023497849870\"},{\"id\":\"6023497850070\"},{\"id\":\"6023497846470\"},{\"id\":\"6023321647470\"},{\"id\":\"6023321651670\"},{\"id\":\"6023321652070\"},{\"id\":\"6023321651870\"},{\"id\":\"6023221134070\"},{\"id\":\"6023221134270\"},{\"id\":\"6023221134470\"},{\"id\":\"6023221130870\"},{\"id\":\"6023187836670\"},{\"id\":\"6023187836270\"},{\"id\":\"6023187832270\"},{\"id\":\"6023188264670\"},{\"id\":\"6023188276670\"},{\"id\":\"6023188263670\"},{\"id\":\"6023188274070\"},{\"id\":\"6023188266070\"},{\"id\":\"6023188264870\"},{\"id\":\"6023187854070\"},{\"id\":\"6023187853670\"},{\"id\":\"6023187835270\"},{\"id\":\"6023187831870\"},{\"id\":\"6023187855270\"},{\"id\":\"6023187834270\"},{\"id\":\"6023044218070\"},{\"id\":\"6023044218470\"},{\"id\":\"6023044218270\"},{\"id\":\"6023044214670\"},{\"id\":\"6023001089470\"},{\"id\":\"6023011201470\"},{\"id\":\"6022922612870\"},{\"id\":\"6022922612470\"},{\"id\":\"6022922612670\"},{\"id\":\"6022922608870\"},{\"id\":\"6022893603070\"},{\"id\":\"6022893599270\"},{\"id\":\"6022893602670\"},{\"id\":\"6022893602470\"},{\"id\":\"6022861193870\"},{\"id\":\"6022861190270\"},{\"id\":\"6022861193470\"},{\"id\":\"6022861193670\"},{\"id\":\"6022819904070\"},{\"id\":\"6022819877070\"},{\"id\":\"6022819896470\"},{\"id\":\"6022820164670\"},{\"id\":\"6022820164470\"},{\"id\":\"6022820164270\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMzgyNjk2NDA3MAZDZD\",\"after\":\"NjAyMjgyMDE2NDI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyMjgyMDE2NDI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyMzgyNjk2NDA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyNDE0OTc0Mjg3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyNTU4OTk2OTY3MAZDZD",
 :as :json}
(fn [req]{:request-time 939,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "ClWRYxbBnRUVXNnBPBQ+6NtIGNyB9RKIJGK2Bxn9ljCL+YG9Zv+0vgePyL2N+dUS3HgHBHxDjPR3e5s2C8C08A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"46fdaa5938a3830f9ee37b20ba92045b902ecc86\"",
  "x-fb-trace-id" "GfYZaRKA3bU",
  "Date" "Sat, 15 Apr 2017 15:10:55 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6025589971470\"},{\"id\":\"6025592518070\"},{\"id\":\"6025592523270\"},{\"id\":\"6025589981270\"},{\"id\":\"6025589979870\"},{\"id\":\"6025589980070\"},{\"id\":\"6025589980270\"},{\"id\":\"6025562962670\"},{\"id\":\"6025563003870\"},{\"id\":\"6025562969470\"},{\"id\":\"6025562963670\"},{\"id\":\"6025563001470\"},{\"id\":\"6025562962270\"},{\"id\":\"6025562971870\"},{\"id\":\"6025562988470\"},{\"id\":\"6025562979070\"},{\"id\":\"6025562977270\"},{\"id\":\"6025562964670\"},{\"id\":\"6025562958270\"},{\"id\":\"6025562989270\"},{\"id\":\"6025562988670\"},{\"id\":\"6025562963070\"},{\"id\":\"6025562989070\"},{\"id\":\"6025562994870\"},{\"id\":\"6025563004070\"},{\"id\":\"6025562965270\"},{\"id\":\"6025562964470\"},{\"id\":\"6025560451270\"},{\"id\":\"6025560444470\"},{\"id\":\"6025560452870\"},{\"id\":\"6025560444270\"},{\"id\":\"6025200481470\"},{\"id\":\"6025200479070\"},{\"id\":\"6025200480070\"},{\"id\":\"6025200481870\"},{\"id\":\"6025161662470\"},{\"id\":\"6025161662070\"},{\"id\":\"6025161662270\"},{\"id\":\"6025161663070\"},{\"id\":\"6024565489070\"},{\"id\":\"6024565480070\"},{\"id\":\"6024565479270\"},{\"id\":\"6024565478670\"},{\"id\":\"6024565476670\"},{\"id\":\"6024565475670\"},{\"id\":\"6024565475870\"},{\"id\":\"6024565478470\"},{\"id\":\"6024149749070\"},{\"id\":\"6024149745870\"},{\"id\":\"6024149746070\"},{\"id\":\"6024149745670\"},{\"id\":\"6024149747870\"},{\"id\":\"6024149750670\"},{\"id\":\"6024149741670\"},{\"id\":\"6024149742870\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyNTU4OTk3MTQ3MAZDZD\",\"after\":\"NjAyNDE0OTc0Mjg3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyNDE0OTc0Mjg3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyNTU4OTk3MTQ3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyNTU4OTk2OTY3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyNjc5ODk2Mzg3MAZDZD",
 :as :json}
(fn [req]{:request-time 900,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "nwheRePqsfzt67Se4GMOPARFSGPhSxC7bkUmh+9oU9l9N9+EzKHH93zVGxPLvl4RNqA686VXm/tDM+kiHYuZWw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"b3ef81b2c9e6dd3ceae42de028827f522aa0b0b8\"",
  "x-fb-trace-id" "GlyTeZNVqR7",
  "Date" "Sat, 15 Apr 2017 15:10:54 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6026721259670\"},{\"id\":\"6026721259870\"},{\"id\":\"6026567475070\"},{\"id\":\"6026567467270\"},{\"id\":\"6026567474070\"},{\"id\":\"6026567468070\"},{\"id\":\"6026567466870\"},{\"id\":\"6026567467670\"},{\"id\":\"6026567183070\"},{\"id\":\"6026542988670\"},{\"id\":\"6026542987870\"},{\"id\":\"6026542990870\"},{\"id\":\"6026505665470\"},{\"id\":\"6026505671470\"},{\"id\":\"6026505665870\"},{\"id\":\"6026505665070\"},{\"id\":\"6026505664670\"},{\"id\":\"6026505671270\"},{\"id\":\"6026392088670\"},{\"id\":\"6026392090270\"},{\"id\":\"6026392091070\"},{\"id\":\"6026392088070\"},{\"id\":\"6026356625070\"},{\"id\":\"6026356627070\"},{\"id\":\"6026356625870\"},{\"id\":\"6026313661670\"},{\"id\":\"6025592516870\"},{\"id\":\"6025592516670\"},{\"id\":\"6026226382670\"},{\"id\":\"6026226381470\"},{\"id\":\"6026226380870\"},{\"id\":\"6026182837670\"},{\"id\":\"6026182837270\"},{\"id\":\"6026182836470\"},{\"id\":\"6025560445270\"},{\"id\":\"6025560452670\"},{\"id\":\"6026011243870\"},{\"id\":\"6026011249870\"},{\"id\":\"6026011243670\"},{\"id\":\"6026011247070\"},{\"id\":\"6025978796270\"},{\"id\":\"6025978795870\"},{\"id\":\"6025978796870\"},{\"id\":\"6025695657270\"},{\"id\":\"6025695656870\"},{\"id\":\"6025695657470\"},{\"id\":\"6025695657070\"},{\"id\":\"6025695664270\"},{\"id\":\"6025695662070\"},{\"id\":\"6025695665870\"},{\"id\":\"6025695664470\"},{\"id\":\"6025695513270\"},{\"id\":\"6025589971070\"},{\"id\":\"6025589968870\"},{\"id\":\"6025589969670\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyNjcyMTI1OTY3MAZDZD\",\"after\":\"NjAyNTU4OTk2OTY3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyNTU4OTk2OTY3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyNjcyMTI1OTY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyNjc5ODk2Mzg3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyODI3MDk4MTI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2532,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "5yV6awzMCWgRLPv52PjSzL8TH5GYaM7OWCje/TIb4U/9VL9YCQWH3iT/Bun/zAaBF/Fy2qba8Dls2rASSs1C3Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"1fbf94bedf6c5fcee3fac7c861e06f682c9d8e5a\"",
  "x-fb-trace-id" "EtNjDy6n1Li",
  "Date" "Sat, 15 Apr 2017 15:10:53 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6028270969670\"},{\"id\":\"6028236494070\"},{\"id\":\"6028236493870\"},{\"id\":\"6028236494870\"},{\"id\":\"6028084226270\"},{\"id\":\"6028084226870\"},{\"id\":\"6028084225070\"},{\"id\":\"6027882166670\"},{\"id\":\"6027882167270\"},{\"id\":\"6027882165870\"},{\"id\":\"6027882168070\"},{\"id\":\"6027882164270\"},{\"id\":\"6027882164470\"},{\"id\":\"6027678421870\"},{\"id\":\"6027678420670\"},{\"id\":\"6027678420470\"},{\"id\":\"6027570750670\"},{\"id\":\"6027570765270\"},{\"id\":\"6027570763670\"},{\"id\":\"6027570764670\"},{\"id\":\"6027570762870\"},{\"id\":\"6027570748670\"},{\"id\":\"6027570748870\"},{\"id\":\"6027570769670\"},{\"id\":\"6027570768470\"},{\"id\":\"6027378256070\"},{\"id\":\"6027378257670\"},{\"id\":\"6027378256870\"},{\"id\":\"6027371321670\"},{\"id\":\"6027243204670\"},{\"id\":\"6027205133670\"},{\"id\":\"6027205134670\"},{\"id\":\"6027205133870\"},{\"id\":\"6027159833670\"},{\"id\":\"6027159832070\"},{\"id\":\"6027159831870\"},{\"id\":\"6027036884870\"},{\"id\":\"6027036890670\"},{\"id\":\"6027036891670\"},{\"id\":\"6027036881870\"},{\"id\":\"6027036884270\"},{\"id\":\"6027036883670\"},{\"id\":\"6026976899070\"},{\"id\":\"6026976898670\"},{\"id\":\"6026976896870\"},{\"id\":\"6026904330870\"},{\"id\":\"6026904331670\"},{\"id\":\"6026904330070\"},{\"id\":\"6026891425270\"},{\"id\":\"6026891424070\"},{\"id\":\"6026891425070\"},{\"id\":\"6026798964070\"},{\"id\":\"6026798963070\"},{\"id\":\"6026798963670\"},{\"id\":\"6026798963870\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyODI3MDk2OTY3MAZDZD\",\"after\":\"NjAyNjc5ODk2Mzg3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyNjc5ODk2Mzg3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyODI3MDk2OTY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyODI3MDk4MTI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyOTM1MTE2NjI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2377,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "lZifNuJsNt2z8mygtlB1PMIiildUCXaJtSjujU2QHCn68g5FI4Oo7NTrCOTxEeoFlGgyDIplAVkmr8VS3hMuAg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"64d5d5a369f284e1d1a85780ddb224395663fad9\"",
  "x-fb-trace-id" "FVw7lIRXqLU",
  "Date" "Sat, 15 Apr 2017 15:10:51 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6029351166070\"},{\"id\":\"6029351165070\"},{\"id\":\"6029341877670\"},{\"id\":\"6029341877470\"},{\"id\":\"6029341877270\"},{\"id\":\"6029058319470\"},{\"id\":\"6029058319270\"},{\"id\":\"6029058318470\"},{\"id\":\"6029058319070\"},{\"id\":\"6028994842070\"},{\"id\":\"6028994851070\"},{\"id\":\"6028994852470\"},{\"id\":\"6028994841870\"},{\"id\":\"6028994845070\"},{\"id\":\"6028994843270\"},{\"id\":\"6028621724270\"},{\"id\":\"6028621725670\"},{\"id\":\"6028621724070\"},{\"id\":\"6028621721670\"},{\"id\":\"6028504433670\"},{\"id\":\"6028504432670\"},{\"id\":\"6028504426470\"},{\"id\":\"6028504432070\"},{\"id\":\"6028504431870\"},{\"id\":\"6028504423470\"},{\"id\":\"6028504426670\"},{\"id\":\"6028504424670\"},{\"id\":\"6028432871870\"},{\"id\":\"6028471868470\"},{\"id\":\"6028471866670\"},{\"id\":\"6028471867670\"},{\"id\":\"6028471874870\"},{\"id\":\"6028471872070\"},{\"id\":\"6028471873270\"},{\"id\":\"6028471875270\"},{\"id\":\"6028471872470\"},{\"id\":\"6028471867470\"},{\"id\":\"6026011252470\"},{\"id\":\"6026011243470\"},{\"id\":\"6028432646270\"},{\"id\":\"6028381975870\"},{\"id\":\"6028381986270\"},{\"id\":\"6028381979270\"},{\"id\":\"6028381982870\"},{\"id\":\"6028346492270\"},{\"id\":\"6028345830470\"},{\"id\":\"6028345834270\"},{\"id\":\"6028345835270\"},{\"id\":\"6028346492070\"},{\"id\":\"6028343841270\"},{\"id\":\"6028343841470\"},{\"id\":\"6028343841070\"},{\"id\":\"6028270941270\"},{\"id\":\"6028270977870\"},{\"id\":\"6028270981270\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyOTM1MTE2NjA3MAZDZD\",\"after\":\"NjAyODI3MDk4MTI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyODI3MDk4MTI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAyOTM1MTE2NjA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyOTM1MTE2NjI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzMTI0NTcwNDA3MAZDZD",
 :as :json}
(fn [req]{:request-time 1676,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.01,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "k9yilX81ETk1OPtj6qcjnl1KQOH8QJS8jrgAk7sVqMbdt8atucTbpZj+VXYoZaIweXo9lxzKnu86ZYjGlEV3bg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"c54800ba788014a6b9c022cc6f59703fae9ea16c\"",
  "x-fb-trace-id" "B40kAeqQilS",
  "Date" "Sat, 15 Apr 2017 15:10:48 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6031245703670\"},{\"id\":\"6030926475470\"},{\"id\":\"6030926475670\"},{\"id\":\"6030926475270\"},{\"id\":\"6030926475870\"},{\"id\":\"6030926470070\"},{\"id\":\"6030926470670\"},{\"id\":\"6030926470470\"},{\"id\":\"6030926470270\"},{\"id\":\"6030606696870\"},{\"id\":\"6030606697070\"},{\"id\":\"6030606697470\"},{\"id\":\"6030606697270\"},{\"id\":\"6030460709870\"},{\"id\":\"6030460710070\"},{\"id\":\"6030460709470\"},{\"id\":\"6030460709670\"},{\"id\":\"6030197295470\"},{\"id\":\"6030197296270\"},{\"id\":\"6030197296070\"},{\"id\":\"6030197296470\"},{\"id\":\"6030077617270\"},{\"id\":\"6030077616870\"},{\"id\":\"6030077616670\"},{\"id\":\"6030077616270\"},{\"id\":\"6030029673670\"},{\"id\":\"6030029673470\"},{\"id\":\"6029784111470\"},{\"id\":\"6029750541470\"},{\"id\":\"6029750534470\"},{\"id\":\"6029750532870\"},{\"id\":\"6029842978070\"},{\"id\":\"6029842978470\"},{\"id\":\"6029896997070\"},{\"id\":\"6029855094670\"},{\"id\":\"6029896996870\"},{\"id\":\"6029855805470\"},{\"id\":\"6029855806270\"},{\"id\":\"6029855805270\"},{\"id\":\"6029798211270\"},{\"id\":\"6029798209270\"},{\"id\":\"6029798219070\"},{\"id\":\"6029798212670\"},{\"id\":\"6029750530070\"},{\"id\":\"6028432641270\"},{\"id\":\"6029552277270\"},{\"id\":\"6029552278470\"},{\"id\":\"6029552278270\"},{\"id\":\"6029552276870\"},{\"id\":\"6029405815670\"},{\"id\":\"6029405815870\"},{\"id\":\"6029405815470\"},{\"id\":\"6029405816070\"},{\"id\":\"6029351166870\"},{\"id\":\"6029351166270\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzMTI0NTcwMzY3MAZDZD\",\"after\":\"NjAyOTM1MTE2NjI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAyOTM1MTE2NjI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAzMTI0NTcwMzY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzMTI0NTcwNDA3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzMjg2NzIwODI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2007,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.01,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "4vvsWVd4dhNicTeJL4W4L+z6W8ddsADKDXBiSuQaHcIGGUBaq5ccfPA9RerqeB1rmpAL0vcvIzWEcXnCeuZXVQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"33fe53444d32abd6837f2bce072547193cd355b8\"",
  "x-fb-trace-id" "HCqDqv14blC",
  "Date" "Sat, 15 Apr 2017 15:10:47 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6032867209670\"},{\"id\":\"6032867212270\"},{\"id\":\"6032749488470\"},{\"id\":\"6032749091270\"},{\"id\":\"6032749486670\"},{\"id\":\"6032749492070\"},{\"id\":\"6032749087070\"},{\"id\":\"6032749089870\"},{\"id\":\"6031491152470\"},{\"id\":\"6031491152070\"},{\"id\":\"6031491152270\"},{\"id\":\"6032439998670\"},{\"id\":\"6032439998470\"},{\"id\":\"6031717849870\"},{\"id\":\"6031717822470\"},{\"id\":\"6031717859470\"},{\"id\":\"6031717850470\"},{\"id\":\"6031718568270\"},{\"id\":\"6031718568070\"},{\"id\":\"6031718567470\"},{\"id\":\"6031717863270\"},{\"id\":\"6031717857270\"},{\"id\":\"6031717856270\"},{\"id\":\"6031717854070\"},{\"id\":\"6031717852270\"},{\"id\":\"6031717847070\"},{\"id\":\"6031717845870\"},{\"id\":\"6031717841270\"},{\"id\":\"6031717839870\"},{\"id\":\"6031717836270\"},{\"id\":\"6031717831670\"},{\"id\":\"6031717829670\"},{\"id\":\"6031717829070\"},{\"id\":\"6031717824070\"},{\"id\":\"6031717821470\"},{\"id\":\"6031717821270\"},{\"id\":\"6031672132270\"},{\"id\":\"6031672131870\"},{\"id\":\"6031672132070\"},{\"id\":\"6031596599870\"},{\"id\":\"6031596600670\"},{\"id\":\"6031596600470\"},{\"id\":\"6031489848070\"},{\"id\":\"6031489847870\"},{\"id\":\"6031534458470\"},{\"id\":\"6031534458270\"},{\"id\":\"6031534458070\"},{\"id\":\"6031490827870\"},{\"id\":\"6031490828270\"},{\"id\":\"6031490828070\"},{\"id\":\"6031475895070\"},{\"id\":\"6031475894870\"},{\"id\":\"6031475894470\"},{\"id\":\"6031245704870\"},{\"id\":\"6031245704070\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzMjg2NzIwOTY3MAZDZD\",\"after\":\"NjAzMTI0NTcwNDA3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzMTI0NTcwNDA3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAzMjg2NzIwOTY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzMjg2NzIwODI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzNTU5NDg5MDI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2583,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "tcXL12NRMr76ClPT3AMTGtGiPM0LDQuxP1/TrXN/aeocBGH1XOlyDB4Lc+NuU6MlnQQY2lRigRNV+aasAmz9Vg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"08b9ea8d148a27a9f9a05f8d83783a04f999d325\"",
  "x-fb-trace-id" "H7f95Hum7xa",
  "Date" "Sat, 15 Apr 2017 15:10:44 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6035594899470\"},{\"id\":\"6035594885870\"},{\"id\":\"6035594922870\"},{\"id\":\"6035594895270\"},{\"id\":\"6035594923070\"},{\"id\":\"6035594895470\"},{\"id\":\"6035594893270\"},{\"id\":\"6035594926470\"},{\"id\":\"6035594908670\"},{\"id\":\"6035594896270\"},{\"id\":\"6035594893470\"},{\"id\":\"6034785548070\"},{\"id\":\"6034785566270\"},{\"id\":\"6034785561470\"},{\"id\":\"6034785559270\"},{\"id\":\"6034785559070\"},{\"id\":\"6034785564270\"},{\"id\":\"6034785555670\"},{\"id\":\"6034785551870\"},{\"id\":\"6034785547870\"},{\"id\":\"6034785544070\"},{\"id\":\"6034785550470\"},{\"id\":\"6034785558070\"},{\"id\":\"6034423935670\"},{\"id\":\"6034423935470\"},{\"id\":\"6034300750870\"},{\"id\":\"6034300750670\"},{\"id\":\"6034265622670\"},{\"id\":\"6034265621870\"},{\"id\":\"6034265617270\"},{\"id\":\"6034265617070\"},{\"id\":\"6034265616870\"},{\"id\":\"6034265616670\"},{\"id\":\"6034265622870\"},{\"id\":\"6034265622270\"},{\"id\":\"6034264594270\"},{\"id\":\"6034264594070\"},{\"id\":\"6032911049470\"},{\"id\":\"6032911047470\"},{\"id\":\"6032911053070\"},{\"id\":\"6032908501070\"},{\"id\":\"6032908497870\"},{\"id\":\"6032908500070\"},{\"id\":\"6032908499470\"},{\"id\":\"6032908502870\"},{\"id\":\"6032908496470\"},{\"id\":\"6032908512670\"},{\"id\":\"6032908498070\"},{\"id\":\"6032908498270\"},{\"id\":\"6032906772670\"},{\"id\":\"6032906772870\"},{\"id\":\"6032906773670\"},{\"id\":\"6032906771870\"},{\"id\":\"6032861629270\"},{\"id\":\"6032867208270\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzNTU5NDg5OTQ3MAZDZD\",\"after\":\"NjAzMjg2NzIwODI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzMjg2NzIwODI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAzNTU5NDg5OTQ3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzNTU5NDg5MDI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzODcwMTQxNTA3MAZDZD",
 :as :json}
(fn [req]{:request-time 836,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "QnDU12wS0qAxRUzGfohIVFJdxvJ/vEv0NjEqodqmBBvRih5gHVCt3nMGEDlpAsRrlU3KCFiEvAgV3VZAiDZ84g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"a62b3c69acdc17f45b1ad1edbfd42cc01a35896b\"",
  "x-fb-trace-id" "DnaEzD6/KsL",
  "Date" "Sat, 15 Apr 2017 15:10:42 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6038701411470\"},{\"id\":\"6038701432670\"},{\"id\":\"6038701420070\"},{\"id\":\"6038701432270\"},{\"id\":\"6038701416270\"},{\"id\":\"6038701411070\"},{\"id\":\"6038701410470\"},{\"id\":\"6038414907070\"},{\"id\":\"6038414906270\"},{\"id\":\"6038388609270\"},{\"id\":\"6038414906070\"},{\"id\":\"6038414917470\"},{\"id\":\"6038414977270\"},{\"id\":\"6038388609470\"},{\"id\":\"6038388610270\"},{\"id\":\"6038414926470\"},{\"id\":\"6038414915470\"},{\"id\":\"6038414915270\"},{\"id\":\"6038388611870\"},{\"id\":\"6032111477070\"},{\"id\":\"6032111475870\"},{\"id\":\"6032111477870\"},{\"id\":\"6032111475270\"},{\"id\":\"6032232625870\"},{\"id\":\"6032232626870\"},{\"id\":\"6032232625670\"},{\"id\":\"6035787728070\"},{\"id\":\"6035561746270\"},{\"id\":\"6035562093270\"},{\"id\":\"6035561745270\"},{\"id\":\"6035562068270\"},{\"id\":\"6035562078270\"},{\"id\":\"6035561880870\"},{\"id\":\"6035562081670\"},{\"id\":\"6035562070270\"},{\"id\":\"6035562095870\"},{\"id\":\"6035562095470\"},{\"id\":\"6035562070070\"},{\"id\":\"6035562082870\"},{\"id\":\"6035562066670\"},{\"id\":\"6035562088270\"},{\"id\":\"6035561747670\"},{\"id\":\"6035562081870\"},{\"id\":\"6035562091670\"},{\"id\":\"6035560901270\"},{\"id\":\"6035560900870\"},{\"id\":\"6035560902270\"},{\"id\":\"6035560898270\"},{\"id\":\"6035594888270\"},{\"id\":\"6035594889270\"},{\"id\":\"6035594888470\"},{\"id\":\"6035594901870\"},{\"id\":\"6035594882270\"},{\"id\":\"6035594924470\"},{\"id\":\"6035594890270\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzODcwMTQxMTQ3MAZDZD\",\"after\":\"NjAzNTU5NDg5MDI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzNTU5NDg5MDI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjAzODcwMTQxMTQ3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzODcwMTQxNTA3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0Mzc0MzE1OTA3MAZDZD",
 :as :json}
(fn [req]{:request-time 874,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "VBVs0GRjsjEmopu/V9Q/b6urNVcv8XTlcZajPKX7jKd8BR6hW0XNeusVpNHtW/3/WQRLbc+Obok1/j8B/adGcA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"be206f8c7dab347df02c70ba392e2d5c4a22098a\"",
  "x-fb-trace-id" "F0yyHxeqSy0",
  "Date" "Sat, 15 Apr 2017 15:10:41 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6043742993870\"},{\"id\":\"6043634284670\"},{\"id\":\"6043634294670\"},{\"id\":\"6043634292470\"},{\"id\":\"6043633783870\"},{\"id\":\"6042976582870\"},{\"id\":\"6043383811070\"},{\"id\":\"6043266617070\"},{\"id\":\"6043374839670\"},{\"id\":\"6042973702870\"},{\"id\":\"6042912142470\"},{\"id\":\"6042911288670\"},{\"id\":\"6042911836670\"},{\"id\":\"6042912252470\"},{\"id\":\"6042063981870\"},{\"id\":\"6042150078670\"},{\"id\":\"6042063982070\"},{\"id\":\"6042063981670\"},{\"id\":\"6029842978870\"},{\"id\":\"6041832079070\"},{\"id\":\"6041831673470\"},{\"id\":\"6041825298270\"},{\"id\":\"6041825298070\"},{\"id\":\"6041825298670\"},{\"id\":\"6041825298470\"},{\"id\":\"6041622476270\"},{\"id\":\"6039832220270\"},{\"id\":\"6041242068070\"},{\"id\":\"6041242068270\"},{\"id\":\"6041242067670\"},{\"id\":\"6041002149470\"},{\"id\":\"6041004989470\"},{\"id\":\"6041004989270\"},{\"id\":\"6041004989070\"},{\"id\":\"6041004989670\"},{\"id\":\"6041002151470\"},{\"id\":\"6041002150870\"},{\"id\":\"6041002150270\"},{\"id\":\"6040759513470\"},{\"id\":\"6041003751270\"},{\"id\":\"6041003751070\"},{\"id\":\"6041003750870\"},{\"id\":\"6041003750670\"},{\"id\":\"6040026097870\"},{\"id\":\"6040025879670\"},{\"id\":\"6040025401870\"},{\"id\":\"6039120692670\"},{\"id\":\"6039120692470\"},{\"id\":\"6039120693070\"},{\"id\":\"6039120692870\"},{\"id\":\"6038701432470\"},{\"id\":\"6038701428870\"},{\"id\":\"6038701419670\"},{\"id\":\"6038701411270\"},{\"id\":\"6038701415070\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0Mzc0Mjk5Mzg3MAZDZD\",\"after\":\"NjAzODcwMTQxNTA3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjAzODcwMTQxNTA3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA0Mzc0Mjk5Mzg3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0Mzc0MzE1OTA3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0NDc5NjY1MDY3MAZDZD",
 :as :json}
(fn [req]{:request-time 1531,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "RVFrLOR6StW+2eGzbGSECBwFn+0Xc6mELFG4PpmjcNxANhJCmjsrqjOdBIvA5WbB0ktXkbbhKq27BfObe0ULxg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"6643e66e17e17cbd6bf376d8ea033e0a6616b502\"",
  "x-fb-trace-id" "AA2XWoPtg43",
  "Date" "Sat, 15 Apr 2017 15:10:40 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6044796077870\"},{\"id\":\"6044796078070\"},{\"id\":\"6044795597870\"},{\"id\":\"6044795358670\"},{\"id\":\"6044795358470\"},{\"id\":\"6043579322470\"},{\"id\":\"6044679889870\"},{\"id\":\"6044674202870\"},{\"id\":\"6044673905870\"},{\"id\":\"6044674186070\"},{\"id\":\"6044674142470\"},{\"id\":\"6044677762070\"},{\"id\":\"6044285811870\"},{\"id\":\"6044285812070\"},{\"id\":\"6044441666870\"},{\"id\":\"6044440409470\"},{\"id\":\"6044356602670\"},{\"id\":\"6044355848470\"},{\"id\":\"6044403883070\"},{\"id\":\"6044403883470\"},{\"id\":\"6044403883270\"},{\"id\":\"6044402742070\"},{\"id\":\"6044402809670\"},{\"id\":\"6044126008070\"},{\"id\":\"6044125342070\"},{\"id\":\"6044199224670\"},{\"id\":\"6044125593070\"},{\"id\":\"6044193412870\"},{\"id\":\"6044124556070\"},{\"id\":\"6044217378270\"},{\"id\":\"6044217484670\"},{\"id\":\"6044199442870\"},{\"id\":\"6044199442670\"},{\"id\":\"6044199376670\"},{\"id\":\"6044199376870\"},{\"id\":\"6044198834070\"},{\"id\":\"6044198834270\"},{\"id\":\"6044198598070\"},{\"id\":\"6044124960870\"},{\"id\":\"6044198360470\"},{\"id\":\"6044198250870\"},{\"id\":\"6043579602870\"},{\"id\":\"6043579602670\"},{\"id\":\"6043918197270\"},{\"id\":\"6043918197470\"},{\"id\":\"6042985583670\"},{\"id\":\"6043742721470\"},{\"id\":\"6043743158870\"},{\"id\":\"6043743031470\"},{\"id\":\"6043743159470\"},{\"id\":\"6043742939470\"},{\"id\":\"6043743158670\"},{\"id\":\"6043743058070\"},{\"id\":\"6043743159270\"},{\"id\":\"6043743159070\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NDc5NjA3Nzg3MAZDZD\",\"after\":\"NjA0Mzc0MzE1OTA3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0Mzc0MzE1OTA3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA0NDc5NjA3Nzg3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0NDc5NjY1MDY3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0NjMxMzkzMDI3MAZDZD",
 :as :json}
(fn [req]{:request-time 1840,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "WZU0b+xZh6aL21AwFwhWB5Dew7JGFvYnsNV7Hwm5gDETnZLhulLUDE7nYVXO06hvEUXXusnwSV1SEOw243XGKA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"18ac29f2f04b5cafa601e5c1fe3d3595d4b4c14c\"",
  "x-fb-trace-id" "HAEcD2Lq3PT",
  "Date" "Sat, 15 Apr 2017 15:10:39 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6046313957270\"},{\"id\":\"6045680514470\"},{\"id\":\"6045680514670\"},{\"id\":\"6045842878270\"},{\"id\":\"6045746798270\"},{\"id\":\"6045746777270\"},{\"id\":\"6045210420270\"},{\"id\":\"6045771928870\"},{\"id\":\"6045767050270\"},{\"id\":\"6045751859670\"},{\"id\":\"6045747389670\"},{\"id\":\"6045747383070\"},{\"id\":\"6045747374870\"},{\"id\":\"6045681325470\"},{\"id\":\"6045681337270\"},{\"id\":\"6045681332070\"},{\"id\":\"6045680170070\"},{\"id\":\"6045679833070\"},{\"id\":\"6045209959070\"},{\"id\":\"6045209282470\"},{\"id\":\"6045545880470\"},{\"id\":\"6045545949270\"},{\"id\":\"6045546000070\"},{\"id\":\"6045545943870\"},{\"id\":\"6045135613470\"},{\"id\":\"6045136083670\"},{\"id\":\"6045135613070\"},{\"id\":\"6045135612870\"},{\"id\":\"6045521578270\"},{\"id\":\"6045521578070\"},{\"id\":\"6045349735870\"},{\"id\":\"6044801305870\"},{\"id\":\"6045383943070\"},{\"id\":\"6045383767670\"},{\"id\":\"6045383767470\"},{\"id\":\"6045058565670\"},{\"id\":\"6045058966870\"},{\"id\":\"6045291087270\"},{\"id\":\"6045135614070\"},{\"id\":\"6045136809270\"},{\"id\":\"6045135613870\"},{\"id\":\"6045136743270\"},{\"id\":\"6044796982670\"},{\"id\":\"6045057503670\"},{\"id\":\"6045056840470\"},{\"id\":\"6045057503870\"},{\"id\":\"6045056840670\"},{\"id\":\"6044902378670\"},{\"id\":\"6044876930670\"},{\"id\":\"6044865190670\"},{\"id\":\"6044865224270\"},{\"id\":\"6044864399270\"},{\"id\":\"6044802526270\"},{\"id\":\"6044803088270\"},{\"id\":\"6044796650670\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NjMxMzk1NzI3MAZDZD\",\"after\":\"NjA0NDc5NjY1MDY3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0NDc5NjY1MDY3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA0NjMxMzk1NzI3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0NjMxMzkzMDI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0ODY3NzQyMTI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2147,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "LWwCsdE59fgglxSJ+mj2cAsClXKDAZSGCeKJwI+hiQd1ivngYHrJ7PCRoui2hFVWdPbs9rhk62S8jT1uAwqpWg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"1ac1a7c9e088e3303dcacaf88af5cfc91cc5d249\"",
  "x-fb-trace-id" "HCBRlwU6JC/",
  "Date" "Sat, 15 Apr 2017 15:10:37 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6048677374870\"},{\"id\":\"6049020070470\"},{\"id\":\"6048738787070\"},{\"id\":\"6048738598270\"},{\"id\":\"6048570468270\"},{\"id\":\"6048570468070\"},{\"id\":\"6048570467670\"},{\"id\":\"6048570367870\"},{\"id\":\"6048570392470\"},{\"id\":\"6048570306670\"},{\"id\":\"6048464931270\"},{\"id\":\"6048274915470\"},{\"id\":\"6048274571270\"},{\"id\":\"6048274821470\"},{\"id\":\"6048274593070\"},{\"id\":\"6048274373270\"},{\"id\":\"6048274938870\"},{\"id\":\"6048131599270\"},{\"id\":\"6047851034670\"},{\"id\":\"6047779613670\"},{\"id\":\"6047396789270\"},{\"id\":\"6047396789070\"},{\"id\":\"6047396787870\"},{\"id\":\"6047396788870\"},{\"id\":\"6047312221070\"},{\"id\":\"6047312221270\"},{\"id\":\"6046839961070\"},{\"id\":\"6046839804070\"},{\"id\":\"6047309002670\"},{\"id\":\"6047306968270\"},{\"id\":\"6047307064870\"},{\"id\":\"6046855572270\"},{\"id\":\"6046855086270\"},{\"id\":\"6046855100870\"},{\"id\":\"6046853487670\"},{\"id\":\"6046853488070\"},{\"id\":\"6046851850470\"},{\"id\":\"6046851820270\"},{\"id\":\"6046851320270\"},{\"id\":\"6046851320070\"},{\"id\":\"6046850967870\"},{\"id\":\"6046850729070\"},{\"id\":\"6046840157270\"},{\"id\":\"6046839888470\"},{\"id\":\"6046769881270\"},{\"id\":\"6046769880870\"},{\"id\":\"6046740679870\"},{\"id\":\"6046739954670\"},{\"id\":\"6046759447470\"},{\"id\":\"6046759075270\"},{\"id\":\"6046747845470\"},{\"id\":\"6046747845670\"},{\"id\":\"6046475506070\"},{\"id\":\"6046313892270\"},{\"id\":\"6046313930270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0ODY3NzM3NDg3MAZDZD\",\"after\":\"NjA0NjMxMzkzMDI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0NjMxMzkzMDI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA0ODY3NzM3NDg3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0ODY3NzQyMTI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0OTQ4MTgxMjQ3MAZDZD",
 :as :json}
(fn [req]{:request-time 921,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.01,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "U+LjOIA2c1YboH0O9LR/QKZeqInO5EXRJGYpFNYRi0k1i9ieM3HitasG68jEWhfs6mxB+LHq+5vBHggiMs5TEA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"e57d8676eced6a536bd1fd9040d16eecccb49270\"",
  "x-fb-trace-id" "CXk+FDno7z4",
  "Date" "Sat, 15 Apr 2017 15:10:35 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6049481812670\"},{\"id\":\"6049481811470\"},{\"id\":\"6050016085270\"},{\"id\":\"6050016215270\"},{\"id\":\"6050015454870\"},{\"id\":\"6049954409670\"},{\"id\":\"6049667878470\"},{\"id\":\"6049023794670\"},{\"id\":\"6049023797270\"},{\"id\":\"6049022800470\"},{\"id\":\"6049541695470\"},{\"id\":\"6049477921270\"},{\"id\":\"6049477922270\"},{\"id\":\"6049477922670\"},{\"id\":\"6049477922470\"},{\"id\":\"6049477244070\"},{\"id\":\"6049477243870\"},{\"id\":\"6048739393270\"},{\"id\":\"6048737663870\"},{\"id\":\"6049463476470\"},{\"id\":\"6048737663670\"},{\"id\":\"6049242129470\"},{\"id\":\"6049420924070\"},{\"id\":\"6049242128870\"},{\"id\":\"6049463476070\"},{\"id\":\"6048738030870\"},{\"id\":\"6048737937870\"},{\"id\":\"6048737963870\"},{\"id\":\"6048737819670\"},{\"id\":\"6048736771270\"},{\"id\":\"6048738086070\"},{\"id\":\"6048737449870\"},{\"id\":\"6048948496470\"},{\"id\":\"6048948473670\"},{\"id\":\"6048948529070\"},{\"id\":\"6048948528870\"},{\"id\":\"6048948522670\"},{\"id\":\"6048948496270\"},{\"id\":\"6048948522870\"},{\"id\":\"6048948473470\"},{\"id\":\"6048949325070\"},{\"id\":\"6048949325870\"},{\"id\":\"6048949325670\"},{\"id\":\"6048677459070\"},{\"id\":\"6048949325470\"},{\"id\":\"6048949324070\"},{\"id\":\"6048949325270\"},{\"id\":\"6048677838870\"},{\"id\":\"6048677815070\"},{\"id\":\"6048949326270\"},{\"id\":\"6048677375070\"},{\"id\":\"6048677814870\"},{\"id\":\"6048677838470\"},{\"id\":\"6048949326070\"},{\"id\":\"6048677421270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0OTQ4MTgxMjY3MAZDZD\",\"after\":\"NjA0ODY3NzQyMTI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0ODY3NzQyMTI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA0OTQ4MTgxMjY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0OTQ4MTgxMjQ3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0NTc0OTU1NTA3MAZDZD",
 :as :json}
(fn [req]{:request-time 2761,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "60yAspT66jPXRJ0qE2Aiar2hXPtQQX6RMflYUhqfWDLPvRWAuj8CzR5w8yOSQyBccB0igojL6a/7vtd7+NHyGg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"818b5efff878fda5e630709ad031344d3e696c39\"",
  "x-fb-trace-id" "DYxMrLa8HXc",
  "Date" "Sat, 15 Apr 2017 15:10:34 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6051392455670\"},{\"id\":\"6051392674470\"},{\"id\":\"6051392674270\"},{\"id\":\"6051392455470\"},{\"id\":\"6051391057870\"},{\"id\":\"6051392674670\"},{\"id\":\"6051392456470\"},{\"id\":\"6051392456070\"},{\"id\":\"6051392455870\"},{\"id\":\"6051391058070\"},{\"id\":\"6051391057670\"},{\"id\":\"6051389722870\"},{\"id\":\"6051392456670\"},{\"id\":\"6051392674070\"},{\"id\":\"6051391057470\"},{\"id\":\"6051392673270\"},{\"id\":\"6051390585870\"},{\"id\":\"6051392456870\"},{\"id\":\"6051392673470\"},{\"id\":\"6051392673870\"},{\"id\":\"6051391009070\"},{\"id\":\"6051392455270\"},{\"id\":\"6051392673670\"},{\"id\":\"6051390950070\"},{\"id\":\"6052496614870\"},{\"id\":\"6052496615270\"},{\"id\":\"6052496766270\"},{\"id\":\"6052496676470\"},{\"id\":\"6051325163070\"},{\"id\":\"6051325162870\"},{\"id\":\"6052346706070\"},{\"id\":\"6052346705470\"},{\"id\":\"6052346705670\"},{\"id\":\"6052284957070\"},{\"id\":\"6052285441270\"},{\"id\":\"6052285440670\"},{\"id\":\"6052284860270\"},{\"id\":\"6051782093270\"},{\"id\":\"6051782092870\"},{\"id\":\"6051207195870\"},{\"id\":\"6051207040070\"},{\"id\":\"6051206503470\"},{\"id\":\"6051207195670\"},{\"id\":\"6051207040270\"},{\"id\":\"6051207008070\"},{\"id\":\"6050849592270\"},{\"id\":\"6050791945670\"},{\"id\":\"6050584104270\"},{\"id\":\"6049537139070\"},{\"id\":\"6049537138870\"},{\"id\":\"6050387155670\"},{\"id\":\"6050018287870\"},{\"id\":\"6050018287270\"},{\"id\":\"6049481812870\"},{\"id\":\"6049481812470\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1MTM5MjQ1NTY3MAZDZD\",\"after\":\"NjA0OTQ4MTgxMjQ3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0OTQ4MTgxMjQ3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA1MTM5MjQ1NTY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0NTc0OTU1NTA3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1Mzc3Njk5NjQ3MAZDZD",
 :as :json}
(fn [req]{:request-time 2762,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "qdGTiiOUlKxKEKoZnqyL+jcs5GRH/bB6HjQ1sfU13mIbILz4XG5ksvM33U2Faetj1IyWk1ZqF6y4emL4eKe6yw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"db5413a1ce4b820210a668426ad91992d3d4e9ee\"",
  "x-fb-trace-id" "CrXFlglEBfB",
  "Date" "Sat, 15 Apr 2017 15:10:31 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6053506211470\"},{\"id\":\"6053506040670\"},{\"id\":\"6053506215470\"},{\"id\":\"6053438655870\"},{\"id\":\"6053526258670\"},{\"id\":\"6053526257670\"},{\"id\":\"6053526341670\"},{\"id\":\"6052285496470\"},{\"id\":\"6052285497270\"},{\"id\":\"6046656329270\"},{\"id\":\"6046560393470\"},{\"id\":\"6051275530870\"},{\"id\":\"6051273690670\"},{\"id\":\"6051273690270\"},{\"id\":\"6051273689870\"},{\"id\":\"6050186058470\"},{\"id\":\"6050051897270\"},{\"id\":\"6050051897070\"},{\"id\":\"6050051896670\"},{\"id\":\"6050051733670\"},{\"id\":\"6050051733070\"},{\"id\":\"6050051732870\"},{\"id\":\"6050020916670\"},{\"id\":\"6050020902670\"},{\"id\":\"6050020787070\"},{\"id\":\"6049677489070\"},{\"id\":\"6048780594870\"},{\"id\":\"6048779959870\"},{\"id\":\"6048770169270\"},{\"id\":\"6048770168870\"},{\"id\":\"6048275371070\"},{\"id\":\"6048275370870\"},{\"id\":\"6048275370670\"},{\"id\":\"6048275370470\"},{\"id\":\"6048275370270\"},{\"id\":\"6047082516470\"},{\"id\":\"6047081497270\"},{\"id\":\"6047080643670\"},{\"id\":\"6047079964470\"},{\"id\":\"6047042437470\"},{\"id\":\"6047042425670\"},{\"id\":\"6047042411870\"},{\"id\":\"6047042402070\"},{\"id\":\"6047042298070\"},{\"id\":\"6046828167870\"},{\"id\":\"6046827381670\"},{\"id\":\"6046827044070\"},{\"id\":\"6046656329470\"},{\"id\":\"6046558738270\"},{\"id\":\"6045818999870\"},{\"id\":\"6045754927470\"},{\"id\":\"6045754913470\"},{\"id\":\"6045749880670\"},{\"id\":\"6045749798870\"},{\"id\":\"6045749555070\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1MzUwNjIxMTQ3MAZDZD\",\"after\":\"NjA0NTc0OTU1NTA3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA0NTc0OTU1NTA3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA1MzUwNjIxMTQ3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1Mzc3Njk5NjQ3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1MTM5MzEwMTI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2456,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "1piR1VETY0i3OmqkAW7AVvriFkUIjkeJWTilm3aylg+O3hm3a4lq/KShe9kxQz7QH3p9FpyhDF6OIy0MFeAMBw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"d3f30c2b6f8078d51e037f0a1efef0cb03c523d1\"",
  "x-fb-trace-id" "Acvy0mIBFot",
  "Date" "Sat, 15 Apr 2017 15:10:28 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6051393100870\"},{\"id\":\"6051393100670\"},{\"id\":\"6051393100470\"},{\"id\":\"6051393100270\"},{\"id\":\"6051391686870\"},{\"id\":\"6051391687070\"},{\"id\":\"6051391686670\"},{\"id\":\"6051391686470\"},{\"id\":\"6051391686270\"},{\"id\":\"6051391686070\"},{\"id\":\"6051391685670\"},{\"id\":\"6051391685470\"},{\"id\":\"6055319065670\"},{\"id\":\"6055319064670\"},{\"id\":\"6055319065070\"},{\"id\":\"6055264272070\"},{\"id\":\"6055264271670\"},{\"id\":\"6054824863070\"},{\"id\":\"6055103762870\"},{\"id\":\"6055103839070\"},{\"id\":\"6055052845070\"},{\"id\":\"6055052401070\"},{\"id\":\"6055052845670\"},{\"id\":\"6055052844670\"},{\"id\":\"6055052401470\"},{\"id\":\"6055052400670\"},{\"id\":\"6054977942470\"},{\"id\":\"6054977014270\"},{\"id\":\"6053440199270\"},{\"id\":\"6054492606870\"},{\"id\":\"6054492607070\"},{\"id\":\"6054420205870\"},{\"id\":\"6054424136870\"},{\"id\":\"6054424134670\"},{\"id\":\"6054424137070\"},{\"id\":\"6054424134070\"},{\"id\":\"6054424137870\"},{\"id\":\"6054424134870\"},{\"id\":\"6054417560070\"},{\"id\":\"6054418543270\"},{\"id\":\"6054101193470\"},{\"id\":\"6054101193870\"},{\"id\":\"6054101193670\"},{\"id\":\"6054156232070\"},{\"id\":\"6054156232270\"},{\"id\":\"6054101969270\"},{\"id\":\"6054101968870\"},{\"id\":\"6054101969470\"},{\"id\":\"6054100443270\"},{\"id\":\"6054100443070\"},{\"id\":\"6054100442870\"},{\"id\":\"6053819490270\"},{\"id\":\"6053776996870\"},{\"id\":\"6053776996670\"},{\"id\":\"6053776996470\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1MTM5MzEwMDg3MAZDZD\",\"after\":\"NjA1Mzc3Njk5NjQ3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1Mzc3Njk5NjQ3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA1MTM5MzEwMDg3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1MTM5MzEwMTI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1NTkyODgzNjA3MAZDZD",
 :as :json}
(fn [req]{:request-time 3061,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.01,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "SpnQPLsOE6u5TRhN7Ir5QJ7iEGVmZEA3t8r9I/H0n0TSnhigeJCkrR6Ephd2fK5FN08kqaep3HE9Um79TAnfaQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"ac99d8ff03d6675dddbcbb47035b32f4101cb79b\"",
  "x-fb-trace-id" "HRVBFCO1u/Z",
  "Date" "Sat, 15 Apr 2017 15:10:26 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6055928474070\"},{\"id\":\"6055928472870\"},{\"id\":\"6055928475270\"},{\"id\":\"6055928216070\"},{\"id\":\"6055928216470\"},{\"id\":\"6055928215470\"},{\"id\":\"6055927696470\"},{\"id\":\"6055927694870\"},{\"id\":\"6055927989270\"},{\"id\":\"6055920196670\"},{\"id\":\"6055920196470\"},{\"id\":\"6055920195870\"},{\"id\":\"6054543737470\"},{\"id\":\"6054543738870\"},{\"id\":\"6054543738070\"},{\"id\":\"6054420782470\"},{\"id\":\"6054023008870\"},{\"id\":\"6054022857870\"},{\"id\":\"6054021367470\"},{\"id\":\"6055519601070\"},{\"id\":\"6055520637870\"},{\"id\":\"6055393324070\"},{\"id\":\"6055393325670\"},{\"id\":\"6055393324270\"},{\"id\":\"6055393323870\"},{\"id\":\"6055393325870\"},{\"id\":\"6055393324470\"},{\"id\":\"6055393323270\"},{\"id\":\"6055393325470\"},{\"id\":\"6055393324670\"},{\"id\":\"6055393323670\"},{\"id\":\"6055393322870\"},{\"id\":\"6055393322670\"},{\"id\":\"6055393323070\"},{\"id\":\"6055393328470\"},{\"id\":\"6055393323470\"},{\"id\":\"6055392958070\"},{\"id\":\"6055392997070\"},{\"id\":\"6055392971270\"},{\"id\":\"6055392970870\"},{\"id\":\"6055392924670\"},{\"id\":\"6055392924870\"},{\"id\":\"6055392944070\"},{\"id\":\"6055392997670\"},{\"id\":\"6055392958270\"},{\"id\":\"6055392943870\"},{\"id\":\"6055385073470\"},{\"id\":\"6055384774470\"},{\"id\":\"6055384819070\"},{\"id\":\"6055384750870\"},{\"id\":\"6055384252870\"},{\"id\":\"6051393101870\"},{\"id\":\"6051393101670\"},{\"id\":\"6051393101470\"},{\"id\":\"6051393101270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1NTkyODQ3NDA3MAZDZD\",\"after\":\"NjA1MTM5MzEwMTI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1MTM5MzEwMTI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA1NTkyODQ3NDA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1NTkyODgzNjA3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1ODI0Njg2MDI3MAZDZD",
 :as :json}
(fn [req]{:request-time 2107,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.02,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "/0uc0lb7zkhsuvSpmfdSdNNFRnb80jjFPTeg+I9szQnlPOPdbliFiwUUofjLntipsG+qx9IuUiNJ2whb4haiug==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"4da350d5ee0fa126f15a95788753941e397218d9\"",
  "x-fb-trace-id" "BzVFd44F8u3",
  "Date" "Sat, 15 Apr 2017 15:10:23 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6058246859870\"},{\"id\":\"6058246859470\"},{\"id\":\"6058242864670\"},{\"id\":\"6058242864470\"},{\"id\":\"6058242863670\"},{\"id\":\"6058242863470\"},{\"id\":\"6058242657270\"},{\"id\":\"6058242656670\"},{\"id\":\"6058242656470\"},{\"id\":\"6058242656270\"},{\"id\":\"6058242458070\"},{\"id\":\"6058242457870\"},{\"id\":\"6058242457070\"},{\"id\":\"6058241003870\"},{\"id\":\"6057691861670\"},{\"id\":\"6058242457670\"},{\"id\":\"6057567637870\"},{\"id\":\"6057567636870\"},{\"id\":\"6056816812470\"},{\"id\":\"6056675011670\"},{\"id\":\"6057567637670\"},{\"id\":\"6057567637470\"},{\"id\":\"6057567637070\"},{\"id\":\"6057567636270\"},{\"id\":\"6056675984870\"},{\"id\":\"6056335430470\"},{\"id\":\"6056334732270\"},{\"id\":\"6056279878670\"},{\"id\":\"6056278813270\"},{\"id\":\"6056277427070\"},{\"id\":\"6057511513070\"},{\"id\":\"6057281079870\"},{\"id\":\"6056822049670\"},{\"id\":\"6056083071270\"},{\"id\":\"6056082644670\"},{\"id\":\"6056085997870\"},{\"id\":\"6056085998270\"},{\"id\":\"6055928216270\"},{\"id\":\"6055928921670\"},{\"id\":\"6055928835670\"},{\"id\":\"6055929169070\"},{\"id\":\"6055928473270\"},{\"id\":\"6055928919870\"},{\"id\":\"6055927695870\"},{\"id\":\"6055929168870\"},{\"id\":\"6055929167870\"},{\"id\":\"6055928920070\"},{\"id\":\"6055928920670\"},{\"id\":\"6055928921070\"},{\"id\":\"6055928918470\"},{\"id\":\"6055928920870\"},{\"id\":\"6055928920470\"},{\"id\":\"6055928835070\"},{\"id\":\"6055928836270\"},{\"id\":\"6055928836070\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1ODI0Njg1OTg3MAZDZD\",\"after\":\"NjA1NTkyODgzNjA3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1NTkyODgzNjA3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&before=NjA1ODI0Njg1OTg3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1ODI0Njg2MDI3MAZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/ads",
 :as :json,
 :query-params
 {:path "ads",
  :limit "55",
  :fields
  "insights.action_breakdowns(action_type).date_preset(last_3_days).time_increment(1){ad_id,impressions,reach,clicks,spend,video_30_sec_watched_actions,video_p95_watched_actions,actions}",
  :ids "act_10152437784203995",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:request-time 1883,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.00,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "7X8B+dfikAvVXZY+XXRm8vMnPQcBGEUoJZ/o5NjZ72rtYjMk9Xp0meWrr+rbt83NdOrqXweszc3cd6goFiQtKA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"a211a87c3a4737aa6e8636d1e18c28d4624e410c\"",
  "x-fb-trace-id" "Ewzqxz2rR0K",
  "Date" "Sat, 15 Apr 2017 15:10:21 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"act_10152437784203995\":{\"data\":[{\"insights\":{\"data\":[{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"238\"}],\"impressions\":\"9348\",\"clicks\":\"25\",\"reach\":\"9348\",\"spend\":\"14.15\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"15\"},{\"action_type\":\"post_reaction\",\"value\":\"23\"},{\"action_type\":\"video_view\",\"value\":\"1348\"},{\"action_type\":\"page_engagement\",\"value\":\"1386\"},{\"action_type\":\"post_engagement\",\"value\":\"1386\"}],\"ad_id\":\"6065546811470\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"240\"}],\"date_start\":\"2017-04-13\",\"date_stop\":\"2017-04-13\"},{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"202\"}],\"impressions\":\"8295\",\"clicks\":\"21\",\"reach\":\"8158\",\"spend\":\"13.14\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"7\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_type\":\"post_reaction\",\"value\":\"18\"},{\"action_type\":\"video_view\",\"value\":\"1145\"},{\"action_type\":\"page_engagement\",\"value\":\"1171\"},{\"action_type\":\"post_engagement\",\"value\":\"1171\"}],\"ad_id\":\"6065546811470\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"205\"}],\"date_start\":\"2017-04-14\",\"date_stop\":\"2017-04-14\"},{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"124\"}],\"impressions\":\"4079\",\"clicks\":\"10\",\"reach\":\"4070\",\"spend\":\"7.33\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"5\"},{\"action_type\":\"post_reaction\",\"value\":\"13\"},{\"action_type\":\"video_view\",\"value\":\"592\"},{\"action_type\":\"page_engagement\",\"value\":\"610\"},{\"action_type\":\"post_engagement\",\"value\":\"610\"}],\"ad_id\":\"6065546811470\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"125\"}],\"date_start\":\"2017-04-15\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}},\"id\":\"6065546811470\"},{\"insights\":{\"data\":[{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"367\"}],\"impressions\":\"7437\",\"clicks\":\"22\",\"reach\":\"6676\",\"spend\":\"18.2\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"7\"},{\"action_type\":\"post_reaction\",\"value\":\"2\"},{\"action_type\":\"video_play\",\"value\":\"8\"},{\"action_type\":\"video_view\",\"value\":\"1980\"},{\"action_type\":\"page_engagement\",\"value\":\"1989\"},{\"action_type\":\"post_engagement\",\"value\":\"1989\"}],\"ad_id\":\"6065546047470\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"368\"}],\"date_start\":\"2017-04-13\",\"date_stop\":\"2017-04-13\"},{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"332\"}],\"impressions\":\"7057\",\"clicks\":\"11\",\"reach\":\"6438\",\"spend\":\"16.91\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"5\"},{\"action_type\":\"video_play\",\"value\":\"5\"},{\"action_type\":\"video_view\",\"value\":\"1761\"},{\"action_type\":\"page_engagement\",\"value\":\"1766\"},{\"action_type\":\"post_engagement\",\"value\":\"1766\"}],\"ad_id\":\"6065546047470\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"334\"}],\"date_start\":\"2017-04-14\",\"date_stop\":\"2017-04-14\"},{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"189\"}],\"impressions\":\"4473\",\"clicks\":\"11\",\"reach\":\"4255\",\"spend\":\"10.83\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"3\"},{\"action_type\":\"video_play\",\"value\":\"3\"},{\"action_type\":\"video_view\",\"value\":\"1099\"},{\"action_type\":\"page_engagement\",\"value\":\"1102\"},{\"action_type\":\"post_engagement\",\"value\":\"1102\"}],\"ad_id\":\"6065546047470\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"193\"}],\"date_start\":\"2017-04-15\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}},\"id\":\"6065546047470\"},{\"insights\":{\"data\":[{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"1108\"}],\"impressions\":\"22558\",\"clicks\":\"132\",\"reach\":\"21665\",\"spend\":\"35.31\",\"actions\":[{\"action_type\":\"like\",\"value\":\"2\"},{\"action_type\":\"link_click\",\"value\":\"26\"},{\"action_type\":\"post\",\"value\":\"2\"},{\"action_type\":\"post_reaction\",\"value\":\"29\"},{\"action_type\":\"video_play\",\"value\":\"53\"},{\"action_type\":\"video_view\",\"value\":\"5641\"},{\"action_type\":\"page_engagement\",\"value\":\"5700\"},{\"action_type\":\"post_engagement\",\"value\":\"5698\"}],\"ad_id\":\"6065546046670\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"1124\"}],\"date_start\":\"2017-04-13\",\"date_stop\":\"2017-04-13\"},{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"957\"}],\"impressions\":\"21663\",\"clicks\":\"135\",\"reach\":\"20401\",\"spend\":\"34.27\",\"actions\":[{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"33\"},{\"action_type\":\"post\",\"value\":\"2\"},{\"action_type\":\"post_reaction\",\"value\":\"38\"},{\"action_type\":\"video_play\",\"value\":\"50\"},{\"action_type\":\"video_view\",\"value\":\"4769\"},{\"action_type\":\"page_engagement\",\"value\":\"4843\"},{\"action_type\":\"post_engagement\",\"value\":\"4842\"}],\"ad_id\":\"6065546046670\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"969\"}],\"date_start\":\"2017-04-14\",\"date_stop\":\"2017-04-14\"},{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"548\"}],\"impressions\":\"12765\",\"clicks\":\"88\",\"reach\":\"12642\",\"spend\":\"19.43\",\"actions\":[{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"35\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_type\":\"post_reaction\",\"value\":\"17\"},{\"action_type\":\"video_play\",\"value\":\"15\"},{\"action_type\":\"video_view\",\"value\":\"2631\"},{\"action_type\":\"page_engagement\",\"value\":\"2685\"},{\"action_type\":\"post_engagement\",\"value\":\"2684\"}],\"ad_id\":\"6065546046670\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"558\"}],\"date_start\":\"2017-04-15\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}},\"id\":\"6065546046670\"},{\"insights\":{\"data\":[{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"563\"}],\"impressions\":\"17297\",\"clicks\":\"56\",\"reach\":\"17148\",\"spend\":\"28.03\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"18\"},{\"action_type\":\"post_reaction\",\"value\":\"114\"},{\"action_type\":\"video_view\",\"value\":\"3248\"},{\"action_type\":\"page_engagement\",\"value\":\"3380\"},{\"action_type\":\"post_engagement\",\"value\":\"3380\"}],\"ad_id\":\"6065546811270\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"576\"}],\"date_start\":\"2017-04-13\",\"date_stop\":\"2017-04-13\"},{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"539\"}],\"impressions\":\"16874\",\"clicks\":\"55\",\"reach\":\"16874\",\"spend\":\"28.03\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"17\"},{\"action_type\":\"post_reaction\",\"value\":\"135\"},{\"action_type\":\"video_view\",\"value\":\"3000\"},{\"action_type\":\"page_engagement\",\"value\":\"3152\"},{\"action_type\":\"post_engagement\",\"value\":\"3152\"}],\"ad_id\":\"6065546811270\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"546\"}],\"date_start\":\"2017-04-14\",\"date_stop\":\"2017-04-14\"},{\"video_30_sec_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"264\"}],\"impressions\":\"8642\",\"clicks\":\"32\",\"reach\":\"8642\",\"spend\":\"14.94\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"9\"},{\"action_type\":\"post_reaction\",\"value\":\"47\"},{\"action_type\":\"video_view\",\"value\":\"1457\"},{\"action_type\":\"page_engagement\",\"value\":\"1513\"},{\"action_type\":\"post_engagement\",\"value\":\"1513\"}],\"ad_id\":\"6065546811270\",\"video_p95_watched_actions\":[{\"action_type\":\"video_view\",\"value\":\"269\"}],\"date_start\":\"2017-04-15\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}},\"id\":\"6065546811270\"},{\"id\":\"6064628003270\"},{\"id\":\"6064532442070\"},{\"id\":\"6064532445670\"},{\"id\":\"6064628442870\"},{\"id\":\"6064535746470\"},{\"id\":\"6064534430870\"},{\"id\":\"6064535747070\"},{\"id\":\"6064534432070\"},{\"id\":\"6064628443070\"},{\"id\":\"6064535747270\"},{\"id\":\"6064534430470\"},{\"id\":\"6064535746870\"},{\"id\":\"6064535746670\"},{\"id\":\"6064534431270\"},{\"id\":\"6064534430670\"},{\"id\":\"6064532445070\"},{\"id\":\"6064532440070\"},{\"id\":\"6064532444670\"},{\"id\":\"6064447878470\"},{\"id\":\"6064447826070\"},{\"insights\":{\"data\":[{\"ad_id\":\"6064432518470\",\"impressions\":\"5951\",\"reach\":\"5951\",\"clicks\":\"172\",\"spend\":\"30.23\",\"actions\":[{\"action_type\":\"like\",\"value\":\"2\"},{\"action_type\":\"link_click\",\"value\":\"135\"},{\"action_type\":\"page_engagement\",\"value\":\"137\"},{\"action_type\":\"post_engagement\",\"value\":\"135\"}],\"date_start\":\"2017-04-13\",\"date_stop\":\"2017-04-13\"},{\"ad_id\":\"6064432518470\",\"impressions\":\"6790\",\"reach\":\"6680\",\"clicks\":\"174\",\"spend\":\"29.12\",\"actions\":[{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"114\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_type\":\"post_reaction\",\"value\":\"3\"},{\"action_type\":\"page_engagement\",\"value\":\"119\"},{\"action_type\":\"post_engagement\",\"value\":\"118\"}],\"date_start\":\"2017-04-14\",\"date_stop\":\"2017-04-14\"},{\"ad_id\":\"6064432518470\",\"impressions\":\"2693\",\"reach\":\"2671\",\"clicks\":\"77\",\"spend\":\"13.73\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"57\"},{\"action_type\":\"post_reaction\",\"value\":\"3\"},{\"action_type\":\"page_engagement\",\"value\":\"60\"},{\"action_type\":\"post_engagement\",\"value\":\"60\"}],\"date_start\":\"2017-04-15\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}},\"id\":\"6064432518470\"},{\"insights\":{\"data\":[{\"ad_id\":\"6064431746670\",\"impressions\":\"874\",\"reach\":\"861\",\"clicks\":\"19\",\"spend\":\"3.36\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"14\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_type\":\"post_reaction\",\"value\":\"1\"},{\"action_type\":\"page_engagement\",\"value\":\"16\"},{\"action_type\":\"post_engagement\",\"value\":\"16\"}],\"date_start\":\"2017-04-13\",\"date_stop\":\"2017-04-13\"},{\"ad_id\":\"6064431746670\",\"impressions\":\"1325\",\"reach\":\"1301\",\"clicks\":\"37\",\"spend\":\"6.2\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"25\"},{\"action_type\":\"page_engagement\",\"value\":\"25\"},{\"action_type\":\"post_engagement\",\"value\":\"25\"}],\"date_start\":\"2017-04-14\",\"date_stop\":\"2017-04-14\"},{\"ad_id\":\"6064431746670\",\"impressions\":\"814\",\"reach\":\"810\",\"clicks\":\"13\",\"spend\":\"1.59\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"7\"},{\"action_type\":\"page_engagement\",\"value\":\"7\"},{\"action_type\":\"post_engagement\",\"value\":\"7\"}],\"date_start\":\"2017-04-15\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}},\"id\":\"6064431746670\"},{\"id\":\"6063345208270\"},{\"id\":\"6063345209070\"},{\"id\":\"6063345208470\"},{\"id\":\"6063304978870\"},{\"id\":\"6063304979070\"},{\"id\":\"6063304978670\"},{\"id\":\"6062984301270\"},{\"id\":\"6062980783070\"},{\"id\":\"6062980783670\"},{\"id\":\"6062511599270\"},{\"id\":\"6062511593070\"},{\"id\":\"6062511554470\"},{\"id\":\"6062511575270\"},{\"id\":\"6062511161070\"},{\"id\":\"6059554223670\"},{\"id\":\"6059553655870\"},{\"id\":\"6058727885270\"},{\"id\":\"6058582359870\"},{\"id\":\"6058582361670\"},{\"id\":\"6058582361070\"},{\"id\":\"6058442678270\"},{\"id\":\"6058442681870\"},{\"id\":\"6058442678870\"},{\"id\":\"6058442681070\"},{\"id\":\"6058442675870\"},{\"id\":\"6058242418870\"},{\"id\":\"6058242419270\"},{\"id\":\"6058246860670\"},{\"id\":\"6058246860270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA2NTU0NjgxMTQ3MAZDZD\",\"after\":\"NjA1ODI0Njg2MDI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/ads?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_type%29.date_preset%28last_3_days%29.time_increment%281%29%7Bad_id%2Cimpressions%2Creach%2Cclicks%2Cspend%2Cvideo_30_sec_watched_actions%2Cvideo_p95_watched_actions%2Cactions%7D&since&until&limit=55&after=NjA1ODI0Njg2MDI3MAZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/ads"]}
)
})