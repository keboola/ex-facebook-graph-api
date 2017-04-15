(ns keboola.regression-tests.feedsummary.apicalls)
(def recorded 
{
{:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1455044103&__paging_token=enc_AdBXTkxb5ZAe78yZAes6XnjNM2YnZAgnteCKDwa07MLfLys77244pDZCQ3inNCJRM8c7uZCZBHNoN0dXCc86kpF08nNVMqZBrMcDMIhND83FyPdZBKqoPAZDZD",
 :as :json}
(fn [req]{:request-time 258,
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
  "9HY6AKpf9dAWkYvmrRYEa8EnDybyo+kreXf9FtZA+ZXTevhQi/OolcoZbHCw8PeL9PF70gMKvqaJJRIPYQKSJQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"1050253aec7b29caff644806927dabfa81406eee\"",
  "x-fb-trace-id" "FhNqdNjEoTT",
  "Date" "Sat, 15 Apr 2017 17:16:09 GMT",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length 11,
 :body "{\"data\":[]}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1455044103&__paging_token=enc_AdBXTkxb5ZAe78yZAes6XnjNM2YnZAgnteCKDwa07MLfLys77244pDZCQ3inNCJRM8c7uZCZBHNoN0dXCc86kpF08nNVMqZBrMcDMIhND83FyPdZBKqoPAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=15+months+ago&__paging_token=enc_AdC7dZCOOSQEU8sOIZBAt3KZBlFazPHDzMZAPKmYWeRmAjrZBasyq57UmUQ3xgmnqDnZCygLg0rwLVYBmKG7NgCHSoiQAA7rzPNk6pmewCV4UthL5QzgZDZD&access_token=XXTOKENXX&until=1453930568",
 :as :json}
(fn [req]{:request-time 303,
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
  "EuMRMPB9yOLU7hsEqrECk1SmkJcnwIBHE5x23V97MzD6so8WvGUCy3zL5s+awU+TnBr4L2h1pi3jHktJKWbNEQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"1050253aec7b29caff644806927dabfa81406eee\"",
  "x-fb-trace-id" "G+iXUeEeUTA",
  "Date" "Sat, 15 Apr 2017 17:16:09 GMT",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length 11,
 :body "{\"data\":[]}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=15+months+ago&__paging_token=enc_AdC7dZCOOSQEU8sOIZBAt3KZBlFazPHDzMZAPKmYWeRmAjrZBasyq57UmUQ3xgmnqDnZCygLg0rwLVYBmKG7NgCHSoiQAA7rzPNk6pmewCV4UthL5QzgZDZD&access_token=XXTOKENXX&until=1453930568"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=15+months+ago&__paging_token=enc_AdCdhOWuX9E0Qzn8oHZCkfVe2QBLxgpsTd3w5IWqzo0gluDm8Arkjf51ZBpAjIrx1rEzzeoYU9OSnk1SrYWgWYiYyRpvKTQnfxEbY5GnfR6H1J1gZDZD&access_token=XXTOKENXX&until=1457470021",
 :as :json}
(fn [req]{:request-time 274,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "V6eTZslZ7kC0l6gLQbvNLMeoNfuPUa3eWe8IHrDWP4B/qBirWgD67JVCD0YXwap6hkg1bhpzyg2xTNO/w+N8Jg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"fd1fdfedb20d9caf387901e0f31a97db4a062a96\"",
  "x-fb-trace-id" "B1MMLLMKAzD",
  "Date" "Sat, 15 Apr 2017 17:16:09 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"222838661196260_850409348439185\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":3}}},{\"id\":\"222838661196260_843246175822169\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_836221609857959\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":3}}},{\"id\":\"222838661196260_832290383584415\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":3}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=1456858048&__paging_token=enc_AdB6OgXDEYcXfEvZBkOgqtGDTlPGSWpdiXrNFZCEpXDZBUnHm9PQX4bmlokovDP8DrOZB2nycZCc4OBJDhexDZCNW9PUHykKFytoIxD641JVVdrC915gZDZD&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=15+months+ago&__paging_token=enc_AdC7dZCOOSQEU8sOIZBAt3KZBlFazPHDzMZAPKmYWeRmAjrZBasyq57UmUQ3xgmnqDnZCygLg0rwLVYBmKG7NgCHSoiQAA7rzPNk6pmewCV4UthL5QzgZDZD&access_token=XXTOKENXX&until=1453930568\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=15+months+ago&__paging_token=enc_AdCdhOWuX9E0Qzn8oHZCkfVe2QBLxgpsTd3w5IWqzo0gluDm8Arkjf51ZBpAjIrx1rEzzeoYU9OSnk1SrYWgWYiYyRpvKTQnfxEbY5GnfR6H1J1gZDZD&access_token=XXTOKENXX&until=1457470021"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1476358236&__paging_token=enc_AdACTGHy1QB9I74L9iGAs21kooPhBqXDcgLYCGZABYlxMeahoVBlbfDBLd9ssr0I0yiLEs3yhjmFUoIoj2XR1IcmYZAmW4HmU4ePyURiIhJPTUpgZDZD",
 :as :json}
(fn [req]{:request-time 343,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "N2xJCd24djqHH/1bijwbvqH+5r2WyakvyNlJfhqApu1H+YqPvqtdYcvDsFjKwXOfSFGawVCdHOHBd4b4FMbFhQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"3de9a46095646b3f63fb841d60dc0451978a6ece\"",
  "x-fb-trace-id" "B2Vo2iqoEcQ",
  "Date" "Sat, 15 Apr 2017 17:16:08 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"222838661196260_994556534024465\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_994115824068536\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"222838661196260_994106270736158\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_992409077572544\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_990277561119029\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_984858171660968\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":6}}},{\"id\":\"222838661196260_982803328533119\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":5}}},{\"id\":\"222838661196260_979969342149851\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"222838661196260_972586652888120\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":5}}},{\"id\":\"222838661196260_953713914775394\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_942857695861016\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_940202489459870\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_927165737430212\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_926235147523271\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_914671865346266\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_914550398691746\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"222838661196260_896166527196800\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":4}}},{\"id\":\"222838661196260_891161441030642\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_885085214971598\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_883072411839545\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_882597775220342\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":4}}},{\"id\":\"222838661196260_876229139190539\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_871453466334773\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_859262124220574\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":4}}},{\"id\":\"222838661196260_854303544716432\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":3}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=1476357912&__paging_token=enc_AdBZBXX6jZB3P6By12YvVR2FjBWbbweOkUV2xJrTJLpxVOLie3j69CsvXw9P2b9au3VZBt3ulEOlCM8iMh3SfZBQyWcfHoupTAZBYjDR60Ds23wn6YwZDZD&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=15+months+ago&__paging_token=enc_AdCdhOWuX9E0Qzn8oHZCkfVe2QBLxgpsTd3w5IWqzo0gluDm8Arkjf51ZBpAjIrx1rEzzeoYU9OSnk1SrYWgWYiYyRpvKTQnfxEbY5GnfR6H1J1gZDZD&access_token=XXTOKENXX&until=1457470021\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1476358236&__paging_token=enc_AdACTGHy1QB9I74L9iGAs21kooPhBqXDcgLYCGZABYlxMeahoVBlbfDBLd9ssr0I0yiLEs3yhjmFUoIoj2XR1IcmYZAmW4HmU4ePyURiIhJPTUpgZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/feed",
 :as :json,
 :query-params
 {:since "15 months ago",
  :until "now",
  :path "feed",
  :fields "reactions.type(LIKE).summary(total_count).limit(0)",
  :ids "222838661196260,177057932317550",
  :access_token "XXTOKENXX"}}
(fn [req]{:request-time 1082,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "FFKUfXhxQfZhnxzIUJgU6ZufB9Udc2x7BcwAEmUgiemeMtmRYmyFeiYTMKFtvDVCBcFfSrydjEaD94EACk5ZVg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"e9a7f0d55da96e3cffffe974cfe8e298ac05ac65\"",
  "x-fb-trace-id" "AlftIIVrTQR",
  "Date" "Sat, 15 Apr 2017 17:16:08 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"222838661196260\":{\"data\":[{\"id\":\"222838661196260_1117831915030259\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_1116959565117494\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1108005789346205\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"222838661196260_1107482036065247\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1107481849398599\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_412927135725672\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_1102759903204127\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1102748413205276\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1102622523217865\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":4}}},{\"id\":\"222838661196260_1101117760035008\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_1095366693943448\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":9}}},{\"id\":\"222838661196260_1088426111304173\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":3}}},{\"id\":\"222838661196260_1085738481572936\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1082965645183553\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1077902842356500\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1071468542999930\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_1047848388695279\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1024914097655375\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":5}}},{\"id\":\"222838661196260_1020713021408816\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":4}}},{\"id\":\"222838661196260_1019388544874597\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1018215251658593\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":3}}},{\"id\":\"222838661196260_1005566356256816\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":11}}},{\"id\":\"222838661196260_999439503536168\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_994709314009187\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_994559144024204\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=1490695014&access_token=XXTOKENXX&limit=25&__paging_token=enc_AdCxn5ObC2qOmDw8M1kQR0iWHZAC9UVuLSZBEZB1YkSLfGgeCvQTsbu8HhNNMNxzuz9Xigr5gZBw0le2r7Yss7vpZCTZBUrafvULrQSEgMiVe3XjAzgAZDZD&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1476358236&__paging_token=enc_AdACTGHy1QB9I74L9iGAs21kooPhBqXDcgLYCGZABYlxMeahoVBlbfDBLd9ssr0I0yiLEs3yhjmFUoIoj2XR1IcmYZAmW4HmU4ePyURiIhJPTUpgZDZD\"}},\"177057932317550\":{\"data\":[{\"id\":\"177057932317550_1379478452075486\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"177057932317550_1126854757337858\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"177057932317550_10207570586690352\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"177057932317550_1043848705638464\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=1491510469&access_token=XXTOKENXX&limit=25&__paging_token=enc_AdD1oKv62UShBGNFboAc4BJQnLMmQe5XbMXmjpmZAZCaEHTBgxi82ZCTM1ZB7nLSbl6f36azCbkjDLTupuX2RnnefrSEwI2oqRAkV0bPk89hPV1fGgZDZD&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1455044103&__paging_token=enc_AdBXTkxb5ZAe78yZAes6XnjNM2YnZAgnteCKDwa07MLfLys77244pDZCQ3inNCJRM8c7uZCZBHNoN0dXCc86kpF08nNVMqZBrMcDMIhND83FyPdZBKqoPAZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/feed"]}
)
})