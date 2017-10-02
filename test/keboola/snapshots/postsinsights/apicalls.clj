(ns keboola.snapshots.postsinsights.apicalls)
(def recorded 
{
{:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 326,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "arRpJFsA54zoAVbzgqywOAXRaHJi5v6OcR9A8YtICfbw/C57snxDEVdoTiAxXfoF+8OfDoE5D250ooGJwZsUMA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"499d7f1f4895838d6e5789975fa42e7191b5c6b0\"",
  "x-fb-trace-id" "E58sTCYP5u3",
  "Date" "Sat, 15 Apr 2017 16:12:30 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"e2xq7\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"We187\",\"description\":\"bIogC\",\"id\":\"177057932317550_905758402780829/insights/post_video_view_time/day\"},{\"name\":\"KsKOd\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"oCrrN\",\"description\":\"18gPT\",\"id\":\"177057932317550_905758402780829/insights/post_video_view_time/lifetime\"},{\"name\":\"RKHHT\",\"period\":\"lifetime\",\"values\":[{\"value\":3}],\"title\":\"vZ6uN\",\"description\":\"a8OM0\",\"id\":\"177057932317550_905758402780829/insights/post_engaged_fan/lifetime\"},{\"name\":\"UResm\",\"period\":\"lifetime\",\"values\":[{\"value\":3}],\"title\":\"FUWJ8\",\"description\":\"y34TB\",\"id\":\"177057932317550_905758402780829/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 262,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "P8VP1NtY33qJoz0sQ2lE4gbmXY3VnfFfloqKRXShE1eLAqE04yTOS4WOu3HmfUlZ2ePvWmkKo6fr2Mpq48kp7Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"751265e75b6a6db7e2cd731617e922660418189c\"",
  "x-fb-trace-id" "FDgrIZWkHDM",
  "Date" "Sat, 15 Apr 2017 16:12:29 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"rJ2TI\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"9eM4z\",\"description\":\"XR6PH\",\"id\":\"177057932317550_908277042528965/insights/post_video_view_time/day\"},{\"name\":\"3hdSc\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"IjKRU\",\"description\":\"cIzxu\",\"id\":\"177057932317550_908277042528965/insights/post_video_view_time/lifetime\"},{\"name\":\"oHv6Z\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"XpVR1\",\"description\":\"RXbJl\",\"id\":\"177057932317550_908277042528965/insights/post_engaged_fan/lifetime\"},{\"name\":\"l6WOG\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"HXw2M\",\"description\":\"0qf3l\",\"id\":\"177057932317550_908277042528965/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 262,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "JhflIrvgppRaNFC36rF+0uKpURPzTAckSTDZadwHUnobwuSPqmoNyldL9Qf1dxYW3ru0HXqtdf5NWGXuDhsX7w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"10aa5dd1c4565c3d2640c5834f4c1593dc274f70\"",
  "x-fb-trace-id" "AkBqYgjak1R",
  "Date" "Sat, 15 Apr 2017 16:12:29 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"LJ8Iz\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"gEZtz\",\"description\":\"r7UMy\",\"id\":\"177057932317550_910073965682606/insights/post_video_view_time/day\"},{\"name\":\"GFD0u\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ieGzc\",\"description\":\"gJ098\",\"id\":\"177057932317550_910073965682606/insights/post_video_view_time/lifetime\"},{\"name\":\"Ze7w9\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"308IR\",\"description\":\"fB9g4\",\"id\":\"177057932317550_910073965682606/insights/post_engaged_fan/lifetime\"},{\"name\":\"Wc3xp\",\"period\":\"lifetime\",\"values\":[{\"value\":5}],\"title\":\"58hFU\",\"description\":\"XN1W6\",\"id\":\"177057932317550_910073965682606/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 269,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "4/SX5TGXr8XC3wjhdojFVRzfULp4ipIe1DPoZgPfvmpdDAMhCfp8oFwX9mHa2XgneMcqkAU/nU5jZVv0fkB60g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"45757c5c8948ab396b0c55240021a36a7e4be83b\"",
  "x-fb-trace-id" "GCtZ0NOOSez",
  "Date" "Sat, 15 Apr 2017 16:12:29 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"iUyZJ\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"nJN8t\",\"description\":\"c4FoJ\",\"id\":\"177057932317550_913371222019547/insights/post_video_view_time/day\"},{\"name\":\"HdLpe\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ZXDck\",\"description\":\"CgPzD\",\"id\":\"177057932317550_913371222019547/insights/post_video_view_time/lifetime\"},{\"name\":\"Go6fd\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"LsGmf\",\"description\":\"RKkaH\",\"id\":\"177057932317550_913371222019547/insights/post_engaged_fan/lifetime\"},{\"name\":\"8LnpI\",\"period\":\"lifetime\",\"values\":[{\"value\":7}],\"title\":\"uE7I0\",\"description\":\"rjsJw\",\"id\":\"177057932317550_913371222019547/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 262,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "X++hWdUOZhcZd3S7aqw6b8HCUtU1ZIfv/9KTntqvCsJ9lpgGR7enWIfoUJCfg1k07e7LSuGm+uvl2XWDFdU21A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"a0997632eb82cab36ca5687b673334a21a53bfe3\"",
  "x-fb-trace-id" "GEpcaF9eweL",
  "Date" "Sat, 15 Apr 2017 16:12:29 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"zVJ4H\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"QKLha\",\"description\":\"11ncv\",\"id\":\"177057932317550_913890861967583/insights/post_video_view_time/day\"},{\"name\":\"PZ5nn\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"pz38h\",\"description\":\"8y1g7\",\"id\":\"177057932317550_913890861967583/insights/post_video_view_time/lifetime\"},{\"name\":\"Ihurs\",\"period\":\"lifetime\",\"values\":[{\"value\":2}],\"title\":\"q1qIT\",\"description\":\"z5EXn\",\"id\":\"177057932317550_913890861967583/insights/post_engaged_fan/lifetime\"},{\"name\":\"FO3Yp\",\"period\":\"lifetime\",\"values\":[{\"value\":2}],\"title\":\"dCMOU\",\"description\":\"a5HIs\",\"id\":\"177057932317550_913890861967583/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 260,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "fMqQzHpzjoHFpsFy/fAeCE5MVCcM/wcRI0CiQc0uofqL+lgMXTTwdV/1CXTkLVUVb19gRiNME9Hkc25U7bMmEg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"7c7ba54f14fc506f1aefc23ac0594aa71a09362a\"",
  "x-fb-trace-id" "CuvUmwV6qLd",
  "Date" "Sat, 15 Apr 2017 16:12:28 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"sO8GH\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"w2CZ5\",\"description\":\"MxbSn\",\"id\":\"177057932317550_921759597847376/insights/post_video_view_time/day\"},{\"name\":\"d0fgv\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"0Ecs3\",\"description\":\"tzhI5\",\"id\":\"177057932317550_921759597847376/insights/post_video_view_time/lifetime\"},{\"name\":\"8TuhJ\",\"period\":\"lifetime\",\"values\":[{\"value\":9}],\"title\":\"b1rpL\",\"description\":\"6O6zC\",\"id\":\"177057932317550_921759597847376/insights/post_engaged_fan/lifetime\"},{\"name\":\"fsSpY\",\"period\":\"lifetime\",\"values\":[{\"value\":56}],\"title\":\"khR83\",\"description\":\"LuepG\",\"id\":\"177057932317550_921759597847376/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 264,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "1eWkAubLe83spaIN3AqbRDCPRH/PozQt+cy8ZVqTEsxLtz/FUvPXpoXQvUZyk8EyWPyKr4YLOpQl0xunODu3KQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"c3261a035741258a8c420a56f6d5743b1f2418c5\"",
  "x-fb-trace-id" "CnJ7/jNAw0l",
  "Date" "Sat, 15 Apr 2017 16:12:28 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"gDfI1\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"c2Nmd\",\"description\":\"daGHc\",\"id\":\"177057932317550_921776914512311/insights/post_video_view_time/day\"},{\"name\":\"e1Fl4\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"lCk3S\",\"description\":\"rPdXa\",\"id\":\"177057932317550_921776914512311/insights/post_video_view_time/lifetime\"},{\"name\":\"gLyDR\",\"period\":\"lifetime\",\"values\":[{\"value\":5}],\"title\":\"kzWln\",\"description\":\"FWjPk\",\"id\":\"177057932317550_921776914512311/insights/post_engaged_fan/lifetime\"},{\"name\":\"HgsDz\",\"period\":\"lifetime\",\"values\":[{\"value\":62}],\"title\":\"cMXWU\",\"description\":\"Q4GaO\",\"id\":\"177057932317550_921776914512311/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 340,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "K1xyC02PzmrtH73OakoG4F/PRdrBbTGwEA/rgdCHMIa5WiJA+EsEOCPlKCVfJ1TcRcjTywdPNzp5K8hcsI1QDA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"f2d12c79e3b3fb022e509b12de5669d70658b717\"",
  "x-fb-trace-id" "DB4X7yyiqLM",
  "Date" "Sat, 15 Apr 2017 16:12:28 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"m0S76\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"EoefU\",\"description\":\"Q86qe\",\"id\":\"177057932317550_932914176731918/insights/post_video_view_time/day\"},{\"name\":\"yOiGC\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"YV0RY\",\"description\":\"qOkw8\",\"id\":\"177057932317550_932914176731918/insights/post_video_view_time/lifetime\"},{\"name\":\"usJXt\",\"period\":\"lifetime\",\"values\":[{\"value\":150}],\"title\":\"3NN9H\",\"description\":\"tFi72\",\"id\":\"177057932317550_932914176731918/insights/post_engaged_fan/lifetime\"},{\"name\":\"TZBe6\",\"period\":\"lifetime\",\"values\":[{\"value\":5315}],\"title\":\"c0zOE\",\"description\":\"QI6Z9\",\"id\":\"177057932317550_932914176731918/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 270,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "czqNtO8vu5MSQEfgmMc+bjBotTYka4w/xKZ8JqVMkkvxB+qO93kEGKYypkcKrJ3waPoe/SkiaKGowZD00x00TQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"9aafe66f4c26a976acd6cb5c9ccfb108572358f4\"",
  "x-fb-trace-id" "ANxsKIF2bhv",
  "Date" "Sat, 15 Apr 2017 16:12:27 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"SyITO\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"4TGe9\",\"description\":\"YfTIE\",\"id\":\"177057932317550_940984532591549/insights/post_video_view_time/day\"},{\"name\":\"FLN86\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"g4udK\",\"description\":\"T2YNz\",\"id\":\"177057932317550_940984532591549/insights/post_video_view_time/lifetime\"},{\"name\":\"CPh5K\",\"period\":\"lifetime\",\"values\":[{\"value\":13}],\"title\":\"s8QMq\",\"description\":\"DMNlM\",\"id\":\"177057932317550_940984532591549/insights/post_engaged_fan/lifetime\"},{\"name\":\"jI8Mt\",\"period\":\"lifetime\",\"values\":[{\"value\":97}],\"title\":\"uJwOw\",\"description\":\"bbDtY\",\"id\":\"177057932317550_940984532591549/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 266,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "t1S4Y2XrvcR+rEC/tPk9rUvI4O1XwV/5zGYwHFla4acGRDbCHE4JWCUWmv+wX+1L1Ed5150CEzoFW2TFrWbBAQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"1cdede662030e52b66cbe67c90edb32ef1e85d5d\"",
  "x-fb-trace-id" "Cb/36JGyIi+",
  "Date" "Sat, 15 Apr 2017 16:12:27 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"QaFuy\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"J43GN\",\"description\":\"kExO8\",\"id\":\"177057932317550_990386480984687/insights/post_video_view_time/day\"},{\"name\":\"2VkWd\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"lPrPk\",\"description\":\"itXVx\",\"id\":\"177057932317550_990386480984687/insights/post_video_view_time/lifetime\"},{\"name\":\"1fMpc\",\"period\":\"lifetime\",\"values\":[{\"value\":27}],\"title\":\"4SEfs\",\"description\":\"ZZCIk\",\"id\":\"177057932317550_990386480984687/insights/post_engaged_fan/lifetime\"},{\"name\":\"6NMH2\",\"period\":\"lifetime\",\"values\":[{\"value\":114}],\"title\":\"hQQqs\",\"description\":\"wnVsE\",\"id\":\"177057932317550_990386480984687/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 254,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "HsmybrvLRFvuv1LHNzO9UwqoNsFsBrTSbrK8/AwoRX/Y5AnwyhyXdms/4qNEp2oltX5+2nOVAi7htlmrxGoWdw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"e51d696379b319a1a7dc020d4a7c8b3bf1958aad\"",
  "x-fb-trace-id" "Acn4N/5J+e3",
  "Date" "Sat, 15 Apr 2017 16:12:27 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"57Wyd\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"hb3pi\",\"description\":\"utNkg\",\"id\":\"177057932317550_1043848705638464/insights/post_video_view_time/day\"},{\"name\":\"Hu93x\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"CR7H6\",\"description\":\"Mxr8w\",\"id\":\"177057932317550_1043848705638464/insights/post_video_view_time/lifetime\"},{\"name\":\"MTpyd\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"6qG7F\",\"description\":\"bGg4W\",\"id\":\"177057932317550_1043848705638464/insights/post_engaged_fan/lifetime\"},{\"name\":\"YnnCo\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"BIEPo\",\"description\":\"KGPkL\",\"id\":\"177057932317550_1043848705638464/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 272,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "gGOwr7fkH2ZDD3FKwphlVJupfLzI9wFqRkmkJea0gYaCvmrGT4ZzQhGeC5YRV+Vm9una8ZEkkKKqbbc+6VC2/g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"21f74e70a36be8aeebaa12df755971162e7ec212\"",
  "x-fb-trace-id" "HFq+KW8re+X",
  "Date" "Sat, 15 Apr 2017 16:12:27 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"sqajV\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"IBjEz\",\"description\":\"KBIYD\",\"id\":\"177057932317550_10207570586690352/insights/post_video_view_time/day\"},{\"name\":\"jOJBm\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"lF8Yj\",\"description\":\"QZSbT\",\"id\":\"177057932317550_10207570586690352/insights/post_video_view_time/lifetime\"},{\"name\":\"I0KXC\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"N11dK\",\"description\":\"bczRO\",\"id\":\"177057932317550_10207570586690352/insights/post_engaged_fan/lifetime\"},{\"name\":\"07LMi\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"KjRK1\",\"description\":\"RQslI\",\"id\":\"177057932317550_10207570586690352/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 264,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "T66lSy3RDFW1/xaTpE+lPwo556gfgetlyHzhpEY/n1tvX8ZJzCrvka2Hq9ZvQ9S/aGTU4Mxfm8GvG1bLXM1ASQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"c101d1ee9cdc006e20c6f8d3c2ead354d2d14f90\"",
  "x-fb-trace-id" "GUyCPU9L1X3",
  "Date" "Sat, 15 Apr 2017 16:12:26 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"QQv3Q\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"3F19Y\",\"description\":\"GKuXu\",\"id\":\"177057932317550_1126854757337858/insights/post_video_view_time/day\"},{\"name\":\"UQrDj\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"oemHy\",\"description\":\"5rFSl\",\"id\":\"177057932317550_1126854757337858/insights/post_video_view_time/lifetime\"},{\"name\":\"GYgF2\",\"period\":\"lifetime\",\"values\":[{\"value\":26}],\"title\":\"NvnHb\",\"description\":\"oGCtI\",\"id\":\"177057932317550_1126854757337858/insights/post_engaged_fan/lifetime\"},{\"name\":\"hIeGZ\",\"period\":\"lifetime\",\"values\":[{\"value\":32}],\"title\":\"Olfnr\",\"description\":\"ofdEH\",\"id\":\"177057932317550_1126854757337858/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_1379478452075486/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145",
 :as :json}
(fn [req]{:request-time 280,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "9l5pDLUI1m5zaH4PIbxdqkWjF2SAhhaTAKbVegv2dsyo8vXYOIEDvKsNPqji8ysTvNakvzUQ/PK0qA85ibZoSQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"f97f56d3945582d48efddedd7746e9454ab1428c\"",
  "x-fb-trace-id" "Bt12QuNJsXz",
  "Date" "Sat, 15 Apr 2017 16:12:26 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"biRkL\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-16T07:00:00+0000\"}],\"title\":\"wiUv0\",\"description\":\"6MfHk\",\"id\":\"177057932317550_1379478452075486/insights/post_video_view_time/day\"},{\"name\":\"SRJN7\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"3M9Zu\",\"description\":\"ZFNaO\",\"id\":\"177057932317550_1379478452075486/insights/post_video_view_time/lifetime\"},{\"name\":\"5zG26\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"DOsJr\",\"description\":\"vQt76\",\"id\":\"177057932317550_1379478452075486/insights/post_engaged_fan/lifetime\"},{\"name\":\"QvNlf\",\"period\":\"lifetime\",\"values\":[{\"value\":9}],\"title\":\"cMjit\",\"description\":\"qcsvM\",\"id\":\"177057932317550_1379478452075486/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1379478452075486/insights?access_token=XXTOKENXX&since=1492186345&until=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_1379478452075486/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_video_view_time,post_engaged_fan,post_consumptions%29&limit=40&since=24+months+ago&access_token=XXTOKENXX&until=1429120082&__paging_token=enc_AdDGclYLPsRkhL2l7rZAcPvGgeDZAqL4Uzp4tIj2yC8F70EFI5XejQNMJKFMQ1QiXPDdRaYC1GveBkcIRv46L9Hiw49eyeQ6Fc7eF9fuHBtZAnBCQZDZD",
 :as :json}
(fn [req]{:request-time 268,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "Content-Length" "11",
  "X-FB-Debug"
  "NLGWVbbEHeDlVD4lKXfM2Cx5mB9QBMx5CqvSVBofN8YmMWX7ugDG3h4+sAEAJHNqZ1OkYnaC1eSFXywSI4JwJw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"1050253aec7b29caff644806927dabfa81406eee\"",
  "x-fb-trace-id" "G6Bp4CXPoSb",
  "Date" "Sat, 15 Apr 2017 16:12:26 GMT",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length 11,
 :body "{\"data\":[]}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_video_view_time,post_engaged_fan,post_consumptions%29&limit=40&since=24+months+ago&access_token=XXTOKENXX&until=1429120082&__paging_token=enc_AdDGclYLPsRkhL2l7rZAcPvGgeDZAqL4Uzp4tIj2yC8F70EFI5XejQNMJKFMQ1QiXPDdRaYC1GveBkcIRv46L9Hiw49eyeQ6Fc7eF9fuHBtZAnBCQZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/feed",
 :as :json,
 :query-params
 {:limit "40",
  :since "24 months ago",
  :until "now",
  :path "feed",
  :fields
  "insights.since(now).metric(post_video_view_time,post_engaged_fan,post_consumptions)",
  :ids "177057932317550",
  :access_token "XXTOKENXX"}}
(fn [req]{:request-time 1187,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "sHIo4JMR9yEyEA+HCsHlV/9dF+fGsOSnQnptIHIKWzeFNVmWTobMa2eLiJBevBpYCpAHo+REqQMFsaJJouCxkg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"36e02198a24828c190c4eea11a6047505d840279\"",
  "x-fb-trace-id" "Hl/Ke00QU5B",
  "Date" "Sat, 15 Apr 2017 16:12:25 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"177057932317550\":{\"data\":[{\"id\":\"177057932317550_1379478452075486\",\"insights\":{\"data\":[{\"name\":\"y2Yrt\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"6sW5J\",\"description\":\"RpQhy\",\"id\":\"177057932317550_1379478452075486/insights/post_video_view_time/day\"},{\"name\":\"J8jSr\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"n1pxb\",\"description\":\"9chZZ\",\"id\":\"177057932317550_1379478452075486/insights/post_video_view_time/lifetime\"},{\"name\":\"5v82f\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"nDTeP\",\"description\":\"SwIbk\",\"id\":\"177057932317550_1379478452075486/insights/post_engaged_fan/lifetime\"},{\"name\":\"QLbaP\",\"period\":\"lifetime\",\"values\":[{\"value\":9}],\"title\":\"DhEVK\",\"description\":\"Z7geD\",\"id\":\"177057932317550_1379478452075486/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1379478452075486/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_1379478452075486/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_1126854757337858\",\"insights\":{\"data\":[{\"name\":\"kZHQi\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"myJJb\",\"description\":\"yiVfU\",\"id\":\"177057932317550_1126854757337858/insights/post_video_view_time/day\"},{\"name\":\"0iqhI\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"b9fJ1\",\"description\":\"7Pzgc\",\"id\":\"177057932317550_1126854757337858/insights/post_video_view_time/lifetime\"},{\"name\":\"OMeMw\",\"period\":\"lifetime\",\"values\":[{\"value\":26}],\"title\":\"r8owb\",\"description\":\"t4Xhc\",\"id\":\"177057932317550_1126854757337858/insights/post_engaged_fan/lifetime\"},{\"name\":\"nfeOt\",\"period\":\"lifetime\",\"values\":[{\"value\":32}],\"title\":\"FVsvh\",\"description\":\"Q4lNc\",\"id\":\"177057932317550_1126854757337858/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_10207570586690352\",\"insights\":{\"data\":[{\"name\":\"zmJrQ\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"ertd9\",\"description\":\"PR331\",\"id\":\"177057932317550_10207570586690352/insights/post_video_view_time/day\"},{\"name\":\"ItEay\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9UXSs\",\"description\":\"LXZ6Z\",\"id\":\"177057932317550_10207570586690352/insights/post_video_view_time/lifetime\"},{\"name\":\"6SrKn\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"iGdaT\",\"description\":\"y9Euw\",\"id\":\"177057932317550_10207570586690352/insights/post_engaged_fan/lifetime\"},{\"name\":\"8DKfI\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"XO7nH\",\"description\":\"7E8rP\",\"id\":\"177057932317550_10207570586690352/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_1043848705638464\",\"insights\":{\"data\":[{\"name\":\"xYk7N\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"RCoao\",\"description\":\"w6YR3\",\"id\":\"177057932317550_1043848705638464/insights/post_video_view_time/day\"},{\"name\":\"RjU0K\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"LHxVq\",\"description\":\"hMDJu\",\"id\":\"177057932317550_1043848705638464/insights/post_video_view_time/lifetime\"},{\"name\":\"ML8RS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"EIK1r\",\"description\":\"O8jTW\",\"id\":\"177057932317550_1043848705638464/insights/post_engaged_fan/lifetime\"},{\"name\":\"BUqhI\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9GTsN\",\"description\":\"hMX9K\",\"id\":\"177057932317550_1043848705638464/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_990386480984687\",\"insights\":{\"data\":[{\"name\":\"FpKKa\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"afenP\",\"description\":\"aanKa\",\"id\":\"177057932317550_990386480984687/insights/post_video_view_time/day\"},{\"name\":\"DPeKz\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"iTrh4\",\"description\":\"3UpM2\",\"id\":\"177057932317550_990386480984687/insights/post_video_view_time/lifetime\"},{\"name\":\"7Nrvj\",\"period\":\"lifetime\",\"values\":[{\"value\":27}],\"title\":\"yiPMU\",\"description\":\"Njd2v\",\"id\":\"177057932317550_990386480984687/insights/post_engaged_fan/lifetime\"},{\"name\":\"T9xnv\",\"period\":\"lifetime\",\"values\":[{\"value\":114}],\"title\":\"ENqXm\",\"description\":\"EE9dL\",\"id\":\"177057932317550_990386480984687/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_940984532591549\",\"insights\":{\"data\":[{\"name\":\"ffYKH\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"NNwlo\",\"description\":\"gw5iS\",\"id\":\"177057932317550_940984532591549/insights/post_video_view_time/day\"},{\"name\":\"Lzxdi\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"NyU7J\",\"description\":\"mHyn9\",\"id\":\"177057932317550_940984532591549/insights/post_video_view_time/lifetime\"},{\"name\":\"OVyxa\",\"period\":\"lifetime\",\"values\":[{\"value\":13}],\"title\":\"3JCKR\",\"description\":\"C5pby\",\"id\":\"177057932317550_940984532591549/insights/post_engaged_fan/lifetime\"},{\"name\":\"38VgU\",\"period\":\"lifetime\",\"values\":[{\"value\":97}],\"title\":\"IJ9q9\",\"description\":\"Fbhva\",\"id\":\"177057932317550_940984532591549/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_932914176731918\",\"insights\":{\"data\":[{\"name\":\"cITur\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"PedY6\",\"description\":\"g5csD\",\"id\":\"177057932317550_932914176731918/insights/post_video_view_time/day\"},{\"name\":\"uh02h\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"gUVK1\",\"description\":\"EL4tf\",\"id\":\"177057932317550_932914176731918/insights/post_video_view_time/lifetime\"},{\"name\":\"EHisq\",\"period\":\"lifetime\",\"values\":[{\"value\":150}],\"title\":\"KsGsc\",\"description\":\"MgT5l\",\"id\":\"177057932317550_932914176731918/insights/post_engaged_fan/lifetime\"},{\"name\":\"TfwYi\",\"period\":\"lifetime\",\"values\":[{\"value\":5315}],\"title\":\"fXdht\",\"description\":\"2S9py\",\"id\":\"177057932317550_932914176731918/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_921776914512311\",\"insights\":{\"data\":[{\"name\":\"lqcFx\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"NGeBw\",\"description\":\"yrKkv\",\"id\":\"177057932317550_921776914512311/insights/post_video_view_time/day\"},{\"name\":\"UjQHR\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"d1Zl5\",\"description\":\"1ksW8\",\"id\":\"177057932317550_921776914512311/insights/post_video_view_time/lifetime\"},{\"name\":\"qJ3Kh\",\"period\":\"lifetime\",\"values\":[{\"value\":5}],\"title\":\"HmjgG\",\"description\":\"8QFRp\",\"id\":\"177057932317550_921776914512311/insights/post_engaged_fan/lifetime\"},{\"name\":\"zqmdI\",\"period\":\"lifetime\",\"values\":[{\"value\":62}],\"title\":\"2uINg\",\"description\":\"F0gip\",\"id\":\"177057932317550_921776914512311/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_921759597847376\",\"insights\":{\"data\":[{\"name\":\"CHHf1\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"biZMt\",\"description\":\"NSRwt\",\"id\":\"177057932317550_921759597847376/insights/post_video_view_time/day\"},{\"name\":\"kzqQj\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"He7Mm\",\"description\":\"yrxIT\",\"id\":\"177057932317550_921759597847376/insights/post_video_view_time/lifetime\"},{\"name\":\"jKksn\",\"period\":\"lifetime\",\"values\":[{\"value\":9}],\"title\":\"KnDLy\",\"description\":\"nlxJ6\",\"id\":\"177057932317550_921759597847376/insights/post_engaged_fan/lifetime\"},{\"name\":\"3d1nf\",\"period\":\"lifetime\",\"values\":[{\"value\":56}],\"title\":\"6ZDTC\",\"description\":\"lILaY\",\"id\":\"177057932317550_921759597847376/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_913890861967583\",\"insights\":{\"data\":[{\"name\":\"YUCHe\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"Cgvze\",\"description\":\"ZHq6o\",\"id\":\"177057932317550_913890861967583/insights/post_video_view_time/day\"},{\"name\":\"fDpNx\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"N4qB7\",\"description\":\"ZwL2t\",\"id\":\"177057932317550_913890861967583/insights/post_video_view_time/lifetime\"},{\"name\":\"2uOtK\",\"period\":\"lifetime\",\"values\":[{\"value\":2}],\"title\":\"SSOTY\",\"description\":\"fZ4na\",\"id\":\"177057932317550_913890861967583/insights/post_engaged_fan/lifetime\"},{\"name\":\"1kSNL\",\"period\":\"lifetime\",\"values\":[{\"value\":2}],\"title\":\"OilfZ\",\"description\":\"lEV6Z\",\"id\":\"177057932317550_913890861967583/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_913371222019547\",\"insights\":{\"data\":[{\"name\":\"l1N4Y\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"3zv5t\",\"description\":\"6pQ7d\",\"id\":\"177057932317550_913371222019547/insights/post_video_view_time/day\"},{\"name\":\"MaQq6\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"vKZ2h\",\"description\":\"mpl8V\",\"id\":\"177057932317550_913371222019547/insights/post_video_view_time/lifetime\"},{\"name\":\"QnP8B\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"PgwUz\",\"description\":\"PpHPt\",\"id\":\"177057932317550_913371222019547/insights/post_engaged_fan/lifetime\"},{\"name\":\"krI9u\",\"period\":\"lifetime\",\"values\":[{\"value\":7}],\"title\":\"gW0Kw\",\"description\":\"knlpm\",\"id\":\"177057932317550_913371222019547/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_910073965682606\",\"insights\":{\"data\":[{\"name\":\"ts713\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"JJz3d\",\"description\":\"n7so0\",\"id\":\"177057932317550_910073965682606/insights/post_video_view_time/day\"},{\"name\":\"jKyCw\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"yqdt6\",\"description\":\"jXNtI\",\"id\":\"177057932317550_910073965682606/insights/post_video_view_time/lifetime\"},{\"name\":\"c3EST\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"oBktI\",\"description\":\"nGzOc\",\"id\":\"177057932317550_910073965682606/insights/post_engaged_fan/lifetime\"},{\"name\":\"yRyZf\",\"period\":\"lifetime\",\"values\":[{\"value\":5}],\"title\":\"CBrdd\",\"description\":\"7jRN4\",\"id\":\"177057932317550_910073965682606/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_908277042528965\",\"insights\":{\"data\":[{\"name\":\"hxV15\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"TdXxw\",\"description\":\"a046u\",\"id\":\"177057932317550_908277042528965/insights/post_video_view_time/day\"},{\"name\":\"vdBzH\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9OxIq\",\"description\":\"NxLSR\",\"id\":\"177057932317550_908277042528965/insights/post_video_view_time/lifetime\"},{\"name\":\"pvgJn\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"5UYpx\",\"description\":\"7n4Lr\",\"id\":\"177057932317550_908277042528965/insights/post_engaged_fan/lifetime\"},{\"name\":\"t3nOa\",\"period\":\"lifetime\",\"values\":[{\"value\":6}],\"title\":\"c7o9t\",\"description\":\"BVZRa\",\"id\":\"177057932317550_908277042528965/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}},{\"id\":\"177057932317550_905758402780829\",\"insights\":{\"data\":[{\"name\":\"2s8H9\",\"period\":\"day\",\"values\":[{\"value\":0,\"end_time\":\"2017-04-15T07:00:00+0000\"}],\"title\":\"pmpTy\",\"description\":\"hul2w\",\"id\":\"177057932317550_905758402780829/insights/post_video_view_time/day\"},{\"name\":\"GeVr0\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"RPSDz\",\"description\":\"EjbYN\",\"id\":\"177057932317550_905758402780829/insights/post_video_view_time/lifetime\"},{\"name\":\"ow0GE\",\"period\":\"lifetime\",\"values\":[{\"value\":3}],\"title\":\"OkQrE\",\"description\":\"RMpLc\",\"id\":\"177057932317550_905758402780829/insights/post_engaged_fan/lifetime\"},{\"name\":\"wXEeh\",\"period\":\"lifetime\",\"values\":[{\"value\":3}],\"title\":\"0sYsb\",\"description\":\"HtQhx\",\"id\":\"177057932317550_905758402780829/insights/post_consumptions/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1492186345&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492272745\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1492272745&metric=post_video_view_time%2Cpost_engaged_fan%2Cpost_consumptions&until=1492359145\"}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_video_view_time,post_engaged_fan,post_consumptions%29&limit=40&since=1491510469&access_token=XXTOKENXX&__paging_token=enc_AdD1oKv62UShBGNFboAc4BJQnLMmQe5XbMXmjpmZAZCaEHTBgxi82ZCTM1ZB7nLSbl6f36azCbkjDLTupuX2RnnefrSEwI2oqRAkV0bPk89hPV1fGgZDZD&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_video_view_time,post_engaged_fan,post_consumptions%29&limit=40&since=24+months+ago&access_token=XXTOKENXX&until=1429120082&__paging_token=enc_AdDGclYLPsRkhL2l7rZAcPvGgeDZAqL4Uzp4tIj2yC8F70EFI5XejQNMJKFMQ1QiXPDdRaYC1GveBkcIRv46L9Hiw49eyeQ6Fc7eF9fuHBtZAnBCQZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/feed"]}
)
})