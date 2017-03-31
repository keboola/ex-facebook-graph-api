(ns keboola.regression-tests.postsinsights.apicalls)
(def recorded 
{
{:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_171674186203006/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 210,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Ea8i6SqV4uj9/Ce9buuNZxcuEpOnIAnnk6AImjU2Jw0yt9FLb0qa3eUh6ppC70ZRzrGQpEpXViIh8QsslqUpyQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"2d400e4c1a337dbe8f8aacda104dc2a602e817d2\"",
  "x-fb-trace-id" "EfyXnmXlezF",
  "Date" "Fri, 31 Mar 2017 10:08:45 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"iRBzv\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"MkyXO\",\"description\":\"Oca1Y\",\"id\":\"177057932317550_171674186203006/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_171674186203006/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_171674186203006/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_134098826650108/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 261,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "MB+IMh/NdbS7KJhuFFEjdd2k9wfIPpx4V04IPY7vD4aJyUkabPKU+KHl4SYk+65SASTlAGh0Uwy1TrDkHYFtXA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"546f64583e061d3fa8cef8f3c5d779909ac99b99\"",
  "x-fb-trace-id" "BakIOLESZDD",
  "Date" "Fri, 31 Mar 2017 10:08:45 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"rcbTB\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"P7DjL\",\"description\":\"xuy83\",\"id\":\"177057932317550_134098826650108/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_134098826650108/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_134098826650108/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_180908155265861/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 231,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "wxRnUPCsoAWqvhacYMSKPGGD9hfpqdjMeJCw37QcRD2021rj3vvRkby0jchKSmvhXGWKzxSb9AaH5L8QJM9XTw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8968a1db3fd5299b8247b00be2a32cab91cdc76c\"",
  "x-fb-trace-id" "DX4TKW+Yas+",
  "Date" "Fri, 31 Mar 2017 10:08:45 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"aql9v\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"5fhGe\",\"description\":\"XjGER\",\"id\":\"177057932317550_180908155265861/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_180908155265861/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_180908155265861/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_181683068521703/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 224,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "25Au+5IFk55F7NokbkBwF0rDzGJSL2u0kZYI/rcU4GjbQrDPX6a4YOuZ/uC8i5tpwN3Qlv5hpPf2HrqkOLceJA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ef7f8e9d05e12cbb68fad43a16cf06a8f244a600\"",
  "x-fb-trace-id" "CxtKTVWK3dx",
  "Date" "Fri, 31 Mar 2017 10:08:45 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Rp7uy\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"EXx25\",\"description\":\"kwnym\",\"id\":\"177057932317550_181683068521703/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_181683068521703/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_181683068521703/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_184322484924428/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 230,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "yCVeFudSLVc3CUVthW0Dwx7jRxVMNSVd4f8ackiJl5kYQdGAuZ1GU+sRNognFq1wLjZSrqDxkocv8OZCMK9XPA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"6f38bc0f26dc39b631effcfa7b6224fd64eb4a91\"",
  "x-fb-trace-id" "CD3gXZ70rzq",
  "Date" "Fri, 31 Mar 2017 10:08:44 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"lMPeS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"dkNxp\",\"description\":\"gh4QP\",\"id\":\"177057932317550_184322484924428/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_184322484924428/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_184322484924428/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_126067137462604/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 225,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "nzQpW6Mr1mWDwd0LqHdMqD+PCVqB8FvHcQ7SgWobYX325DEmjioWp0k+66ptBf2tlGUF4on6X2/y9PBSyRoWHQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"035257b2ba4e3c2e515f173d527bc9d690d82302\"",
  "x-fb-trace-id" "HxeNvTr3auH",
  "Date" "Fri, 31 Mar 2017 10:08:44 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"jIfV6\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8Ylor\",\"description\":\"QE2C3\",\"id\":\"177057932317550_126067137462604/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_126067137462604/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_126067137462604/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_185882488101761/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 234,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "txs55+TfZHAvoBcm4VBVFsP6vJ7y8nfmGP83r9PrFHjvm5TfkfA5Ie5oC20CiGS0I4b+xsHWgyYIdXij5ITnig==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ed1009ff79ece8fc2492f0b91c156fb2f2c8339a\"",
  "x-fb-trace-id" "CkIKXxuCFCm",
  "Date" "Fri, 31 Mar 2017 10:08:44 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Wqwzp\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"mg5ks\",\"description\":\"QS2go\",\"id\":\"177057932317550_185882488101761/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_185882488101761/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_185882488101761/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_199870140026616/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 235,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "bkedrHjgEP3kNfAnrzpf7JUauzJJyYKwKKG4L5//2jDmfWHS0NuBMU/ELE84Oi6xHN7pCXQiYNUKUQ8MotNtcQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ef22afa1fe027bbc90ae169011c63dbd2a962514\"",
  "x-fb-trace-id" "DroVGdUMjMX",
  "Date" "Fri, 31 Mar 2017 10:08:44 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"8jr9X\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"sU6l4\",\"description\":\"vSRgR\",\"id\":\"177057932317550_199870140026616/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_199870140026616/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_199870140026616/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_192688704088246/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 245,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "GRbpK1Se9/tHRwRrXjOAC0VMIDkNAccG6JIwWEThJVIAB9gVW7hYMisKvlfth0LKF7S7XRlHFLirfOacHNWtbA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"9d94c634c904e50f5a6f89072ef00a0b55a07750\"",
  "x-fb-trace-id" "EG0FVek43w/",
  "Date" "Fri, 31 Mar 2017 10:08:43 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"o1oCk\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"0FcrB\",\"description\":\"uT4u2\",\"id\":\"177057932317550_192688704088246/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_192688704088246/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_192688704088246/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_197403570282986/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 216,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "nC3PMa0Td8up8hYQyIYjfOODk5wkchj8F/SRrYgJ1B4Q8HlCJZhPY6xgoxkb1u6jTn1zccHd0uDWqBSMg0xITQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"2ce2ddee3f3578393bd0534415fd35ceb1e31e7d\"",
  "x-fb-trace-id" "EuPw/4jkQQa",
  "Date" "Fri, 31 Mar 2017 10:08:43 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"7EFMy\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"bbspX\",\"description\":\"QTMm7\",\"id\":\"177057932317550_197403570282986/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_197403570282986/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_197403570282986/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_211220768894075/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 208,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "tAhVBO7Hm+xqkWMCQ/eRaMLC+DNcuVVQgqoBP1reKREer0CAOpxvg3RegQqtNyj5ieZcpbgdp6/mn1MRsgitqg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"cddf172af97a34ad040ba00654ec2cc0ecd0c37f\"",
  "x-fb-trace-id" "DDPMf0KCgjW",
  "Date" "Fri, 31 Mar 2017 10:08:43 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"61Z6z\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"3gv6y\",\"description\":\"0Kyeh\",\"id\":\"177057932317550_211220768894075/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_211220768894075/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_211220768894075/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_137582739648143/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 227,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Bz4AjGkGFn74gwkJKdD7FqmFc3gfz3E53iRqJUMPgRFYYJ2yAcr0JkXBMl7Z9Ncoq/1QKibPE1QJHD5St0r/Sg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"e824b5b3da8e9ad0bc52b4b34ea58112b0192b9e\"",
  "x-fb-trace-id" "Crvk7Lholjy",
  "Date" "Fri, 31 Mar 2017 10:08:43 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"2RsGX\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"dsvwu\",\"description\":\"4jEpO\",\"id\":\"177057932317550_137582739648143/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_137582739648143/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_137582739648143/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_196467620396988/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 213,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "PxwUVSTWiyFyTwwyjheqc+qh+j/EvN+HXYnBc0czYnhyS2tQCnfKrV2XgAirraEQDdz96iOmRHAIGbbKxu/wOg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f70f23e0060e5704a544cf516d6bc0be2bb0139d\"",
  "x-fb-trace-id" "HqPLvhsFUu4",
  "Date" "Fri, 31 Mar 2017 10:08:42 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"KlNm9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"P8Pcu\",\"description\":\"1cpCZ\",\"id\":\"177057932317550_196467620396988/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_196467620396988/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_196467620396988/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_215623685128044/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 271,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "OFwriJ4UkIY05cW9vbN01tkEItLXRqpEPLQFZKQw8i2Al2bvA5lW3ZpYFo7BGgu1NMM/ZKFZuTRwKY9MXhW5vA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"51201f2ac7127cbaee2567a65bf47b32a65764f1\"",
  "x-fb-trace-id" "Bw5I8rkpfF8",
  "Date" "Fri, 31 Mar 2017 10:08:42 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"yTCI6\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"3XiIm\",\"description\":\"8YMWt\",\"id\":\"177057932317550_215623685128044/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_215623685128044/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_215623685128044/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_209620832394593/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 219,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "EgdtBhJ1L+XJB3iu5EGG/p491275oQ0DxVtZo2e7vVM/+gcLa9u8WYNin7HF3HZfkqWn07ylQCIXzbrqbre42Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"128fa2fffd5d1796c1c79f2f640792fc46f3e8cc\"",
  "x-fb-trace-id" "Hohd1YmNiJJ",
  "Date" "Fri, 31 Mar 2017 10:08:42 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"p51xi\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"IbsQ0\",\"description\":\"2hfeD\",\"id\":\"177057932317550_209620832394593/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_209620832394593/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_209620832394593/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_216377241726149/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 235,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "6pIcYAUNLRMsOcylwUhUEjZiRmjM+bqy63T/mcNLHKmUCXjrItj6FJuFofh4k3DBTnup6IHnh99Li+YqbITtTA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"12a7153c303b9d88f7e092fd443b8c127a45f696\"",
  "x-fb-trace-id" "AUChnMNCONj",
  "Date" "Fri, 31 Mar 2017 10:08:42 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"eDBRp\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"iSVbI\",\"description\":\"Mexh0\",\"id\":\"177057932317550_216377241726149/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_216377241726149/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_216377241726149/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_218189694871040/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 265,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "ew4y7RnqdE0rRoro+nQWuqXfEhuOpYEG67lz3IeF6Q7MgCNJXdMxtIYtlVg4onR4ipdmqQyfBzzFydyQDDjxKQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"962d48a97f985eb19b4068ab0a7dea8d17d3b945\"",
  "x-fb-trace-id" "D1dBnCRMdWb",
  "Date" "Fri, 31 Mar 2017 10:08:42 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"2Osxk\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"lwipI\",\"description\":\"uaORx\",\"id\":\"177057932317550_218189694871040/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_218189694871040/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_218189694871040/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_168333893234364/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 226,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "hRQJwIFMSyM331P9ndk9Fwlvo6Bn8jtaLipe/GZLOoA1eB5e09W7kZC7Bx2dpkJJ+7SuGjBsB4w5q3wIKqIwUQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"c4fee447b134c497db51dc8444d17b3727b70f47\"",
  "x-fb-trace-id" "D0KG++5mlta",
  "Date" "Fri, 31 Mar 2017 10:08:41 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"yo6I3\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"5eGec\",\"description\":\"YkqoW\",\"id\":\"177057932317550_168333893234364/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_168333893234364/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_168333893234364/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_235614199800401/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 220,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "RNOzEAAK+q/EPw+zWSNEkFLtWAaozuTupHW2R9HbX4uS6i7As0O9hgwso8fFwR2mP5Flucm0trB5RTR5pPXvSg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"19f0e139918e1272699496a834715403e06d9aad\"",
  "x-fb-trace-id" "B+TyfSn4Ocp",
  "Date" "Fri, 31 Mar 2017 10:08:41 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"SOVqa\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"NYLMr\",\"description\":\"Pxm62\",\"id\":\"177057932317550_235614199800401/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_235614199800401/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_235614199800401/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_240014989344643/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 222,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "DN0t8j7vlbGULLY61yks2GzdDwj539NLfuS00pExUhtvtXRljzclOsbA7DYk4X17H3XpHX0wKzyrPLqV3J/LXw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8e4a44f8fc3b06015e96095c3d2609bb0a8e8230\"",
  "x-fb-trace-id" "GheWQdMT83d",
  "Date" "Fri, 31 Mar 2017 10:08:41 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"FC62U\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"7Jus4\",\"description\":\"f2evk\",\"id\":\"177057932317550_240014989344643/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_240014989344643/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_240014989344643/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_224521170914631/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 231,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "tLZsQYJNNl/wDaz4ZQhMqB37jX2vZy2AL+yEuY8TcTy2p46+yZfe5d+rwyon1F4kTSm2c8rTh3yb4bENmq2GZg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"cc1abf593468a52890fc13d04ac3dde6241f2284\"",
  "x-fb-trace-id" "HPKSViGsp6x",
  "Date" "Fri, 31 Mar 2017 10:08:41 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"tmOJ1\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8m0gT\",\"description\":\"apdng\",\"id\":\"177057932317550_224521170914631/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_224521170914631/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_224521170914631/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_249145035105683/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314",
 :as :json}
(fn [req]{:request-time 228,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "ixkvrSdYkdpLhvSe5rY43foXhzaX3GA8h5yoy40an26ympX5Iw29KG5XzidAUXUUvHilb9NsIABnyv9fQJzCZw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"d5fc3197287331ed63889bf208761e5bfa1e1e20\"",
  "x-fb-trace-id" "Hy1rHVAFuNg",
  "Date" "Fri, 31 Mar 2017 10:08:40 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"q9ccR\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"iHIrj\",\"description\":\"ETca8\",\"id\":\"177057932317550_249145035105683/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_249145035105683/insights?access_token=XXTOKENXX&since=1490868514&until=1490954914&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_249145035105683/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdBmZCEpy6qDk6tj1rYLio1WD6i6UyX9iSmIVoZBUWSDXzmsZCLVcHP30JZCmeEoSeLJoZBcoE4FxPZCt6kL7iZAiKu3unFebHaxYRfH79qZBgkM7GeaPgZDZD&since&access_token=XXTOKENXX&until=1293605065",
 :as :json}
(fn [req]{:request-time 208,
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
  "GFI1Tw0YYqvBPNm7nIKddZlJTRCJNmv8JnYr1addQDXaP0SW5Sjr5HNIcsO/YBL2mTS6PqNNFospmdsFw+6E6Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"1050253aec7b29caff644806927dabfa81406eee\"",
  "x-fb-trace-id" "BMyVUfa1h+3",
  "Date" "Fri, 31 Mar 2017 10:08:40 GMT",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length 11,
 :body "{\"data\":[]}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdBmZCEpy6qDk6tj1rYLio1WD6i6UyX9iSmIVoZBUWSDXzmsZCLVcHP30JZCmeEoSeLJoZBcoE4FxPZCt6kL7iZAiKu3unFebHaxYRfH79qZBgkM7GeaPgZDZD&since&access_token=XXTOKENXX&until=1293605065"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_179407758797038/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 232,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "R9rxg6EoPaNFls9VK98NT3lD5BXO8SzZOh+8bce/hF08/RwsCXya+BafDwrF3vMzOBLxjdmlyoBzxLYDDvQmag==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"dab948c3fdcd159bbb9d926f1e2bd3bf2dfc2f9b\"",
  "x-fb-trace-id" "FlXZD7bM0bB",
  "Date" "Fri, 31 Mar 2017 10:08:40 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"SlPI2\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"B9u9J\",\"description\":\"LY3pS\",\"id\":\"177057932317550_179407758797038/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_179407758797038/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_179407758797038/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_183429435059845/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 223,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "cuTucmgrA7lg2a/qT8jizluMnrK5Z5F5AwemATJqvHwFbrQ37UC7oZKEcagcOb/8gRe75CSBpBwCQSdU8S6dig==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"df59c6d16ce83d1bb91d8565412f59cb09e5313d\"",
  "x-fb-trace-id" "HzD7X0F6zn5",
  "Date" "Fri, 31 Mar 2017 10:08:40 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"DVh9P\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"duRMy\",\"description\":\"OfhYS\",\"id\":\"177057932317550_183429435059845/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_183429435059845/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_183429435059845/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_158899414188800/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 229,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "iQuHHLYf7VFu/rdx6hn2PrEcQs82UCCSJQm/LO22peHKUh2e6nMrlmKLd479hcgqYXEhvnAmCdJjs+kUAyoy4g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"0e5b26270f42eb86dd89ac1f484dca910ff7101b\"",
  "x-fb-trace-id" "DPWejEcvEca",
  "Date" "Fri, 31 Mar 2017 10:08:39 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"89Zj7\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"IDiVK\",\"description\":\"Ucgpj\",\"id\":\"177057932317550_158899414188800/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_158899414188800/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_158899414188800/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_141088755980548/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 216,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "+Wp5rR+POxbTb9ZPq8TgCRPYaS7+9c7A4dfvdtvcVZ1f1jUTBOvEjWtA5XglW4lvz7VtSO2LJUf3lUOn5asOKg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"b6d3c89457ee79c3a116cae338154b04f2c4e0b5\"",
  "x-fb-trace-id" "Hvx0sQG+fnD",
  "Date" "Fri, 31 Mar 2017 10:08:39 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"xCuvR\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"m9o1P\",\"description\":\"x89OU\",\"id\":\"177057932317550_141088755980548/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_141088755980548/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_141088755980548/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_252981534725189/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 212,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "cbe/bLuRFZYPXXd1E1iEyK2SsjVfDUIbJ/euKySdMg8IWd5SpXG+OUKsYJMoHux+21N+CSmJCol6SacwY7RsSw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"6d3c38c8ad137625a26f92036217372c960d2683\"",
  "x-fb-trace-id" "HvQKOj8Z3Vv",
  "Date" "Fri, 31 Mar 2017 10:08:39 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"GoExN\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ZHBF6\",\"description\":\"UC5hp\",\"id\":\"177057932317550_252981534725189/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_252981534725189/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_252981534725189/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_271057969584212/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 231,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "D829vu8Z9cyDCg3mr9D0pGkjH3Py8Qptiil9NAf4W0DDlJtyRP6rgUSsUiqWzfA/hANfIhqvOPIHDyBEMRM5tA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"3bc5ff89e3d4af92b406181dd0933bc81c0ce904\"",
  "x-fb-trace-id" "DO2hh/AMJJO",
  "Date" "Fri, 31 Mar 2017 10:08:39 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"GkjkY\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"OxI1v\",\"description\":\"wrKTr\",\"id\":\"177057932317550_271057969584212/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_271057969584212/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_271057969584212/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_277989612224381/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 235,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "86j/xk802f9s06i5McXvjwHDU6wR1o6BN4zozH4EjeXNrQwS6oM5dKy6aMxJ1RkEb5RtKTcPla0jU2+ABBy+TA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"4d91a8a19a941dbded9554a406ee5fe65c7240e6\"",
  "x-fb-trace-id" "FgDB/p1CDjw",
  "Date" "Fri, 31 Mar 2017 10:08:39 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"mLYcb\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"BrUF2\",\"description\":\"CeKLP\",\"id\":\"177057932317550_277989612224381/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_277989612224381/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_277989612224381/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_247915598594326/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 219,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "nIZey7IKMP0zPhbgOUM1afcjf+v8s0AUaRQH9rk5xYbSdMITh4T06idtJaVbGlL/NSx+igyJa2OZD6h2nWdGTQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"c9d73dbdb7bec95d82627ad89600ceaa6fe02dff\"",
  "x-fb-trace-id" "B1E6DFD9+yo",
  "Date" "Fri, 31 Mar 2017 10:08:38 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"R0DED\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"6DeES\",\"description\":\"MpJRQ\",\"id\":\"177057932317550_247915598594326/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_247915598594326/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_247915598594326/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_278627468827262/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 213,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "LC+M6XnmrH/FvKbH/PCnMHOcP01X1aUqwSpo7K0nt7YEXSS2kXI1c5t1ddNegyBbfUrbjPoCx4s4u/w34qzN9w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"abaaad9a2c831bda2c3ffa77128c3dd7e1176d8f\"",
  "x-fb-trace-id" "DXT/5paE1n2",
  "Date" "Fri, 31 Mar 2017 10:08:38 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"N6Tet\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"k5Mgu\",\"description\":\"8OFmo\",\"id\":\"177057932317550_278627468827262/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_278627468827262/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_278627468827262/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_140498742716844/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 219,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "JOKaQ//ax4fdbOlFPKMnjIaHiONwEMkQ20B+BQisPtJ03oGLa4kmhepiV7/MFf9s9zr/pmB+hjwdVihObXVTng==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"d086de25ccbe02d3578de323fff128772029ac38\"",
  "x-fb-trace-id" "DqmUSjm/pHh",
  "Date" "Fri, 31 Mar 2017 10:08:38 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"zRpvJ\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"djf2m\",\"description\":\"ZIaMW\",\"id\":\"177057932317550_140498742716844/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_140498742716844/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_140498742716844/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_280609595295716/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 304,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "De5Q1eusmTsIDclI5fFC+ub/P9a1dIR9otaJwApZyJtJ9qtsSUZ1/Kmp9Fk4xoZqLmX14MUxPQFXhPnlls9Agg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"eb57d1b175e437fec8e4edf7988ca14e4d17b7d7\"",
  "x-fb-trace-id" "F/T6AoTQORt",
  "Date" "Fri, 31 Mar 2017 10:08:38 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Sov88\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"s7wnZ\",\"description\":\"R1fTc\",\"id\":\"177057932317550_280609595295716/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_280609595295716/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_280609595295716/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_281387161884626/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 224,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "a0Rybf6C55Emm58w7Q17Bcoq4SgIVYZ1ST+Qlhd3clmIPl4oN7EfYR2WLq5uZHG7VL50JwbGyUdH5uVQ3cogNA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"3304eecea3a9dafb66fc2b45d5c70091203a554b\"",
  "x-fb-trace-id" "G7W9wJq5t3c",
  "Date" "Fri, 31 Mar 2017 10:08:37 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Z768a\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Qj4SI\",\"description\":\"mUX09\",\"id\":\"177057932317550_281387161884626/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_281387161884626/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_281387161884626/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_285051821518160/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 224,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "fRxAC8xerA7eBXsQuMnZ4EEa9tpWJ1sCgb9svwzDbKTMIm+KEh2Y3TE0Aaq+IYTx/6eI+IidP+osDvSKWmwzKQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"0f3997f17af820253e680cc0246ad3d605ec9e2d\"",
  "x-fb-trace-id" "EDcVcCLMzCl",
  "Date" "Fri, 31 Mar 2017 10:08:37 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"jjxSO\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"SK0jM\",\"description\":\"eEtSF\",\"id\":\"177057932317550_285051821518160/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_285051821518160/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_285051821518160/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_269366146445734/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 240,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "w65o9l32pF7AcoJBIAAR4ROOkKMtrKQbZWBv80xOTxih0t4XL0aYdCzZf8JL8+G07vVuh8uVs4aTSUUVHdjkag==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ccd5bedc3fcb3b33f6d6d75da90b2f7276f3ade6\"",
  "x-fb-trace-id" "A2kZkDRQskA",
  "Date" "Fri, 31 Mar 2017 10:08:37 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"FyhXR\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"xO8in\",\"description\":\"WFRRS\",\"id\":\"177057932317550_269366146445734/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_269366146445734/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_269366146445734/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_285228031514604/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 220,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "LpLx91DUkYo80H9tI95s54bsdU6FgXefNuFhVKnLfNjwEDpDqOKCbM7NJ1fYolNDtj3n+ApwbR62HD/TfEf70A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"d246cea7be310580511905aef81227818bdc8bdb\"",
  "x-fb-trace-id" "C//2jGuz14I",
  "Date" "Fri, 31 Mar 2017 10:08:37 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"JTRFo\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Tlmz1\",\"description\":\"Zcxon\",\"id\":\"177057932317550_285228031514604/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_285228031514604/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_285228031514604/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_302791829744159/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 236,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Vq+A6eAvvU523VfB4ujmHVBv9JWJWnksMObr9Jm5qL+H4OsVGNQprwCKFxOoAAHE7fGOXr/wnG+foTIvhQDbCg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"dc3c063585e3f7e9e82101cfc65a548cad9515f4\"",
  "x-fb-trace-id" "HrpJj5MVhDS",
  "Date" "Fri, 31 Mar 2017 10:08:36 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"PZnlV\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"jDHQc\",\"description\":\"4h1uN\",\"id\":\"177057932317550_302791829744159/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_302791829744159/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_302791829744159/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_305252146164794/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 216,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "zTDJBq2waCLutnx166i1HeabSEjmOwhcY6TGjBaIhRE7utRHgm5hWEI5smHozjtuKpkbfqqyvmFC+rApxy/zPQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"0a4380c700565fdea98014ad308a7f66dd35344a\"",
  "x-fb-trace-id" "BWdsUTKtK54",
  "Date" "Fri, 31 Mar 2017 10:08:36 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"FL3WI\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"0HpF2\",\"description\":\"6fQ4N\",\"id\":\"177057932317550_305252146164794/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_305252146164794/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_305252146164794/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_305498366140172/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 224,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "wecmeJRwO06RTvKPqOTNK4/AK1TSbUnPk5GguW4t/VlrP9bBef1PTWyGTgtnXuqOW+Y64PUYdKCuTxviS5E0UA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"befba7df053a9c0ac8db9e42afce14d67d2b2328\"",
  "x-fb-trace-id" "Hv3akbGZG9+",
  "Date" "Fri, 31 Mar 2017 10:08:36 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"LixXT\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"mf9u6\",\"description\":\"wVq7g\",\"id\":\"177057932317550_305498366140172/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_305498366140172/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_305498366140172/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_323610584328950/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 220,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "8K7YV+aP8QgbpPg645tXan5t+943lo3NkBw40oXetMxTGYuXLNWomyyiNzUcNEZO0PFnFEElaYSwfFaRNjQi2A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"11c6c58facdea558afbc67011ba5872b982e901b\"",
  "x-fb-trace-id" "Hzt9mmjW19w",
  "Date" "Fri, 31 Mar 2017 10:08:36 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"V5ar7\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9yCnR\",\"description\":\"e62Mz\",\"id\":\"177057932317550_323610584328950/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_323610584328950/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_323610584328950/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_353214921378881/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 225,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "kFtotpZQwJ52hUXqh0AI8BbWahTyE30A14TGLb70f3VKUruagZ9wnwmOqDrwGwbCkQV7RdaKMohL6Nu9ymKDJQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"6899f4a256dc0f29eb628c5190e2ec599d7890af\"",
  "x-fb-trace-id" "D9+dA2v+e5/",
  "Date" "Fri, 31 Mar 2017 10:08:36 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"c5WsO\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"yre44\",\"description\":\"EmB4N\",\"id\":\"177057932317550_353214921378881/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_353214921378881/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_353214921378881/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_352005758179048/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 240,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "zoIClGhflwEKkXDtYpoB0IcndnzGRe1Z+wHpQ0q6rc7/4SV2/W9L14q/SDo6SALIsC6hsH7po46UqRVbwJSnrA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"7327fb275a5f9d37e743202202d0f1382df8870c\"",
  "x-fb-trace-id" "D5C3EcbM+9y",
  "Date" "Fri, 31 Mar 2017 10:08:35 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Bk5FE\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"qNIXQ\",\"description\":\"bcSv2\",\"id\":\"177057932317550_352005758179048/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_352005758179048/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_352005758179048/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_361138837242791/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 224,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "RxttL/mFidmEYkDel+AWW/yDEmwIgl5PG9kFjOY0sXWvvqNW5zMJZIVMOSnElOtbeLecJXv38ZGhfxXVScu/Rg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"c855803ec4f106adb2be791da1225c56d596612a\"",
  "x-fb-trace-id" "G6iMg+BTmSW",
  "Date" "Fri, 31 Mar 2017 10:08:35 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"vucQd\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"FayWV\",\"description\":\"as8T8\",\"id\":\"177057932317550_361138837242791/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_361138837242791/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_361138837242791/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_162215200570381/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 214,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "i6FWRRsqZmn4e911EaygOzfcJXelZ3z2ixOTrAwsrJVN6rOBpVGFbbhOKthFtbcf7j6Qi6Iml41BBTbTUWWfCA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f03838dad113dd4c0dcd579b41ce993dd9aaac50\"",
  "x-fb-trace-id" "B+tSZkrBid2",
  "Date" "Fri, 31 Mar 2017 10:08:35 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"oZ04H\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8nT75\",\"description\":\"QYHnr\",\"id\":\"177057932317550_162215200570381/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_162215200570381/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_162215200570381/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_228383477282117/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
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
  "X-FB-Debug"
  "yeyJMIo+AOXlSPHy/MOe23JwMSdiP5EOmYunhSi+JL620s0CvU+bzyCKO38SthyOqFCiSr946xsiz0KiPUnp+A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"e06c2de864aa8e2c8c48d78c76fc5523ed6a9d8c\"",
  "x-fb-trace-id" "DbhIto4zUtw",
  "Date" "Fri, 31 Mar 2017 10:08:35 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"uGahw\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ldDj4\",\"description\":\"acgja\",\"id\":\"177057932317550_228383477282117/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_228383477282117/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_228383477282117/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_334081216672711/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307",
 :as :json}
(fn [req]{:request-time 229,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "6iJV5ZpVTgLExQAmybyeOWEvvULUHQXYDLj/oSy1RSeG+YxOjNoaBjBLnvM4fC9OSpYz0VRuBjk/T2s/64R91Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"d19fa1c53fdcf3cfc3552fe6d43e75a3b1ea71ba\"",
  "x-fb-trace-id" "BAZz574rvqu",
  "Date" "Fri, 31 Mar 2017 10:08:34 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"J9GpW\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"427xI\",\"description\":\"rUIiD\",\"id\":\"177057932317550_334081216672711/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_334081216672711/insights?access_token=XXTOKENXX&since=1490868507&until=1490954907&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_334081216672711/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdDnvmx5UWNYrNwIX2OArIpib9M9JiijkLCGuD5B8S8sm67D2ZBYuJ2L75tmL6z6oTiUTpaZAE6C512SopTZBmZCEoJYoIuF8ZAfR7iBTuYsKG9p6TgZDZD&since&access_token=XXTOKENXX&until=1313691799",
 :as :json}
(fn [req]{:request-time 709,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "fzpFlfpX9RIdjRr7lNfWJvk834jyATf7nEtPVnNOkMdbZVB6t1dHDMSMscG61GGoQinIRFWb+LFtOfpWHhRDyQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ca876207741d87df2f0e2174d4675f06a93590ec\"",
  "x-fb-trace-id" "FZ4iOYZ68LX",
  "Date" "Fri, 31 Mar 2017 10:08:34 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"177057932317550_249145035105683\",\"insights\":{\"data\":[{\"name\":\"3twT9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"o1Tmg\",\"description\":\"2RPTN\",\"id\":\"177057932317550_249145035105683/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_249145035105683/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_249145035105683/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_224521170914631\",\"insights\":{\"data\":[{\"name\":\"Cqd35\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"DjnTv\",\"description\":\"9IMkd\",\"id\":\"177057932317550_224521170914631/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_224521170914631/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_224521170914631/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_240014989344643\",\"insights\":{\"data\":[{\"name\":\"TmhIp\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"SQlad\",\"description\":\"vEQV8\",\"id\":\"177057932317550_240014989344643/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_240014989344643/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_240014989344643/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_235614199800401\",\"insights\":{\"data\":[{\"name\":\"l4Pfs\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"scYw8\",\"description\":\"3hO6x\",\"id\":\"177057932317550_235614199800401/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_235614199800401/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_235614199800401/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_168333893234364\",\"insights\":{\"data\":[{\"name\":\"xnF2W\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"t6eg5\",\"description\":\"XcUsM\",\"id\":\"177057932317550_168333893234364/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_168333893234364/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_168333893234364/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_218189694871040\",\"insights\":{\"data\":[{\"name\":\"F0Y0B\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ObkKE\",\"description\":\"PYVHq\",\"id\":\"177057932317550_218189694871040/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_218189694871040/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_218189694871040/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_216377241726149\",\"insights\":{\"data\":[{\"name\":\"bMBXr\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"5qseh\",\"description\":\"Rd5am\",\"id\":\"177057932317550_216377241726149/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_216377241726149/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_216377241726149/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_209620832394593\",\"insights\":{\"data\":[{\"name\":\"63n1n\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"LQ0Fn\",\"description\":\"e9aR2\",\"id\":\"177057932317550_209620832394593/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_209620832394593/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_209620832394593/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_215623685128044\",\"insights\":{\"data\":[{\"name\":\"fVq2g\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Dp79X\",\"description\":\"BMySR\",\"id\":\"177057932317550_215623685128044/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_215623685128044/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_215623685128044/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_196467620396988\",\"insights\":{\"data\":[{\"name\":\"tezSs\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ZnZV9\",\"description\":\"hwlgI\",\"id\":\"177057932317550_196467620396988/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_196467620396988/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_196467620396988/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_137582739648143\",\"insights\":{\"data\":[{\"name\":\"YlaFw\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"HXbdw\",\"description\":\"d7mr8\",\"id\":\"177057932317550_137582739648143/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_137582739648143/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_137582739648143/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_211220768894075\",\"insights\":{\"data\":[{\"name\":\"DzVWy\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"O9mSN\",\"description\":\"anIe5\",\"id\":\"177057932317550_211220768894075/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_211220768894075/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_211220768894075/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_197403570282986\",\"insights\":{\"data\":[{\"name\":\"S3R7j\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"qFb8P\",\"description\":\"iZyoi\",\"id\":\"177057932317550_197403570282986/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_197403570282986/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_197403570282986/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_192688704088246\",\"insights\":{\"data\":[{\"name\":\"XTZ3Z\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"hzq1D\",\"description\":\"wpP4p\",\"id\":\"177057932317550_192688704088246/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_192688704088246/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_192688704088246/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_199870140026616\",\"insights\":{\"data\":[{\"name\":\"i8fu5\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"j9Coj\",\"description\":\"swnxN\",\"id\":\"177057932317550_199870140026616/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_199870140026616/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_199870140026616/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_185882488101761\",\"insights\":{\"data\":[{\"name\":\"tOlP2\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"aQxhd\",\"description\":\"VdSeI\",\"id\":\"177057932317550_185882488101761/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_185882488101761/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_185882488101761/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_126067137462604\",\"insights\":{\"data\":[{\"name\":\"V1TPQ\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"7uT4d\",\"description\":\"8XD5K\",\"id\":\"177057932317550_126067137462604/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_126067137462604/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_126067137462604/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"10210943130921627_142856509109591\"},{\"id\":\"177057932317550_184322484924428\",\"insights\":{\"data\":[{\"name\":\"IkMg0\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ryFlP\",\"description\":\"5CRBM\",\"id\":\"177057932317550_184322484924428/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_184322484924428/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_184322484924428/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_181683068521703\",\"insights\":{\"data\":[{\"name\":\"xJL1G\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"gRTtd\",\"description\":\"kk8Sl\",\"id\":\"177057932317550_181683068521703/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_181683068521703/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_181683068521703/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_180908155265861\",\"insights\":{\"data\":[{\"name\":\"XFDKY\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"VI5ti\",\"description\":\"yWHfw\",\"id\":\"177057932317550_180908155265861/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_180908155265861/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_180908155265861/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_134098826650108\",\"insights\":{\"data\":[{\"name\":\"fW1mE\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"OwavY\",\"description\":\"6eiCJ\",\"id\":\"177057932317550_134098826650108/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_134098826650108/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_134098826650108/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}},{\"id\":\"177057932317550_171674186203006\",\"insights\":{\"data\":[{\"name\":\"zyCzR\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"MDTkc\",\"description\":\"wJsVW\",\"id\":\"177057932317550_171674186203006/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_171674186203006/insights?access_token=XXTOKENXX&since=1490868514&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954914\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_171674186203006/insights?access_token=XXTOKENXX&since=1490954914&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041314\"}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdAozlGJ1qXUUPW4Lc8UOZBFOBle9zNZAqx1FNPmJMZB1Di3ZAKvbOY2hWL1CGh5W7yheFlcCWNhZBGaZAnbLASlgz2DojuviDJO5gIBTZAm7ckOFa7xAZDZD&since=1312967602&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdBmZCEpy6qDk6tj1rYLio1WD6i6UyX9iSmIVoZBUWSDXzmsZCLVcHP30JZCmeEoSeLJoZBcoE4FxPZCt6kL7iZAiKu3unFebHaxYRfH79qZBgkM7GeaPgZDZD&since&access_token=XXTOKENXX&until=1293605065\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdDnvmx5UWNYrNwIX2OArIpib9M9JiijkLCGuD5B8S8sm67D2ZBYuJ2L75tmL6z6oTiUTpaZAE6C512SopTZBmZCEoJYoIuF8ZAfR7iBTuYsKG9p6TgZDZD&since&access_token=XXTOKENXX&until=1313691799"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_206217736172757/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 267,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Ulct2cR2WVAj066WDOUwNhYYL6Odo0MwsmJVJLbnVAZ16pVSQMgHchHa4lv1HorpiR1Gq7bYFl+PEARBdWZtrw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8adae889d325648d3252e913171739e2f658fbac\"",
  "x-fb-trace-id" "FTiV6L6sRii",
  "Date" "Fri, 31 Mar 2017 10:08:33 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"OYr0Y\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"G4oW5\",\"description\":\"SouKJ\",\"id\":\"177057932317550_206217736172757/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_206217736172757/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_206217736172757/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_420838671299530/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 215,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "/FZy/Qhnt7N/Q65lV0dzXvR1XdC5byQSWRGWpRsVtjthm+hHFACl2XTv17wDgXyE6DbTo7gJ72cRjClCneAiJA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"034e3bb69b2e5c0316f8714c61b1a155c1ac2f47\"",
  "x-fb-trace-id" "Fnczd5SjH68",
  "Date" "Fri, 31 Mar 2017 10:08:33 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"61gca\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"uJnvE\",\"description\":\"9sRiH\",\"id\":\"177057932317550_420838671299530/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_420838671299530/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_420838671299530/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_444666632223344/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 240,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "sCT9oS6MjcB8bfVvrs41HuXpHA63IVLC7fxlixmu4eNR0jH2kIhjXYxPtWt1ezEtIXDk7kJjugpWgutKLsYDEw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"93d774982a0209f78f46e0103ecde9e60caa8e11\"",
  "x-fb-trace-id" "EHVeptDi8Su",
  "Date" "Fri, 31 Mar 2017 10:08:33 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"U6UTf\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"FgqU2\",\"description\":\"lHjHH\",\"id\":\"177057932317550_444666632223344/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_444666632223344/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_444666632223344/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_472227856128208/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 224,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "XS7EeLOrj3SP1FbLw3f/V/vQ6/+waskIA9/8YGLagFoE8DWmpD2hpJwQr8lAuCictkQKdtUwzMRz3lFxbG4eww==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"1e007b9c41fcc525cf388a2a95fbe45f6823856f\"",
  "x-fb-trace-id" "B+bzGt6r0nz",
  "Date" "Fri, 31 Mar 2017 10:08:33 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"g11rv\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"r5V7c\",\"description\":\"8JP9u\",\"id\":\"177057932317550_472227856128208/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_472227856128208/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_472227856128208/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_449064145116926/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 238,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "FNykNd5rCWeWQDBzOx89Zv6t1h1SPhEA6IUcb8wWMiLQBuwCRicn+gUyqavPaTSI39G90S5N6P/Xci2IrTIVaQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"9369fc5a3cd45e2392e99b29daad6a1585f953bd\"",
  "x-fb-trace-id" "ADnssMDMK5r",
  "Date" "Fri, 31 Mar 2017 10:08:33 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"HwplU\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"hG9sK\",\"description\":\"SsOUV\",\"id\":\"177057932317550_449064145116926/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_449064145116926/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_449064145116926/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_452914554731885/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 243,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "oYjoLm2b7yu9ERtL9Sb2Ws5aRT9fQgbCuE25nZHKF254RJS1w6B78rz1gPYXOyZqObgVZyuMqmylBr0lYQl25w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"9ec8662e4d0c3378fded9e63b09971e72753c689\"",
  "x-fb-trace-id" "HooiBurc4kk",
  "Date" "Fri, 31 Mar 2017 10:08:32 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"gempZ\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Yt4bm\",\"description\":\"vO1Hk\",\"id\":\"177057932317550_452914554731885/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_452914554731885/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_452914554731885/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_188865441248552/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 232,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "IK4CV0BgQc9aDrF87upLHd5DH0AmYsWTjqYWeMa6/vokYX8sGL9RD98s7I+dmQrvXNcAO274G6wdzloaZ+8olQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"9aa54459f50cc1bd4bd9381a7d00e9a92e63b363\"",
  "x-fb-trace-id" "GruTBag69pa",
  "Date" "Fri, 31 Mar 2017 10:08:32 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"HLXUU\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"H2uYZ\",\"description\":\"g1llr\",\"id\":\"177057932317550_188865441248552/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_188865441248552/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_188865441248552/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_368159903264593/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
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
  "X-FB-Debug"
  "Pp7I2v9IkABRXGJ1TR425QQd3z+ED/CQZJorKY9cgoM7jANNL+7FuuE/QFs2coQ1qIdV+MuomHNYatiA7yFE4Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"377cdc6c35c79e9615e7ae083c32093e04421535\"",
  "x-fb-trace-id" "F08/9AIVNYh",
  "Date" "Fri, 31 Mar 2017 10:08:32 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"fXEyW\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"7Cs92\",\"description\":\"SmSvE\",\"id\":\"177057932317550_368159903264593/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_368159903264593/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_368159903264593/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_294180184015204/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 225,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "qSD6BveVb1TcgJ7PRwLozGyQL4EDbBFnVr+h3+AG32GRazfPTgdZ7ra4GqYWXapx7AfnGEO1zdVUJvZJ/8LQqA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"19d4c906df09a86759025de22aa79090693350f2\"",
  "x-fb-trace-id" "HUJs3h0aCQJ",
  "Date" "Fri, 31 Mar 2017 10:08:31 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"VfZav\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"GPfHr\",\"description\":\"ifY4a\",\"id\":\"177057932317550_294180184015204/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_294180184015204/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_294180184015204/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_403487893058520/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 213,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "EUDz8cdjjkuZmRnWPu9MOd5fUXo9Oc4NSKByD1n0/kbH7gE+dIZkuzKkAC7RQmN99KYvJKAVMpKczUMRSyoc4w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"4d3fbd08934ab8502c8619302f45cbd5654d894f\"",
  "x-fb-trace-id" "GJ1CBvNbmgF",
  "Date" "Fri, 31 Mar 2017 10:08:31 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"yOPz2\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"5e24U\",\"description\":\"HandR\",\"id\":\"177057932317550_403487893058520/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_403487893058520/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_403487893058520/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_4749466741966/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
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
  "X-FB-Debug"
  "8OrInZa5QSCSJqaM6UdHZ+UBMK7KraJYXifgcdC/BaN+UDfGyYIXFkYqDq4eHsG4XLu46l1JBc496cZ8WBlc0g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"bd9002a8554d905fdb139df6c931e9a7d4277728\"",
  "x-fb-trace-id" "HSmmxP1gNJK",
  "Date" "Fri, 31 Mar 2017 10:08:31 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"OU5nb\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"tW1Cf\",\"description\":\"BrpG6\",\"id\":\"177057932317550_4749466741966/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_4749466741966/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_4749466741966/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_4749470622063/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 210,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "4varrIOX89VrOHAc+9RS38AtoIxpHELoG7GCrLd7/t2aS2HaQYlnoYNTUPDuRJGOTzK9JWwfn7poW40Uh8nNXw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"2bf9f0260d6dfcdc2d251ca804af786aa20b4987\"",
  "x-fb-trace-id" "HJZ3PO76dQl",
  "Date" "Fri, 31 Mar 2017 10:08:31 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"SQbfy\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"sssMZ\",\"description\":\"4NHfh\",\"id\":\"177057932317550_4749470622063/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_4749470622063/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_4749470622063/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_398123956929427/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 211,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "k3uvjUHbZF0b+rjjePWKvK4r92+lZ+mfHPxepKDhZ2rA2JVKqV2yK3ZWH9GXTwfCIIiXBZroDFQbrOyJy5UyHA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"a973cf685af813091c0ee598df58fdc58d4e2af9\"",
  "x-fb-trace-id" "Ezv5kZeO3w0",
  "Date" "Fri, 31 Mar 2017 10:08:31 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Lw5Gj\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"T6Gg5\",\"description\":\"TUh9Z\",\"id\":\"177057932317550_398123956929427/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_398123956929427/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_398123956929427/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_490073454349328/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 223,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "CRvy0YMet0mdyOZIlOgITIAtnvdce8UapD5pijjMju/rpgq/lRLub3k7GjSgC3/JCiQnFvofRDQm6JLhx8FS1w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"0613e730a2a248b30eea57064271de3b3e53769d\"",
  "x-fb-trace-id" "DEOmJzZ2GA9",
  "Date" "Fri, 31 Mar 2017 10:08:30 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"VqvR3\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"cqol0\",\"description\":\"OmWek\",\"id\":\"177057932317550_490073454349328/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_490073454349328/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_490073454349328/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_173834012740815/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 223,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "mRrOEuOlodZD5nkQUFx6bTD/vn/TIK9XKzl6HOOLk7F25zdrVOCNJA4KUKCWpIQ5z7lwlAHoWjMSq2SXIhpAog==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"d22ca67c5effcd0798862a3cfd6240485c66ba52\"",
  "x-fb-trace-id" "HgL+BlDbKB+",
  "Date" "Fri, 31 Mar 2017 10:08:30 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"bPCGk\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"CLWrC\",\"description\":\"PEhQ6\",\"id\":\"177057932317550_173834012740815/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_173834012740815/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_173834012740815/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_193778417428982/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 216,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "yfMBWofSPkeERarwULmy+eevb3Y9kYP6XMwMYZOb0Gz+njTO6LgmjNkk8aEoLpVakUZwZub8I6PueQKtGD8SOA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f5a2d220cfa3a58b233974ef2cdd8a43936de7e2\"",
  "x-fb-trace-id" "F1dJMVeJscb",
  "Date" "Fri, 31 Mar 2017 10:08:30 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"pDO1s\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"PPdR5\",\"description\":\"IB3B5\",\"id\":\"177057932317550_193778417428982/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_193778417428982/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_193778417428982/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_318695688240580/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 220,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "cQ8dSezFTND4YKlhc84Xe5yPwnKsYIoGb4YkSG77kCOxZ/n2l2+jXVB980RBB4Ysy8kW5epIoFd2LBUoQhevGw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"57454d00a0b8b4cf8aaa48517d64237178e77db0\"",
  "x-fb-trace-id" "Cw6i+CC2OyT",
  "Date" "Fri, 31 Mar 2017 10:08:30 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"SzSdV\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"NC7Td\",\"description\":\"wfNjT\",\"id\":\"177057932317550_318695688240580/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_318695688240580/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_318695688240580/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_505184512838222/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 245,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "jIWhKwwuwbsaFPPjUeckbJ6/uV8SGPJesQsD5Obv3axKmkqpO7GGKUFRfiCEmAOjkszoJtXB4Te08W6sAARSKw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"c5f641231662e65f1308984a9d8289ed08fbd9e0\"",
  "x-fb-trace-id" "Bs/AOf02Iwp",
  "Date" "Fri, 31 Mar 2017 10:08:29 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"nvyP9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"WGgWf\",\"description\":\"phsF0\",\"id\":\"177057932317550_505184512838222/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_505184512838222/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_505184512838222/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_521257084573804/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 222,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "S+Cyu5CmTPNYxwKDi3lBIn+KrviUxrZJ1GsD2jISTdunonJscywDUC28b9E7vdA20zA4gmMkrTZMR4YqxWDydw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"cd27ca2137cfa5d18201bd9493c1914d7abf4bb6\"",
  "x-fb-trace-id" "DXy2oYUI2V8",
  "Date" "Fri, 31 Mar 2017 10:08:29 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"SaYKK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"zhyEs\",\"description\":\"2vgCd\",\"id\":\"177057932317550_521257084573804/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_521257084573804/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_521257084573804/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_504556319595892/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 250,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "2xKQRJbdo0MQNPssFrsWyWZ+gQt30qfUeXAlVdHBfmmU+p+mvJuae/wSD91G0jKPBcmRECWbzoqb6zdYNTOd3A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"dfa1ed83f29c783dc556e64c0588e1825cac2549\"",
  "x-fb-trace-id" "E2NNijbdJTd",
  "Date" "Fri, 31 Mar 2017 10:08:29 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"a2w76\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"2HY8V\",\"description\":\"fRXke\",\"id\":\"177057932317550_504556319595892/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_504556319595892/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_504556319595892/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_524183217605018/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 306,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "yoy9T1kpxzlcfJjmHaPWIALOjJmDndGhUxMgkObQHX8NcejpQXmQPEZx8bOvtQrdhIV25ZjAAkh/0WFXSJMiFw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"39539d73547e93332eb2201becbdee243bc59713\"",
  "x-fb-trace-id" "CQg+MmLZyuM",
  "Date" "Fri, 31 Mar 2017 10:08:29 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"7Yu1F\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"QLLc6\",\"description\":\"wRkCU\",\"id\":\"177057932317550_524183217605018/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_524183217605018/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_524183217605018/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_435813276500215/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 237,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "9WazqWHv0t2E1UGiOyXHucPvGt3s/ZI25u6+3j4IijKmUMOIPNfYMnVYzVKu/dnDPRtlhASSVO4N7BrlbYiExQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"7195181e629994dbb402bf58c226fa9f2666d158\"",
  "x-fb-trace-id" "Dgi9N+ts2c1",
  "Date" "Fri, 31 Mar 2017 10:08:28 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"dMIth\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"H36J1\",\"description\":\"HrOyc\",\"id\":\"177057932317550_435813276500215/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_435813276500215/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_435813276500215/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_539121112777895/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 223,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "iyVVapZDcPt/oq9YdzqRX0QqShmQkREfti4nWUTLzkce2o7/05vYUljl1qa1iRQ4gGpW1cmv3cfFkS2EhLoKcg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"7aa7e2c63b953082867bf4ff97b1bec032edb77d\"",
  "x-fb-trace-id" "DEiEcbj0zRP",
  "Date" "Fri, 31 Mar 2017 10:08:28 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"fXPKC\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"IhSOE\",\"description\":\"2bbs1\",\"id\":\"177057932317550_539121112777895/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_539121112777895/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_539121112777895/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_352096094902637/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 215,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "l3uqykzhTQnxs45e9x/VWTM+w0zb93kIryESd2PnbhDEAgTBXu33KWiHfy9byo9vnuSsRxkA9bdpMgakgAi8xQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"4b00eb8fcee80451c86a819e57df1d8721278bff\"",
  "x-fb-trace-id" "HxzsVouIfC5",
  "Date" "Fri, 31 Mar 2017 10:08:28 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"rGsd8\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"O5mU1\",\"description\":\"rfpbK\",\"id\":\"177057932317550_352096094902637/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_352096094902637/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_352096094902637/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_10200383182935457/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301",
 :as :json}
(fn [req]{:request-time 232,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "MReGKvL5K35rIpS6h5CQRpjtlm7G+laQyPoFkbB4KtybRcTq5GXbgyHq86qBOiZR/iwHvJY05i7NF1ish2GnxA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8946069524681ad5446ca35ad3c05b0ff61e1eb8\"",
  "x-fb-trace-id" "FNi93Wx3gah",
  "Date" "Fri, 31 Mar 2017 10:08:28 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"yCOXf\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"UFabT\",\"description\":\"Hw5jv\",\"id\":\"177057932317550_10200383182935457/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10200383182935457/insights?access_token=XXTOKENXX&since=1490868501&until=1490954901&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_10200383182935457/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdBW0sKAA0d3W8VS3vUPD751TcHBjDmApQVyszfZB6ClaeiBZAFIPzAcZBnSgEGYd3MzzQc5Vc70su8PomZCGxIJh7uqdWieB7USPOdCCiyQ4VGMbwZDZD&since&access_token=XXTOKENXX&until=1343209626",
 :as :json}
(fn [req]{:request-time 529,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "8N3gNDDDrWRB1r34tmW1TGedcajtUT2DZBKiQNshk1DLi5Ar72LR+Kx6sdXYz+Ayv5GacXhdAs69/oNQGFvHcg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"5d5d63d026383d703533bc6c884e69d0c6ef0e01\"",
  "x-fb-trace-id" "DTTUrq7bOtF",
  "Date" "Fri, 31 Mar 2017 10:08:28 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"177057932317550_334081216672711\",\"insights\":{\"data\":[{\"name\":\"DGYQV\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"RFCfW\",\"description\":\"IfN0V\",\"id\":\"177057932317550_334081216672711/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_334081216672711/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_334081216672711/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_228383477282117\",\"insights\":{\"data\":[{\"name\":\"DCgP9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"RVhzp\",\"description\":\"nSuJy\",\"id\":\"177057932317550_228383477282117/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_228383477282117/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_228383477282117/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_162215200570381\",\"insights\":{\"data\":[{\"name\":\"v9j30\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"7LaOG\",\"description\":\"SMeKt\",\"id\":\"177057932317550_162215200570381/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_162215200570381/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_162215200570381/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_361138837242791\",\"insights\":{\"data\":[{\"name\":\"WJMJP\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"7HqYd\",\"description\":\"fMyjY\",\"id\":\"177057932317550_361138837242791/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_361138837242791/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_361138837242791/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_352005758179048\",\"insights\":{\"data\":[{\"name\":\"9ey2p\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"pPJFo\",\"description\":\"BO3ew\",\"id\":\"177057932317550_352005758179048/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_352005758179048/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_352005758179048/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_353214921378881\",\"insights\":{\"data\":[{\"name\":\"LcpDh\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"CkRo6\",\"description\":\"ZbnOQ\",\"id\":\"177057932317550_353214921378881/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_353214921378881/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_353214921378881/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_323610584328950\",\"insights\":{\"data\":[{\"name\":\"t5HLV\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"o8OcW\",\"description\":\"xBqbx\",\"id\":\"177057932317550_323610584328950/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_323610584328950/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_323610584328950/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_305498366140172\",\"insights\":{\"data\":[{\"name\":\"Zh5a2\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"YORzl\",\"description\":\"RjWYh\",\"id\":\"177057932317550_305498366140172/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_305498366140172/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_305498366140172/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_305252146164794\",\"insights\":{\"data\":[{\"name\":\"rs0Yt\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"I2YL5\",\"description\":\"n66bW\",\"id\":\"177057932317550_305252146164794/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_305252146164794/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_305252146164794/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_302791829744159\",\"insights\":{\"data\":[{\"name\":\"cJIZK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"jO0hE\",\"description\":\"gxkyw\",\"id\":\"177057932317550_302791829744159/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_302791829744159/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_302791829744159/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_285228031514604\",\"insights\":{\"data\":[{\"name\":\"2gJOG\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"UU65u\",\"description\":\"mMHZV\",\"id\":\"177057932317550_285228031514604/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_285228031514604/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_285228031514604/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_269366146445734\",\"insights\":{\"data\":[{\"name\":\"QKeJZ\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"sZ3oK\",\"description\":\"v5IPp\",\"id\":\"177057932317550_269366146445734/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_269366146445734/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_269366146445734/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_285051821518160\",\"insights\":{\"data\":[{\"name\":\"QhgB6\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"vWdpX\",\"description\":\"uESNl\",\"id\":\"177057932317550_285051821518160/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_285051821518160/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_285051821518160/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_281387161884626\",\"insights\":{\"data\":[{\"name\":\"FvDxg\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"XeLwh\",\"description\":\"oMlz2\",\"id\":\"177057932317550_281387161884626/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_281387161884626/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_281387161884626/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_280609595295716\",\"insights\":{\"data\":[{\"name\":\"C0mod\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"3HRIe\",\"description\":\"LPiq6\",\"id\":\"177057932317550_280609595295716/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_280609595295716/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_280609595295716/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_140498742716844\",\"insights\":{\"data\":[{\"name\":\"FiD1m\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"HqlE1\",\"description\":\"zYcHe\",\"id\":\"177057932317550_140498742716844/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_140498742716844/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_140498742716844/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_278627468827262\",\"insights\":{\"data\":[{\"name\":\"b8qsw\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"gTB5x\",\"description\":\"mLoq5\",\"id\":\"177057932317550_278627468827262/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_278627468827262/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_278627468827262/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_247915598594326\",\"insights\":{\"data\":[{\"name\":\"nf34P\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ZUJ8s\",\"description\":\"mazyQ\",\"id\":\"177057932317550_247915598594326/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_247915598594326/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_247915598594326/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_277989612224381\",\"insights\":{\"data\":[{\"name\":\"Ddj2x\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ZNXG7\",\"description\":\"K6GoB\",\"id\":\"177057932317550_277989612224381/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_277989612224381/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_277989612224381/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_271057969584212\",\"insights\":{\"data\":[{\"name\":\"nbbta\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"B0lmV\",\"description\":\"L7EmO\",\"id\":\"177057932317550_271057969584212/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_271057969584212/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_271057969584212/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_252981534725189\",\"insights\":{\"data\":[{\"name\":\"n4rHK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"BLHXw\",\"description\":\"rPZlc\",\"id\":\"177057932317550_252981534725189/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_252981534725189/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_252981534725189/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_141088755980548\",\"insights\":{\"data\":[{\"name\":\"EikeR\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ItqD5\",\"description\":\"v3BYf\",\"id\":\"177057932317550_141088755980548/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_141088755980548/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_141088755980548/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_158899414188800\",\"insights\":{\"data\":[{\"name\":\"BTavg\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"vEnH3\",\"description\":\"owZam\",\"id\":\"177057932317550_158899414188800/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_158899414188800/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_158899414188800/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_183429435059845\",\"insights\":{\"data\":[{\"name\":\"1LYOf\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"hVFRw\",\"description\":\"v6Blj\",\"id\":\"177057932317550_183429435059845/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_183429435059845/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_183429435059845/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}},{\"id\":\"177057932317550_179407758797038\",\"insights\":{\"data\":[{\"name\":\"mT9P5\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"sxIi6\",\"description\":\"3oY2q\",\"id\":\"177057932317550_179407758797038/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_179407758797038/insights?access_token=XXTOKENXX&since=1490868507&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954907\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_179407758797038/insights?access_token=XXTOKENXX&since=1490954907&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041307\"}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdBxAPrZCZCKJBgYzFKv7Vmy8MehG7EaI2rJtOazWzZCVZApn1qAUomPvfceWrW2ee5KVMr5dg7Nm8AUgIVIJVOqMys4UIhhpOdpt4FpPvhbkUxeEQZDZD&since=1341301653&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdDnvmx5UWNYrNwIX2OArIpib9M9JiijkLCGuD5B8S8sm67D2ZBYuJ2L75tmL6z6oTiUTpaZAE6C512SopTZBmZCEoJYoIuF8ZAfR7iBTuYsKG9p6TgZDZD&since&access_token=XXTOKENXX&until=1313691799\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdBW0sKAA0d3W8VS3vUPD751TcHBjDmApQVyszfZB6ClaeiBZAFIPzAcZBnSgEGYd3MzzQc5Vc70su8PomZCGxIJh7uqdWieB7USPOdCCiyQ4VGMbwZDZD&since&access_token=XXTOKENXX&until=1343209626"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_548725015150838/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 231,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Wl4jVc6WQqKCfaB4b3jclbOIljepE0SpQ5ymjwK98SklPtnXuqIIlBha3cBQ43wZf3YjZ+MiSqOlVHelXT6ulQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"2a771fa7fa8622f38c06bd8ddf3520f6fd949059\"",
  "x-fb-trace-id" "FvhCjeNxi7B",
  "Date" "Fri, 31 Mar 2017 10:08:27 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"CUToi\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"VoN0m\",\"description\":\"Mlz4j\",\"id\":\"177057932317550_548725015150838/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_548725015150838/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_548725015150838/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_548905048466168/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 239,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "bf8O6gIss9v1Fw4Sldp05OxtvvyypSf5J6MVxsR6FomAF4U+vHCgVGrvI9leX6Be/2Y2Zl+p+c+eM6G9O20lSA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"b1e3fccf60f759d2ba1792db517a2a540efd0495\"",
  "x-fb-trace-id" "C7yWF+pie/d",
  "Date" "Fri, 31 Mar 2017 10:08:27 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"jHctO\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"42gG6\",\"description\":\"GxFPL\",\"id\":\"177057932317550_548905048466168/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_548905048466168/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_548905048466168/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_552180764805263/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 238,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Du5hStsdiMn29oJx8LHzkQw1tpEl0uVbIhSw/P8grAjXmPMsEHQU+LcQcHSYZ2uPC6v8HvR+jdZ3Oxr0ADvsIg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"4e7006882d7f83e17d11660fa335ca5f9f95f9d2\"",
  "x-fb-trace-id" "FUvYB3rulSS",
  "Date" "Fri, 31 Mar 2017 10:08:27 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"sIUTn\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9K2DG\",\"description\":\"41OIv\",\"id\":\"177057932317550_552180764805263/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_552180764805263/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_552180764805263/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_554128261277180/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 225,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "RkUvYg3n453jytWXwtdiVnO/Xc2yyuReSJ1dljWGCsmB9+BFEwewqXaBtgkIGV2j+YKyKDac6gxAZTaR2ZOLjQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"82c44c031c9445d78071a42ae9c01f9380d10134\"",
  "x-fb-trace-id" "BaqN8ac5gYj",
  "Date" "Fri, 31 Mar 2017 10:08:26 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"E3dIy\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"1taSg\",\"description\":\"Vz1Hj\",\"id\":\"177057932317550_554128261277180/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_554128261277180/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_554128261277180/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_556370214386318/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 223,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "16RS8/r+3Y9dD2kcWNqr7N7+OvPAibjJy2znJhHh9GWNXzwvs4+imlq9bqeanHJF9t6qBo0TuF7a5BQBGBpKpw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"be20708b73093bbbad0a892e043a2918b6762234\"",
  "x-fb-trace-id" "AncsGZF5U71",
  "Date" "Fri, 31 Mar 2017 10:08:26 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"FE0Q9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Q6nI8\",\"description\":\"UTqQS\",\"id\":\"177057932317550_556370214386318/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_556370214386318/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_556370214386318/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_576225999067406/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 239,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "kCiNTXHDcvnsyQUb9eKY7sXytr7RqHM4mC/vaMuGSLtRL0vQSPGnX703Eh1/hW/uy9PXYfPNM768Voz0ZxVZJQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"1c23bbb3115440713fd7e873f2f0490d15234718\"",
  "x-fb-trace-id" "EWH0VkWTJk0",
  "Date" "Fri, 31 Mar 2017 10:08:26 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"ZbSak\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"WMJmZ\",\"description\":\"FDGtl\",\"id\":\"177057932317550_576225999067406/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_576225999067406/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_576225999067406/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_587969594559713/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
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
  "X-FB-Debug"
  "pxFerBhiZ28jr7pnpG2UpchK5UUjXZR637uHgsE8P5ggcr3Z3ic0SggktZD1eGotHrdotHpIj0jh9NiJyPFpgw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"c9b65edb7cd6befd8d5b2e27811e469cac1b09a1\"",
  "x-fb-trace-id" "Fseyj4H+G3c",
  "Date" "Fri, 31 Mar 2017 10:08:26 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"s5yCM\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"dfbvp\",\"description\":\"IUqtn\",\"id\":\"177057932317550_587969594559713/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_587969594559713/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_587969594559713/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_10151520077942551/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 239,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "GqrFCXp/mc2xVWPn9c0zDkv9jFZGtUrHBCO2E9Q0PPqf2bLNtawlxuqzvu5PZOVsqtEoDhRfZZhxNhxt7xrU0w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8b0deaf91b3eb756e28daccab3f09d6adb33f39f\"",
  "x-fb-trace-id" "BYHvGSIxbAt",
  "Date" "Fri, 31 Mar 2017 10:08:25 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"qZ4Jn\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9LPxQ\",\"description\":\"uP6rE\",\"id\":\"177057932317550_10151520077942551/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10151520077942551/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_10151520077942551/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_593958677294138/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 220,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "NIOVWuTCM8DlUTk6LzXXyxDiYxQE4QF6ozw4v5lHGzWh7SGVQKPSRf7DECx8Wg/Vb6aY7YVXUHl6KCRptBMW4w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"579f81df40f10ed6d18b745c24917bce2aeae50b\"",
  "x-fb-trace-id" "CCDSuxxiTvM",
  "Date" "Fri, 31 Mar 2017 10:08:25 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"kXfIj\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"oMMZr\",\"description\":\"1l9J7\",\"id\":\"177057932317550_593958677294138/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_593958677294138/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_593958677294138/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_602382753118397/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 267,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "3I2kUTnbWe19KJ44J9KxdA+/YqIUhKM67Mx/jaO+7dr11/oit5iso9aE4IcQFV8kb3R7i1lyDz4XDzGdr5o5FQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"2d8d66e6a4201a6ec12898ee44ec232463e0283e\"",
  "x-fb-trace-id" "CRFlr5S7s1s",
  "Date" "Fri, 31 Mar 2017 10:08:25 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"d9LRd\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"bbHZL\",\"description\":\"sIjLi\",\"id\":\"177057932317550_602382753118397/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_602382753118397/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_602382753118397/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_605510722805600/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
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
  "Id08tG0WYUG453Ho2urJCmI9RPIZZgJ2IByeNoMjCZOhWdcRjbjd34HaAnAON63u3Ypi7IPUEyKcvVMzkmEjtw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8485d7a93522d96ff479bf330f4b1b07aa8e41e6\"",
  "x-fb-trace-id" "BAHnpBQ8cM8",
  "Date" "Fri, 31 Mar 2017 10:08:25 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"ywL1U\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Xkt2K\",\"description\":\"9Wks9\",\"id\":\"177057932317550_605510722805600/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_605510722805600/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_605510722805600/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_663940230295982/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
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
  "X-FB-Debug"
  "Mt+yT9gylPgpm/ge39hcHHfQPIePx7g3wmFanNBNtOQgGu4k0g/gIno6gKV4BH9jw/kJxwfa8DNtE3SaXmpc2g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"26b74dfd1d359e91fbf2bc1bd48731905f4592db\"",
  "x-fb-trace-id" "G0qvw0vuNz0",
  "Date" "Fri, 31 Mar 2017 10:08:24 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"j56dh\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"mRhJL\",\"description\":\"wLbmI\",\"id\":\"177057932317550_663940230295982/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_663940230295982/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_663940230295982/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_10202183243654151/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 216,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "7BOf8L+5YKAxBMIHYUzv3aCfmJhATtpYl00XZD92jB4lNQPipdawvsfhyK+T77AjxdTh22rYylQjrLRmQuksYQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"74fb48b3b9f247ed199eba4f3841cd524ac71ea7\"",
  "x-fb-trace-id" "BBl0MtAZUho",
  "Date" "Fri, 31 Mar 2017 10:08:24 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Z6kGe\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"teVgm\",\"description\":\"d0Ne6\",\"id\":\"177057932317550_10202183243654151/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10202183243654151/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_10202183243654151/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_668383459851659/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 227,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "fJ83sjNp21tzrZYaAf8bMAKETbjGgZoJU41iQkC2QJ42IVIRfZNVYD7qahIuCwel3Akw8bERZrcmgGe7brxtcA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"57f33d12c48f3b1055df4b34a60996b39f5c8cba\"",
  "x-fb-trace-id" "E6Z6ZNC54M1",
  "Date" "Fri, 31 Mar 2017 10:08:24 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"86xqt\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"mNmQS\",\"description\":\"Cq8k8\",\"id\":\"177057932317550_668383459851659/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_668383459851659/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_668383459851659/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_10202220745311669/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
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
  "Ktay8QQZAnF2U2eE5ZbSd6u5Wc6j81v1NRO4h0KFy6eY49/ubFaQwJXuK9usPp+3tbRG6mf6b9+X+2nQo6I8Uw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"9aecdee1d77bafb08517913ca044cfc537d83907\"",
  "x-fb-trace-id" "CLslvtnjbRv",
  "Date" "Fri, 31 Mar 2017 10:08:24 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Cm20W\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"0j30t\",\"description\":\"F6Ihx\",\"id\":\"177057932317550_10202220745311669/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10202220745311669/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_10202220745311669/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_726738767349461/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 209,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "PB03Uoo32xncgaEse2fbscZup6sfTFjt4KzFdrgegk/tVW4zDXb6jpKHK+h5HXCQA7bB8ILy3iKHG7JngtpYCA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"72b93166f5949cb7243818ac00541887cac7cc04\"",
  "x-fb-trace-id" "H/EQUV2jP9B",
  "Date" "Fri, 31 Mar 2017 10:08:23 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"NYLaL\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"hktlO\",\"description\":\"1EX5m\",\"id\":\"177057932317550_726738767349461/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_726738767349461/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_726738767349461/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_728259217197416/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 216,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "yIG6nSVwvLiSerQ1pQLPaL2n2i6ICvdD58uNd2U1VMUyZP0ToLJi6tGmY2KvgDJVI47woE5n25+Qb/cbNGl9og==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"2dcb9d4d062a5b0db0f3200a36ac4b363188b4a8\"",
  "x-fb-trace-id" "CgLipZ5CHq+",
  "Date" "Fri, 31 Mar 2017 10:08:23 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"EDwpq\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ZNBHJ\",\"description\":\"Yv9Ko\",\"id\":\"177057932317550_728259217197416/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_728259217197416/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_728259217197416/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_728575040499167/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 331,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "wE7HaqsTVYCaOgXck45K2P+PvBQ8KWBME939/3yHZdTbmmDb/MIn/6IsTQUlNrd1ZQOEI8vqsjkndbJO/k5muQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"b2ed46b614b2a132113846c8c2d405c3264dd637\"",
  "x-fb-trace-id" "HIpwbkwmtGA",
  "Date" "Fri, 31 Mar 2017 10:08:23 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"QcP2W\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"gM7lE\",\"description\":\"8frbE\",\"id\":\"177057932317550_728575040499167/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_728575040499167/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_728575040499167/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_728575230499148/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 233,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Xmv1E440szDl/mpL0/qWIBQGe8cnwkvdsbdj6xTyF839U0C9wagV5ihOE64XmM7spz8JCUa7AjPhV9mtVIs0Bw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"80d8fb29fed57dbe9772e94076c91ab795d6cd00\"",
  "x-fb-trace-id" "C/OThNs7WrS",
  "Date" "Fri, 31 Mar 2017 10:08:23 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"d4skd\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"V6Y7J\",\"description\":\"nssln\",\"id\":\"177057932317550_728575230499148/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_728575230499148/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_728575230499148/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_743919872298017/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 244,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "mkJWZLp1XJeAkjrZGrRJhTDm9RLwBknz5H/QyWHxche6zAwnW8Iv9fvgaoRv6uogfBqkLp68sR6bqc9YTH/kKQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"7a772399081c35d549c47136948e47fa653ed00d\"",
  "x-fb-trace-id" "F2izsVllWEu",
  "Date" "Fri, 31 Mar 2017 10:08:22 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"dVN4q\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"quxcw\",\"description\":\"us2gh\",\"id\":\"177057932317550_743919872298017/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_743919872298017/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_743919872298017/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_752191708137500/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 229,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "ZqroLeO7eTK/tMhWCPZ8DS5Ev+qfkyaKE/8wq/1vtasP5gK2UfcyeZpaYbfOPZtSZAmqzADWStHqZ1d4lf7bwg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"9588f130c9f0e7600ea3a0aa9ac560b2684340d5\"",
  "x-fb-trace-id" "FhSPSttP48l",
  "Date" "Fri, 31 Mar 2017 10:08:22 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"qdoqS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ElRnS\",\"description\":\"OSBZo\",\"id\":\"177057932317550_752191708137500/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_752191708137500/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_752191708137500/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_752430261446978/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 210,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "SVW3PyXKWJO2Dx9b2UO2M4BZd6+zeFNc1Z+vWadGE7hoFcKXRL6/URHri7we0lNnIfHmXNhkaYDlCAo6tDPvtg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"045de729138a138a83429e191041e392ed7031a6\"",
  "x-fb-trace-id" "GRt9kJ8g2A3",
  "Date" "Fri, 31 Mar 2017 10:08:22 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"aJPTx\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"IvR7g\",\"description\":\"w7Uo4\",\"id\":\"177057932317550_752430261446978/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_752430261446978/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_752430261446978/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_754064174616920/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 255,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "hD8hUC8+emPGEcY3X4EYOM99Z8zCSs5YxzhpMhm6HQuxX6xS9f0Gs6+4Muo7ZMP6ArQhynrzaKN7/H8wpON7/g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"a6d3c70029f06ecc0b7f83268969253197fabb23\"",
  "x-fb-trace-id" "CH8qM5p+G8n",
  "Date" "Fri, 31 Mar 2017 10:08:22 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"p0Gzz\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"N331H\",\"description\":\"3Yp8Y\",\"id\":\"177057932317550_754064174616920/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_754064174616920/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_754064174616920/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_754072867949384/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 214,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "2yN9wqAnV8khMlRXboLzWAc5osP3XnExuCbkjGMzQbc3fql2cl1KtixKavQHxEwGH6thdcw6yB1DlksfofuHQA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"e34c1c1887d88c3e7feafc06746cda85d62a1fa7\"",
  "x-fb-trace-id" "Hk2MPIKCzOP",
  "Date" "Fri, 31 Mar 2017 10:08:22 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"9Kh0D\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"mQIui\",\"description\":\"CdbHL\",\"id\":\"177057932317550_754072867949384/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_754072867949384/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_754072867949384/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_754441377912533/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293",
 :as :json}
(fn [req]{:request-time 223,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "tynwFL450A/VAqlT49NaCpenI8zqeWrBLpUHGGK0w05beaROtjKb0jkzPueKTfgeqEtiWefKtxrhtUw7wRwj7w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"a9a55cc324493961d4f83a2031b4d7b354c0daf4\"",
  "x-fb-trace-id" "EWdfBWC+Fu7",
  "Date" "Fri, 31 Mar 2017 10:08:21 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"8Pccs\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"LDl1a\",\"description\":\"PYocU\",\"id\":\"177057932317550_754441377912533/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_754441377912533/insights?access_token=XXTOKENXX&since=1490868493&until=1490954893&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_754441377912533/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdCrOkkgA6lYUd0h6nZA7lQwoRALYioDqaSJqfg1ZBnlP3YQHLSGmOB7LgJdOym1GnzvtcJKwFnGVmwl3Vk2rLBHBE3YTMEaYrO1eoELpxCMFZBZBwZDZD&since&access_token=XXTOKENXX&until=1366706931",
 :as :json}
(fn [req]{:request-time 473,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "lcAEqH8lqkiEf9vBcNy0qUzry0GZs7Q8yLQmqFwihLGb+QFm+svDNN16ojjbFnRMK1+G8VZVZfsZbT+hn1uOow==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"eaacb6ae7948f4cce367c4e4e1a0bd6fb087f451\"",
  "x-fb-trace-id" "C11b5jesOOR",
  "Date" "Fri, 31 Mar 2017 10:08:21 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"177057932317550_10200383182935457\",\"insights\":{\"data\":[{\"name\":\"hgFOm\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"VSByZ\",\"description\":\"i7mCt\",\"id\":\"177057932317550_10200383182935457/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10200383182935457/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_10200383182935457/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_352096094902637\",\"insights\":{\"data\":[{\"name\":\"IdRv9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"vFBYN\",\"description\":\"hI1bM\",\"id\":\"177057932317550_352096094902637/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_352096094902637/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_352096094902637/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_539121112777895\",\"insights\":{\"data\":[{\"name\":\"wENhP\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Ksk0n\",\"description\":\"xtQRi\",\"id\":\"177057932317550_539121112777895/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_539121112777895/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_539121112777895/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_435813276500215\",\"insights\":{\"data\":[{\"name\":\"n5Npx\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"UyMop\",\"description\":\"WrpGv\",\"id\":\"177057932317550_435813276500215/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_435813276500215/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_435813276500215/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_524183217605018\",\"insights\":{\"data\":[{\"name\":\"ja4gq\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"tXw0p\",\"description\":\"Pr65m\",\"id\":\"177057932317550_524183217605018/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_524183217605018/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_524183217605018/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_504556319595892\",\"insights\":{\"data\":[{\"name\":\"GHCFs\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"KQMCD\",\"description\":\"r7dF5\",\"id\":\"177057932317550_504556319595892/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_504556319595892/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_504556319595892/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_521257084573804\",\"insights\":{\"data\":[{\"name\":\"788ou\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"LFa2p\",\"description\":\"jG4Eg\",\"id\":\"177057932317550_521257084573804/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_521257084573804/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_521257084573804/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_505184512838222\",\"insights\":{\"data\":[{\"name\":\"0LoVj\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"HPbjY\",\"description\":\"dYvt7\",\"id\":\"177057932317550_505184512838222/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_505184512838222/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_505184512838222/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_318695688240580\",\"insights\":{\"data\":[{\"name\":\"NFvOV\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"NI8zP\",\"description\":\"YEPIp\",\"id\":\"177057932317550_318695688240580/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_318695688240580/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_318695688240580/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_193778417428982\",\"insights\":{\"data\":[{\"name\":\"JRutC\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"vS6QG\",\"description\":\"RkdZk\",\"id\":\"177057932317550_193778417428982/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_193778417428982/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_193778417428982/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_173834012740815\",\"insights\":{\"data\":[{\"name\":\"h23kg\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"eDnch\",\"description\":\"ptVgQ\",\"id\":\"177057932317550_173834012740815/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_173834012740815/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_173834012740815/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_490073454349328\",\"insights\":{\"data\":[{\"name\":\"w4lE8\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"UDWGQ\",\"description\":\"w3G3i\",\"id\":\"177057932317550_490073454349328/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_490073454349328/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_490073454349328/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_398123956929427\",\"insights\":{\"data\":[{\"name\":\"3TGBr\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"WYyJB\",\"description\":\"wFBHw\",\"id\":\"177057932317550_398123956929427/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_398123956929427/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_398123956929427/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_4749470622063\",\"insights\":{\"data\":[{\"name\":\"2tMVV\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ovoGm\",\"description\":\"ExeQ6\",\"id\":\"177057932317550_4749470622063/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_4749470622063/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_4749470622063/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_4749466741966\",\"insights\":{\"data\":[{\"name\":\"yl947\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"44tSh\",\"description\":\"rXGgc\",\"id\":\"177057932317550_4749466741966/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_4749466741966/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_4749466741966/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_403487893058520\",\"insights\":{\"data\":[{\"name\":\"OaTRI\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"pr1Us\",\"description\":\"c9Ho3\",\"id\":\"177057932317550_403487893058520/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_403487893058520/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_403487893058520/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_294180184015204\",\"insights\":{\"data\":[{\"name\":\"2BY9F\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"3mRtm\",\"description\":\"hgNcy\",\"id\":\"177057932317550_294180184015204/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_294180184015204/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_294180184015204/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_368159903264593\",\"insights\":{\"data\":[{\"name\":\"3j580\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Hv2x6\",\"description\":\"Lssgz\",\"id\":\"177057932317550_368159903264593/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_368159903264593/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_368159903264593/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_188865441248552\",\"insights\":{\"data\":[{\"name\":\"B5uLl\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"U9LkZ\",\"description\":\"0C4vc\",\"id\":\"177057932317550_188865441248552/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_188865441248552/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_188865441248552/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_452914554731885\",\"insights\":{\"data\":[{\"name\":\"tj56h\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"qCWya\",\"description\":\"YLtFj\",\"id\":\"177057932317550_452914554731885/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_452914554731885/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_452914554731885/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_449064145116926\",\"insights\":{\"data\":[{\"name\":\"sn9oK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"lKBhU\",\"description\":\"4JFw4\",\"id\":\"177057932317550_449064145116926/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_449064145116926/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_449064145116926/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_472227856128208\",\"insights\":{\"data\":[{\"name\":\"WdnT9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"inLun\",\"description\":\"y4qrM\",\"id\":\"177057932317550_472227856128208/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_472227856128208/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_472227856128208/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_444666632223344\",\"insights\":{\"data\":[{\"name\":\"5trH3\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"RVwXe\",\"description\":\"H664Z\",\"id\":\"177057932317550_444666632223344/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_444666632223344/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_444666632223344/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_420838671299530\",\"insights\":{\"data\":[{\"name\":\"aOc0D\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"dONEd\",\"description\":\"d2n2k\",\"id\":\"177057932317550_420838671299530/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_420838671299530/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_420838671299530/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}},{\"id\":\"177057932317550_206217736172757\",\"insights\":{\"data\":[{\"name\":\"oftKm\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"keY5h\",\"description\":\"WXtYQ\",\"id\":\"177057932317550_206217736172757/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_206217736172757/insights?access_token=XXTOKENXX&since=1490868501&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954901\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_206217736172757/insights?access_token=XXTOKENXX&since=1490954901&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041301\"}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdBlbTTJGze9rCQqL3bwupdnT0WitvkRnPFkStvcDaVYOSLCW5cwmdXmZCcR9SAN0u4uK0MwWKZBtZBZBZATRAZC2EI0QdXNmCfAMihkZCJ9uHVuRuA4AZDZD&since=1366702117&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdBW0sKAA0d3W8VS3vUPD751TcHBjDmApQVyszfZB6ClaeiBZAFIPzAcZBnSgEGYd3MzzQc5Vc70su8PomZCGxIJh7uqdWieB7USPOdCCiyQ4VGMbwZDZD&since&access_token=XXTOKENXX&until=1343209626\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdCrOkkgA6lYUd0h6nZA7lQwoRALYioDqaSJqfg1ZBnlP3YQHLSGmOB7LgJdOym1GnzvtcJKwFnGVmwl3Vk2rLBHBE3YTMEaYrO1eoELpxCMFZBZBwZDZD&since&access_token=XXTOKENXX&until=1366706931"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_755399434483394/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 232,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "9LMrm4Hgcgp/s3HATvYOkOIeyEx244tV9tU9HqSIDxjDZAUZA0jWSNoe+QZkNzKRyrdQtg8ug82w9IBcgwp4Lg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"a88b15c58e797819d205383fc752f0089dd16ed5\"",
  "x-fb-trace-id" "H+jbZr5RvML",
  "Date" "Fri, 31 Mar 2017 10:08:21 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"72nrv\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ouTF5\",\"description\":\"Nx1X4\",\"id\":\"177057932317550_755399434483394/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_755399434483394/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_755399434483394/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_756609071029097/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 202,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "ahLaPxRrs55QyM2JvdjhQttXQ7UTj2MBwYhgRqRpnDbWm2oGNtqXbdFnStW3cZ8BnksiuNuecJbeo7BgclovRQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"153994bb385a387c98f7a1bea80e84ecf2654d7a\"",
  "x-fb-trace-id" "EFXXlIhLR5q",
  "Date" "Fri, 31 Mar 2017 10:08:20 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"ZnsSS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"HySJZ\",\"description\":\"LryQI\",\"id\":\"177057932317550_756609071029097/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_756609071029097/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_756609071029097/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_758019590888045/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 276,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "GaKoecWOPBAFs7AdNug+I3NzwU+Fxh+Jdi2pqUK/41KRUxKUBD6yVgYNMq2H60fH40B2Fi2Cpe/pKU54YGQbIQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8459345ee643f5dd3053053523a4c46bbda9a56f\"",
  "x-fb-trace-id" "FvVPGCXN3m1",
  "Date" "Fri, 31 Mar 2017 10:08:20 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"b3Fqi\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"60kFR\",\"description\":\"274Dd\",\"id\":\"177057932317550_758019590888045/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_758019590888045/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_758019590888045/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_759927937363877/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 229,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "r3recgdxEcTnC+73gE48l8Lql2wSaMvBmMFw9EOA1J1YfSTmwV638thmZYV2LI6QswR2Jh7UM7w4aJkHq8RyXA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8c6952340279dce7393199f8ed6afc425aa9e0d4\"",
  "x-fb-trace-id" "CRmFti0qhCy",
  "Date" "Fri, 31 Mar 2017 10:08:20 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"BM6Kn\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"saGiZ\",\"description\":\"VYpKG\",\"id\":\"177057932317550_759927937363877/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_759927937363877/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_759927937363877/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_763436517013019/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 419,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "EViOb6KxOyThdIiEpPnZizPWnrcnm5mAC2bFkIhDNOdzU076U2IKuIz84l2TGQG+I8XESkW3zj4lw7Jb83uwDA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"eb2024631fc8f64b7e012a77fb6bf45f80489622\"",
  "x-fb-trace-id" "GQC3s4w1VBC",
  "Date" "Fri, 31 Mar 2017 10:08:20 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"jDzWh\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"33mr1\",\"description\":\"XEQjG\",\"id\":\"177057932317550_763436517013019/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_763436517013019/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_763436517013019/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_768031333220204/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 233,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "UYvhOiHpEJrdyfVGWd4UWkayd6DrgMqATTE+GykzTgxZ1C5qQTShz0Co70jDF+UAjdLanvoGx+5mbpp+4PdINg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ef04a2213ea3517289fbe89a42451df22b0787d1\"",
  "x-fb-trace-id" "EJ6YNSJ3cPF",
  "Date" "Fri, 31 Mar 2017 10:08:19 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"KUOQ9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"tasPa\",\"description\":\"KTBri\",\"id\":\"177057932317550_768031333220204/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_768031333220204/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_768031333220204/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_769681236388547/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 250,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "QO64Xs3N7K+6jBCKbDeXQzuqenwExEb/MeSeWWKLfncDU/FoXMrzPGDl58473011tArn1NnoarwWioKgBf4l7g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"930aba9aa428020da5c239d6b749cd86a8520616\"",
  "x-fb-trace-id" "FTE2NXI0lEP",
  "Date" "Fri, 31 Mar 2017 10:08:19 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"vWMDd\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"tfVUj\",\"description\":\"99iv2\",\"id\":\"177057932317550_769681236388547/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_769681236388547/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_769681236388547/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_770954352927902/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 238,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "y8AdXXtM7Yc0T4hxpLpkBWxccK/O5oS/1MGKLfv2m66817zl4LE+deReO4KrhS8jVE7q53f4o7tMGSVIHO+pzw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"afc12d81dac9ec8dd73f44278199d636a21c6e80\"",
  "x-fb-trace-id" "Em07DOuiibA",
  "Date" "Fri, 31 Mar 2017 10:08:19 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"HGph4\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"7LkeW\",\"description\":\"sgsx9\",\"id\":\"177057932317550_770954352927902/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_770954352927902/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_770954352927902/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_771704046186266/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 227,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "B2AlIypek9W+AKhqei/8z1CPJw4seflct2s/HD5i7z4rGJ9xwVCgH3gARvrwCxkZwD4fdNWOVxkj4uq9T5wqLg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f851f5fb20d3f0f0274bc62543704497aa1302ed\"",
  "x-fb-trace-id" "Ew5xVxl2hQB",
  "Date" "Fri, 31 Mar 2017 10:08:19 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"xrUzS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"0wKmj\",\"description\":\"XPJOH\",\"id\":\"177057932317550_771704046186266/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_771704046186266/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_771704046186266/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_779023718787632/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 233,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "C93Pa9C73NMvO3f/QGlCaLYQqVp6hhNjCjPFkPygUHP2dMXmVd7w7rCGm78tM5zUBPpL7ghSHb4Jk9iMnkWX/Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"1cb7eda5eeda747be7c0683a6eb5650ee2c9c940\"",
  "x-fb-trace-id" "GQdBiE2q91z",
  "Date" "Fri, 31 Mar 2017 10:08:18 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"fw9XB\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"2dWTP\",\"description\":\"EX0Dw\",\"id\":\"177057932317550_779023718787632/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_779023718787632/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_779023718787632/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_779709275385743/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 223,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "CrONEjDNFcY1asfTtxSa8dQncReEobeOlqIibT+AuodJDquA1zRVJXvaUuKOrdq6zZ9trPeB9sEL4XlrZvst3w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8d160909fee42761001b04ecbd3e284d96784dbf\"",
  "x-fb-trace-id" "CgE00mvIrzo",
  "Date" "Fri, 31 Mar 2017 10:08:18 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"a8Ffb\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"MdVEj\",\"description\":\"8uz6r\",\"id\":\"177057932317550_779709275385743/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_779709275385743/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_779709275385743/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_780460005310670/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 232,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "hPNMAYi+uJCTGOeg5vANqHQycj+wtmjNXyQnvWEBqxKoIfUQUcGNPM7GazxQuKPDLVoOQqhJof4/eFnBEjhRSg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"349a5ffb1871a24074f5b61caf47d898c0d8ff9c\"",
  "x-fb-trace-id" "B0sFH10/T7O",
  "Date" "Fri, 31 Mar 2017 10:08:18 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"9YV1M\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"RvM6S\",\"description\":\"FjWBN\",\"id\":\"177057932317550_780460005310670/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_780460005310670/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_780460005310670/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_780602168629787/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 609,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "po6fk4lUczNOXyCJesjEVMYM6fsQBzNir90TG2FDdDjrEaQlo1Yqtg2IR3SZN7Qclj6ulX64+bxQ/eXCQZtIoQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"c07f0ab5eb006c8af107afb809f2583ad020d1a0\"",
  "x-fb-trace-id" "DA0QYgA/MzC",
  "Date" "Fri, 31 Mar 2017 10:08:18 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"azdVa\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"e93E2\",\"description\":\"bdtQi\",\"id\":\"177057932317550_780602168629787/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_780602168629787/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_780602168629787/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_787058171317520/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 224,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "+EX6adeg4PbgJp3ybbLhiabbztPKVFqipHWx8anaZMO7BfSRpeennKdbqFF37yrwYehtmH5CaZTMBHtjFU+0Uw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"596c4b7816fec53f40e4b9e36bc44048cca80347\"",
  "x-fb-trace-id" "Cr2QF8Lmmju",
  "Date" "Fri, 31 Mar 2017 10:08:17 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"RnhI9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"mqhiW\",\"description\":\"lSF7w\",\"id\":\"177057932317550_787058171317520/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_787058171317520/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_787058171317520/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_787063444650326/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 293,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "31Ew9hYJmjXpCdkUWCdWog2tuk2YsUDAXgVSHvPc0819K83gPSvVbbRSHzgW2nXR6gs74wz3Haag03AmP6ZuXg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"630f892eb42eb367a1cdc9717745d1c5113621e4\"",
  "x-fb-trace-id" "CjQ1FDBwusx",
  "Date" "Fri, 31 Mar 2017 10:08:17 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"qNCal\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"1Wmlm\",\"description\":\"M5uiX\",\"id\":\"177057932317550_787063444650326/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_787063444650326/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_787063444650326/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_788400981183239/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
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
  "X-FB-Debug"
  "wyFVs6Tq+Nkd3FkacMMXySTNm/sWxJeYYVE0XneLwI/fKTRH4gMNYZXL4Bkh4419aj3iSxmpzTcIdpIPe7c72A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"4b706a75dbb2c1b0552eef9fec0cf3372b095b66\"",
  "x-fb-trace-id" "HAB4UZ7Q47/",
  "Date" "Fri, 31 Mar 2017 10:08:16 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"EWG3L\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"zHxMF\",\"description\":\"xnaNn\",\"id\":\"177057932317550_788400981183239/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_788400981183239/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_788400981183239/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_790080467681957/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 311,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "LD6lSMzdKelt+CddCD9gSAxI/WuuuvTmC7vxDqJ2fusyK1WFfCWH4pBKSH0pfTfgAkYGv6E/9PckrSlcBTDj5w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f181e7f1fa17e8cc15a5a96a059fef5f3e2ddbca\"",
  "x-fb-trace-id" "AQoYO8wvAjj",
  "Date" "Fri, 31 Mar 2017 10:08:16 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"7VlQH\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"f822q\",\"description\":\"asbqD\",\"id\":\"177057932317550_790080467681957/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_790080467681957/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_790080467681957/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_790255884331082/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 299,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "4n/WP1soReeJJQIjEhwXaNar5F68wHVxFOgz20F3ljr3eEunCNR+XYrxLwiSgfFyYGKJnYHY4MwfSSmwd50Hqg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"3f34df88c753ae420d4ea2abab98575383658e78\"",
  "x-fb-trace-id" "CAVjP3kVy1G",
  "Date" "Fri, 31 Mar 2017 10:08:16 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"7CiuP\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8aav5\",\"description\":\"2jW4T\",\"id\":\"177057932317550_790255884331082/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_790255884331082/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_790255884331082/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_791379880885349/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 342,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "DTr8xRDrSSWGmaIJp9S3kNHBHtR9P3PoFiZdjjDCeHxRgWMWGb6EKpMLtkfVIyoUyIfBQABYXmN7x0wS4FHcaQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"18c13691a48da3d0153d8f334fd8f6ed9bffd379\"",
  "x-fb-trace-id" "C1INxrnnGkf",
  "Date" "Fri, 31 Mar 2017 10:08:16 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"p3Fkx\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"CC8LP\",\"description\":\"lZQEX\",\"id\":\"177057932317550_791379880885349/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_791379880885349/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_791379880885349/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_800747633281907/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 376,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "CGXc3pRFa2XXkAJGIkrvzDi25v0XDaVu9bvNggI7+VoI+LP3lkcZHYz/qwr4Kk8zim5eoUcdz9DffFqFpbEAgQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"1f4409c698083ca675fef18ae3eb5f8e7aac0b9f\"",
  "x-fb-trace-id" "AzXPDv4popO",
  "Date" "Fri, 31 Mar 2017 10:08:15 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"XDQb6\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"rjzXP\",\"description\":\"YgRyy\",\"id\":\"177057932317550_800747633281907/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_800747633281907/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_800747633281907/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_801886059834731/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 291,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "U22c4AYGJkH8KBQRAhXcdMEuCEtnp1/buNqfbB3Yr5CRtA3/eTkGFQ1KsvIoNYw55y9uIU3y0CUQbEwIwwTRlA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"54416147613e2a1ef9e64cc3b3451151ac0c0cf6\"",
  "x-fb-trace-id" "D+oY08oaVxQ",
  "Date" "Fri, 31 Mar 2017 10:08:15 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"2cn4N\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"4FPK3\",\"description\":\"Z1aGU\",\"id\":\"177057932317550_801886059834731/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_801886059834731/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_801886059834731/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_809124919110845/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 324,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "zFPkGIuRKGOeakwPPketGyPdUGWkTuizpAAi3ejJwv9oU84AjCbou7wTzJf9mp5UwqUO3lbAhS5Q60wv7wHwPA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"b20e22a7285c627b8aff691ef69cce2746eeca90\"",
  "x-fb-trace-id" "BD1gE/eTnM3",
  "Date" "Fri, 31 Mar 2017 10:08:14 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"cE1sc\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"rH97a\",\"description\":\"UFvO1\",\"id\":\"177057932317550_809124919110845/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_809124919110845/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_809124919110845/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_809400435749960/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 286,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "leg1hMIlCpGImkgUkZWBPaDU7iigUNu9j2t754is0sItiXIQAiwS+thKqiHNcq25YUbtMxRAYTdPG2IaybbLNg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ec451a2c4862934521d501d858594074dc2b3815\"",
  "x-fb-trace-id" "HJomZr75d+f",
  "Date" "Fri, 31 Mar 2017 10:08:14 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"dof0k\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"EVDoe\",\"description\":\"soVzM\",\"id\":\"177057932317550_809400435749960/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_809400435749960/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_809400435749960/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_809469985743005/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 317,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "fQRRgIEhtjVphVFKb9EjPCvJISc3w9TVcZAJsEtx5ylrMqbJOOSrQA0vopCGzas1H7LFuRKA6kbU4RUauPXhEg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"2482025f86663f531c5e441445d7b04b5bd9b136\"",
  "x-fb-trace-id" "GBcUpxJSl7i",
  "Date" "Fri, 31 Mar 2017 10:08:14 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"57JcU\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"d6G4Q\",\"description\":\"ph1yu\",\"id\":\"177057932317550_809469985743005/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_809469985743005/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_809469985743005/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_810959602260710/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285",
 :as :json}
(fn [req]{:request-time 311,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "U0ohknpiAR17SZRz95O+2wZzSxBJokNWacXXVf+TyxvxHIwio2pl6SjWfLBgjdSvMjHp3+LYNRw5skmOQJNP4g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"0726e8694d3d791a40a5f1fac881c78ecb7255de\"",
  "x-fb-trace-id" "DNoUp07m2LK",
  "Date" "Fri, 31 Mar 2017 10:08:14 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"4U2VK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"TWVwu\",\"description\":\"HVNrQ\",\"id\":\"177057932317550_810959602260710/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_810959602260710/insights?access_token=XXTOKENXX&since=1490868485&until=1490954885&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_810959602260710/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdCi6ZBgK6j8MB5jDPZAhpmvxJostz5a0XqKFzDtRamIWoBquAIZC7NCGJg90Ntq4lkWooWm7dcBvZCL1jKBefIcxdAOkl5ipgmDMiWCnZBCP6wm3FQZDZD&since&access_token=XXTOKENXX&until=1405090964",
 :as :json}
(fn [req]{:request-time 711,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "dwqdUTnSP15CRp2986JLS2KYPxGvNHYtuFtU3qrsFYkWgqI0vmJT/LT5eOGdPma0Q3Erwn8TfsPiRVg+eO4lcA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"c24dfbf9346851e2f0571b8885aedd2a017e3d4a\"",
  "x-fb-trace-id" "HDtokH5xUN+",
  "Date" "Fri, 31 Mar 2017 10:08:13 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"177057932317550_754441377912533\",\"insights\":{\"data\":[{\"name\":\"GuqR8\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"WWzIr\",\"description\":\"q3leJ\",\"id\":\"177057932317550_754441377912533/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_754441377912533/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_754441377912533/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_754072867949384\",\"insights\":{\"data\":[{\"name\":\"CoqEL\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"4Ik3I\",\"description\":\"PpuVv\",\"id\":\"177057932317550_754072867949384/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_754072867949384/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_754072867949384/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_754064174616920\",\"insights\":{\"data\":[{\"name\":\"MTnDv\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"yEkDb\",\"description\":\"TO547\",\"id\":\"177057932317550_754064174616920/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_754064174616920/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_754064174616920/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_752430261446978\",\"insights\":{\"data\":[{\"name\":\"Z3tPv\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"pMaqo\",\"description\":\"6O023\",\"id\":\"177057932317550_752430261446978/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_752430261446978/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_752430261446978/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_752191708137500\",\"insights\":{\"data\":[{\"name\":\"Pqrno\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"txLfT\",\"description\":\"1rUdI\",\"id\":\"177057932317550_752191708137500/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_752191708137500/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_752191708137500/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_743919872298017\",\"insights\":{\"data\":[{\"name\":\"D2Vqa\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"JsQIq\",\"description\":\"GNlzK\",\"id\":\"177057932317550_743919872298017/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_743919872298017/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_743919872298017/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_728575230499148\",\"insights\":{\"data\":[{\"name\":\"B0yjz\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"cFmVy\",\"description\":\"WuYY1\",\"id\":\"177057932317550_728575230499148/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_728575230499148/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_728575230499148/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_728575040499167\",\"insights\":{\"data\":[{\"name\":\"shuXp\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"B05hb\",\"description\":\"QUNK5\",\"id\":\"177057932317550_728575040499167/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_728575040499167/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_728575040499167/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_728259217197416\",\"insights\":{\"data\":[{\"name\":\"j3RHD\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"63WDE\",\"description\":\"KBHVg\",\"id\":\"177057932317550_728259217197416/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_728259217197416/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_728259217197416/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_726738767349461\",\"insights\":{\"data\":[{\"name\":\"8hCu2\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"TPmGd\",\"description\":\"jEOVd\",\"id\":\"177057932317550_726738767349461/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_726738767349461/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_726738767349461/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_10202220745311669\",\"insights\":{\"data\":[{\"name\":\"y8V40\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"O5tWi\",\"description\":\"jowKI\",\"id\":\"177057932317550_10202220745311669/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10202220745311669/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_10202220745311669/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_668383459851659\",\"insights\":{\"data\":[{\"name\":\"fMSIG\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"l7XUs\",\"description\":\"Sqctf\",\"id\":\"177057932317550_668383459851659/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_668383459851659/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_668383459851659/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_10202183243654151\",\"insights\":{\"data\":[{\"name\":\"nyyio\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"TEDrS\",\"description\":\"F1gUI\",\"id\":\"177057932317550_10202183243654151/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10202183243654151/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_10202183243654151/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_663940230295982\",\"insights\":{\"data\":[{\"name\":\"KZtea\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"FZhpc\",\"description\":\"nkopQ\",\"id\":\"177057932317550_663940230295982/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_663940230295982/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_663940230295982/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_605510722805600\",\"insights\":{\"data\":[{\"name\":\"pyB1L\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ZVf0d\",\"description\":\"OkKuw\",\"id\":\"177057932317550_605510722805600/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_605510722805600/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_605510722805600/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_602382753118397\",\"insights\":{\"data\":[{\"name\":\"peCf3\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"uERgF\",\"description\":\"gGxSw\",\"id\":\"177057932317550_602382753118397/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_602382753118397/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_602382753118397/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_593958677294138\",\"insights\":{\"data\":[{\"name\":\"65xBI\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"YqdU1\",\"description\":\"RNpwt\",\"id\":\"177057932317550_593958677294138/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_593958677294138/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_593958677294138/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_10151520077942551\",\"insights\":{\"data\":[{\"name\":\"zrXt7\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"y1G09\",\"description\":\"sk7P6\",\"id\":\"177057932317550_10151520077942551/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10151520077942551/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_10151520077942551/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_587969594559713\",\"insights\":{\"data\":[{\"name\":\"0MI3C\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"I5Cgg\",\"description\":\"zTd7W\",\"id\":\"177057932317550_587969594559713/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_587969594559713/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_587969594559713/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_576225999067406\",\"insights\":{\"data\":[{\"name\":\"7MbwH\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"vX6QN\",\"description\":\"IPzSh\",\"id\":\"177057932317550_576225999067406/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_576225999067406/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_576225999067406/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_556370214386318\",\"insights\":{\"data\":[{\"name\":\"aoaEl\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"F4lMK\",\"description\":\"F9tX0\",\"id\":\"177057932317550_556370214386318/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_556370214386318/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_556370214386318/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_554128261277180\",\"insights\":{\"data\":[{\"name\":\"u8Mmj\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"miLci\",\"description\":\"iO5IY\",\"id\":\"177057932317550_554128261277180/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_554128261277180/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_554128261277180/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_552180764805263\",\"insights\":{\"data\":[{\"name\":\"ja284\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Nr7YB\",\"description\":\"XOGDI\",\"id\":\"177057932317550_552180764805263/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_552180764805263/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_552180764805263/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_548905048466168\",\"insights\":{\"data\":[{\"name\":\"WYhBq\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"bBFnT\",\"description\":\"wNZGI\",\"id\":\"177057932317550_548905048466168/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_548905048466168/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_548905048466168/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}},{\"id\":\"177057932317550_548725015150838\",\"insights\":{\"data\":[{\"name\":\"v2aGL\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"6tf6D\",\"description\":\"6pv9C\",\"id\":\"177057932317550_548725015150838/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_548725015150838/insights?access_token=XXTOKENXX&since=1490868493&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954893\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_548725015150838/insights?access_token=XXTOKENXX&since=1490954893&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041293\"}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdDSIa9RNFked6NlWc64utbxGKYe3S7RHjMh4AHTjmVfAFVVjFSZBgaBSX83Ug5J1I2J3YGTGU2pOHgsb3WgNZCDBV1lxrEZBPjJTxBG8AdEwURZCgZDZD&since=1404901469&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdCrOkkgA6lYUd0h6nZA7lQwoRALYioDqaSJqfg1ZBnlP3YQHLSGmOB7LgJdOym1GnzvtcJKwFnGVmwl3Vk2rLBHBE3YTMEaYrO1eoELpxCMFZBZBwZDZD&since&access_token=XXTOKENXX&until=1366706931\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdCi6ZBgK6j8MB5jDPZAhpmvxJostz5a0XqKFzDtRamIWoBquAIZC7NCGJg90Ntq4lkWooWm7dcBvZCL1jKBefIcxdAOkl5ipgmDMiWCnZBCP6wm3FQZDZD&since&access_token=XXTOKENXX&until=1405090964"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_812344502122220/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 306,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "JQNOdgpCF7N97RUb6Ya8wWV/hWS70z01TkQhZpR4bCv/S8KSTTBIkemHppS0QbdeDVuXosDgUS5R9U0hVY8wlw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"e99d81d01df569ae164520227a9de0ae34febef8\"",
  "x-fb-trace-id" "D0EejFHKYs1",
  "Date" "Fri, 31 Mar 2017 10:08:13 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"MqQmY\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"6xCIU\",\"description\":\"tV5w2\",\"id\":\"177057932317550_812344502122220/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_812344502122220/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_812344502122220/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_812853865404617/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 289,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Y5UVQvL1dfO4ohw4Ia8Q+ocGfdNYBlosk+FsYJ6c8t+lKhPNNwy73LV9TD+pU6P1/jo6x2CNCLPnsQ6xandncw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ad0fcc5e8d58c83023b71de0eb407d463ce15bc5\"",
  "x-fb-trace-id" "AarQW+Ccxyt",
  "Date" "Fri, 31 Mar 2017 10:08:12 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"FFY7I\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ND0n5\",\"description\":\"yCBTg\",\"id\":\"177057932317550_812853865404617/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_812853865404617/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_812853865404617/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_815120581844612/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 290,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "8mLybM0c7vWcFUMkHq3a/dSo1ROk8+roVzS4OpenzIg2ZamwvPl05FNAEjw78cWjTRi0vHaTo8sWvxzS2N+KTQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"b0cc7127f9709dd83204edf2531460664bd1660c\"",
  "x-fb-trace-id" "C5j4/hkvIXQ",
  "Date" "Fri, 31 Mar 2017 10:08:12 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"I33H9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"rPRO5\",\"description\":\"YCa49\",\"id\":\"177057932317550_815120581844612/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_815120581844612/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_815120581844612/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_815328998490437/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 316,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "QKYgu2ltDbSBrB+xI+96KUaLVi45s/htXq0IYl+yKcE7dBIUAQEGdMVU5PFcZePdp6+ZLIrhDvWEqQV8b1nqHQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"480de24c3f4fbe8159511a1d9980d9d9b78a175f\"",
  "x-fb-trace-id" "EKYhch9pfBy",
  "Date" "Fri, 31 Mar 2017 10:08:12 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"pET5b\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"a9oI9\",\"description\":\"dHWQj\",\"id\":\"177057932317550_815328998490437/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_815328998490437/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_815328998490437/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_815860998437237/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 435,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "HvS+lSeA6a1Abv3EWux4wPOj1IcjGeUX/uGlLWwpNRZyMWiEuLgVPZAX4h4oPRXWAfjp2oIasf506ZoiPPyZ2w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"2f3db6f078b43df46060bc9f050bcc59a548f57a\"",
  "x-fb-trace-id" "B6M4bgU7gNb",
  "Date" "Fri, 31 Mar 2017 10:08:11 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"PzzjH\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"994Qp\",\"description\":\"XfihD\",\"id\":\"177057932317550_815860998437237/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_815860998437237/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_815860998437237/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_822018727821464/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 304,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "nZNGzrzXIyOskAwGlCyTTi1E/Bqrk7vzRbxG1mR+/VX+Gj7N9QuG+5FubFN8I0Yy/ZODdje+mJ2a9h0uZRjF8Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"70bdac53e00d831f942dd4c31610419ec73f6bdd\"",
  "x-fb-trace-id" "BEAiajhdD8q",
  "Date" "Fri, 31 Mar 2017 10:08:11 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"cWX6v\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"0UoTY\",\"description\":\"CBtkM\",\"id\":\"177057932317550_822018727821464/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_822018727821464/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_822018727821464/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_824196854270318/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 310,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "1m8igiYuOv3a0R+CaDjS+EEzutc+0mrhFcrF6gyeAZyW2u8/te5+GgALStdCbeIlvXT6bsVc3Qzjn2nbUxbiqw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"6e139aaee9405c9fd399b6b63979f23f0370a936\"",
  "x-fb-trace-id" "GFcvrz+ewR1",
  "Date" "Fri, 31 Mar 2017 10:08:11 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"tTC7y\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"CfZx6\",\"description\":\"2Gwtf\",\"id\":\"177057932317550_824196854270318/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_824196854270318/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_824196854270318/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_828735377149799/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 313,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "5QHY7/hxdTDBW4dHCo0uXqeqltZz4cpeJCmYE9dB3UvWhLnJYsatPk9Lp2ntNXdkt3X6WObS2prKJPIymjIV8w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"9207a18dddda11ab92de7c5eed51c360163d4543\"",
  "x-fb-trace-id" "ETx71rw2VZk",
  "Date" "Fri, 31 Mar 2017 10:08:10 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"WznQX\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"qvz4u\",\"description\":\"iEdWV\",\"id\":\"177057932317550_828735377149799/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_828735377149799/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_828735377149799/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_829756233714380/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 401,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Rv8rgesVHS9b4i8nlcWvjSuleTeeaeT//5M/pMKPwCIKbY+02iBZL/5IZWSIQuTPa/+Thl2GiMjS1rP0vIYecw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"d118b1b6fca4d63a60262990d93f83fcd39380b6\"",
  "x-fb-trace-id" "C9lhJpkzCGG",
  "Date" "Fri, 31 Mar 2017 10:08:10 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"WnWCM\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"knSOr\",\"description\":\"mdiGG\",\"id\":\"177057932317550_829756233714380/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_829756233714380/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_829756233714380/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_831492690207401/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 289,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "L1lZ5Cgr7dROJ4lzvy5QVOFWcjzZnaatjpy1eO7FGlUw4Q2uFLSOVEQJBZ5J4F/BsCGz7Tm+LKq5G7QLa/BCsA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"fd1d4f50998b9cb70e3f1413d5d1b8cc15e796d0\"",
  "x-fb-trace-id" "HdTBN7RCeGP",
  "Date" "Fri, 31 Mar 2017 10:08:10 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Qiopk\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"UVUet\",\"description\":\"zquqr\",\"id\":\"177057932317550_831492690207401/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_831492690207401/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_831492690207401/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_831635373526466/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 296,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "nPGb93xN/3GIHTNHEFyFX1P9nxioNJPUcWjzPETRkof+0KAuD/BQ9QxEbt8BJbg8JdfDwQVxRPEO7MsuTX+tdQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f6d7ccae7954ab9d0001cadc738c9c8d01a496ca\"",
  "x-fb-trace-id" "F25ixcoK1Aq",
  "Date" "Fri, 31 Mar 2017 10:08:09 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"WD8VW\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"FLBiq\",\"description\":\"RGoSu\",\"id\":\"177057932317550_831635373526466/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_831635373526466/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_831635373526466/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_832653096758027/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 293,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "27ybQLaNW9Z18oI0xP6ymNhcwSTK2QHc+gtErCEJAT7AZB6YAfG+izCxBug0LHNre6udpuO8YkUWBvsArrlpDQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"7a440ffcdc0bab9eed5daa91fae1aaa8aa248463\"",
  "x-fb-trace-id" "C1q+N7rEt6i",
  "Date" "Fri, 31 Mar 2017 10:08:09 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"bhIlS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"q7kcy\",\"description\":\"s0zC7\",\"id\":\"177057932317550_832653096758027/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_832653096758027/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_832653096758027/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_835895269767143/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 283,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "9DVQ5U/7lpA4ALPZ2gxpFHSRSTpYNdgGLIHgNmgtpf/Oxn0noG2onWu7vEhnGEpd+Om3twzgjy8l8rgucOfEWA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ebaf0b8f2b89888a609c0e6bbbae664700ea840e\"",
  "x-fb-trace-id" "D20cby+VRLa",
  "Date" "Fri, 31 Mar 2017 10:08:09 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"z4uMS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"fr6Pj\",\"description\":\"HtUql\",\"id\":\"177057932317550_835895269767143/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_835895269767143/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_835895269767143/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_836616029695067/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 333,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Vd4WMIe67DpJauSr6qicIYP3aRZQrpxUu4R0TZHVtPCrOBfNBGz2kKBa4XfboSUXUgYM65cRXX8v7YeUPecrFA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"9ab85f78c64cc0917b74dbe1e2abae546e6b8e8a\"",
  "x-fb-trace-id" "DhVcVqMp6Am",
  "Date" "Fri, 31 Mar 2017 10:08:08 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"4UTvj\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"6rTQg\",\"description\":\"YT26L\",\"id\":\"177057932317550_836616029695067/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_836616029695067/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_836616029695067/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_840209139335756/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 300,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "NFRxuP9qRgt6xa6E9Chkl7A4jdolFfMwiTytXU03u25femTXxC8IqTrf/S9ZxHJkhXml8Ud6mbfEa+iR6v1p1g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"59fa84bfb2dfc05b46ccaa07b040b91432bfe7ad\"",
  "x-fb-trace-id" "ALGRy5uLOEB",
  "Date" "Fri, 31 Mar 2017 10:08:08 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"G4Jtu\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"DdxOb\",\"description\":\"BM7lj\",\"id\":\"177057932317550_840209139335756/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_840209139335756/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_840209139335756/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_840894219267248/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 284,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "1iuO++LUR3h0iE3F1aS0D1eQusg2OAQo0FCDbYauB9HDZkBQPLfu/gsCRX09tJ6R8pqEXCQb9dXZeLSuvgV2Ew==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"2a709c0b3ebe6ccfddf1183a98420b87d07aa5b7\"",
  "x-fb-trace-id" "FAu69gix1sB",
  "Date" "Fri, 31 Mar 2017 10:08:08 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"sicFj\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"oBQV1\",\"description\":\"KVTGP\",\"id\":\"177057932317550_840894219267248/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_840894219267248/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_840894219267248/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_841844912505512/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 354,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "kyuBLO2vmovoDpMsiM6wVZd6mN5PNrbTgR4MaPIX8DuetvkPHrHfsvt9GD6Ijd93iissD0WZRf8bgQAa7LWwZQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"1772479fdbb22e11e278d2aead2c7de0693bd5f5\"",
  "x-fb-trace-id" "HIPd+t6d8xB",
  "Date" "Fri, 31 Mar 2017 10:08:07 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"a00Vi\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"htCOL\",\"description\":\"rkbNN\",\"id\":\"177057932317550_841844912505512/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_841844912505512/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_841844912505512/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_842012709155399/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 296,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Zh7jt1lpV4A0GM8SK7E41ydov4TyysOyvS2UBXJNvMuXtJN9km41kTb/h8HAeRaAngkNaS/t4kYoHCv8gws2ow==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"12f3577ba9eab3700465d069aa8a4813b2149240\"",
  "x-fb-trace-id" "BT4yU0ZZQjb",
  "Date" "Fri, 31 Mar 2017 10:08:07 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"8QVqe\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Su9no\",\"description\":\"QnseN\",\"id\":\"177057932317550_842012709155399/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_842012709155399/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_842012709155399/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_843202225703114/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 288,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "MVm/2kTIFkRpv+tMkAe2JxPTkgvX7QmCM6n/OUM5mdEEbwrynbs5wGqwMvJdySrZC7DaRBNK3M4foVDPZZJ4SQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"3b71bc20586f3ece2b1f4d9ca861f4dc8621c1a6\"",
  "x-fb-trace-id" "AdU9DZftWLi",
  "Date" "Fri, 31 Mar 2017 10:08:07 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"mtJgx\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ExaTo\",\"description\":\"lIlDX\",\"id\":\"177057932317550_843202225703114/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_843202225703114/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_843202225703114/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_843461772343826/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 294,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "7KgrnvKJxV/EqmF9cGJY8v7DByK7jU+S/tGsYAUQUVUDG05ZS+AAzJIyCZDEPHklwQVX6v7BxKdadTDKtGsmfQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"5d1dffa80d7ee3f23b4f80157a853f3355d69550\"",
  "x-fb-trace-id" "Eh+3NQw7YP3",
  "Date" "Fri, 31 Mar 2017 10:08:07 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"cCyN8\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"LbEEY\",\"description\":\"YZTgc\",\"id\":\"177057932317550_843461772343826/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_843461772343826/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_843461772343826/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_854822971207706/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 310,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "BQX13xuK4tGYscurzwQV3Rtd6jQdC8bw2FRLpbL2mLcr98Spig5LkEMV7gR1FqI09YIJY4rdCQrK7c5uEgKy+Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"344159ec55eee995f0ca824bd716535f42150e10\"",
  "x-fb-trace-id" "G8YfEo4zYLT",
  "Date" "Fri, 31 Mar 2017 10:08:06 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"kP3Rg\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"k9Q4p\",\"description\":\"Hqhs1\",\"id\":\"177057932317550_854822971207706/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_854822971207706/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_854822971207706/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_856006187756051/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 288,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "LqhEq5xHiwLvFVuaHHmmDQH1BEJ9hWxMbmpiQv3y7BGbVyzkQGXYWnfTsHPNV/1ruLllNH1unwSNWcn7+PR5xg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"1b1eb1eb543b2e69d089a62f0bae92ba453ebbf2\"",
  "x-fb-trace-id" "FsqZYrvqHwh",
  "Date" "Fri, 31 Mar 2017 10:08:06 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"k39xp\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"PjGJl\",\"description\":\"hIlkh\",\"id\":\"177057932317550_856006187756051/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_856006187756051/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_856006187756051/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_856461684377168/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 331,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "90iWii2Qoq1ezyh5Gzf++DtaV4oKShzBL7DpSuoVBzUKJAH2+SS/c2SkIp7wvvj9Xy47AnxwFIapcHhbYVpauQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"060578a31f267de483c33091149b510000825d92\"",
  "x-fb-trace-id" "GdnDrZFCxKD",
  "Date" "Fri, 31 Mar 2017 10:08:06 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"xCJ4O\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"3eTn2\",\"description\":\"Ki1rB\",\"id\":\"177057932317550_856461684377168/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_856461684377168/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_856461684377168/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_859192114104125/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 302,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Ph+04HBH7lgM3MaVT/BzhErjQnboFmjnpsMsPLbKNb6P4r+8TlbDYR42WiD9/Q2fG/suXkER7IHx5Zke66LUCg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"78342a8bc9dfe9461677934311583fa1cb15235f\"",
  "x-fb-trace-id" "BO8CNWP85sE",
  "Date" "Fri, 31 Mar 2017 10:08:05 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"9PP2X\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"RaMUR\",\"description\":\"Hkz44\",\"id\":\"177057932317550_859192114104125/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_859192114104125/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_859192114104125/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_859677620722241/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276",
 :as :json}
(fn [req]{:request-time 284,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "SMfxMJmtlHqPABv2XODPIsODQl4arHMmIePKC6/CZqsU96nRIsudJ8FwKZO752khIAOxPyHu0HxwwfcvV3nmzQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f1b03ba129fd64247bb02ed3e9caa270cea1efbd\"",
  "x-fb-trace-id" "BZ8J8f1U1qK",
  "Date" "Fri, 31 Mar 2017 10:08:05 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"ePd8z\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"kl1NH\",\"description\":\"elm8l\",\"id\":\"177057932317550_859677620722241/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_859677620722241/insights?access_token=XXTOKENXX&since=1490868476&until=1490954876&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_859677620722241/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdDTAJBJWSKKw09d1duh0FSyqNZAHyUGYbUBHV6xKgeSBlJG1w43jbtqvFBv0uItEeKxaqSy6W7EHgCPtuNQXdEn7OZBF6YmAHTE5LvJDEAxZBZBogZDZD&since&access_token=XXTOKENXX&until=1414671312",
 :as :json}
(fn [req]{:request-time 474,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "zbpI5vwA9HdakqldeuRsMmzs/EuY9dJxcz/4cG7wvvNoGlYtS7RRje1x4Nm4AzqQsq04SqvEfWRfCWxyu5yMPQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"5ce23fdb58a9e6391b4b428fdf20a6f4684ff9f3\"",
  "x-fb-trace-id" "DEFPo90qZUl",
  "Date" "Fri, 31 Mar 2017 10:08:05 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"177057932317550_810959602260710\",\"insights\":{\"data\":[{\"name\":\"b6UmX\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"bqgTw\",\"description\":\"BIBvK\",\"id\":\"177057932317550_810959602260710/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_810959602260710/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_810959602260710/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_809469985743005\",\"insights\":{\"data\":[{\"name\":\"1uGix\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"fHZWp\",\"description\":\"GLFum\",\"id\":\"177057932317550_809469985743005/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_809469985743005/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_809469985743005/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_809400435749960\",\"insights\":{\"data\":[{\"name\":\"Oyp1a\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"qdQJe\",\"description\":\"Oa6qI\",\"id\":\"177057932317550_809400435749960/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_809400435749960/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_809400435749960/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_809124919110845\",\"insights\":{\"data\":[{\"name\":\"B8MDe\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"2190H\",\"description\":\"1GURJ\",\"id\":\"177057932317550_809124919110845/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_809124919110845/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_809124919110845/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_801886059834731\",\"insights\":{\"data\":[{\"name\":\"P49we\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"x44MP\",\"description\":\"bNdfn\",\"id\":\"177057932317550_801886059834731/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_801886059834731/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_801886059834731/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_800747633281907\",\"insights\":{\"data\":[{\"name\":\"pFCCB\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"147U7\",\"description\":\"QS34a\",\"id\":\"177057932317550_800747633281907/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_800747633281907/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_800747633281907/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_791379880885349\",\"insights\":{\"data\":[{\"name\":\"i5sPf\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"yaCvr\",\"description\":\"IRn8c\",\"id\":\"177057932317550_791379880885349/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_791379880885349/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_791379880885349/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_790255884331082\",\"insights\":{\"data\":[{\"name\":\"Howlf\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"auMUw\",\"description\":\"C7ysp\",\"id\":\"177057932317550_790255884331082/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_790255884331082/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_790255884331082/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_790080467681957\",\"insights\":{\"data\":[{\"name\":\"clzlc\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"PnGO7\",\"description\":\"FRpJD\",\"id\":\"177057932317550_790080467681957/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_790080467681957/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_790080467681957/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_788400981183239\",\"insights\":{\"data\":[{\"name\":\"3Lb12\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"SPoGx\",\"description\":\"X5G7U\",\"id\":\"177057932317550_788400981183239/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_788400981183239/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_788400981183239/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_787063444650326\",\"insights\":{\"data\":[{\"name\":\"Tk64F\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"dDEtJ\",\"description\":\"laoqy\",\"id\":\"177057932317550_787063444650326/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_787063444650326/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_787063444650326/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_787058171317520\",\"insights\":{\"data\":[{\"name\":\"VltWQ\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"mDJ7g\",\"description\":\"L75V9\",\"id\":\"177057932317550_787058171317520/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_787058171317520/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_787058171317520/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_780602168629787\",\"insights\":{\"data\":[{\"name\":\"TuoUv\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"rlL8U\",\"description\":\"085Ly\",\"id\":\"177057932317550_780602168629787/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_780602168629787/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_780602168629787/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_780460005310670\",\"insights\":{\"data\":[{\"name\":\"5YLbK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"4aEvI\",\"description\":\"hUuco\",\"id\":\"177057932317550_780460005310670/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_780460005310670/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_780460005310670/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_779709275385743\",\"insights\":{\"data\":[{\"name\":\"T4Ehs\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Q8Wl8\",\"description\":\"ce4eZ\",\"id\":\"177057932317550_779709275385743/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_779709275385743/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_779709275385743/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_779023718787632\",\"insights\":{\"data\":[{\"name\":\"whdRG\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"2Vi23\",\"description\":\"gIWTv\",\"id\":\"177057932317550_779023718787632/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_779023718787632/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_779023718787632/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_771704046186266\",\"insights\":{\"data\":[{\"name\":\"s9iPX\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"E26IV\",\"description\":\"9eXQY\",\"id\":\"177057932317550_771704046186266/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_771704046186266/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_771704046186266/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_770954352927902\",\"insights\":{\"data\":[{\"name\":\"JUow3\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"HRafl\",\"description\":\"nQgL7\",\"id\":\"177057932317550_770954352927902/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_770954352927902/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_770954352927902/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_769681236388547\",\"insights\":{\"data\":[{\"name\":\"XKSX3\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"fSRKF\",\"description\":\"MXWfs\",\"id\":\"177057932317550_769681236388547/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_769681236388547/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_769681236388547/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_768031333220204\",\"insights\":{\"data\":[{\"name\":\"eF1pR\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"E1GcO\",\"description\":\"FSQwo\",\"id\":\"177057932317550_768031333220204/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_768031333220204/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_768031333220204/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_763436517013019\",\"insights\":{\"data\":[{\"name\":\"y664k\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"iySus\",\"description\":\"uj48V\",\"id\":\"177057932317550_763436517013019/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_763436517013019/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_763436517013019/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_759927937363877\",\"insights\":{\"data\":[{\"name\":\"IBGHP\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"B3VSJ\",\"description\":\"Esu9X\",\"id\":\"177057932317550_759927937363877/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_759927937363877/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_759927937363877/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_758019590888045\",\"insights\":{\"data\":[{\"name\":\"M0vJN\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"TxYes\",\"description\":\"stuzQ\",\"id\":\"177057932317550_758019590888045/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_758019590888045/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_758019590888045/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_756609071029097\",\"insights\":{\"data\":[{\"name\":\"KELMY\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"V3dNF\",\"description\":\"0ObXH\",\"id\":\"177057932317550_756609071029097/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_756609071029097/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_756609071029097/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}},{\"id\":\"177057932317550_755399434483394\",\"insights\":{\"data\":[{\"name\":\"8pvf4\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9keHt\",\"description\":\"B5y4H\",\"id\":\"177057932317550_755399434483394/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_755399434483394/insights?access_token=XXTOKENXX&since=1490868485&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954885\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_755399434483394/insights?access_token=XXTOKENXX&since=1490954885&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041285\"}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdARWLjv97rYZCsPSQttg74EHDLh0l3tWGdh4xaC2Gs3gfkFIPZCBCf3gzirL7yNVIZAIu3T29P9ypvPxr6vyosfZBlZB6m7LqVATFN1SZBCZCJvWMxgQZDZD&since=1414424039&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdCi6ZBgK6j8MB5jDPZAhpmvxJostz5a0XqKFzDtRamIWoBquAIZC7NCGJg90Ntq4lkWooWm7dcBvZCL1jKBefIcxdAOkl5ipgmDMiWCnZBCP6wm3FQZDZD&since&access_token=XXTOKENXX&until=1405090964\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdDTAJBJWSKKw09d1duh0FSyqNZAHyUGYbUBHV6xKgeSBlJG1w43jbtqvFBv0uItEeKxaqSy6W7EHgCPtuNQXdEn7OZBF6YmAHTE5LvJDEAxZBZBogZDZD&since&access_token=XXTOKENXX&until=1414671312"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_859987434024593/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 323,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "M51yRrLhHcXHofTg+pHrqTPU7zDuUd/U7wp/xWwEOfbtjy+iGhCGM3qtCc6fh750xhwcqf3BIooHU5H3FwqZsw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"abf3f1d396aa50c71990f67a7fff5f2d223c769d\"",
  "x-fb-trace-id" "ApnPBH822u3",
  "Date" "Fri, 31 Mar 2017 10:08:04 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"UIvrF\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"SfPDd\",\"description\":\"0EaKG\",\"id\":\"177057932317550_859987434024593/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_859987434024593/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_859987434024593/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_860049017351768/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 333,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "hO0R8Nudon0lAiRZQo8Rc3Y4R2xLPZtUM/h9d2zpeiSb371lzlwPtQvsELrZMeNCMS2GjYAixpXLfP78x5nCQw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"d99a1b83e9751e646bf83a83f5453e080c5cecb6\"",
  "x-fb-trace-id" "E/esHFygNLD",
  "Date" "Fri, 31 Mar 2017 10:08:04 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"WecKI\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8Ellv\",\"description\":\"w8HKY\",\"id\":\"177057932317550_860049017351768/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_860049017351768/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_860049017351768/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_860597873963549/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
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
  "ZJ3A53ZF/N+8kAKqy4qOF5PhwK1E+8N6huAiYD++jlfMzEEm5tsMQu/bbRToEHxy2Nc5cy7C4bfJiEoABQF6VQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"d6d6f7d847bf469017f5eea68442676c8d1004a0\"",
  "x-fb-trace-id" "Desa2KGVwWN",
  "Date" "Fri, 31 Mar 2017 10:08:04 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"T75vJ\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"dIlL5\",\"description\":\"j3jSx\",\"id\":\"177057932317550_860597873963549/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_860597873963549/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_860597873963549/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_860860447270625/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 293,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "387v+YILhcWGszzaZv2eHiX0yL+pWWA3L3iSbqYCM+J4t+UQVmVo7kQTa+m/qMwQ3gXqReu3ht8AgERzoGRn3g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"29e636ffa06efba58790d4d5f48674e5dc48b18e\"",
  "x-fb-trace-id" "CfsvKgy3QiF",
  "Date" "Fri, 31 Mar 2017 10:08:03 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"HwvD4\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"DRQRZ\",\"description\":\"qNgZs\",\"id\":\"177057932317550_860860447270625/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_860860447270625/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_860860447270625/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_862432097113460/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 295,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "iI1LcjivKPm7lMFqk45g4n+5/ZDBMJnvqZKVqesAfDU5EKf9Mvel/pdkjlEpkYJ60poavCeFVNcKaLsi6pbEVg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"612f6a813d7955542f3958489ca311335973867e\"",
  "x-fb-trace-id" "FNImHz+6QIJ",
  "Date" "Fri, 31 Mar 2017 10:08:03 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"qCgpE\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"xHXOY\",\"description\":\"ema7u\",\"id\":\"177057932317550_862432097113460/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_862432097113460/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_862432097113460/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_863179447038725/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 290,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "thAhJIVtJjjUIDjoYyHUzwy3ID/m+bbX+22lvG7exmfJgXX6pCYCsGkGigAgwn9TZlVGSXVMjI+C2GHtKTRiNQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"8321295bda6961bf778c2452d0580ef08590c446\"",
  "x-fb-trace-id" "F+zQB6ycj0Z",
  "Date" "Fri, 31 Mar 2017 10:08:03 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"fP7x0\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"3dnt1\",\"description\":\"3eWeo\",\"id\":\"177057932317550_863179447038725/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_863179447038725/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_863179447038725/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_867662119923791/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 317,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "SC93L25ySX09H6cImt2WUw9swGTXvH8ul9gcMZRXwotsBBwfT4jmua4wA0IRtsMAZAI2ShaI+tX9Rgwv60/8pA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"3059fac95c708167cf9c221f649f53da18b2219b\"",
  "x-fb-trace-id" "E2vAYuBAIq3",
  "Date" "Fri, 31 Mar 2017 10:08:02 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Ld7ut\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"BccQ1\",\"description\":\"hYXci\",\"id\":\"177057932317550_867662119923791/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_867662119923791/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_867662119923791/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_867918849898118/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 287,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "+aVQZxpO7BVz3fz8qezJQpQVQLhhKKJPuB5t+g8lDBXESYrLMDzFtPmWEBz2ceRIlZi7ZJvcApyhkyEcES//uA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"75fc798a5676783fcb72edada85f7c79b49ac2e9\"",
  "x-fb-trace-id" "B96GSG7k4FU",
  "Date" "Fri, 31 Mar 2017 10:08:02 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"1wUpH\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"NRmvO\",\"description\":\"V5IT0\",\"id\":\"177057932317550_867918849898118/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_867918849898118/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_867918849898118/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_868084153214921/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 283,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "N6pr8P2hom8Pzl134DFz9bpN5xLBqzCJsJ4cSZcZi0/DW+IBpyQOkvnQofS1JGTxDNpxommCeOPV4zCLJk6uLA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"c34492e6672a2d0aa62c8834b979225c09c2e47e\"",
  "x-fb-trace-id" "EQ1RAPbjAyf",
  "Date" "Fri, 31 Mar 2017 10:08:02 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Bjb0a\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"1h7MH\",\"description\":\"2ZsdW\",\"id\":\"177057932317550_868084153214921/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_868084153214921/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_868084153214921/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_868201209869882/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 405,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "JKUNKgZJdkM1YSz+/QrC0Ll3qo1ckuTWGjKaZB0+dDY9ld7rBMk3v2V+Lmw9HtmQxVQUYq7wCh4+9Cb9gmIDaA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"404c02a6aecd3e27a11eae573f6c3e37c62eabce\"",
  "x-fb-trace-id" "A+/5JehhQws",
  "Date" "Fri, 31 Mar 2017 10:08:02 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"8abEr\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"2Zmu5\",\"description\":\"97bCx\",\"id\":\"177057932317550_868201209869882/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_868201209869882/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_868201209869882/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_868721253151211/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 299,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "v3zLJsqhUD35Z629Jow8if3Jc4QaOkiGeeyXdi2FYBqfXs/rruVwZ1ilRxMousPXWoV8YEJzJ4LRmdivkQm1/Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"afc3adf02bf30b5f2e7820d78f5c3863e5b9c8f7\"",
  "x-fb-trace-id" "GyptGhcTFAc",
  "Date" "Fri, 31 Mar 2017 10:08:01 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"ML2zi\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9xdqJ\",\"description\":\"95049\",\"id\":\"177057932317550_868721253151211/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_868721253151211/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_868721253151211/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_868726169817386/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 296,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "XaI5oLcGT84FlAbvL9K4p1poHiWztEQv2FhWmQygity7orBhgW/EC5I8l4kuXzkA1S2LznAz3r9Sv13MiOzNog==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"21eedbb430969c2ca01edbbfd99bae3d21886a1c\"",
  "x-fb-trace-id" "BzuAIBZrY8m",
  "Date" "Fri, 31 Mar 2017 10:08:01 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"W7dW7\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"CM1oj\",\"description\":\"Z0Mf8\",\"id\":\"177057932317550_868726169817386/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_868726169817386/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_868726169817386/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_871299946226675/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 327,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "wxNYHC8juu3+KHprITmguOYy0W7A9RuWPZy7U/x6uODvi58F6itcX79tcWjvkTIZU1wVbQJsw+asunN41pNnxA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"0e9ab9d455d33cfd66d30abd0e47a15af98ad748\"",
  "x-fb-trace-id" "Df5Uf46HiRH",
  "Date" "Fri, 31 Mar 2017 10:08:01 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"5rsKU\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"lkqMX\",\"description\":\"PbkpY\",\"id\":\"177057932317550_871299946226675/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_871299946226675/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_871299946226675/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_871542359535767/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 298,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "DII9gWmHdslOaOA8xy7PgMShuW5Ia/kzNlY3+EyZBymdTmIE9vF5gS0RbcvujDt+vAcqmTiWhkUC6Dfm3RWPbw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"7f8131714c48f3986e7e393eb8712cd09e379862\"",
  "x-fb-trace-id" "CtuLKGv6dVo",
  "Date" "Fri, 31 Mar 2017 10:08:00 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"xybk1\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"5Bl73\",\"description\":\"KG0Lz\",\"id\":\"177057932317550_871542359535767/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_871542359535767/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_871542359535767/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_871770149512988/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 327,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "I5MsI3Lua/nwnmLFWgnwFLeM2cVEQaRRDcOkbqwqxIIxAFY8aLwzmckqpAigbNYPksMzG51oZIvsqzqYj1a+4w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"32f9982c08a8ba28a9a82d866b787fe4b1458c3b\"",
  "x-fb-trace-id" "FqrCutSh0AJ",
  "Date" "Fri, 31 Mar 2017 10:08:00 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Z1oln\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"2L45Y\",\"description\":\"Va6rg\",\"id\":\"177057932317550_871770149512988/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_871770149512988/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_871770149512988/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_876365615720108/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 352,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "jgN44ZDdIXCi4E/mh0P/ttr9bZ6LwxcBHimWyF1RozUQ5V1//uwZl5GKipom3at5Ct93zmleUdj44WvIBtnWkw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f80f319f75f736107fb06b6dc4f0e245e890eea4\"",
  "x-fb-trace-id" "Fvf8UO/mRbc",
  "Date" "Fri, 31 Mar 2017 10:08:00 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"CoxCh\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"DevCU\",\"description\":\"3qj30\",\"id\":\"177057932317550_876365615720108/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_876365615720108/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_876365615720108/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_876391385717531/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 307,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "UONsJFoOPa60PrUs4LuP6+kfK3h2Gqqa9SGzV+sA+xxM80n6PU8xjc7ZGgX9urXb0wsvm3chr1wh354PCar6nQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"a8025f96f4a1fd8ac416d7efcc8ff5bf9f3dd7a8\"",
  "x-fb-trace-id" "C480/KHp2Hi",
  "Date" "Fri, 31 Mar 2017 10:07:59 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"V1IZ7\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"1RLNV\",\"description\":\"i1LwC\",\"id\":\"177057932317550_876391385717531/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_876391385717531/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_876391385717531/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_876759985680671/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 278,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "fclL9Au69pUq8omsiRPlHhztZUN+BsA75FC3zze0VP4yRrlSufmjytEQIXS+Wo3TCKe/A5rhoaunFVYpRN5kiQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"24410edec11c7ed011d86ed113361f34048d0edb\"",
  "x-fb-trace-id" "DNI4ytUdpmN",
  "Date" "Fri, 31 Mar 2017 10:07:59 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"d6iyQ\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"k1UjL\",\"description\":\"zr3FN\",\"id\":\"177057932317550_876759985680671/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_876759985680671/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_876759985680671/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_878717075484962/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 302,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "CPcBUv28UshjhmTExIu/Ut28efoSVed48IMYfSqZq9gVEDpQeOAMUi5bgrhlMpHMkH+1nfbJ9YxQDdTCZdswOQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"911b0a9b3bfa24e7bb4c18c381b60e1edde3f0f3\"",
  "x-fb-trace-id" "HoraVQ9l35e",
  "Date" "Fri, 31 Mar 2017 10:07:59 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"6QLpw\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ySmDj\",\"description\":\"mqBos\",\"id\":\"177057932317550_878717075484962/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_878717075484962/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_878717075484962/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_878834132139923/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 294,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "2BTDeBysNk+b99yFRJEiaI4gVNhMtiwQY1aVxc4Basyi+YGauvdMleDcvprDOr8NZfO6rxk9DoSpK9M3SJkptA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"e5d25f2ce8eda275029c40d256dc262fd218975e\"",
  "x-fb-trace-id" "EhnEnhnvrbA",
  "Date" "Fri, 31 Mar 2017 10:07:58 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"oNZYr\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"2ZspN\",\"description\":\"Knojy\",\"id\":\"177057932317550_878834132139923/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_878834132139923/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_878834132139923/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_880197812003555/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 305,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "NqtUX8FDlVpBqiginr+2M4IYa9328ZQQi8+Wp6yvL2mno5Q/wRJ19R/uNLq0Dhiz8GY9i8olm0q0e93gF6ISrg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"09ea2bba5e2295cca4f35c7c876bacf3285a945f\"",
  "x-fb-trace-id" "HDoQw/4XXMb",
  "Date" "Fri, 31 Mar 2017 10:07:58 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"tBrR2\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"4G8Wh\",\"description\":\"buafy\",\"id\":\"177057932317550_880197812003555/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_880197812003555/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_880197812003555/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_882565748433428/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 305,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "nX5lgCvJ8rd7gn5vTG30nVHLTUZAMhS25Op/CfYJJDcnunlCx1GiZvYaOM2ozEeToePwegMMAMq1dlUBpTtM9Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"b790b2655a9844f373b6b7899ca886c281cfde86\"",
  "x-fb-trace-id" "B8t65eJgZ4X",
  "Date" "Fri, 31 Mar 2017 10:07:58 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"OxEpX\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"h79T6\",\"description\":\"1TxKY\",\"id\":\"177057932317550_882565748433428/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_882565748433428/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_882565748433428/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_890214517668551/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 320,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "hdKI4QRDpnl7cFFAhHHEXmecnTNvp+uR2+lqml4/MD9Xbl4Aadvm9zvh2rI05/V0dFFaR1nZgabTN9hnDH0Yiw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"cd1f99b6d15d98339601467235e8a16bad895676\"",
  "x-fb-trace-id" "EincSy6PjUp",
  "Date" "Fri, 31 Mar 2017 10:07:57 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"rD288\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Ei2VV\",\"description\":\"6quiq\",\"id\":\"177057932317550_890214517668551/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_890214517668551/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_890214517668551/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_894591280564208/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
 :as :json}
(fn [req]{:request-time 292,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "TIlkKCu7HuQTakzfJmZBMCtq6EBE2PzkIModZRRy/BTcl3nJu1oWPQ/mwQlPYSrCz0eItN/Bdc+Jg+TcJTA/uA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"94f3a61e7d3a3889efe3661b58e696d04543c129\"",
  "x-fb-trace-id" "DnwVe1UTO7/",
  "Date" "Fri, 31 Mar 2017 10:07:57 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"qtp4z\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"WUv9w\",\"description\":\"LqhqL\",\"id\":\"177057932317550_894591280564208/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_894591280564208/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_894591280564208/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_894908463865823/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268",
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
  "xXQ753mvh690/sk+qpRcy+i+bxkI84T79XAc2n9ORTT7sSWQjN3Z+W7YEnfChWV3TQ09NTR1CJ6ie+pA+h5eJg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"426c286eb6d772d3464f8f4cacae8908e1195066\"",
  "x-fb-trace-id" "FwONdIRwkFs",
  "Date" "Fri, 31 Mar 2017 10:07:57 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"cbfDL\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"3JQdV\",\"description\":\"zG7o1\",\"id\":\"177057932317550_894908463865823/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_894908463865823/insights?access_token=XXTOKENXX&since=1490868468&until=1490954868&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_894908463865823/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdAYZBrkpL4l8uV3M9z3NUzw6WTUvgOzO8vMkSIxhoXiZAKrR0LgHlKFb5xFxfFp63iqnKkIHXtWlrh0krsC5aH1Jhrw35xmvBJ9HoY47dN8ZB32AZDZD&since&access_token=XXTOKENXX&until=1421387610",
 :as :json}
(fn [req]{:request-time 449,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Ld8jYQgvKwus79PflV3tH6oMBC6tL9uPEqB0k9Ccy2AzJKxZiXcE5oyaZ/NXbn7A3qQi7GhXKJin9lePsidsXQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"623168f12f1b2722600320b0ffb030a6b194f5b2\"",
  "x-fb-trace-id" "C44HHYAcaP7",
  "Date" "Fri, 31 Mar 2017 10:07:56 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"177057932317550_859677620722241\",\"insights\":{\"data\":[{\"name\":\"uWMRY\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"sNgqI\",\"description\":\"bboqb\",\"id\":\"177057932317550_859677620722241/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_859677620722241/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_859677620722241/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_859192114104125\",\"insights\":{\"data\":[{\"name\":\"2E5WO\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"JXmS0\",\"description\":\"9x5pv\",\"id\":\"177057932317550_859192114104125/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_859192114104125/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_859192114104125/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_856461684377168\",\"insights\":{\"data\":[{\"name\":\"tus44\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Fn3B5\",\"description\":\"qM8lo\",\"id\":\"177057932317550_856461684377168/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_856461684377168/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_856461684377168/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_856006187756051\",\"insights\":{\"data\":[{\"name\":\"cQtnY\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"EZViK\",\"description\":\"VEH1s\",\"id\":\"177057932317550_856006187756051/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_856006187756051/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_856006187756051/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_854822971207706\",\"insights\":{\"data\":[{\"name\":\"3Fi5p\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"WS3JM\",\"description\":\"xCe3r\",\"id\":\"177057932317550_854822971207706/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_854822971207706/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_854822971207706/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_843461772343826\",\"insights\":{\"data\":[{\"name\":\"Rww6F\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ul6MV\",\"description\":\"EOqmF\",\"id\":\"177057932317550_843461772343826/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_843461772343826/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_843461772343826/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_843202225703114\",\"insights\":{\"data\":[{\"name\":\"mkEgL\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"jo8DW\",\"description\":\"bDPcg\",\"id\":\"177057932317550_843202225703114/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_843202225703114/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_843202225703114/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_842012709155399\",\"insights\":{\"data\":[{\"name\":\"t6ray\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"1GMoB\",\"description\":\"McMNR\",\"id\":\"177057932317550_842012709155399/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_842012709155399/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_842012709155399/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_841844912505512\",\"insights\":{\"data\":[{\"name\":\"ywc4o\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8MtEr\",\"description\":\"pPIlc\",\"id\":\"177057932317550_841844912505512/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_841844912505512/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_841844912505512/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_840894219267248\",\"insights\":{\"data\":[{\"name\":\"0fLSH\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"79SBJ\",\"description\":\"uOmge\",\"id\":\"177057932317550_840894219267248/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_840894219267248/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_840894219267248/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_840209139335756\",\"insights\":{\"data\":[{\"name\":\"xwmF7\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"c9xzP\",\"description\":\"XCbee\",\"id\":\"177057932317550_840209139335756/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_840209139335756/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_840209139335756/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_836616029695067\",\"insights\":{\"data\":[{\"name\":\"zWUux\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8m6UW\",\"description\":\"uGVta\",\"id\":\"177057932317550_836616029695067/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_836616029695067/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_836616029695067/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_835895269767143\",\"insights\":{\"data\":[{\"name\":\"n9eMH\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"DjfY8\",\"description\":\"2eFeo\",\"id\":\"177057932317550_835895269767143/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_835895269767143/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_835895269767143/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_832653096758027\",\"insights\":{\"data\":[{\"name\":\"YK6IK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"sm2hQ\",\"description\":\"tGl0m\",\"id\":\"177057932317550_832653096758027/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_832653096758027/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_832653096758027/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_831635373526466\",\"insights\":{\"data\":[{\"name\":\"GmBoH\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"nDhfS\",\"description\":\"fw4R3\",\"id\":\"177057932317550_831635373526466/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_831635373526466/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_831635373526466/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_831492690207401\",\"insights\":{\"data\":[{\"name\":\"HDEK2\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"B4vtZ\",\"description\":\"3zura\",\"id\":\"177057932317550_831492690207401/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_831492690207401/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_831492690207401/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_829756233714380\",\"insights\":{\"data\":[{\"name\":\"7N70C\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Jzk34\",\"description\":\"8nMes\",\"id\":\"177057932317550_829756233714380/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_829756233714380/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_829756233714380/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_828735377149799\",\"insights\":{\"data\":[{\"name\":\"9VUoK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"HOUiM\",\"description\":\"O0RXa\",\"id\":\"177057932317550_828735377149799/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_828735377149799/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_828735377149799/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_824196854270318\",\"insights\":{\"data\":[{\"name\":\"QzRF4\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"PsvMK\",\"description\":\"2CixR\",\"id\":\"177057932317550_824196854270318/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_824196854270318/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_824196854270318/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_822018727821464\",\"insights\":{\"data\":[{\"name\":\"bDJT7\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"oxzVt\",\"description\":\"8hV7r\",\"id\":\"177057932317550_822018727821464/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_822018727821464/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_822018727821464/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_815860998437237\",\"insights\":{\"data\":[{\"name\":\"ZcZwv\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"vmeSs\",\"description\":\"juchz\",\"id\":\"177057932317550_815860998437237/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_815860998437237/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_815860998437237/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_815328998490437\",\"insights\":{\"data\":[{\"name\":\"r1Wf3\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"Jmsy6\",\"description\":\"ntyFu\",\"id\":\"177057932317550_815328998490437/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_815328998490437/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_815328998490437/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_815120581844612\",\"insights\":{\"data\":[{\"name\":\"tEqrg\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"bpyGM\",\"description\":\"Gkx36\",\"id\":\"177057932317550_815120581844612/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_815120581844612/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_815120581844612/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_812853865404617\",\"insights\":{\"data\":[{\"name\":\"XaSrz\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"zHxNc\",\"description\":\"P9QdV\",\"id\":\"177057932317550_812853865404617/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_812853865404617/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_812853865404617/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}},{\"id\":\"177057932317550_812344502122220\",\"insights\":{\"data\":[{\"name\":\"pUago\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"sDJxe\",\"description\":\"Zbp9F\",\"id\":\"177057932317550_812344502122220/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_812344502122220/insights?access_token=XXTOKENXX&since=1490868476&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954876\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_812344502122220/insights?access_token=XXTOKENXX&since=1490954876&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041276\"}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdCZBCVOU0ok16T1yqC0rxE4vZC3lXhdpTYKBoQeOL6AbVR4BGZCQxFuMCcakOowc2bUDVx1kAEXUy3PWuIb56FZCo24fDqLx4nAF8qCHV8ujIziOQZDZD&since=1421322132&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdDTAJBJWSKKw09d1duh0FSyqNZAHyUGYbUBHV6xKgeSBlJG1w43jbtqvFBv0uItEeKxaqSy6W7EHgCPtuNQXdEn7OZBF6YmAHTE5LvJDEAxZBZBogZDZD&since&access_token=XXTOKENXX&until=1414671312\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdAYZBrkpL4l8uV3M9z3NUzw6WTUvgOzO8vMkSIxhoXiZAKrR0LgHlKFb5xFxfFp63iqnKkIHXtWlrh0krsC5aH1Jhrw35xmvBJ9HoY47dN8ZB32AZDZD&since&access_token=XXTOKENXX&until=1421387610"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_895159487174054/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 300,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "ZryDUi/uIhv5lk5bgM96V/ZbG0Hu86EA0VDBzOlEvYAaP2Pg6bf5rWr77lCM5dqN87Z+FP+87C23MOtdjxFPEQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"e34d18a5052566c1fd4f265860f145d32dfb42a2\"",
  "x-fb-trace-id" "Asb+mIybYpW",
  "Date" "Fri, 31 Mar 2017 10:07:56 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"O61sf\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"c1Mzx\",\"description\":\"TqCCX\",\"id\":\"177057932317550_895159487174054/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_895159487174054/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_895159487174054/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_895172080506128/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 276,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "AFWdC8mRkeQz48qXo7R51CcujSQ9gpm8uX9rgOehxTW1+9009jJu2c+DX5Sk/KO0vLnfReQ3gfItUA2HN1+U7Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"4d47af9f05b933e6482ae43a1a845085a640f8c9\"",
  "x-fb-trace-id" "EExuUKIK8Sv",
  "Date" "Fri, 31 Mar 2017 10:07:56 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"dYuGS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"1XOnj\",\"description\":\"ozlGG\",\"id\":\"177057932317550_895172080506128/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_895172080506128/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_895172080506128/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_895638570459479/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 287,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "bEpZStyI5lZmKe1cdEMZIQHb43HTIMhoiBtL0LlfTHbFW5Lhe5P/RuciFiNTsHsDx3CpfgdS3xb/xWRjUlgaeA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"3d1c3d5687a2a8702b016f00a1bbe5b20e27d69f\"",
  "x-fb-trace-id" "E2cDGKJXBCr",
  "Date" "Fri, 31 Mar 2017 10:07:55 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"sFd1n\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"56xwb\",\"description\":\"2MYlJ\",\"id\":\"177057932317550_895638570459479/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_895638570459479/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_895638570459479/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_895669693789700/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 617,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "R6+COGWJvI3NpPV4Yqg8G8KAJ4iPFAZ7DGd1wXycM0sFHoPVFxcq9cTt3pFwmYXl1KXk/f9TqqG8hzp5rmJ3Eg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"7f57e2ed4392c1e00773f9b3bbd95b2b60f63d8a\"",
  "x-fb-trace-id" "HjAk27g2SAS",
  "Date" "Fri, 31 Mar 2017 10:07:55 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"8vyxH\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"b6cK7\",\"description\":\"3sRwf\",\"id\":\"177057932317550_895669693789700/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_895669693789700/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_895669693789700/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_897828396907163/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 289,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "4WYfMRasPt4YHOAL4DLEIMaLXpotEf8JjNgmfIbn+kOWWy1HBEdigGd8I18Z3tBPnffMB3GfGp09yfrpxmjHdw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"36eb0be2fe8e6f3976e0d5d7c058cb3e3c01e896\"",
  "x-fb-trace-id" "H49MjGEKyJR",
  "Date" "Fri, 31 Mar 2017 10:07:55 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"zqf0W\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ctJZR\",\"description\":\"ot1mQ\",\"id\":\"177057932317550_897828396907163/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_897828396907163/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_897828396907163/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_898249010198435/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 302,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "r5MAn3Y1PXt+oWp6KVDjmEE8s5Zaw48M23D2jBW0bT6vAHbXxs+xpQCcRlLi7lpF0vomi+ADO3axr7uMBdPwEA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"732ea6b2fdaf09b8f741fb5f7fd828bcc6a0ab86\"",
  "x-fb-trace-id" "C99nScHSBjL",
  "Date" "Fri, 31 Mar 2017 10:07:54 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"kIPx0\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"0Die5\",\"description\":\"hB0Ge\",\"id\":\"177057932317550_898249010198435/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_898249010198435/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_898249010198435/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_898322620191074/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 288,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "To2bQL3ojmEQVianNfWX8+8zdWcb+z74mCY3/47M4URBPMxIUHd5W3PBQbJ6+uU0w9OcjRPOZbwfquBrzsCQjg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"7d2ed6a7ce3579e1c4e1da7d982498bdcc6682d1\"",
  "x-fb-trace-id" "D3WgNwdl8Ml",
  "Date" "Fri, 31 Mar 2017 10:07:54 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"ERhYx\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"jallV\",\"description\":\"D2kaW\",\"id\":\"177057932317550_898322620191074/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_898322620191074/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_898322620191074/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_898705676819435/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 295,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "IjcX71H/uGodsmKr0R76k8IMlmwKPhZrQhNLzH7UMZCC+ukOf6GOqgs1B8urWejk0Zluq7gaC7/AcImBrFXuxg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"d97be78387842af20bcc7edf51437cdb6c6373de\"",
  "x-fb-trace-id" "BWl0Gnu+9aA",
  "Date" "Fri, 31 Mar 2017 10:07:54 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"wNQxc\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"RqUWO\",\"description\":\"2DwCE\",\"id\":\"177057932317550_898705676819435/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_898705676819435/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_898705676819435/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_899104843446185/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 299,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "G5Nv8B3feWEtwlO1RwRGlhkhF8M2bhNDq4lx53YS4bmvJiFmccpvuFi/aduRpie9b9xGerQJl0OLYH4QtZWhnw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"5c4ca312addd550bcb35f6acfa3e426f46399403\"",
  "x-fb-trace-id" "GGMbUjjZM8i",
  "Date" "Fri, 31 Mar 2017 10:07:53 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"YxBDb\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"G0h7z\",\"description\":\"1EVSL\",\"id\":\"177057932317550_899104843446185/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_899104843446185/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_899104843446185/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_899507860072550/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
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
  "NAJeldJMtNpJ/NhVysViZZ0eGmTjEv5Sb0ScZx98NOkBjHLc6yiNbKSjHQXXz8/pa2i2JXneG9qCh+MH2x1qCw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"6940670e6767c619e23df6fb92a1eb4f83fb0b5b\"",
  "x-fb-trace-id" "E0I52OSOioK",
  "Date" "Fri, 31 Mar 2017 10:07:53 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"X5CCa\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"gJdol\",\"description\":\"9VSU3\",\"id\":\"177057932317550_899507860072550/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_899507860072550/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_899507860072550/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_902157386474264/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 306,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "1sJ1mkPX/6gKdQwAOLcfQ/RO6dgyqZnOTZIjpeWj9ewVN8lvyU4nbLV+LYVNbj9OJIMV3X+RpXWDfiw23+3QAw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"6797e99f3ee179ca12412dfca59b8d7477d582e0\"",
  "x-fb-trace-id" "GodoBA8ywjL",
  "Date" "Fri, 31 Mar 2017 10:07:53 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"J03yC\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"71nsP\",\"description\":\"Ilibn\",\"id\":\"177057932317550_902157386474264/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_902157386474264/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_902157386474264/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_903010183055651/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 305,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "siXQnEoCG1/rRSrY4l+AthzI74F1gF/bmaGd/f/itrh0TGFaxGFhayqvTskW/rePoa4QzKHTGHQ8zOdgN/p9oQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"62b88d2edf8d3958f383c57e9ccf8a278480762a\"",
  "x-fb-trace-id" "BqFk37sdQTh",
  "Date" "Fri, 31 Mar 2017 10:07:52 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"SZ1K6\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"EzITM\",\"description\":\"6c6fU\",\"id\":\"177057932317550_903010183055651/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_903010183055651/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_903010183055651/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 325,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "7aiUnGX7IwDTJ5XCpuXUE5AeFVtS+bTntMtm6buyzDM1WiWuNs1pwuKB8XeY8RMNjXZmSDX8mPTsS8sd0gcSXA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"75ac16ae49603bb2a3c87593e08d04223703fe17\"",
  "x-fb-trace-id" "EgokHAsxPqW",
  "Date" "Fri, 31 Mar 2017 10:07:52 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"mxygY\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"mcpgT\",\"description\":\"Gtafy\",\"id\":\"177057932317550_905758402780829/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 305,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Swv6d3DNUcQYIHtUu9S670ONchcZSxRj2pPww/RRZLkOdsqdTYs/zWAzBx7aUjJlp290ReyRlWnOQKZ3GGv5Lg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"b09c8202c4045ad14b19d6783192fdd8cd636b26\"",
  "x-fb-trace-id" "AIg0tkV3Vz8",
  "Date" "Fri, 31 Mar 2017 10:07:52 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"YBT5T\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"EDnKD\",\"description\":\"am9Ts\",\"id\":\"177057932317550_908277042528965/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 292,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Meq23ueN6dSTWq3mH+9IMx1mXTSlZ6YjJksXxNQhqDsIWlKa5zFCu8uztktEav39zv+NIBXlZCbnoO3IQdDzgA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"661297a299cd3ee1c56a13f3148acd4e5a3da092\"",
  "x-fb-trace-id" "G4Txaj+KlWy",
  "Date" "Fri, 31 Mar 2017 10:07:52 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"ObT6x\",\"period\":\"lifetime\",\"values\":[{\"value\":1}],\"title\":\"rT0Mj\",\"description\":\"3UwYK\",\"id\":\"177057932317550_910073965682606/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 286,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "utrnTl6Hf24nwjZxGwXVK8UN6s/anCttd4huyg1DqAwQztdnr0idwW2O17vQH0Ub1/EDjQy5kseU8l0jaQgu/A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f1f5a45d36c746976486b312c338df9ac1cc10be\"",
  "x-fb-trace-id" "Gm7+3WfgtYk",
  "Date" "Fri, 31 Mar 2017 10:07:51 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"ajFrK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"MUava\",\"description\":\"uwmfD\",\"id\":\"177057932317550_913371222019547/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 293,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "aRFITD3GyGmOs93EIorrYe82FOu0emuN5azI6LnYUKhC1UdbvUomkNbtBNenR5/iJyG1YFzMYqET6ymb3JL65Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"938ff66f9f22f5eeeb9fede6e080ce5515cd5864\"",
  "x-fb-trace-id" "FzaQm3+ksXi",
  "Date" "Fri, 31 Mar 2017 10:07:51 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"VtCwM\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"CP1UU\",\"description\":\"16Dqh\",\"id\":\"177057932317550_913890861967583/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 288,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "wIAnMn7Zug2MdikGUbVxJxdWJYDU1vdaps1aZEjCBmk9RKF3prcGvu85wY2m8iP+bhis1p3tzY+ayj/5fy4WlQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"c2e3cc17f6d0aa0a3a3757bbd2278b96a27d80c5\"",
  "x-fb-trace-id" "GSpOG/+1LPV",
  "Date" "Fri, 31 Mar 2017 10:07:51 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"Zgxx5\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"QpezK\",\"description\":\"6exSf\",\"id\":\"177057932317550_921759597847376/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 292,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "kEmZL6HZEav6oojhNa/sil6zH9nRWdyaff4UEE7WBPRivRC7Mij3F3x99u5Fh+0/LbaCrEAcTTJsLwDTSKHKEg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"ee2d05ff79b1bb4518c93da24a69036ef981e9ed\"",
  "x-fb-trace-id" "CQS0e3LXhIx",
  "Date" "Fri, 31 Mar 2017 10:07:50 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"GN79c\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"n4gBX\",\"description\":\"9PfkB\",\"id\":\"177057932317550_921776914512311/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 317,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "qF3COoGLBLRsC8Z5CBtcI1BudrZMTU0qVg/6/gxaV+DI8pqEDRCww3Cp+6ttZcEPfbMbJLrRIkoGEz1zqsHOwA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"0cb4fdeed6ef6b1237c5cf52899aad729834c307\"",
  "x-fb-trace-id" "DGgtt4/tXmx",
  "Date" "Fri, 31 Mar 2017 10:07:50 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"MJmgL\",\"period\":\"lifetime\",\"values\":[{\"value\":8}],\"title\":\"ftnsw\",\"description\":\"MuoYO\",\"id\":\"177057932317550_932914176731918/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 295,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "Gi5sJbhoNPTrpUm9ljamB0hBVUGn0qKO7vnUEEj4U1caVLHklaMhh3VG0y3SyQKMzEwwx51bHjibVKkDOeHxMQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"04d37071a0b8986ed66f5c01abb28cb516fb8cae\"",
  "x-fb-trace-id" "D+9oPbCGBk3",
  "Date" "Fri, 31 Mar 2017 10:07:50 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"yg0DP\",\"period\":\"lifetime\",\"values\":[{\"value\":1}],\"title\":\"XmLX8\",\"description\":\"5wMLd\",\"id\":\"177057932317550_940984532591549/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 324,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "kI8qGUxMPBx7lz/pDaKSgOwQRwV0M2Mta5uUeRqm7aBL5FSHvW5rtYc3daythpcpd2Y1/1qOGOgYwemKtTJv/Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"23c71f99493d1eeea602cbd0bc8fac3f8f12ae38\"",
  "x-fb-trace-id" "A36b6DDsejr",
  "Date" "Fri, 31 Mar 2017 10:07:49 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"njD0P\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"qHU7P\",\"description\":\"rCYXN\",\"id\":\"177057932317550_990386480984687/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 296,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "QVo3HmM/Fl3yBZ4LrHiebJLsJPoxrNzG8gPrbiaMrNeL1B8MzBXS3W7kq/V1sbg5Y4XAFxcyALT3L29BTUxhkg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"06ec8906f0c0f9b8e98f1488d6b38755ddae984d\"",
  "x-fb-trace-id" "AZYLufRY2qZ",
  "Date" "Fri, 31 Mar 2017 10:07:49 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"bD1EL\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"tkNTq\",\"description\":\"ZjqwJ\",\"id\":\"177057932317550_1043848705638464/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 375,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "aAW58VIm2itGC/0mq7Gti1e4lTRGqlTJADo6L9AD30pZCRzzPALswsSIO0a4BpAzaH4i/Hjt1RABK8z/0vgWiw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"414fb5c0dbecbbf6514bc16f1521d7d987f34d99\"",
  "x-fb-trace-id" "FlcePx1T6zM",
  "Date" "Fri, 31 Mar 2017 10:07:49 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"SOrza\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"bdeYE\",\"description\":\"jPDFa\",\"id\":\"177057932317550_10207570586690352/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267",
 :as :json}
(fn [req]{:request-time 310,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "AY1OHBh3FtnmlQHbXW6ZCm3TAO3CwX2Ylao08rOE+42rf4NIZSSY5oPHfoFMaypfmUshVCC092Wto1+F80y6Mw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"f0fae75b305a9458891882c00a419f6527743128\"",
  "x-fb-trace-id" "AV5cvuPe29P",
  "Date" "Fri, 31 Mar 2017 10:07:48 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"name\":\"MyRN4\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"uFrQ5\",\"description\":\"ZmsTh\",\"id\":\"177057932317550_1126854757337858/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1490868467&until=1490954867&metric=post_negative_feedback%2C+page_posts_impressions\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&since&access_token=XXTOKENXX&limit=25&until=1427397642&__paging_token=enc_AdB2LNjGnk1UmwTQVeoZCqHeHcJVzhHIavVlTt8vRyZBqIbG5yU1AaBmlIfYzajDfjyGN66DWqbjVUzkkRayNlWuhN6F5EYX7XCOaHvJxjmt3icAZDZD",
 :as :json}
(fn [req]{:request-time 563,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "kjuM5TjEtWQ/O5cHCs2/l3xkQtNdmwj2bhgfP9A5CdQRftnXQ4Z3F2cAKY++dAQbAxTcpNCSA6s2V0wsRZhVSg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"a916890ee63411c98b4b7dcc9f900c210753735b\"",
  "x-fb-trace-id" "EDjSoDlOd4/",
  "Date" "Fri, 31 Mar 2017 10:07:48 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"177057932317550_894908463865823\",\"insights\":{\"data\":[{\"name\":\"pLsHa\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"spph6\",\"description\":\"yEwit\",\"id\":\"177057932317550_894908463865823/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_894908463865823/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_894908463865823/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_894591280564208\",\"insights\":{\"data\":[{\"name\":\"7hCxk\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"4y82g\",\"description\":\"MCiYK\",\"id\":\"177057932317550_894591280564208/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_894591280564208/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_894591280564208/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_890214517668551\",\"insights\":{\"data\":[{\"name\":\"BM0ri\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"QYqrN\",\"description\":\"RD8f2\",\"id\":\"177057932317550_890214517668551/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_890214517668551/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_890214517668551/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_882565748433428\",\"insights\":{\"data\":[{\"name\":\"MrNKf\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"KVe1O\",\"description\":\"bGxFn\",\"id\":\"177057932317550_882565748433428/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_882565748433428/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_882565748433428/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_880197812003555\",\"insights\":{\"data\":[{\"name\":\"ukNrw\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"HvHXu\",\"description\":\"55zf4\",\"id\":\"177057932317550_880197812003555/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_880197812003555/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_880197812003555/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_878834132139923\",\"insights\":{\"data\":[{\"name\":\"noX78\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"4ytFF\",\"description\":\"l9gSB\",\"id\":\"177057932317550_878834132139923/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_878834132139923/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_878834132139923/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_878717075484962\",\"insights\":{\"data\":[{\"name\":\"GsCQy\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"BpzKO\",\"description\":\"stnw6\",\"id\":\"177057932317550_878717075484962/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_878717075484962/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_878717075484962/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_876759985680671\",\"insights\":{\"data\":[{\"name\":\"ZtmHh\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"S7Z0a\",\"description\":\"vUTX0\",\"id\":\"177057932317550_876759985680671/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_876759985680671/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_876759985680671/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_876391385717531\",\"insights\":{\"data\":[{\"name\":\"JJFSq\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"4DhB3\",\"description\":\"G9nR8\",\"id\":\"177057932317550_876391385717531/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_876391385717531/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_876391385717531/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_876365615720108\",\"insights\":{\"data\":[{\"name\":\"eYiyE\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"7oN1X\",\"description\":\"ftuN3\",\"id\":\"177057932317550_876365615720108/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_876365615720108/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_876365615720108/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_871770149512988\",\"insights\":{\"data\":[{\"name\":\"Q5T2j\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"aLnBQ\",\"description\":\"y7Lzt\",\"id\":\"177057932317550_871770149512988/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_871770149512988/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_871770149512988/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_871542359535767\",\"insights\":{\"data\":[{\"name\":\"dewnv\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9TkzD\",\"description\":\"i3BiH\",\"id\":\"177057932317550_871542359535767/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_871542359535767/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_871542359535767/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_871299946226675\",\"insights\":{\"data\":[{\"name\":\"lo2mz\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"dDG3j\",\"description\":\"8K3nC\",\"id\":\"177057932317550_871299946226675/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_871299946226675/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_871299946226675/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_868726169817386\",\"insights\":{\"data\":[{\"name\":\"lmzk5\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"xL87P\",\"description\":\"RDw4S\",\"id\":\"177057932317550_868726169817386/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_868726169817386/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_868726169817386/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_868721253151211\",\"insights\":{\"data\":[{\"name\":\"GODQo\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"jMUa9\",\"description\":\"kCo5e\",\"id\":\"177057932317550_868721253151211/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_868721253151211/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_868721253151211/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_868201209869882\",\"insights\":{\"data\":[{\"name\":\"IhbuP\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ngx4H\",\"description\":\"sif85\",\"id\":\"177057932317550_868201209869882/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_868201209869882/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_868201209869882/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_868084153214921\",\"insights\":{\"data\":[{\"name\":\"5uLps\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8IRlw\",\"description\":\"2U1xt\",\"id\":\"177057932317550_868084153214921/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_868084153214921/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_868084153214921/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_867918849898118\",\"insights\":{\"data\":[{\"name\":\"5I8Gm\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"me7bx\",\"description\":\"9MWIr\",\"id\":\"177057932317550_867918849898118/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_867918849898118/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_867918849898118/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_867662119923791\",\"insights\":{\"data\":[{\"name\":\"tJBKs\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"RvOUF\",\"description\":\"kG5CH\",\"id\":\"177057932317550_867662119923791/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_867662119923791/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_867662119923791/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_863179447038725\",\"insights\":{\"data\":[{\"name\":\"rxWsS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"V3JvY\",\"description\":\"J1evE\",\"id\":\"177057932317550_863179447038725/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_863179447038725/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_863179447038725/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_862432097113460\",\"insights\":{\"data\":[{\"name\":\"keWjE\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"5hiyN\",\"description\":\"Notsu\",\"id\":\"177057932317550_862432097113460/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_862432097113460/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_862432097113460/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_860860447270625\",\"insights\":{\"data\":[{\"name\":\"KgVat\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8283T\",\"description\":\"lxI22\",\"id\":\"177057932317550_860860447270625/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_860860447270625/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_860860447270625/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_860597873963549\",\"insights\":{\"data\":[{\"name\":\"g6vwQ\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"7OiPO\",\"description\":\"nDjiu\",\"id\":\"177057932317550_860597873963549/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_860597873963549/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_860597873963549/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_860049017351768\",\"insights\":{\"data\":[{\"name\":\"1skXP\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"ci6G4\",\"description\":\"2C5Gu\",\"id\":\"177057932317550_860049017351768/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_860049017351768/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_860049017351768/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}},{\"id\":\"177057932317550_859987434024593\",\"insights\":{\"data\":[{\"name\":\"sx81I\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9pjpT\",\"description\":\"nEU18\",\"id\":\"177057932317550_859987434024593/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_859987434024593/insights?access_token=XXTOKENXX&since=1490868468&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954868\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_859987434024593/insights?access_token=XXTOKENXX&since=1490954868&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041268\"}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdBYBxUvsHK0JR3ZC5WugpiFAih1X5n9fzq3sZAU40YwImJI3mk0LvEeHgZBFo3ZBqYxLrkPMsuZBPZCIA2u4sNgeDEOEn7GYlOrM7qZAoT70N99IgUkgZDZD&since=1427362714&access_token=XXTOKENXX&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&limit=25&__paging_token=enc_AdAYZBrkpL4l8uV3M9z3NUzw6WTUvgOzO8vMkSIxhoXiZAKrR0LgHlKFb5xFxfFp63iqnKkIHXtWlrh0krsC5aH1Jhrw35xmvBJ9HoY47dN8ZB32AZDZD&since&access_token=XXTOKENXX&until=1421387610\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&since&access_token=XXTOKENXX&limit=25&until=1427397642&__paging_token=enc_AdB2LNjGnk1UmwTQVeoZCqHeHcJVzhHIavVlTt8vRyZBqIbG5yU1AaBmlIfYzajDfjyGN66DWqbjVUzkkRayNlWuhN6F5EYX7XCOaHvJxjmt3icAZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/feed",
 :as :json,
 :query-params
 {:path "feed",
  :fields
  "insights.since(now).metric(post_negative_feedback, page_posts_impressions)",
  :ids "177057932317550",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:request-time 1880,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "wRlVGZZy8SlSVjo8R9WdzE0bCwg/UayxdMfyvsjgFvIYr3z86KNRQz8Geo9V4OWGmPGLimLOaFQb9NFhyfwRvg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2927011",
  "ETag" "\"9c959aaf6af6403a8cbeec5dfc8dd8d9b97b17fe\"",
  "x-fb-trace-id" "A6B+WLSMHou",
  "Date" "Fri, 31 Mar 2017 10:07:47 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"177057932317550\":{\"data\":[{\"id\":\"177057932317550_1126854757337858\",\"insights\":{\"data\":[{\"name\":\"8GK1H\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"caXv6\",\"description\":\"BICsM\",\"id\":\"177057932317550_1126854757337858/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_1126854757337858/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_10207570586690352\",\"insights\":{\"data\":[{\"name\":\"SWqbk\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"UZ0iQ\",\"description\":\"mMSPp\",\"id\":\"177057932317550_10207570586690352/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_10207570586690352/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_1043848705638464\",\"insights\":{\"data\":[{\"name\":\"y31K9\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"dqojq\",\"description\":\"9gakQ\",\"id\":\"177057932317550_1043848705638464/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_1043848705638464/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_990386480984687\",\"insights\":{\"data\":[{\"name\":\"J7GtO\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"4ouQh\",\"description\":\"jHrrS\",\"id\":\"177057932317550_990386480984687/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_990386480984687/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_940984532591549\",\"insights\":{\"data\":[{\"name\":\"Ch6wb\",\"period\":\"lifetime\",\"values\":[{\"value\":1}],\"title\":\"DI7zM\",\"description\":\"E6UQ5\",\"id\":\"177057932317550_940984532591549/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_940984532591549/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_932914176731918\",\"insights\":{\"data\":[{\"name\":\"9C7bJ\",\"period\":\"lifetime\",\"values\":[{\"value\":8}],\"title\":\"rNbfc\",\"description\":\"7JCKF\",\"id\":\"177057932317550_932914176731918/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_932914176731918/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_921776914512311\",\"insights\":{\"data\":[{\"name\":\"glQtF\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"80Y7I\",\"description\":\"O7bnc\",\"id\":\"177057932317550_921776914512311/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_921776914512311/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_921759597847376\",\"insights\":{\"data\":[{\"name\":\"cjw90\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"xi3IJ\",\"description\":\"0eJDC\",\"id\":\"177057932317550_921759597847376/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_921759597847376/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_913890861967583\",\"insights\":{\"data\":[{\"name\":\"HJHVk\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9PowT\",\"description\":\"Ydaex\",\"id\":\"177057932317550_913890861967583/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_913890861967583/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_913371222019547\",\"insights\":{\"data\":[{\"name\":\"FGa9F\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"8e9Bh\",\"description\":\"vPyBv\",\"id\":\"177057932317550_913371222019547/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_913371222019547/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_910073965682606\",\"insights\":{\"data\":[{\"name\":\"ZWsZr\",\"period\":\"lifetime\",\"values\":[{\"value\":1}],\"title\":\"sO83J\",\"description\":\"hlFSZ\",\"id\":\"177057932317550_910073965682606/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_910073965682606/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_908277042528965\",\"insights\":{\"data\":[{\"name\":\"7LkKW\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"1Kx8I\",\"description\":\"enkcH\",\"id\":\"177057932317550_908277042528965/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_908277042528965/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_905758402780829\",\"insights\":{\"data\":[{\"name\":\"HPfwM\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"cwxz7\",\"description\":\"b0dP7\",\"id\":\"177057932317550_905758402780829/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_905758402780829/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_903010183055651\",\"insights\":{\"data\":[{\"name\":\"wnYCB\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"RTcTN\",\"description\":\"pFVjM\",\"id\":\"177057932317550_903010183055651/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_903010183055651/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_903010183055651/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_902157386474264\",\"insights\":{\"data\":[{\"name\":\"oS3xe\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"puFzU\",\"description\":\"lp6Zp\",\"id\":\"177057932317550_902157386474264/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_902157386474264/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_902157386474264/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_899507860072550\",\"insights\":{\"data\":[{\"name\":\"9EfKF\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"KcdYd\",\"description\":\"tMOYj\",\"id\":\"177057932317550_899507860072550/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_899507860072550/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_899507860072550/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_899104843446185\",\"insights\":{\"data\":[{\"name\":\"yPwXt\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"DR0en\",\"description\":\"UymeN\",\"id\":\"177057932317550_899104843446185/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_899104843446185/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_899104843446185/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_898705676819435\",\"insights\":{\"data\":[{\"name\":\"GvXiK\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"GZsQK\",\"description\":\"UJ4X1\",\"id\":\"177057932317550_898705676819435/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_898705676819435/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_898705676819435/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_898322620191074\",\"insights\":{\"data\":[{\"name\":\"ZZ9cC\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"p2zyt\",\"description\":\"Yo1Ef\",\"id\":\"177057932317550_898322620191074/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_898322620191074/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_898322620191074/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_898249010198435\",\"insights\":{\"data\":[{\"name\":\"z9gL0\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"9bRtg\",\"description\":\"PRKnF\",\"id\":\"177057932317550_898249010198435/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_898249010198435/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_898249010198435/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_897828396907163\",\"insights\":{\"data\":[{\"name\":\"z2oGM\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"3P0OV\",\"description\":\"fpury\",\"id\":\"177057932317550_897828396907163/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_897828396907163/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_897828396907163/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_895669693789700\",\"insights\":{\"data\":[{\"name\":\"pU0ej\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"fS4TJ\",\"description\":\"nqMzV\",\"id\":\"177057932317550_895669693789700/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_895669693789700/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_895669693789700/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_895638570459479\",\"insights\":{\"data\":[{\"name\":\"m8Gde\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"5WnjQ\",\"description\":\"Xbzit\",\"id\":\"177057932317550_895638570459479/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_895638570459479/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_895638570459479/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_895172080506128\",\"insights\":{\"data\":[{\"name\":\"l1DkS\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"KgEnk\",\"description\":\"YDZYj\",\"id\":\"177057932317550_895172080506128/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_895172080506128/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_895172080506128/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}},{\"id\":\"177057932317550_895159487174054\",\"insights\":{\"data\":[{\"name\":\"k0H3T\",\"period\":\"lifetime\",\"values\":[{\"value\":0}],\"title\":\"t5iNd\",\"description\":\"Zh6Qb\",\"id\":\"177057932317550_895159487174054/insights/post_negative_feedback/lifetime\"}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550_895159487174054/insights?access_token=XXTOKENXX&since=1490868467&metric=post_negative_feedback%2C+page_posts_impressions&until=1490954867\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550_895159487174054/insights?access_token=XXTOKENXX&since=1490954867&metric=post_negative_feedback%2C+page_posts_impressions&until=1491041267\"}}}],\"paging\":{\"previous\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&since=1466576604&access_token=XXTOKENXX&limit=25&__paging_token=enc_AdC0lJfU5VlMRqurJI1z8dI7GZAHRy5ZBelI1hob1L37lLij2V79i1ZAtQMJyh8artu00t6O2A5N1N2V1GrpkqS4g1nnKWMEz47rrubYBNbz2BwZCAZDZD&__previous=1\",\"next\":\"https://graph.facebook.com/v2.8/177057932317550/feed?fields=insights.since%28now%29.metric%28post_negative_feedback,+page_posts_impressions%29&since&access_token=XXTOKENXX&limit=25&until=1427397642&__paging_token=enc_AdB2LNjGnk1UmwTQVeoZCqHeHcJVzhHIavVlTt8vRyZBqIbG5yU1AaBmlIfYzajDfjyGN66DWqbjVUzkkRayNlWuhN6F5EYX7XCOaHvJxjmt3icAZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/feed"]}
)
})