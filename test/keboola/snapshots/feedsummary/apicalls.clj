(ns keboola.snapshots.feedsummary.apicalls)
(def recorded 
{
{:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1491510469&__paging_token=enc_AdD1oKv62UShBGNFboAc4BJQnLMmQe5XbMXmjpmZAZCaEHTBgxi82ZCTM1ZB7nLSbl6f36azCbkjDLTupuX2RnnefrSEwI2oqRAkV0bPk89hPV1fGgZDZD",
 :as :json}
(fn [req]{:request-time 221,
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
  "oGDImyAtqZvN9zstu7x8Xjz9vJXZ8lr5qQbJ0wcJxpVfUc/a5qn4SXLRQx23SlC9dWCZ2UiIkySl1oVK9d9+1g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "3339268",
  "ETag" "\"1050253aec7b29caff644806927dabfa81406eee\"",
  "x-fb-trace-id" "EYkItb9T46/",
  "Date" "Mon, 02 Oct 2017 15:38:20 GMT",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length 11,
 :body "{\"data\":[]}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1491510469&__paging_token=enc_AdD1oKv62UShBGNFboAc4BJQnLMmQe5XbMXmjpmZAZCaEHTBgxi82ZCTM1ZB7nLSbl6f36azCbkjDLTupuX2RnnefrSEwI2oqRAkV0bPk89hPV1fGgZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=15+months+ago&__paging_token=enc_AdDaTozZCyoNuHZBZAsaQrPIuo4ZBcdgAD6TzSmlj4pVFGHZByXZCQZAcuIxh3UkuEJqr5lPw8j0Jf3wLEOOnPb4nEUAQA3nbWm5WpEcLyNLsRTp9LANwZDZD&access_token=XXTOKENXX&until=1467493717",
 :as :json}
(fn [req]{:request-time 242,
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
  "Bsg/GXh4SP+bkl7Pg/sssYYFrozXWkcJYXUH8/Y9S3Ri8S/34dGi709lVgqGFArs6kAn8Mqhezef3aVS5lLvHA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "3339268",
  "ETag" "\"1050253aec7b29caff644806927dabfa81406eee\"",
  "x-fb-trace-id" "CZ7TFeRVI3j",
  "Date" "Mon, 02 Oct 2017 15:38:20 GMT",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length 11,
 :body "{\"data\":[]}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=15+months+ago&__paging_token=enc_AdDaTozZCyoNuHZBZAsaQrPIuo4ZBcdgAD6TzSmlj4pVFGHZByXZCQZAcuIxh3UkuEJqr5lPw8j0Jf3wLEOOnPb4nEUAQA3nbWm5WpEcLyNLsRTp9LANwZDZD&access_token=XXTOKENXX&until=1467493717"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1479487057&__paging_token=enc_AdBjRVNywKQsyKMEvUhZBgLUKjwgDQS9NzdtFp1tZBV8IyMwStEXlySMo3b6NpnrAVNH3aZCx8V7Eh00PanlNdq7Il8gZA7ahpsZCZClZBEPsJhOAOQPAZDZD",
 :as :json}
(fn [req]{:request-time 297,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "h3Sn+0JySQUB3nr76dKLmR4Zu02JFNZkh7c4ZRWDSA2Qhp6Ip2BzsYLNceUc6h7DNFxONHPJP5WVIzFycqxGYw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "3339268",
  "ETag" "\"f78192cf7ab52a5e803d8738e2e4b3aea9886b55\"",
  "x-fb-trace-id" "DKZa9NJg6Py",
  "Date" "Mon, 02 Oct 2017 15:38:20 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"222838661196260_1019388544874597\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1005566356256816\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":11}}},{\"id\":\"222838661196260_1341134989232514\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_999439503536168\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_994709314009187\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_994559144024204\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"222838661196260_994556534024465\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_994115824068536\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"222838661196260_994106270736158\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_992409077572544\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_990277561119029\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_984858171660968\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":6}}},{\"id\":\"222838661196260_982803328533119\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":5}}},{\"id\":\"222838661196260_979969342149851\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"222838661196260_972586652888120\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":5}}},{\"id\":\"222838661196260_953713914775394\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_942857695861016\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_940202489459870\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_927165737430212\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_926235147523271\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=1479307488&__paging_token=enc_AdDAmFuw7q4Y1IWWyRWHHAYhLftYNMrDpev5uTEepkPQFlYX0WPyuQCzVAgLKlGdSiZBIlb5WmS7U0uu0OpRe421i66bxrZCo2vvwkgSxRaVOMfwZDZD&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&limit=25&since=15+months+ago&__paging_token=enc_AdDaTozZCyoNuHZBZAsaQrPIuo4ZBcdgAD6TzSmlj4pVFGHZByXZCQZAcuIxh3UkuEJqr5lPw8j0Jf3wLEOOnPb4nEUAQA3nbWm5WpEcLyNLsRTp9LANwZDZD&access_token=XXTOKENXX&until=1467493717\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1479487057&__paging_token=enc_AdBjRVNywKQsyKMEvUhZBgLUKjwgDQS9NzdtFp1tZBV8IyMwStEXlySMo3b6NpnrAVNH3aZCx8V7Eh00PanlNdq7Il8gZA7ahpsZCZClZBEPsJhOAOQPAZDZD"]}
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
(fn [req]{:request-time 534,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "8YhHwgBi+Ztagouc5Rvavc4EIawFZpv4G/NYsdJUhQ3WA9MEkSW2ZI1P1LTtKEF3bi4+ge123sJuBUdiMPC2dA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "3339268",
  "ETag" "\"830cf8e52f0ee224aa60d24955e1c7635957742f\"",
  "x-fb-trace-id" "CaK/wNCabva",
  "Date" "Mon, 02 Oct 2017 15:38:19 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"222838661196260\":{\"data\":[{\"id\":\"222838661196260_1219971791482937\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"222838661196260_1169662839847166\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1166746836805433\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1166746623472121\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1117831915030259\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_1116959565117494\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1108005789346205\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":1}}},{\"id\":\"222838661196260_1107482036065247\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1107481849398599\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1260350687419830\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_412927135725672\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_1102759903204127\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1102748413205276\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1102622523217865\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":4}}},{\"id\":\"222838661196260_1101117760035008\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_1095366693943448\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":9}}},{\"id\":\"222838661196260_1088426111304173\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":3}}},{\"id\":\"222838661196260_1085738481572936\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1082965645183553\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1077902842356500\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1071468542999930\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_1369870156416993\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}},{\"id\":\"222838661196260_1047848388695279\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"222838661196260_1024914097655375\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":5}}},{\"id\":\"222838661196260_1020713021408816\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":4}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=1502378610&access_token=XXTOKENXX&limit=25&__paging_token=enc_AdAT5chlk0Us238V2h0ZAFWvn5m5P94Smv4VwCphGRWGkSFv7LXRtamk0PZBZCsbJhYXhff6ZC78sIRGjKQFjsDJXIL7uolPJCSIiCA2AqkmlHXlJgZDZD&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/222838661196260/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1479487057&__paging_token=enc_AdBjRVNywKQsyKMEvUhZBgLUKjwgDQS9NzdtFp1tZBV8IyMwStEXlySMo3b6NpnrAVNH3aZCx8V7Eh00PanlNdq7Il8gZA7ahpsZCZClZBEPsJhOAOQPAZDZD\"}},\"177057932317550\":{\"data\":[{\"id\":\"177057932317550_1528270233862973\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"177057932317550_1920132124904149\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":4}}},{\"id\":\"177057932317550_200219200511028\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"177057932317550_1478486035508060\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":5}}},{\"id\":\"177057932317550_1477131262310204\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"177057932317550_177062472317096\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":0}}},{\"id\":\"177057932317550_10155365834019810\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":22}}},{\"id\":\"177057932317550_1379478452075486\",\"reactions\":{\"data\":[],\"summary\":{\"total_count\":2}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=1504731236&access_token=XXTOKENXX&limit=25&__paging_token=enc_AdCblm5DxAYalGbkvNQeoMZAf7xBZBUGbpBvocQACIvFinGIcpelcRK4BKIpZA94s9uraoZBBJPKGV0T7cOgH3ej2UyQxJz1j47ZBK9ZB7WJHzXplCtwZDZD&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=reactions.type%28LIKE%29.summary%28total_count%29.limit%280%29&since=15+months+ago&access_token=XXTOKENXX&limit=25&until=1491510469&__paging_token=enc_AdD1oKv62UShBGNFboAc4BJQnLMmQe5XbMXmjpmZAZCaEHTBgxi82ZCTM1ZB7nLSbl6f36azCbkjDLTupuX2RnnefrSEwI2oqRAkV0bPk89hPV1fGgZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/feed"]}
)
})