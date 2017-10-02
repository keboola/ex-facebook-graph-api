(ns keboola.snapshots.ads.apicalls)
(def recorded 
{
{:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAxOTM2Mzk4NDcwOAZDZD",
 :as :json}
(fn [req]{:request-time 656,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "6/nAjxX2RQbRC1m35EDtw2Jx9d01ItvNXXs6TxoDgfCw6jCpuAywWN9fADmtYE/B692+9PYbQPfOkmeEJExc6A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"8c8066fe6d57e0e1502812b46f810d92953f24df\"",
  "x-fb-trace-id" "BWpS0BUkbMG",
  "Date" "Sat, 15 Apr 2017 16:35:40 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6019173396908\",\"name\":\"mMuwH\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019173396708\",\"name\":\"y810I\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019173396508\",\"name\":\"tW9qp\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019173394508\",\"name\":\"JGijy\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018869673308\",\"name\":\"duzz2\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018869673108\",\"name\":\"magID\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018869672908\",\"name\":\"9Lhow\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018869672708\",\"name\":\"CnHfv\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018869670908\",\"name\":\"DNbBR\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018869670708\",\"name\":\"EaQjs\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018395907908\",\"name\":\"vrh1g\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018395907708\",\"name\":\"3j5tP\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018395907508\",\"name\":\"2QNuZ\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018300893308\",\"name\":\"BQWg2\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018300893108\",\"name\":\"0fDYz\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018300892908\",\"name\":\"ZDYmm\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018300891508\",\"name\":\"97YZU\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018300845708\",\"name\":\"3HSyd\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018300845508\",\"name\":\"D0xpO\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018300845308\",\"name\":\"CvpEU\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018062856708\",\"name\":\"DLEaY\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018062856508\",\"name\":\"5LMp3\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018062856308\",\"name\":\"z27bN\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018062856108\",\"name\":\"4VPGq\",\"account_id\":\"10152412627713995\"}],\"paging\":{\"cursors\":{\"before\":\"NjAxOTE3MzM5NjkwOAZDZD\",\"after\":\"NjAxODA2Mjg1NjEwOAZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&before=NjAxOTE3MzM5NjkwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAxOTM2Mzk4NDcwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAyMjQ5NzQ3NTMwOAZDZD",
 :as :json}
(fn [req]{:request-time 346,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "PtX22xF/LEz56LrrHuCT2/hbB7fEb4i1DEraTjqEQSJgju9OCThKq2ZZ/QuZmu7+qjXxgyDvTcW1vYKzl6P/XQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"b4d76e44d87f8e775ba424bae7d231ebbd61ae92\"",
  "x-fb-trace-id" "B/9V78lWodm",
  "Date" "Sat, 15 Apr 2017 16:35:40 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6022384455308\",\"name\":\"c53Ki\",\"account_id\":\"10152412627713995\"},{\"id\":\"6022227533708\",\"name\":\"lBn4d\",\"account_id\":\"10152412627713995\"},{\"id\":\"6022099353908\",\"name\":\"TkuGQ\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021862044508\",\"name\":\"ubtzT\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021704239908\",\"name\":\"q0gq2\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021704239708\",\"name\":\"35uld\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021704238908\",\"name\":\"YoJz9\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021703482308\",\"name\":\"pVyjt\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021618800308\",\"name\":\"P9rXw\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021618800108\",\"name\":\"6SNbB\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021618799108\",\"name\":\"8q77t\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021617811308\",\"name\":\"VGoQT\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021527352708\",\"name\":\"N7hQu\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021430991108\",\"name\":\"hs8iO\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021065595108\",\"name\":\"z0yxr\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020834987908\",\"name\":\"pTbej\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020779953708\",\"name\":\"mgbCO\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020764680708\",\"name\":\"Srpy1\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020525769508\",\"name\":\"4Q39o\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020525094508\",\"name\":\"cmzbm\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020374960908\",\"name\":\"XoSQ2\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020304748108\",\"name\":\"WJCyE\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020176077508\",\"name\":\"XZYLl\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020118445108\",\"name\":\"b97Kc\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020084747308\",\"name\":\"ziWC4\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020084746508\",\"name\":\"cgQEy\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020084745308\",\"name\":\"zWiEW\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019982775308\",\"name\":\"t5V9H\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019982775108\",\"name\":\"7Bjem\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019982774908\",\"name\":\"a914S\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019982772908\",\"name\":\"4jVMT\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019982602508\",\"name\":\"R0wk8\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019833859308\",\"name\":\"vdGV9\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019833858908\",\"name\":\"kYyiL\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019833857708\",\"name\":\"N2pIk\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019739765108\",\"name\":\"923qT\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019739764908\",\"name\":\"XyKQ0\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019739763908\",\"name\":\"WsNDV\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019736571908\",\"name\":\"yiMTk\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019736571708\",\"name\":\"gjy6H\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019736570308\",\"name\":\"h2yJd\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019650564908\",\"name\":\"Vi9NS\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019650564708\",\"name\":\"5Rbwx\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019650563308\",\"name\":\"qbrCH\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019363988508\",\"name\":\"3wmGY\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019363988308\",\"name\":\"ccPGT\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019363988108\",\"name\":\"dCICS\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019363987908\",\"name\":\"JKOcK\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019363986108\",\"name\":\"5dHoD\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019363984708\",\"name\":\"vNtOI\",\"account_id\":\"10152412627713995\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMjM4NDQ1NTMwOAZDZD\",\"after\":\"NjAxOTM2Mzk4NDcwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAxOTM2Mzk4NDcwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&before=NjAyMjM4NDQ1NTMwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAyMjQ5NzQ3NTMwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAzMDg5OTg1MDkwOAZDZD",
 :as :json}
(fn [req]{:request-time 439,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "hE1XM2IJGkhE2g2Jm6ORL9L5GZwXwXtbvpI5YsSNC7/wcFMPJCSxr6dSk76c+n0njmBJpR9+NAbIdmOq+KaPTw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"294d5d4ea2c46c8d2425609c5ace0b1a10234052\"",
  "x-fb-trace-id" "AgZqA/Cyet7",
  "Date" "Sat, 15 Apr 2017 16:35:39 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6030899850708\",\"name\":\"GR9nB\",\"account_id\":\"10152412627713995\"},{\"id\":\"6030899850508\",\"name\":\"375HY\",\"account_id\":\"10152412627713995\"},{\"id\":\"6030899849708\",\"name\":\"NdWuq\",\"account_id\":\"10152412627713995\"},{\"id\":\"6029050666708\",\"name\":\"assdb\",\"account_id\":\"10152412627713995\"},{\"id\":\"6029050665908\",\"name\":\"1mIWw\",\"account_id\":\"10152412627713995\"},{\"id\":\"6029050665708\",\"name\":\"TvqUl\",\"account_id\":\"10152412627713995\"},{\"id\":\"6029050665508\",\"name\":\"8SOaL\",\"account_id\":\"10152412627713995\"},{\"id\":\"6028106062908\",\"name\":\"lkGIv\",\"account_id\":\"10152412627713995\"},{\"id\":\"6028106062708\",\"name\":\"a2JTP\",\"account_id\":\"10152412627713995\"},{\"id\":\"6028106062508\",\"name\":\"TgfRw\",\"account_id\":\"10152412627713995\"},{\"id\":\"6028106062308\",\"name\":\"Lhhzc\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026999962908\",\"name\":\"qWM1E\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026999962108\",\"name\":\"NGmYb\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026992784308\",\"name\":\"lIBQo\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026992783708\",\"name\":\"SvFW9\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026992783508\",\"name\":\"1DjFq\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026992781908\",\"name\":\"aQYvR\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026992781308\",\"name\":\"Kr89F\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026992781108\",\"name\":\"ntmLv\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287412308\",\"name\":\"ffr0v\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287411908\",\"name\":\"IDvin\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287411108\",\"name\":\"JPvrp\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287409908\",\"name\":\"YgloD\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287409108\",\"name\":\"FL8Il\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287408508\",\"name\":\"ukmz3\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287408308\",\"name\":\"UuGiy\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287408108\",\"name\":\"5dtTH\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025523612708\",\"name\":\"py3lR\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025523612308\",\"name\":\"CcNb4\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025523611508\",\"name\":\"N3c3S\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025523611108\",\"name\":\"jzZvi\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025342743708\",\"name\":\"YqWon\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025342743108\",\"name\":\"KcdIx\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025342742908\",\"name\":\"OQrI4\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025342742708\",\"name\":\"c2Iun\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987412508\",\"name\":\"7QRXg\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987412108\",\"name\":\"hDqGN\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987411908\",\"name\":\"d0Fbt\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987410108\",\"name\":\"Gzp3G\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987409308\",\"name\":\"vYy1j\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987409108\",\"name\":\"vfbLC\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987408908\",\"name\":\"4HHvu\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987408708\",\"name\":\"1i5tT\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023170891308\",\"name\":\"ey7XN\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023170890708\",\"name\":\"QUVJq\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023110052708\",\"name\":\"4QnPB\",\"account_id\":\"10152412627713995\"},{\"id\":\"6022769056708\",\"name\":\"6JuzY\",\"account_id\":\"10152412627713995\"},{\"id\":\"6022769056108\",\"name\":\"9nehB\",\"account_id\":\"10152412627713995\"},{\"id\":\"6022769055908\",\"name\":\"h8FkG\",\"account_id\":\"10152412627713995\"},{\"id\":\"6022497475308\",\"name\":\"OVXqt\",\"account_id\":\"10152412627713995\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzMDg5OTg1MDcwOAZDZD\",\"after\":\"NjAyMjQ5NzQ3NTMwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAyMjQ5NzQ3NTMwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&before=NjAzMDg5OTg1MDcwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAzMDg5OTg1MDkwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjA0MDc0MDI3ODcwOAZDZD",
 :as :json}
(fn [req]{:request-time 504,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "AacZ0iC3WFW/BpESQ0vgWjisbgJ0CMHbodJFqSFb4IR/8T2xDiTAwTg4u1k3r7KafPGWwfhYUSykQEabjkkw8g==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"b220a2b28ec4a71c2ed5d7f2d4d0ec6a5fb66703\"",
  "x-fb-trace-id" "FYrIrvuMdTH",
  "Date" "Sat, 15 Apr 2017 16:35:39 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6040739719108\",\"name\":\"KTX1l\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040739718908\",\"name\":\"7EKOE\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040739718708\",\"name\":\"SLjWT\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040739717108\",\"name\":\"1effn\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040739381508\",\"name\":\"9xarX\",\"account_id\":\"10152412627713995\"},{\"id\":\"6039331673508\",\"name\":\"gF4Lo\",\"account_id\":\"10152412627713995\"},{\"id\":\"6039331672708\",\"name\":\"9bDq2\",\"account_id\":\"10152412627713995\"},{\"id\":\"6039331671908\",\"name\":\"mWpc4\",\"account_id\":\"10152412627713995\"},{\"id\":\"6039331671708\",\"name\":\"bDgBc\",\"account_id\":\"10152412627713995\"},{\"id\":\"6039331670308\",\"name\":\"xo6Sn\",\"account_id\":\"10152412627713995\"},{\"id\":\"6039331669708\",\"name\":\"Dd1OK\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037797572108\",\"name\":\"H9I6i\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037797571708\",\"name\":\"bbiBd\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037797043108\",\"name\":\"8HBxm\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037797042908\",\"name\":\"tpYM2\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037795800308\",\"name\":\"ukcJF\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037764907508\",\"name\":\"TL6mV\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037764906508\",\"name\":\"dWM0m\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037764905708\",\"name\":\"CwCVe\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037764905508\",\"name\":\"okduq\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037764903508\",\"name\":\"ctbHn\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037764902908\",\"name\":\"4oIJy\",\"account_id\":\"10152412627713995\"},{\"id\":\"6036310196908\",\"name\":\"lH9eo\",\"account_id\":\"10152412627713995\"},{\"id\":\"6036310195708\",\"name\":\"yORDr\",\"account_id\":\"10152412627713995\"},{\"id\":\"6036310195108\",\"name\":\"zjThs\",\"account_id\":\"10152412627713995\"},{\"id\":\"6036310194508\",\"name\":\"h4V3p\",\"account_id\":\"10152412627713995\"},{\"id\":\"6036310193308\",\"name\":\"lxDnr\",\"account_id\":\"10152412627713995\"},{\"id\":\"6036310192508\",\"name\":\"jIYNY\",\"account_id\":\"10152412627713995\"},{\"id\":\"6035030430708\",\"name\":\"d3o5a\",\"account_id\":\"10152412627713995\"},{\"id\":\"6035030428908\",\"name\":\"QSbaS\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034803787508\",\"name\":\"WmSTo\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034803786708\",\"name\":\"2KDaO\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034803645708\",\"name\":\"ZYVRs\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034803645508\",\"name\":\"NuUuq\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087418908\",\"name\":\"QfC7n\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087417908\",\"name\":\"zmje1\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087416908\",\"name\":\"V27lq\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087416708\",\"name\":\"NMV2m\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087416508\",\"name\":\"KI8KP\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087416108\",\"name\":\"Q1iaB\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032883803308\",\"name\":\"VIOre\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597925508\",\"name\":\"byG7d\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597924508\",\"name\":\"R8sG5\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597923708\",\"name\":\"fvOyi\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597923508\",\"name\":\"noKN6\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597923108\",\"name\":\"tZ6z8\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597922908\",\"name\":\"Od097\",\"account_id\":\"10152412627713995\"},{\"id\":\"6031426193508\",\"name\":\"SVF6t\",\"account_id\":\"10152412627713995\"},{\"id\":\"6031426192908\",\"name\":\"5nXKn\",\"account_id\":\"10152412627713995\"},{\"id\":\"6030899850908\",\"name\":\"2pZvq\",\"account_id\":\"10152412627713995\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0MDczOTcxOTEwOAZDZD\",\"after\":\"NjAzMDg5OTg1MDkwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAzMDg5OTg1MDkwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&before=NjA0MDczOTcxOTEwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjA0MDc0MDI3ODcwOAZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/adsets",
 :as :json,
 :query-params
 {:path "adsets",
  :limit "50",
  :fields "id,name,account_id",
  :ids "act_10152412627713995",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:request-time 448,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "t2yJNUc3EntMG9a0J8Fk8kqU51qNA0TnlQLm9gDR01miDxTUvT2gtI+kWNdxQ2IC9pCRBMgJqC7Lde8RrMjBIg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"9d5dc8ff69106a9d8d861ed887e9e1a425c0d332\"",
  "x-fb-trace-id" "CQaMqdZLnNs",
  "Date" "Sat, 15 Apr 2017 16:35:39 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"act_10152412627713995\":{\"data\":[{\"id\":\"6052149268508\",\"name\":\"ZNPVL\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130291708\",\"name\":\"HmcMk\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130291508\",\"name\":\"9hqOJ\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130291308\",\"name\":\"zlOlV\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130291108\",\"name\":\"WBz3k\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130290908\",\"name\":\"e8C8L\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130290708\",\"name\":\"cOnH4\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130290508\",\"name\":\"m1dhG\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130284508\",\"name\":\"4kHtB\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130283908\",\"name\":\"5GbK6\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816616908\",\"name\":\"wbuoP\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816616708\",\"name\":\"bZYIa\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816616508\",\"name\":\"9SJZh\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816616308\",\"name\":\"XDqcZ\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816616108\",\"name\":\"p7qPw\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816615908\",\"name\":\"Ptmks\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816615708\",\"name\":\"7vKrC\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816615508\",\"name\":\"DUjoi\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816615308\",\"name\":\"2rpTe\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315733308\",\"name\":\"oTv1b\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315733108\",\"name\":\"GiinM\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315732908\",\"name\":\"bnEvv\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315732708\",\"name\":\"yh0PV\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315732508\",\"name\":\"T9jIj\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315732308\",\"name\":\"Icv1B\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315732108\",\"name\":\"bJgiq\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315731908\",\"name\":\"gWhoN\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315731708\",\"name\":\"tCiIw\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315731508\",\"name\":\"ok0vc\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315731308\",\"name\":\"I6E5Y\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315731108\",\"name\":\"2JSM6\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315730908\",\"name\":\"m1yO3\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315730708\",\"name\":\"jWwjV\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042601725908\",\"name\":\"0Fr0u\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042601725708\",\"name\":\"ruafL\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042601725508\",\"name\":\"BuvXi\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042601725308\",\"name\":\"vxFMc\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042213730708\",\"name\":\"6hkqB\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042213730508\",\"name\":\"y0LX6\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042191852508\",\"name\":\"VSSTr\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042191852308\",\"name\":\"cnThg\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042191852108\",\"name\":\"qemyn\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042191851908\",\"name\":\"2yw70\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042191851708\",\"name\":\"4EoO6\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042191851508\",\"name\":\"ru4zd\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042191851308\",\"name\":\"XDmG0\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042191851108\",\"name\":\"IwU8G\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040740929908\",\"name\":\"oG3o5\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040740278908\",\"name\":\"zW0BX\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040740278708\",\"name\":\"ubGU7\",\"account_id\":\"10152412627713995\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1MjE0OTI2ODUwOAZDZD\",\"after\":\"NjA0MDc0MDI3ODcwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/adsets?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjA0MDc0MDI3ODcwOAZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/adsets"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/campaigns?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAyMzExMDA1MDkwOAZDZD",
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
  "wNE5epkgvjhGSWGrdWSElsQx55IqrWoMSeqSUAeGxI6S2QNhb4iCfAki1m5WYI7u39PhaHspI3L3JHlLKesNQA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"ffa234d338c7d631e98cba5e2623920fd187fcff\"",
  "x-fb-trace-id" "Hm5O+LKbHGK",
  "Date" "Sat, 15 Apr 2017 16:35:38 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6022227532708\",\"name\":\"yPT5B\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021704237308\",\"name\":\"hW4Bb\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021618797908\",\"name\":\"W4Ogo\",\"account_id\":\"10152412627713995\"},{\"id\":\"6021430990308\",\"name\":\"WiNEV\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020764641508\",\"name\":\"75OJi\",\"account_id\":\"10152412627713995\"},{\"id\":\"6020012167508\",\"name\":\"zx8kU\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019982771708\",\"name\":\"f4Qza\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019982601108\",\"name\":\"Xj3yN\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019363983508\",\"name\":\"OOwhN\",\"account_id\":\"10152412627713995\"},{\"id\":\"6019173393708\",\"name\":\"HvNj3\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018300843908\",\"name\":\"DdxZP\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018300843708\",\"name\":\"bjRyY\",\"account_id\":\"10152412627713995\"},{\"id\":\"6018062854308\",\"name\":\"BweoU\",\"account_id\":\"10152412627713995\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMjIyNzUzMjcwOAZDZD\",\"after\":\"NjAxODA2Mjg1NDMwOAZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/campaigns?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&before=NjAyMjIyNzUzMjcwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/campaigns?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAyMzExMDA1MDkwOAZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/campaigns",
 :as :json,
 :query-params
 {:path "campaigns",
  :limit "50",
  :fields "id,name,account_id",
  :ids "act_10152412627713995",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:request-time 660,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "fEN/UZZ/kRRFgq8BmVhBCJu7+qiNwOIaso51gvcjiaNtmqfmg7qGodH883OzuYAr4qHq4HpL/szLY6ywXsQO+A==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"8e3316050c69bcd0f0bace864a4ab342925df24c\"",
  "x-fb-trace-id" "Dpw2aF3ssiF",
  "Date" "Sat, 15 Apr 2017 16:35:38 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"act_10152412627713995\":{\"data\":[{\"id\":\"6052149267708\",\"name\":\"sgQTs\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130283708\",\"name\":\"h0mdo\",\"account_id\":\"10152412627713995\"},{\"id\":\"6049130283508\",\"name\":\"6Qn6e\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816614508\",\"name\":\"7ZZ6O\",\"account_id\":\"10152412627713995\"},{\"id\":\"6046816614308\",\"name\":\"kiIVe\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315729508\",\"name\":\"sNpZJ\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315729308\",\"name\":\"RwZ8H\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315729108\",\"name\":\"jaE7F\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315728908\",\"name\":\"krhTE\",\"account_id\":\"10152412627713995\"},{\"id\":\"6044315728708\",\"name\":\"Y9E8v\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042601724708\",\"name\":\"Bv70l\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042601724508\",\"name\":\"geGBu\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042213729908\",\"name\":\"Izmql\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042213729708\",\"name\":\"q0TXG\",\"account_id\":\"10152412627713995\"},{\"id\":\"6042191850708\",\"name\":\"0ynHx\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040740278108\",\"name\":\"C38Yq\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040740277908\",\"name\":\"gXc3x\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040739716108\",\"name\":\"d1dUZ\",\"account_id\":\"10152412627713995\"},{\"id\":\"6040739715908\",\"name\":\"WnFP7\",\"account_id\":\"10152412627713995\"},{\"id\":\"6039331667708\",\"name\":\"FknWd\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037795175108\",\"name\":\"KdnEY\",\"account_id\":\"10152412627713995\"},{\"id\":\"6037764899108\",\"name\":\"eZoDP\",\"account_id\":\"10152412627713995\"},{\"id\":\"6036310188308\",\"name\":\"Grzrq\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034803642708\",\"name\":\"e3pMf\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087406708\",\"name\":\"61DUQ\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087406508\",\"name\":\"Hy0kk\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087406308\",\"name\":\"i9XOm\",\"account_id\":\"10152412627713995\"},{\"id\":\"6034087406108\",\"name\":\"Cr3Xp\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032883801708\",\"name\":\"fdJ9E\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597916508\",\"name\":\"VN75a\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597916308\",\"name\":\"0vRaV\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597916108\",\"name\":\"uJWKH\",\"account_id\":\"10152412627713995\"},{\"id\":\"6032597915908\",\"name\":\"mYmYh\",\"account_id\":\"10152412627713995\"},{\"id\":\"6031426189108\",\"name\":\"UDGQ5\",\"account_id\":\"10152412627713995\"},{\"id\":\"6031426188908\",\"name\":\"OwPB2\",\"account_id\":\"10152412627713995\"},{\"id\":\"6030899843708\",\"name\":\"Ulo7x\",\"account_id\":\"10152412627713995\"},{\"id\":\"6030899843508\",\"name\":\"ZY7eG\",\"account_id\":\"10152412627713995\"},{\"id\":\"6029050661908\",\"name\":\"zP8ta\",\"account_id\":\"10152412627713995\"},{\"id\":\"6029050661508\",\"name\":\"SDhzY\",\"account_id\":\"10152412627713995\"},{\"id\":\"6028106058108\",\"name\":\"XBi5S\",\"account_id\":\"10152412627713995\"},{\"id\":\"6028106057908\",\"name\":\"u5nPW\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026992779108\",\"name\":\"zHXRh\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026992252308\",\"name\":\"0e73l\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287405508\",\"name\":\"tUJKi\",\"account_id\":\"10152412627713995\"},{\"id\":\"6026287405308\",\"name\":\"vBBIQ\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025523608508\",\"name\":\"dD5c3\",\"account_id\":\"10152412627713995\"},{\"id\":\"6025342736908\",\"name\":\"aIOg9\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987405708\",\"name\":\"UYURB\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023987405508\",\"name\":\"vghho\",\"account_id\":\"10152412627713995\"},{\"id\":\"6023110050908\",\"name\":\"YEMfR\",\"account_id\":\"10152412627713995\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1MjE0OTI2NzcwOAZDZD\",\"after\":\"NjAyMzExMDA1MDkwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/campaigns?access_token=XXTOKENXX&fields=id%2Cname%2Caccount_id&since&until&limit=50&after=NjAyMzExMDA1MDkwOAZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/campaigns"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAxOTE3MzQwOTcwOAZDZD",
 :as :json}
(fn [req]{:request-time 431,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "IMzOCHfq8OJGvh9JPevWwtnyYKSaN2be12dHJlhlLPSVlUwTNOK/INJH4RPXkVjoTWtDsi9vEpWM4bb1lMTnUA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"3a1c7501f1936baaceeaeda2a3452c56f0cbd6ef\"",
  "x-fb-trace-id" "CbYJ6fmdSYo",
  "Date" "Sat, 15 Apr 2017 16:35:37 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6019173408108\",\"name\":\"2VYWh\",\"adset_id\":\"6019173396508\"},{\"id\":\"6019173405108\",\"name\":\"veb3w\",\"adset_id\":\"6019173396508\"},{\"id\":\"6019173404908\",\"name\":\"71DFT\",\"adset_id\":\"6019173396508\"},{\"id\":\"6019173409508\",\"name\":\"ooYeO\",\"adset_id\":\"6019173396908\"},{\"id\":\"6019173421508\",\"name\":\"Da12r\",\"adset_id\":\"6019173394508\"},{\"id\":\"6019173407508\",\"name\":\"Pc2lV\",\"adset_id\":\"6019173396908\"},{\"id\":\"6019173428708\",\"name\":\"yqwal\",\"adset_id\":\"6019173396708\"},{\"id\":\"6019173428908\",\"name\":\"Dtbso\",\"adset_id\":\"6019173396708\"},{\"id\":\"6019173407708\",\"name\":\"F8Tto\",\"adset_id\":\"6019173396908\"},{\"id\":\"6019173405308\",\"name\":\"9EjHY\",\"adset_id\":\"6019173396508\"},{\"id\":\"6018869680108\",\"name\":\"OnK0x\",\"adset_id\":\"6018869672908\"},{\"id\":\"6018869683908\",\"name\":\"Yq2bw\",\"adset_id\":\"6018869670708\"},{\"id\":\"6018869680508\",\"name\":\"DNk1v\",\"adset_id\":\"6018869673308\"},{\"id\":\"6018869682708\",\"name\":\"Ct8g1\",\"adset_id\":\"6018869670908\"},{\"id\":\"6018869679508\",\"name\":\"aajkg\",\"adset_id\":\"6018869672708\"},{\"id\":\"6018869679308\",\"name\":\"mJ1ZQ\",\"adset_id\":\"6018869673108\"},{\"id\":\"6018395910908\",\"name\":\"RlfJW\",\"adset_id\":\"6018395907908\"},{\"id\":\"6018395910508\",\"name\":\"y191D\",\"adset_id\":\"6018395907708\"},{\"id\":\"6018395909508\",\"name\":\"Si4SD\",\"adset_id\":\"6018395907508\"},{\"id\":\"6018300848308\",\"name\":\"YLibb\",\"adset_id\":\"6018300845508\"},{\"id\":\"6018300849108\",\"name\":\"28JwO\",\"adset_id\":\"6018300845708\"},{\"id\":\"6018300848508\",\"name\":\"Pgpna\",\"adset_id\":\"6018300845308\"},{\"id\":\"6018062871908\",\"name\":\"VZSUf\",\"adset_id\":\"6018062856308\"},{\"id\":\"6018062889708\",\"name\":\"gX1Cm\",\"adset_id\":\"6018062856508\"},{\"id\":\"6018062894108\",\"name\":\"UTL95\",\"adset_id\":\"6018062856108\"},{\"id\":\"6018062889108\",\"name\":\"Qovl5\",\"adset_id\":\"6018062856708\"},{\"id\":\"6018062893108\",\"name\":\"ps5Xi\",\"adset_id\":\"6018062856108\"},{\"id\":\"6018062892908\",\"name\":\"Z9zRR\",\"adset_id\":\"6018062856108\"},{\"id\":\"6018062871708\",\"name\":\"fz2p0\",\"adset_id\":\"6018062856708\"},{\"id\":\"6018062892708\",\"name\":\"C0WQW\",\"adset_id\":\"6018062856508\"},{\"id\":\"6018062872108\",\"name\":\"jTig6\",\"adset_id\":\"6018062856308\"},{\"id\":\"6018062870908\",\"name\":\"xIjqw\",\"adset_id\":\"6018062856108\"},{\"id\":\"6018062888908\",\"name\":\"hfIUJ\",\"adset_id\":\"6018062856708\"},{\"id\":\"6018062869108\",\"name\":\"G3IqF\",\"adset_id\":\"6018062856508\"},{\"id\":\"6018062870708\",\"name\":\"L2g7o\",\"adset_id\":\"6018062856708\"},{\"id\":\"6018062871108\",\"name\":\"q5gJf\",\"adset_id\":\"6018062856308\"},{\"id\":\"6018062889508\",\"name\":\"kQh1a\",\"adset_id\":\"6018062856308\"},{\"id\":\"6018062871308\",\"name\":\"bqYO2\",\"adset_id\":\"6018062856508\"}],\"paging\":{\"cursors\":{\"before\":\"NjAxOTE3MzQwODEwOAZDZD\",\"after\":\"NjAxODA2Mjg3MTMwOAZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAxOTE3MzQwODEwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAxOTE3MzQwOTcwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAxOTk4Mjc3NzMwOAZDZD",
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
  "llFBIwN0JLkfxUytuWvfOL0NYNZcKUDZCT3rDAQLPLN0QrHC5HaZj/Lay3AsQFOyHsLgn8Dl35AzgU2gL2l8pw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"de55ad008f10e1a67b6244110373224527cfc72c\"",
  "x-fb-trace-id" "HdfDc/RxjtJ",
  "Date" "Sat, 15 Apr 2017 16:35:36 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6019982803108\",\"name\":\"YXozM\",\"adset_id\":\"6019982775308\"},{\"id\":\"6019982603508\",\"name\":\"zc5NM\",\"adset_id\":\"6019982602508\"},{\"id\":\"6019982803308\",\"name\":\"EWKEL\",\"adset_id\":\"6019982775308\"},{\"id\":\"6019982776508\",\"name\":\"WkLNH\",\"adset_id\":\"6019982772908\"},{\"id\":\"6019982789708\",\"name\":\"acyNo\",\"adset_id\":\"6019982774908\"},{\"id\":\"6019982795308\",\"name\":\"MzsYp\",\"adset_id\":\"6019982775308\"},{\"id\":\"6019982787308\",\"name\":\"Osv1o\",\"adset_id\":\"6019982774908\"},{\"id\":\"6019982778508\",\"name\":\"WOyZP\",\"adset_id\":\"6019982772908\"},{\"id\":\"6019982776908\",\"name\":\"ST3kh\",\"adset_id\":\"6019982775108\"},{\"id\":\"6019982788508\",\"name\":\"t8lmx\",\"adset_id\":\"6019982775108\"},{\"id\":\"6019833860908\",\"name\":\"r3gXh\",\"adset_id\":\"6019833858908\"},{\"id\":\"6019833860708\",\"name\":\"EwtXm\",\"adset_id\":\"6019833857708\"},{\"id\":\"6019833861108\",\"name\":\"Gc3pa\",\"adset_id\":\"6019833859308\"},{\"id\":\"6019739767508\",\"name\":\"6vqen\",\"adset_id\":\"6019739763908\"},{\"id\":\"6019739768708\",\"name\":\"o5r5E\",\"adset_id\":\"6019739764908\"},{\"id\":\"6019739767708\",\"name\":\"sgFW7\",\"adset_id\":\"6019739765108\"},{\"id\":\"6019736574108\",\"name\":\"XkmYu\",\"adset_id\":\"6019736570308\"},{\"id\":\"6019736573908\",\"name\":\"9Slh2\",\"adset_id\":\"6019736571908\"},{\"id\":\"6019736574308\",\"name\":\"56ti0\",\"adset_id\":\"6019736571708\"},{\"id\":\"6019650567908\",\"name\":\"LSMqb\",\"adset_id\":\"6019650564708\"},{\"id\":\"6019650567508\",\"name\":\"ZUqvf\",\"adset_id\":\"6019650564908\"},{\"id\":\"6019650567708\",\"name\":\"Lc4fE\",\"adset_id\":\"6019650563308\"},{\"id\":\"6019363992308\",\"name\":\"TXjpl\",\"adset_id\":\"6019363987908\"},{\"id\":\"6019363992708\",\"name\":\"uBgxG\",\"adset_id\":\"6019363988108\"},{\"id\":\"6019363992908\",\"name\":\"lDWyb\",\"adset_id\":\"6019363984708\"},{\"id\":\"6019363992508\",\"name\":\"vxflp\",\"adset_id\":\"6019363988308\"},{\"id\":\"6019363993108\",\"name\":\"OPau7\",\"adset_id\":\"6019363988508\"},{\"id\":\"6019363993308\",\"name\":\"fjdHw\",\"adset_id\":\"6019363986108\"},{\"id\":\"6018300903508\",\"name\":\"tmWgW\",\"adset_id\":\"6018300891508\"},{\"id\":\"6018300895508\",\"name\":\"L1Lyr\",\"adset_id\":\"6018300893108\"},{\"id\":\"6018300914708\",\"name\":\"0DHMB\",\"adset_id\":\"6018300893308\"},{\"id\":\"6018300916508\",\"name\":\"FdQLR\",\"adset_id\":\"6018300893308\"},{\"id\":\"6018300895108\",\"name\":\"VaIRS\",\"adset_id\":\"6018300893108\"},{\"id\":\"6018300904308\",\"name\":\"cNB6n\",\"adset_id\":\"6018300891508\"},{\"id\":\"6018300914108\",\"name\":\"5c0B4\",\"adset_id\":\"6018300893308\"},{\"id\":\"6018300903708\",\"name\":\"v3z6h\",\"adset_id\":\"6018300891508\"},{\"id\":\"6018300894108\",\"name\":\"zlunN\",\"adset_id\":\"6018300893108\"},{\"id\":\"6018300913908\",\"name\":\"DmcvC\",\"adset_id\":\"6018300893308\"},{\"id\":\"6018300915108\",\"name\":\"fivWF\",\"adset_id\":\"6018300892908\"},{\"id\":\"6018300903908\",\"name\":\"Cvo78\",\"adset_id\":\"6018300891508\"},{\"id\":\"6018300916308\",\"name\":\"kMv3f\",\"adset_id\":\"6018300892908\"},{\"id\":\"6018300894708\",\"name\":\"a1N93\",\"adset_id\":\"6018300893108\"},{\"id\":\"6018300916108\",\"name\":\"4Nl28\",\"adset_id\":\"6018300892908\"},{\"id\":\"6018300914908\",\"name\":\"fzgeI\",\"adset_id\":\"6018300892908\"},{\"id\":\"6019173407108\",\"name\":\"tpOFQ\",\"adset_id\":\"6019173394508\"},{\"id\":\"6019173422108\",\"name\":\"I0Wbh\",\"adset_id\":\"6019173394508\"},{\"id\":\"6019173417308\",\"name\":\"VrK2r\",\"adset_id\":\"6019173396708\"},{\"id\":\"6019173421708\",\"name\":\"mb1YG\",\"adset_id\":\"6019173394508\"},{\"id\":\"6019173417508\",\"name\":\"MQrWl\",\"adset_id\":\"6019173396708\"},{\"id\":\"6019173409708\",\"name\":\"NBjuf\",\"adset_id\":\"6019173396908\"}],\"paging\":{\"cursors\":{\"before\":\"NjAxOTk4MjgwMzEwOAZDZD\",\"after\":\"NjAxOTE3MzQwOTcwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAxOTE3MzQwOTcwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAxOTk4MjgwMzEwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAxOTk4Mjc3NzMwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyMTg2MjA0NjcwOAZDZD",
 :as :json}
(fn [req]{:request-time 349,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "LjzyJZYaH60UIUgYgQXpvjWaP0E9bl0prV4kXwNdlt3XY+kc6qgD1jF3fjXVSXuixxqYythRcopaJlra7FlWNA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"3a8b1ba2accd819949dd214bedbd0527647f6a5f\"",
  "x-fb-trace-id" "G7WEbtIeWh8",
  "Date" "Sat, 15 Apr 2017 16:35:36 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6021703484108\",\"name\":\"gCHIj\",\"adset_id\":\"6021703482308\"},{\"id\":\"6021723127108\",\"name\":\"E69nK\",\"adset_id\":\"6021704239708\"},{\"id\":\"6021723124708\",\"name\":\"VLEwp\",\"adset_id\":\"6021704239708\"},{\"id\":\"6021704697708\",\"name\":\"pppkU\",\"adset_id\":\"6021704239708\"},{\"id\":\"6021704697108\",\"name\":\"ONeUE\",\"adset_id\":\"6021704239708\"},{\"id\":\"6021704696908\",\"name\":\"4b8n4\",\"adset_id\":\"6021704239708\"},{\"id\":\"6021704689508\",\"name\":\"uIZbh\",\"adset_id\":\"6021704239708\"},{\"id\":\"6021704687708\",\"name\":\"8gZfy\",\"adset_id\":\"6021704238908\"},{\"id\":\"6021704679708\",\"name\":\"CsPxv\",\"adset_id\":\"6021704238908\"},{\"id\":\"6021704677708\",\"name\":\"5nXQR\",\"adset_id\":\"6021704238908\"},{\"id\":\"6021704692108\",\"name\":\"hCegs\",\"adset_id\":\"6021704239908\"},{\"id\":\"6021704678708\",\"name\":\"PePV4\",\"adset_id\":\"6021704238908\"},{\"id\":\"6021704693308\",\"name\":\"p1gpa\",\"adset_id\":\"6021704239908\"},{\"id\":\"6021704702508\",\"name\":\"2h0GR\",\"adset_id\":\"6021704239908\"},{\"id\":\"6021704702108\",\"name\":\"taxuI\",\"adset_id\":\"6021704239908\"},{\"id\":\"6021642126308\",\"name\":\"NM0kY\",\"adset_id\":\"6021618800308\"},{\"id\":\"6021642118508\",\"name\":\"pZ05w\",\"adset_id\":\"6021618799108\"},{\"id\":\"6021642116508\",\"name\":\"pfV60\",\"adset_id\":\"6021618800108\"},{\"id\":\"6021642106908\",\"name\":\"joBju\",\"adset_id\":\"6021618799108\"},{\"id\":\"6021642106108\",\"name\":\"H4SzV\",\"adset_id\":\"6021618799108\"},{\"id\":\"6021642115308\",\"name\":\"ktuEs\",\"adset_id\":\"6021618800108\"},{\"id\":\"6021642123508\",\"name\":\"m9xKY\",\"adset_id\":\"6021618800308\"},{\"id\":\"6021642106508\",\"name\":\"tcJ27\",\"adset_id\":\"6021618799108\"},{\"id\":\"6021642116908\",\"name\":\"W2Er9\",\"adset_id\":\"6021618800108\"},{\"id\":\"6021642121108\",\"name\":\"Wngs6\",\"adset_id\":\"6021618800308\"},{\"id\":\"6021642116108\",\"name\":\"Zz2C8\",\"adset_id\":\"6021618800108\"},{\"id\":\"6021642133308\",\"name\":\"pw3h8\",\"adset_id\":\"6021618800308\"},{\"id\":\"6021617813108\",\"name\":\"EXbe0\",\"adset_id\":\"6021617811308\"},{\"id\":\"6021527357508\",\"name\":\"HJxWz\",\"adset_id\":\"6021527352708\"},{\"id\":\"6021430992908\",\"name\":\"TejiD\",\"adset_id\":\"6021430991108\"},{\"id\":\"6021065596708\",\"name\":\"rFl4d\",\"adset_id\":\"6021065595108\"},{\"id\":\"6020834991508\",\"name\":\"frHeq\",\"adset_id\":\"6020834987908\"},{\"id\":\"6020779955508\",\"name\":\"C7ILX\",\"adset_id\":\"6020779953708\"},{\"id\":\"6020764695508\",\"name\":\"OqLj9\",\"adset_id\":\"6020764680708\"},{\"id\":\"6020525096108\",\"name\":\"YG2Hm\",\"adset_id\":\"6020525094508\"},{\"id\":\"6020525771108\",\"name\":\"6Mhr8\",\"adset_id\":\"6020525769508\"},{\"id\":\"6020374962708\",\"name\":\"gL9YC\",\"adset_id\":\"6020374960908\"},{\"id\":\"6020304750308\",\"name\":\"aJEgb\",\"adset_id\":\"6020304748108\"},{\"id\":\"6020176079708\",\"name\":\"Vgsg2\",\"adset_id\":\"6020176077508\"},{\"id\":\"6020084753108\",\"name\":\"m3ajO\",\"adset_id\":\"6020084747308\"},{\"id\":\"6020084753308\",\"name\":\"1wVo0\",\"adset_id\":\"6020084745308\"},{\"id\":\"6020084752908\",\"name\":\"mzNnO\",\"adset_id\":\"6020084746508\"},{\"id\":\"6020118446708\",\"name\":\"UfklD\",\"adset_id\":\"6020118445108\"},{\"id\":\"6019982776308\",\"name\":\"dJhlJ\",\"adset_id\":\"6019982772908\"},{\"id\":\"6019982776108\",\"name\":\"xQx8U\",\"adset_id\":\"6019982772908\"},{\"id\":\"6019982783908\",\"name\":\"993If\",\"adset_id\":\"6019982775308\"},{\"id\":\"6019982788308\",\"name\":\"x6ba2\",\"adset_id\":\"6019982775108\"},{\"id\":\"6019982777108\",\"name\":\"KVY4u\",\"adset_id\":\"6019982775108\"},{\"id\":\"6019982776708\",\"name\":\"Z6naK\",\"adset_id\":\"6019982774908\"},{\"id\":\"6019982777308\",\"name\":\"zQgiy\",\"adset_id\":\"6019982774908\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMTcwMzQ4NDEwOAZDZD\",\"after\":\"NjAxOTk4Mjc3NzMwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAxOTk4Mjc3NzMwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAyMTcwMzQ4NDEwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyMTg2MjA0NjcwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyMzk4NzQ0MzEwOAZDZD",
 :as :json}
(fn [req]{:request-time 486,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "wK0mHZNewY3ec3PLZ06H/libtGpPG3cgf7GoIWvyzvjObHX9mW0wVulwFc7uG8czvJwbOWmUwPdQAA9SXcTLjA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"e1e913552075eb55505070cb04dd4f9efd4cb064\"",
  "x-fb-trace-id" "FKd/iTsKBOJ",
  "Date" "Sat, 15 Apr 2017 16:35:35 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6023987441308\",\"name\":\"fIiH5\",\"adset_id\":\"6023987408908\"},{\"id\":\"6023987454908\",\"name\":\"ertYb\",\"adset_id\":\"6023987409308\"},{\"id\":\"6023987472908\",\"name\":\"8DH46\",\"adset_id\":\"6023987409108\"},{\"id\":\"6023987488708\",\"name\":\"oXG7X\",\"adset_id\":\"6023987412108\"},{\"id\":\"6023987458708\",\"name\":\"lhuqX\",\"adset_id\":\"6023987409108\"},{\"id\":\"6023987441108\",\"name\":\"ff8xS\",\"adset_id\":\"6023987408908\"},{\"id\":\"6023987472508\",\"name\":\"rIW0e\",\"adset_id\":\"6023987409108\"},{\"id\":\"6023987472308\",\"name\":\"ievvb\",\"adset_id\":\"6023987409108\"},{\"id\":\"6023987493708\",\"name\":\"ZY5MO\",\"adset_id\":\"6023987410108\"},{\"id\":\"6023987461908\",\"name\":\"OZXaE\",\"adset_id\":\"6023987409108\"},{\"id\":\"6023987494108\",\"name\":\"wxxXP\",\"adset_id\":\"6023987410108\"},{\"id\":\"6023987441508\",\"name\":\"4U94z\",\"adset_id\":\"6023987408908\"},{\"id\":\"6023987470308\",\"name\":\"hIOLZ\",\"adset_id\":\"6023987409308\"},{\"id\":\"6023987470108\",\"name\":\"gYHdf\",\"adset_id\":\"6023987409308\"},{\"id\":\"6023987454108\",\"name\":\"dZXlJ\",\"adset_id\":\"6023987409308\"},{\"id\":\"6023987485508\",\"name\":\"asJ4u\",\"adset_id\":\"6023987410108\"},{\"id\":\"6023987538508\",\"name\":\"Yn7f2\",\"adset_id\":\"6023987412508\"},{\"id\":\"6023987518308\",\"name\":\"Q4n2S\",\"adset_id\":\"6023987412508\"},{\"id\":\"6023987510308\",\"name\":\"6QF8G\",\"adset_id\":\"6023987412108\"},{\"id\":\"6023987538908\",\"name\":\"xDtUm\",\"adset_id\":\"6023987411908\"},{\"id\":\"6023987510108\",\"name\":\"pdXNV\",\"adset_id\":\"6023987412108\"},{\"id\":\"6023987538708\",\"name\":\"W9SYB\",\"adset_id\":\"6023987411908\"},{\"id\":\"6023987537308\",\"name\":\"siY0J\",\"adset_id\":\"6023987411908\"},{\"id\":\"6023987533908\",\"name\":\"J7NEI\",\"adset_id\":\"6023987411908\"},{\"id\":\"6023987521908\",\"name\":\"CaBQi\",\"adset_id\":\"6023987412508\"},{\"id\":\"6023987520908\",\"name\":\"Dp7dP\",\"adset_id\":\"6023987412508\"},{\"id\":\"6023987486908\",\"name\":\"irxGp\",\"adset_id\":\"6023987412108\"},{\"id\":\"6023987518708\",\"name\":\"30mgh\",\"adset_id\":\"6023987412508\"},{\"id\":\"6023987458508\",\"name\":\"0ahuh\",\"adset_id\":\"6023987409308\"},{\"id\":\"6023987493508\",\"name\":\"URtJD\",\"adset_id\":\"6023987410108\"},{\"id\":\"6023987429308\",\"name\":\"Bo7Ta\",\"adset_id\":\"6023987408708\"},{\"id\":\"6023987419508\",\"name\":\"9roWp\",\"adset_id\":\"6023987408708\"},{\"id\":\"6023987533708\",\"name\":\"GZylz\",\"adset_id\":\"6023987411908\"},{\"id\":\"6023987418708\",\"name\":\"LCsc9\",\"adset_id\":\"6023987408708\"},{\"id\":\"6023987510508\",\"name\":\"2pEeo\",\"adset_id\":\"6023987412108\"},{\"id\":\"6023987429508\",\"name\":\"pdwDu\",\"adset_id\":\"6023987408908\"},{\"id\":\"6023987493908\",\"name\":\"PDHUv\",\"adset_id\":\"6023987410108\"},{\"id\":\"6023987429908\",\"name\":\"w0bZi\",\"adset_id\":\"6023987408708\"},{\"id\":\"6023987425908\",\"name\":\"iPQr5\",\"adset_id\":\"6023987408708\"},{\"id\":\"6023170901908\",\"name\":\"R0xw2\",\"adset_id\":\"6023170891308\"},{\"id\":\"6023170899108\",\"name\":\"Z39gI\",\"adset_id\":\"6023170890708\"},{\"id\":\"6023110054708\",\"name\":\"Q9jMr\",\"adset_id\":\"6023110052708\"},{\"id\":\"6022769067708\",\"name\":\"mSiD5\",\"adset_id\":\"6022769055908\"},{\"id\":\"6022769062508\",\"name\":\"HM4ME\",\"adset_id\":\"6022769056108\"},{\"id\":\"6022769071908\",\"name\":\"ufEBI\",\"adset_id\":\"6022769056708\"},{\"id\":\"6022497476908\",\"name\":\"qm03Y\",\"adset_id\":\"6022497475308\"},{\"id\":\"6022384461308\",\"name\":\"L2x7c\",\"adset_id\":\"6022384455308\"},{\"id\":\"6022227539308\",\"name\":\"SYbjS\",\"adset_id\":\"6022227533708\"},{\"id\":\"6022099356108\",\"name\":\"Jbhm8\",\"adset_id\":\"6022099353908\"},{\"id\":\"6021862046708\",\"name\":\"rzE3j\",\"adset_id\":\"6021862044508\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMzk4NzQ0MTMwOAZDZD\",\"after\":\"NjAyMTg2MjA0NjcwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyMTg2MjA0NjcwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAyMzk4NzQ0MTMwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyMzk4NzQ0MzEwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyNTUyMzYxODMwOAZDZD",
 :as :json}
(fn [req]{:request-time 426,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "5tnAljjx67iydxdAAl5yCGPDcSxi+jG6c/Kh3S2vK0tG16S47dPZ2e1jEYT+vBaFXOHjZD7VzEIdmLr6NfW6gg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"eae32f48cc3467abd8816b7dcd1648e4e5e0a007\"",
  "x-fb-trace-id" "ENMiEmgDieA",
  "Date" "Sat, 15 Apr 2017 16:35:35 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6025523677308\",\"name\":\"zQVvV\",\"adset_id\":\"6025523612708\"},{\"id\":\"6025523650508\",\"name\":\"FvYRo\",\"adset_id\":\"6025523611508\"},{\"id\":\"6025523660308\",\"name\":\"ERa4M\",\"adset_id\":\"6025523612708\"},{\"id\":\"6025523667108\",\"name\":\"rChH2\",\"adset_id\":\"6025523612708\"},{\"id\":\"6025523656508\",\"name\":\"SmGjZ\",\"adset_id\":\"6025523612708\"},{\"id\":\"6025523642708\",\"name\":\"2y5T2\",\"adset_id\":\"6025523611508\"},{\"id\":\"6025523668708\",\"name\":\"Or5v9\",\"adset_id\":\"6025523611108\"},{\"id\":\"6025523648108\",\"name\":\"LDdOb\",\"adset_id\":\"6025523611508\"},{\"id\":\"6025523631908\",\"name\":\"tpguC\",\"adset_id\":\"6025523612308\"},{\"id\":\"6025523620108\",\"name\":\"6dDqd\",\"adset_id\":\"6025523611108\"},{\"id\":\"6025523627708\",\"name\":\"FEXPX\",\"adset_id\":\"6025523612308\"},{\"id\":\"6025523616908\",\"name\":\"jfNTz\",\"adset_id\":\"6025523611108\"},{\"id\":\"6025523653508\",\"name\":\"jXsxn\",\"adset_id\":\"6025523611508\"},{\"id\":\"6025523639108\",\"name\":\"4Mloz\",\"adset_id\":\"6025523612308\"},{\"id\":\"6025523653308\",\"name\":\"40wGe\",\"adset_id\":\"6025523612708\"},{\"id\":\"6025523647108\",\"name\":\"XZGJv\",\"adset_id\":\"6025523611508\"},{\"id\":\"6025523634308\",\"name\":\"TkrSM\",\"adset_id\":\"6025523612308\"},{\"id\":\"6025342800708\",\"name\":\"WBvnC\",\"adset_id\":\"6025342742908\"},{\"id\":\"6025342765708\",\"name\":\"uYnw5\",\"adset_id\":\"6025342743108\"},{\"id\":\"6025342794908\",\"name\":\"uzFX6\",\"adset_id\":\"6025342743708\"},{\"id\":\"6025342784908\",\"name\":\"Kaf7n\",\"adset_id\":\"6025342743108\"},{\"id\":\"6025342784108\",\"name\":\"H52dv\",\"adset_id\":\"6025342742708\"},{\"id\":\"6025342811108\",\"name\":\"iduFF\",\"adset_id\":\"6025342743708\"},{\"id\":\"6025342786308\",\"name\":\"Q8soZ\",\"adset_id\":\"6025342743708\"},{\"id\":\"6025342776708\",\"name\":\"Olm15\",\"adset_id\":\"6025342743108\"},{\"id\":\"6025342788108\",\"name\":\"RIRF0\",\"adset_id\":\"6025342742908\"},{\"id\":\"6025342774108\",\"name\":\"bYHQL\",\"adset_id\":\"6025342742708\"},{\"id\":\"6025342762908\",\"name\":\"1kVOr\",\"adset_id\":\"6025342742708\"},{\"id\":\"6025342789108\",\"name\":\"wxRZ6\",\"adset_id\":\"6025342743708\"},{\"id\":\"6025342762308\",\"name\":\"0eLms\",\"adset_id\":\"6025342742708\"},{\"id\":\"6025342800908\",\"name\":\"KINcE\",\"adset_id\":\"6025342742908\"},{\"id\":\"6025342777908\",\"name\":\"QtmHR\",\"adset_id\":\"6025342742908\"},{\"id\":\"6025342768708\",\"name\":\"csNa4\",\"adset_id\":\"6025342742908\"},{\"id\":\"6025342778908\",\"name\":\"gKYB9\",\"adset_id\":\"6025342743708\"},{\"id\":\"6025342768108\",\"name\":\"td5cs\",\"adset_id\":\"6025342742708\"},{\"id\":\"6025342767108\",\"name\":\"K6a9x\",\"adset_id\":\"6025342742708\"},{\"id\":\"6025342761508\",\"name\":\"QCTYK\",\"adset_id\":\"6025342743108\"},{\"id\":\"6025342783308\",\"name\":\"qlwoV\",\"adset_id\":\"6025342743108\"},{\"id\":\"6025342805908\",\"name\":\"00s6L\",\"adset_id\":\"6025342743708\"},{\"id\":\"6025342779108\",\"name\":\"2jUfv\",\"adset_id\":\"6025342742908\"},{\"id\":\"6025342775308\",\"name\":\"efjwS\",\"adset_id\":\"6025342743108\"},{\"id\":\"6023987489308\",\"name\":\"k7wE2\",\"adset_id\":\"6023987410108\"},{\"id\":\"6023987511508\",\"name\":\"Sr8Wq\",\"adset_id\":\"6023987412108\"},{\"id\":\"6023987429708\",\"name\":\"Gim80\",\"adset_id\":\"6023987408708\"},{\"id\":\"6023987420308\",\"name\":\"hDjQo\",\"adset_id\":\"6023987408908\"},{\"id\":\"6023987538308\",\"name\":\"ugdjh\",\"adset_id\":\"6023987412508\"},{\"id\":\"6023987533508\",\"name\":\"JNRDt\",\"adset_id\":\"6023987411908\"},{\"id\":\"6023987458908\",\"name\":\"H6Q46\",\"adset_id\":\"6023987409308\"},{\"id\":\"6023987456508\",\"name\":\"bM025\",\"adset_id\":\"6023987409108\"},{\"id\":\"6023987443108\",\"name\":\"k1QUl\",\"adset_id\":\"6023987408908\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyNTUyMzY3NzMwOAZDZD\",\"after\":\"NjAyMzk4NzQ0MzEwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyMzk4NzQ0MzEwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAyNTUyMzY3NzMwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyNTUyMzYxODMwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyNjI4NzUyNTUwOAZDZD",
 :as :json}
(fn [req]{:request-time 610,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "93JJpFml8hqIPW81M1l5/sHtu8C/X8KJe11cK4HV7t4c6rUQrUFUDrTXyOvZhnBSCAGqVboZgW4iCf1QWTAERw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"7c5eaa301f07ee81dcb85c5a7fb2dc9faf454b2b\"",
  "x-fb-trace-id" "B3A22aK3aJP",
  "Date" "Sat, 15 Apr 2017 16:35:34 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6026287472308\",\"name\":\"F1svF\",\"adset_id\":\"6026287408508\"},{\"id\":\"6026287480308\",\"name\":\"NpoIR\",\"adset_id\":\"6026287408508\"},{\"id\":\"6026287461908\",\"name\":\"uScWJ\",\"adset_id\":\"6026287409908\"},{\"id\":\"6026287460908\",\"name\":\"hd04r\",\"adset_id\":\"6026287409908\"},{\"id\":\"6026287477508\",\"name\":\"HWLyT\",\"adset_id\":\"6026287408508\"},{\"id\":\"6026287515708\",\"name\":\"PpKHm\",\"adset_id\":\"6026287411108\"},{\"id\":\"6026287539908\",\"name\":\"0O8bV\",\"adset_id\":\"6026287411908\"},{\"id\":\"6026287431108\",\"name\":\"1zUSq\",\"adset_id\":\"6026287408308\"},{\"id\":\"6026287513908\",\"name\":\"CShHe\",\"adset_id\":\"6026287411108\"},{\"id\":\"6026287422508\",\"name\":\"c07qi\",\"adset_id\":\"6026287408308\"},{\"id\":\"6026287550108\",\"name\":\"SCu9k\",\"adset_id\":\"6026287411908\"},{\"id\":\"6026287438708\",\"name\":\"PQCEJ\",\"adset_id\":\"6026287409108\"},{\"id\":\"6026287458308\",\"name\":\"pgyJP\",\"adset_id\":\"6026287409908\"},{\"id\":\"6026287473308\",\"name\":\"6Fhbr\",\"adset_id\":\"6026287408508\"},{\"id\":\"6026287490108\",\"name\":\"m4Qka\",\"adset_id\":\"6026287408108\"},{\"id\":\"6026287502108\",\"name\":\"Qkp0o\",\"adset_id\":\"6026287408108\"},{\"id\":\"6026287474708\",\"name\":\"aDMPr\",\"adset_id\":\"6026287409908\"},{\"id\":\"6026287540908\",\"name\":\"f33IZ\",\"adset_id\":\"6026287411908\"},{\"id\":\"6026287536708\",\"name\":\"aw2FN\",\"adset_id\":\"6026287412308\"},{\"id\":\"6026287453508\",\"name\":\"v80qb\",\"adset_id\":\"6026287408308\"},{\"id\":\"6026287532708\",\"name\":\"Ryco9\",\"adset_id\":\"6026287412308\"},{\"id\":\"6026287460708\",\"name\":\"bZ0ib\",\"adset_id\":\"6026287409908\"},{\"id\":\"6026287436108\",\"name\":\"tIVkk\",\"adset_id\":\"6026287409108\"},{\"id\":\"6026287449508\",\"name\":\"4UvTh\",\"adset_id\":\"6026287409108\"},{\"id\":\"6026287515508\",\"name\":\"WaMRi\",\"adset_id\":\"6026287411108\"},{\"id\":\"6026287499708\",\"name\":\"xjYho\",\"adset_id\":\"6026287408108\"},{\"id\":\"6026287469908\",\"name\":\"j3iBe\",\"adset_id\":\"6026287408508\"},{\"id\":\"6026287549908\",\"name\":\"kxjoj\",\"adset_id\":\"6026287411908\"},{\"id\":\"6026287473908\",\"name\":\"TVlFD\",\"adset_id\":\"6026287408508\"},{\"id\":\"6026287546308\",\"name\":\"PkLEZ\",\"adset_id\":\"6026287411908\"},{\"id\":\"6026287505908\",\"name\":\"IgCNb\",\"adset_id\":\"6026287411108\"},{\"id\":\"6026287550308\",\"name\":\"bUDLB\",\"adset_id\":\"6026287411908\"},{\"id\":\"6026287494908\",\"name\":\"5HxJ1\",\"adset_id\":\"6026287408108\"},{\"id\":\"6026287426708\",\"name\":\"4zxP8\",\"adset_id\":\"6026287409908\"},{\"id\":\"6026287525308\",\"name\":\"YVcEi\",\"adset_id\":\"6026287412308\"},{\"id\":\"6026287435908\",\"name\":\"7tQc8\",\"adset_id\":\"6026287409108\"},{\"id\":\"6026287421308\",\"name\":\"JeW8r\",\"adset_id\":\"6026287408308\"},{\"id\":\"6026287447108\",\"name\":\"26ldM\",\"adset_id\":\"6026287408308\"},{\"id\":\"6026287531508\",\"name\":\"o7tnJ\",\"adset_id\":\"6026287412308\"},{\"id\":\"6026287435708\",\"name\":\"tDOlD\",\"adset_id\":\"6026287409108\"},{\"id\":\"6026287495108\",\"name\":\"w5RdL\",\"adset_id\":\"6026287408108\"},{\"id\":\"6026287514508\",\"name\":\"yewEp\",\"adset_id\":\"6026287411108\"},{\"id\":\"6026287437508\",\"name\":\"3qeWi\",\"adset_id\":\"6026287408308\"},{\"id\":\"6025523677508\",\"name\":\"IPpiz\",\"adset_id\":\"6025523612708\"},{\"id\":\"6025523654508\",\"name\":\"2H56D\",\"adset_id\":\"6025523611508\"},{\"id\":\"6025523634908\",\"name\":\"BpVNq\",\"adset_id\":\"6025523612308\"},{\"id\":\"6025523617308\",\"name\":\"8K0Nx\",\"adset_id\":\"6025523612308\"},{\"id\":\"6025523659708\",\"name\":\"1YuJJ\",\"adset_id\":\"6025523611108\"},{\"id\":\"6025523620308\",\"name\":\"YCr77\",\"adset_id\":\"6025523611108\"},{\"id\":\"6025523618308\",\"name\":\"r03OT\",\"adset_id\":\"6025523611108\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyNjI4NzQ3MjMwOAZDZD\",\"after\":\"NjAyNTUyMzYxODMwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyNTUyMzYxODMwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAyNjI4NzQ3MjMwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyNjI4NzUyNTUwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyNjk5Mjg3OTUwOAZDZD",
 :as :json}
(fn [req]{:request-time 598,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "QX35GxnXn+8rFBas3YWZpDgCu+DNrORpI/crXWqsDm18ewxKl23TpKOpZe6/GFY5LdiGN8hP2ROF5Ljyva9Sew==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"431cfba229ddb65f942a487261c1633ed1f082f9\"",
  "x-fb-trace-id" "BU94FF9QAdB",
  "Date" "Sat, 15 Apr 2017 16:35:34 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6026992873908\",\"name\":\"sLWsc\",\"adset_id\":\"6026992781308\"},{\"id\":\"6026992873708\",\"name\":\"ldKLS\",\"adset_id\":\"6026992781308\"},{\"id\":\"6026992869108\",\"name\":\"8ttf8\",\"adset_id\":\"6026992781308\"},{\"id\":\"6026992906108\",\"name\":\"ei3np\",\"adset_id\":\"6026992781908\"},{\"id\":\"6026992895708\",\"name\":\"rt3vX\",\"adset_id\":\"6026992781908\"},{\"id\":\"6026992887708\",\"name\":\"24oXO\",\"adset_id\":\"6026992781908\"},{\"id\":\"6026992887508\",\"name\":\"r5VXK\",\"adset_id\":\"6026992781908\"},{\"id\":\"6026992886908\",\"name\":\"GgRv0\",\"adset_id\":\"6026992781908\"},{\"id\":\"6026992873508\",\"name\":\"HSKJM\",\"adset_id\":\"6026992781908\"},{\"id\":\"6026999969308\",\"name\":\"Nhub0\",\"adset_id\":\"6026999962908\"},{\"id\":\"6026999972308\",\"name\":\"duds5\",\"adset_id\":\"6026999962908\"},{\"id\":\"6026999965508\",\"name\":\"nFSeC\",\"adset_id\":\"6026999962908\"},{\"id\":\"6026999994708\",\"name\":\"wsZzo\",\"adset_id\":\"6026999962108\"},{\"id\":\"6026999968108\",\"name\":\"pMvtU\",\"adset_id\":\"6026999962908\"},{\"id\":\"6026999984108\",\"name\":\"bGzmG\",\"adset_id\":\"6026999962108\"},{\"id\":\"6026999982108\",\"name\":\"w5HSr\",\"adset_id\":\"6026999962108\"},{\"id\":\"6026999967908\",\"name\":\"JJowT\",\"adset_id\":\"6026999962908\"},{\"id\":\"6026999975908\",\"name\":\"7awcM\",\"adset_id\":\"6026999962908\"},{\"id\":\"6026999989708\",\"name\":\"e2LG3\",\"adset_id\":\"6026999962108\"},{\"id\":\"6026999980308\",\"name\":\"f4U8q\",\"adset_id\":\"6026999962108\"},{\"id\":\"6026999983508\",\"name\":\"v5iJ2\",\"adset_id\":\"6026999962108\"},{\"id\":\"6026992948708\",\"name\":\"nD8DP\",\"adset_id\":\"6026992784308\"},{\"id\":\"6026992883308\",\"name\":\"D2NOU\",\"adset_id\":\"6026992781108\"},{\"id\":\"6026992948508\",\"name\":\"OKVpE\",\"adset_id\":\"6026992783708\"},{\"id\":\"6026992949508\",\"name\":\"nR6Pp\",\"adset_id\":\"6026992784308\"},{\"id\":\"6026992925508\",\"name\":\"avNh5\",\"adset_id\":\"6026992783508\"},{\"id\":\"6026992883708\",\"name\":\"nKggN\",\"adset_id\":\"6026992783508\"},{\"id\":\"6026992939908\",\"name\":\"5Hb4U\",\"adset_id\":\"6026992784308\"},{\"id\":\"6026992924108\",\"name\":\"WUFqj\",\"adset_id\":\"6026992783508\"},{\"id\":\"6026992934908\",\"name\":\"IfblC\",\"adset_id\":\"6026992784308\"},{\"id\":\"6026992957508\",\"name\":\"sySXS\",\"adset_id\":\"6026992783708\"},{\"id\":\"6026992923908\",\"name\":\"uf6bp\",\"adset_id\":\"6026992783508\"},{\"id\":\"6026992878908\",\"name\":\"offoF\",\"adset_id\":\"6026992781108\"},{\"id\":\"6026992929308\",\"name\":\"jHPJT\",\"adset_id\":\"6026992783508\"},{\"id\":\"6026992934108\",\"name\":\"12YO5\",\"adset_id\":\"6026992784308\"},{\"id\":\"6026992884708\",\"name\":\"CMmvp\",\"adset_id\":\"6026992781108\"},{\"id\":\"6026992874908\",\"name\":\"BiKCR\",\"adset_id\":\"6026992781108\"},{\"id\":\"6026992951108\",\"name\":\"LHHTh\",\"adset_id\":\"6026992783708\"},{\"id\":\"6026992891708\",\"name\":\"Ctso6\",\"adset_id\":\"6026992781108\"},{\"id\":\"6026992955908\",\"name\":\"q4nh1\",\"adset_id\":\"6026992783708\"},{\"id\":\"6026992949908\",\"name\":\"RjM2q\",\"adset_id\":\"6026992783708\"},{\"id\":\"6026992954708\",\"name\":\"cPQzj\",\"adset_id\":\"6026992783708\"},{\"id\":\"6026992875508\",\"name\":\"TJ2zL\",\"adset_id\":\"6026992783508\"},{\"id\":\"6026992936308\",\"name\":\"veMQv\",\"adset_id\":\"6026992784308\"},{\"id\":\"6026992894508\",\"name\":\"bUSbl\",\"adset_id\":\"6026992781108\"},{\"id\":\"6026287489508\",\"name\":\"KdRcm\",\"adset_id\":\"6026287408108\"},{\"id\":\"6026287508508\",\"name\":\"VSVqk\",\"adset_id\":\"6026287411108\"},{\"id\":\"6026287525708\",\"name\":\"dWECJ\",\"adset_id\":\"6026287412308\"},{\"id\":\"6026287438508\",\"name\":\"LjFcd\",\"adset_id\":\"6026287409108\"},{\"id\":\"6026287525508\",\"name\":\"ltxG4\",\"adset_id\":\"6026287412308\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyNjk5Mjg3MzkwOAZDZD\",\"after\":\"NjAyNjI4NzUyNTUwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyNjI4NzUyNTUwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAyNjk5Mjg3MzkwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyNjk5Mjg3OTUwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyOTA1MDY5MDkwOAZDZD",
 :as :json}
(fn [req]{:request-time 551,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "r18L5BYXPDDcKdW57ikRID3I6g5XFpxoNoeKFyDYejk65q0Ymnv0f5xa85wdQfdqgTuz/+F24Znx4qwyDc0eIw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"e813fdf1298aa223048be051858ed598e95da200\"",
  "x-fb-trace-id" "AOXPeP5JN2C",
  "Date" "Sat, 15 Apr 2017 16:35:33 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6029050670908\",\"name\":\"qpTyp\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050761308\",\"name\":\"epIs2\",\"adset_id\":\"6029050666708\"},{\"id\":\"6029050705108\",\"name\":\"pDF5C\",\"adset_id\":\"6029050665708\"},{\"id\":\"6029050721108\",\"name\":\"hFwZU\",\"adset_id\":\"6029050665508\"},{\"id\":\"6029050692908\",\"name\":\"cFM79\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050676708\",\"name\":\"ztwkF\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050748708\",\"name\":\"rUpJs\",\"adset_id\":\"6029050666708\"},{\"id\":\"6029050701308\",\"name\":\"0eCHM\",\"adset_id\":\"6029050665708\"},{\"id\":\"6029050681108\",\"name\":\"B82pt\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050709508\",\"name\":\"LwLlV\",\"adset_id\":\"6029050665508\"},{\"id\":\"6029050688508\",\"name\":\"mjcTH\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050691108\",\"name\":\"RELWd\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050737908\",\"name\":\"268ar\",\"adset_id\":\"6029050666708\"},{\"id\":\"6029050702508\",\"name\":\"b0F0j\",\"adset_id\":\"6029050665708\"},{\"id\":\"6028898642308\",\"name\":\"UQZtK\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028898634708\",\"name\":\"G233L\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028898631308\",\"name\":\"FK88s\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028898642108\",\"name\":\"6qhv6\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028898636308\",\"name\":\"dsLbv\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028898638308\",\"name\":\"qqqwy\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028898633108\",\"name\":\"NnKxs\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028898635708\",\"name\":\"W7f67\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028898641508\",\"name\":\"UGxix\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028106103908\",\"name\":\"neoRt\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028106102108\",\"name\":\"paxHu\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028106087908\",\"name\":\"dQWcR\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028106082108\",\"name\":\"ojUUq\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028106081708\",\"name\":\"QnEbo\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028106081108\",\"name\":\"YEwlz\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028106071308\",\"name\":\"1pTJC\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028106069308\",\"name\":\"5LjbE\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028106069108\",\"name\":\"mM93g\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028106094108\",\"name\":\"cGNf1\",\"adset_id\":\"6028106062908\"},{\"id\":\"6028106079708\",\"name\":\"mPbis\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028106071108\",\"name\":\"9Dcmu\",\"adset_id\":\"6028106062508\"},{\"id\":\"6028106124708\",\"name\":\"YnuOF\",\"adset_id\":\"6028106062708\"},{\"id\":\"6028106095108\",\"name\":\"5HlCZ\",\"adset_id\":\"6028106062308\"},{\"id\":\"6028106089308\",\"name\":\"GnzX5\",\"adset_id\":\"6028106062708\"},{\"id\":\"6028106114508\",\"name\":\"kCfon\",\"adset_id\":\"6028106062308\"},{\"id\":\"6028106124508\",\"name\":\"ZXCuF\",\"adset_id\":\"6028106062708\"},{\"id\":\"6028106124108\",\"name\":\"YrQQI\",\"adset_id\":\"6028106062708\"},{\"id\":\"6028106120308\",\"name\":\"45VOg\",\"adset_id\":\"6028106062708\"},{\"id\":\"6028106118508\",\"name\":\"6X8Di\",\"adset_id\":\"6028106062308\"},{\"id\":\"6028106116108\",\"name\":\"BMyie\",\"adset_id\":\"6028106062308\"},{\"id\":\"6028106098708\",\"name\":\"dfP1D\",\"adset_id\":\"6028106062308\"},{\"id\":\"6028106084708\",\"name\":\"thjZU\",\"adset_id\":\"6028106062708\"},{\"id\":\"6028106084508\",\"name\":\"Po388\",\"adset_id\":\"6028106062308\"},{\"id\":\"6026992898708\",\"name\":\"jYd03\",\"adset_id\":\"6026992781308\"},{\"id\":\"6026992879908\",\"name\":\"U2VDl\",\"adset_id\":\"6026992781308\"},{\"id\":\"6026992879508\",\"name\":\"EEZbc\",\"adset_id\":\"6026992781308\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyOTA1MDY3MDkwOAZDZD\",\"after\":\"NjAyNjk5Mjg3OTUwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyNjk5Mjg3OTUwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAyOTA1MDY3MDkwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyOTA1MDY5MDkwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAzMDg5OTkwOTUwOAZDZD",
 :as :json}
(fn [req]{:request-time 349,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "DasdzSO154RkB6GgWTszXlEZzKFsdxmI5x1WJsJ8iTtzIkEAV4AzIcKRq+qgDB6sbdfjDH2iTGiCZKcO1Nz2ZA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"b6080f33b257151d29ea2d127306a657d2c9059f\"",
  "x-fb-trace-id" "ApIcovmKjIP",
  "Date" "Sat, 15 Apr 2017 16:35:33 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6030899913508\",\"name\":\"uPGNh\",\"adset_id\":\"6030899850708\"},{\"id\":\"6030899883908\",\"name\":\"iii3b\",\"adset_id\":\"6030899850508\"},{\"id\":\"6030899884508\",\"name\":\"29eyE\",\"adset_id\":\"6030899850508\"},{\"id\":\"6030899860708\",\"name\":\"bdLGc\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899937308\",\"name\":\"xFCiV\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899862908\",\"name\":\"caS7p\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899876308\",\"name\":\"YiKV9\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899876908\",\"name\":\"ubkdM\",\"adset_id\":\"6030899850708\"},{\"id\":\"6030899877108\",\"name\":\"P61LZ\",\"adset_id\":\"6030899850508\"},{\"id\":\"6030899913708\",\"name\":\"rBokn\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899936108\",\"name\":\"kQUxT\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899881108\",\"name\":\"eMCRp\",\"adset_id\":\"6030899850708\"},{\"id\":\"6030899889908\",\"name\":\"YSgqI\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899872708\",\"name\":\"Jcegr\",\"adset_id\":\"6030899850708\"},{\"id\":\"6030899927108\",\"name\":\"Pa10a\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899940108\",\"name\":\"gquWk\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899925508\",\"name\":\"FLYRg\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899932708\",\"name\":\"JVioW\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899868708\",\"name\":\"DgjlS\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899949908\",\"name\":\"Nvrxa\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899859908\",\"name\":\"q4HlX\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899863308\",\"name\":\"ffwUi\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899891708\",\"name\":\"OkGmi\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899885708\",\"name\":\"27uGX\",\"adset_id\":\"6030899850508\"},{\"id\":\"6030899925908\",\"name\":\"wk3yg\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899880908\",\"name\":\"lzz8O\",\"adset_id\":\"6030899850708\"},{\"id\":\"6030899916708\",\"name\":\"unytm\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899864908\",\"name\":\"zFGnb\",\"adset_id\":\"6030899850508\"},{\"id\":\"6030899938508\",\"name\":\"ezdSF\",\"adset_id\":\"6030899850908\"},{\"id\":\"6030899879908\",\"name\":\"c2Ffm\",\"adset_id\":\"6030899850508\"},{\"id\":\"6030899860908\",\"name\":\"Dc9cc\",\"adset_id\":\"6030899849708\"},{\"id\":\"6029050673508\",\"name\":\"ipa6e\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050722708\",\"name\":\"fhFBc\",\"adset_id\":\"6029050665508\"},{\"id\":\"6029050673308\",\"name\":\"dKvNk\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050671108\",\"name\":\"xzGLg\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050705508\",\"name\":\"J0PnS\",\"adset_id\":\"6029050665708\"},{\"id\":\"6029050720908\",\"name\":\"CXEKL\",\"adset_id\":\"6029050665508\"},{\"id\":\"6029050691508\",\"name\":\"MvDqT\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050749708\",\"name\":\"4CLlj\",\"adset_id\":\"6029050666708\"},{\"id\":\"6029050721308\",\"name\":\"CfcIx\",\"adset_id\":\"6029050665508\"},{\"id\":\"6029050710708\",\"name\":\"P1Xlw\",\"adset_id\":\"6029050665708\"},{\"id\":\"6029050707308\",\"name\":\"4YDMU\",\"adset_id\":\"6029050665708\"},{\"id\":\"6029050753708\",\"name\":\"oWUvj\",\"adset_id\":\"6029050666708\"},{\"id\":\"6029050737108\",\"name\":\"8Q4Xd\",\"adset_id\":\"6029050666708\"},{\"id\":\"6029050741108\",\"name\":\"bhw6i\",\"adset_id\":\"6029050666708\"},{\"id\":\"6029050739908\",\"name\":\"bP3du\",\"adset_id\":\"6029050666708\"},{\"id\":\"6029050723708\",\"name\":\"DbeHY\",\"adset_id\":\"6029050665508\"},{\"id\":\"6029050748508\",\"name\":\"a8Y5W\",\"adset_id\":\"6029050666708\"},{\"id\":\"6029050677508\",\"name\":\"X1rqW\",\"adset_id\":\"6029050665908\"},{\"id\":\"6029050690908\",\"name\":\"azG6G\",\"adset_id\":\"6029050666708\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzMDg5OTkxMzUwOAZDZD\",\"after\":\"NjAyOTA1MDY5MDkwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAyOTA1MDY5MDkwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAzMDg5OTkxMzUwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAzMDg5OTkwOTUwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAzNDgwMzgwNTUwOAZDZD",
 :as :json}
(fn [req]{:request-time 438,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "BfZBHrTmM9NWLeML2g0zD6SJ2BbTNrRmR/w2INInbEncI5mwaEHnErc3U3cffRY7XrLlzmmBE09Fg8dac07ivg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"1c7ff3cd6c941878cc3520811aa158b295ef59f0\"",
  "x-fb-trace-id" "HCbgoqCDK+/",
  "Date" "Sat, 15 Apr 2017 16:35:32 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6034803656708\",\"name\":\"BvyRC\",\"adset_id\":\"6034803645508\"},{\"id\":\"6034803804908\",\"name\":\"068ND\",\"adset_id\":\"6034803786708\"},{\"id\":\"6034803797708\",\"name\":\"Ky3Xm\",\"adset_id\":\"6034803786708\"},{\"id\":\"6034803650708\",\"name\":\"zNYCx\",\"adset_id\":\"6034803645708\"},{\"id\":\"6034803649308\",\"name\":\"xc6Ni\",\"adset_id\":\"6034803645708\"},{\"id\":\"6034803653108\",\"name\":\"pv01O\",\"adset_id\":\"6034803645708\"},{\"id\":\"6034803656508\",\"name\":\"Z2HSS\",\"adset_id\":\"6034803645508\"},{\"id\":\"6034803801908\",\"name\":\"VW0Ku\",\"adset_id\":\"6034803787508\"},{\"id\":\"6034803796708\",\"name\":\"8g7Mr\",\"adset_id\":\"6034803787508\"},{\"id\":\"6034803654708\",\"name\":\"t6hbV\",\"adset_id\":\"6034803645708\"},{\"id\":\"6034087442908\",\"name\":\"mho3p\",\"adset_id\":\"6034087417908\"},{\"id\":\"6034087450708\",\"name\":\"27BUK\",\"adset_id\":\"6034087416708\"},{\"id\":\"6034087439108\",\"name\":\"VBgVJ\",\"adset_id\":\"6034087417908\"},{\"id\":\"6034087432908\",\"name\":\"mLUkR\",\"adset_id\":\"6034087417908\"},{\"id\":\"6034087439908\",\"name\":\"KjK6b\",\"adset_id\":\"6034087417908\"},{\"id\":\"6032883805508\",\"name\":\"OvvNT\",\"adset_id\":\"6032883803308\"},{\"id\":\"6033395290508\",\"name\":\"Ni2GT\",\"adset_id\":\"6032597923708\"},{\"id\":\"6033395290308\",\"name\":\"QIUuC\",\"adset_id\":\"6032597923508\"},{\"id\":\"6033395285908\",\"name\":\"68SeL\",\"adset_id\":\"6032597925508\"},{\"id\":\"6033395283108\",\"name\":\"XvtMZ\",\"adset_id\":\"6032597922908\"},{\"id\":\"6032597974108\",\"name\":\"waQhQ\",\"adset_id\":\"6032597923508\"},{\"id\":\"6032597970908\",\"name\":\"YFrR7\",\"adset_id\":\"6032597923708\"},{\"id\":\"6032597968508\",\"name\":\"b2pcU\",\"adset_id\":\"6032597923508\"},{\"id\":\"6032597965508\",\"name\":\"nzHuE\",\"adset_id\":\"6032597923708\"},{\"id\":\"6032597957308\",\"name\":\"EF5Y7\",\"adset_id\":\"6032597925508\"},{\"id\":\"6032597956108\",\"name\":\"qlXFI\",\"adset_id\":\"6032597925508\"},{\"id\":\"6032597952308\",\"name\":\"2Wm3p\",\"adset_id\":\"6032597925508\"},{\"id\":\"6032597940308\",\"name\":\"bPjPV\",\"adset_id\":\"6032597922908\"},{\"id\":\"6032597935308\",\"name\":\"fjNWv\",\"adset_id\":\"6032597922908\"},{\"id\":\"6032597934908\",\"name\":\"Jyjoq\",\"adset_id\":\"6032597922908\"},{\"id\":\"6032597931508\",\"name\":\"PRTJ6\",\"adset_id\":\"6032597922908\"},{\"id\":\"6032597940108\",\"name\":\"RHh5c\",\"adset_id\":\"6032597924508\"},{\"id\":\"6032597960108\",\"name\":\"SwvfE\",\"adset_id\":\"6032597923108\"},{\"id\":\"6032597932708\",\"name\":\"1OWPY\",\"adset_id\":\"6032597924508\"},{\"id\":\"6032597942708\",\"name\":\"OHnaa\",\"adset_id\":\"6032597924508\"},{\"id\":\"6032597936708\",\"name\":\"c7fyk\",\"adset_id\":\"6032597924508\"},{\"id\":\"6031427639708\",\"name\":\"hIRtL\",\"adset_id\":\"6030899850708\"},{\"id\":\"6031426201908\",\"name\":\"dV67s\",\"adset_id\":\"6031426192908\"},{\"id\":\"6031426204508\",\"name\":\"CyrRm\",\"adset_id\":\"6031426193508\"},{\"id\":\"6031426209508\",\"name\":\"vcWPq\",\"adset_id\":\"6031426193508\"},{\"id\":\"6031426210708\",\"name\":\"rm0F6\",\"adset_id\":\"6031426192908\"},{\"id\":\"6031427405308\",\"name\":\"wMBeX\",\"adset_id\":\"6030899849708\"},{\"id\":\"6031427638508\",\"name\":\"19rEj\",\"adset_id\":\"6030899850708\"},{\"id\":\"6031427640908\",\"name\":\"sqTt8\",\"adset_id\":\"6030899850708\"},{\"id\":\"6031427637708\",\"name\":\"TsmW7\",\"adset_id\":\"6030899850708\"},{\"id\":\"6030899869708\",\"name\":\"JKKsB\",\"adset_id\":\"6030899850708\"},{\"id\":\"6031427406108\",\"name\":\"pQmv6\",\"adset_id\":\"6030899849708\"},{\"id\":\"6031427410508\",\"name\":\"U6rJr\",\"adset_id\":\"6030899849708\"},{\"id\":\"6031427408308\",\"name\":\"hLULK\",\"adset_id\":\"6030899849708\"},{\"id\":\"6030899909508\",\"name\":\"XLdoD\",\"adset_id\":\"6030899849708\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzNDgwMzY1NjcwOAZDZD\",\"after\":\"NjAzMDg5OTkwOTUwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAzMDg5OTkwOTUwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAzNDgwMzY1NjcwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAzNDgwMzgwNTUwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAzNjMxMDIyOTcwOAZDZD",
 :as :json}
(fn [req]{:request-time 395,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "BEmXs/nXIr8ux7p/SUgXjRxBCcLGvR2wO4R67TxHIMlYDBAQ2/xHoONo2c9/cc1w5NYc9rOPUK1UkTdVDPFLug==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"9dd91ed738f697093a5cbbb872bd7dadb4916f94\"",
  "x-fb-trace-id" "GAadDrrGmEd",
  "Date" "Sat, 15 Apr 2017 16:35:32 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6036310228908\",\"name\":\"11Z1Z\",\"adset_id\":\"6036310194508\"},{\"id\":\"6036310216508\",\"name\":\"vwRF6\",\"adset_id\":\"6036310193308\"},{\"id\":\"6036310235508\",\"name\":\"4LiXF\",\"adset_id\":\"6036310192508\"},{\"id\":\"6036310266508\",\"name\":\"4gRuB\",\"adset_id\":\"6036310196908\"},{\"id\":\"6036310265308\",\"name\":\"l2fsz\",\"adset_id\":\"6036310196908\"},{\"id\":\"6036310264508\",\"name\":\"OFmsi\",\"adset_id\":\"6036310196908\"},{\"id\":\"6036310223708\",\"name\":\"SMWPN\",\"adset_id\":\"6036310195708\"},{\"id\":\"6036310239508\",\"name\":\"FSNla\",\"adset_id\":\"6036310192508\"},{\"id\":\"6036310238108\",\"name\":\"U6TFz\",\"adset_id\":\"6036310192508\"},{\"id\":\"6036310232908\",\"name\":\"NvXr1\",\"adset_id\":\"6036310193308\"},{\"id\":\"6036310232708\",\"name\":\"CFMhg\",\"adset_id\":\"6036310195708\"},{\"id\":\"6036310232308\",\"name\":\"dQuCc\",\"adset_id\":\"6036310195708\"},{\"id\":\"6036310223908\",\"name\":\"CxK8y\",\"adset_id\":\"6036310193308\"},{\"id\":\"6036310216708\",\"name\":\"1z1Jz\",\"adset_id\":\"6036310193308\"},{\"id\":\"6036310235908\",\"name\":\"czcSf\",\"adset_id\":\"6036310194508\"},{\"id\":\"6036310231908\",\"name\":\"jQ6mm\",\"adset_id\":\"6036310194508\"},{\"id\":\"6036310231308\",\"name\":\"GrFCF\",\"adset_id\":\"6036310192508\"},{\"id\":\"6036310229308\",\"name\":\"gpEGN\",\"adset_id\":\"6036310194508\"},{\"id\":\"6036310214308\",\"name\":\"zj7gN\",\"adset_id\":\"6036310195108\"},{\"id\":\"6036310208908\",\"name\":\"PYdrC\",\"adset_id\":\"6036310195108\"},{\"id\":\"6036310208308\",\"name\":\"bgKMa\",\"adset_id\":\"6036310195108\"},{\"id\":\"6035030517108\",\"name\":\"4d1Wx\",\"adset_id\":\"6035030430708\"},{\"id\":\"6035030516308\",\"name\":\"G3K2k\",\"adset_id\":\"6035030428908\"},{\"id\":\"6035030512308\",\"name\":\"5fvUj\",\"adset_id\":\"6035030428908\"},{\"id\":\"6035030517708\",\"name\":\"c6u70\",\"adset_id\":\"6035030430708\"},{\"id\":\"6035030511908\",\"name\":\"Kux55\",\"adset_id\":\"6035030430708\"},{\"id\":\"6035030516508\",\"name\":\"Zf8NE\",\"adset_id\":\"6035030428908\"},{\"id\":\"6035030512708\",\"name\":\"FIFHw\",\"adset_id\":\"6035030430708\"},{\"id\":\"6035030513308\",\"name\":\"E4DrW\",\"adset_id\":\"6035030428908\"},{\"id\":\"6034087450308\",\"name\":\"rN2mW\",\"adset_id\":\"6034087418908\"},{\"id\":\"6034087471108\",\"name\":\"wDn8S\",\"adset_id\":\"6034087416108\"},{\"id\":\"6034087474708\",\"name\":\"9BaVn\",\"adset_id\":\"6034087416508\"},{\"id\":\"6034087472508\",\"name\":\"s4aqI\",\"adset_id\":\"6034087416108\"},{\"id\":\"6034087446508\",\"name\":\"a3rDp\",\"adset_id\":\"6034087418908\"},{\"id\":\"6034087463708\",\"name\":\"Gu5gf\",\"adset_id\":\"6034087416108\"},{\"id\":\"6034087426108\",\"name\":\"E9efj\",\"adset_id\":\"6034087416908\"},{\"id\":\"6034087428508\",\"name\":\"35NXC\",\"adset_id\":\"6034087416908\"},{\"id\":\"6034087465708\",\"name\":\"ZScJV\",\"adset_id\":\"6034087416508\"},{\"id\":\"6034087450108\",\"name\":\"zQV4K\",\"adset_id\":\"6034087418908\"},{\"id\":\"6034087426308\",\"name\":\"OQ7y6\",\"adset_id\":\"6034087416908\"},{\"id\":\"6034087456308\",\"name\":\"Lm7Bq\",\"adset_id\":\"6034087418908\"},{\"id\":\"6034087432708\",\"name\":\"K5INo\",\"adset_id\":\"6034087416908\"},{\"id\":\"6034087476108\",\"name\":\"FEgsz\",\"adset_id\":\"6034087416508\"},{\"id\":\"6034087426908\",\"name\":\"YJBF9\",\"adset_id\":\"6034087416908\"},{\"id\":\"6034803800508\",\"name\":\"40lXx\",\"adset_id\":\"6034803787508\"},{\"id\":\"6034803804708\",\"name\":\"UR7Y4\",\"adset_id\":\"6034803786708\"},{\"id\":\"6034803657508\",\"name\":\"tdXwd\",\"adset_id\":\"6034803645508\"},{\"id\":\"6034803800308\",\"name\":\"S3Pf6\",\"adset_id\":\"6034803787508\"},{\"id\":\"6034803651908\",\"name\":\"O8B7T\",\"adset_id\":\"6034803645508\"},{\"id\":\"6034803805508\",\"name\":\"cZT4J\",\"adset_id\":\"6034803786708\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzNjMxMDIyODkwOAZDZD\",\"after\":\"NjAzNDgwMzgwNTUwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAzNDgwMzgwNTUwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjAzNjMxMDIyODkwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAzNjMxMDIyOTcwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0MDczOTM4MjMwOAZDZD",
 :as :json}
(fn [req]{:request-time 402,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "s5/mom/bmpsdcrJtY9gvMcHlA4SM1RBXBJxmEu7L6QKrIQ2OuEaiHtBgCvTeQ/qOHsn9NOXZkCuAbr0SFRqRhA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"0c6883b8feaac5ac22a26253b5b48a09b95d1834\"",
  "x-fb-trace-id" "Gav4O7RJf/z",
  "Date" "Sat, 15 Apr 2017 16:35:32 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6040739382108\",\"name\":\"r9vw3\",\"adset_id\":\"6040739381508\"},{\"id\":\"6040739381908\",\"name\":\"GCFFE\",\"adset_id\":\"6040739381508\"},{\"id\":\"6039331866908\",\"name\":\"SFsyl\",\"adset_id\":\"6039331671708\"},{\"id\":\"6039331860308\",\"name\":\"aRriq\",\"adset_id\":\"6039331671908\"},{\"id\":\"6039331850708\",\"name\":\"05erW\",\"adset_id\":\"6039331671708\"},{\"id\":\"6039331850508\",\"name\":\"KQBmH\",\"adset_id\":\"6039331673508\"},{\"id\":\"6039331827908\",\"name\":\"0xCSY\",\"adset_id\":\"6039331671708\"},{\"id\":\"6039331827108\",\"name\":\"q58lN\",\"adset_id\":\"6039331671908\"},{\"id\":\"6039331813908\",\"name\":\"IgPqk\",\"adset_id\":\"6039331671908\"},{\"id\":\"6039331746308\",\"name\":\"FRc5L\",\"adset_id\":\"6039331673508\"},{\"id\":\"6039331744508\",\"name\":\"kDWf3\",\"adset_id\":\"6039331671708\"},{\"id\":\"6039331730908\",\"name\":\"YUWyd\",\"adset_id\":\"6039331673508\"},{\"id\":\"6039331710908\",\"name\":\"Ju1Ed\",\"adset_id\":\"6039331673508\"},{\"id\":\"6039331696108\",\"name\":\"D5lBZ\",\"adset_id\":\"6039331671908\"},{\"id\":\"6037765028508\",\"name\":\"v0ng4\",\"adset_id\":\"6037764903508\"},{\"id\":\"6037765011308\",\"name\":\"0wywH\",\"adset_id\":\"6037764907508\"},{\"id\":\"6037764982708\",\"name\":\"70xIR\",\"adset_id\":\"6037764906508\"},{\"id\":\"6037764996108\",\"name\":\"BIe2L\",\"adset_id\":\"6037764906508\"},{\"id\":\"6037765011708\",\"name\":\"QnpIp\",\"adset_id\":\"6037764905508\"},{\"id\":\"6037765007708\",\"name\":\"fEP3q\",\"adset_id\":\"6037764907508\"},{\"id\":\"6037765009508\",\"name\":\"fdlQE\",\"adset_id\":\"6037764905508\"},{\"id\":\"6037765005108\",\"name\":\"DUXE5\",\"adset_id\":\"6037764907508\"},{\"id\":\"6037765010908\",\"name\":\"2Ua0u\",\"adset_id\":\"6037764905508\"},{\"id\":\"6037764987308\",\"name\":\"QiC1J\",\"adset_id\":\"6037764906508\"},{\"id\":\"6037765027308\",\"name\":\"jwsh9\",\"adset_id\":\"6037764906508\"},{\"id\":\"6037765004908\",\"name\":\"WIavz\",\"adset_id\":\"6037764907508\"},{\"id\":\"6037765010108\",\"name\":\"Bb0vo\",\"adset_id\":\"6037764905508\"},{\"id\":\"6037765026108\",\"name\":\"bL6Rr\",\"adset_id\":\"6037764905708\"},{\"id\":\"6037764995908\",\"name\":\"3n0Us\",\"adset_id\":\"6037764905708\"},{\"id\":\"6037764994508\",\"name\":\"ZfalW\",\"adset_id\":\"6037764905708\"},{\"id\":\"6037764995508\",\"name\":\"zdHCb\",\"adset_id\":\"6037764905708\"},{\"id\":\"6037764974108\",\"name\":\"hbdN3\",\"adset_id\":\"6037764902908\"},{\"id\":\"6037764973508\",\"name\":\"Xh46c\",\"adset_id\":\"6037764902908\"},{\"id\":\"6037764973308\",\"name\":\"TLO3M\",\"adset_id\":\"6037764902908\"},{\"id\":\"6037764987508\",\"name\":\"RyRKs\",\"adset_id\":\"6037764903508\"},{\"id\":\"6037764982308\",\"name\":\"Qhsdo\",\"adset_id\":\"6037764903508\"},{\"id\":\"6037764975308\",\"name\":\"VGLuZ\",\"adset_id\":\"6037764903508\"},{\"id\":\"6037797590108\",\"name\":\"60P9C\",\"adset_id\":\"6037797572108\"},{\"id\":\"6037797585708\",\"name\":\"bjjyG\",\"adset_id\":\"6037797572108\"},{\"id\":\"6037797584308\",\"name\":\"Xv1lb\",\"adset_id\":\"6037797571708\"},{\"id\":\"6037797582708\",\"name\":\"dgXQ7\",\"adset_id\":\"6037797571708\"},{\"id\":\"6037797050908\",\"name\":\"d39FD\",\"adset_id\":\"6037797043108\"},{\"id\":\"6037797048108\",\"name\":\"hsVDE\",\"adset_id\":\"6037797042908\"},{\"id\":\"6037797046708\",\"name\":\"y0Xir\",\"adset_id\":\"6037797042908\"},{\"id\":\"6037797048308\",\"name\":\"hNhjK\",\"adset_id\":\"6037797043108\"},{\"id\":\"6037796645108\",\"name\":\"GHund\",\"adset_id\":\"6037795800308\"},{\"id\":\"6037796644908\",\"name\":\"ShxLn\",\"adset_id\":\"6037795800308\"},{\"id\":\"6036310209108\",\"name\":\"b2Z5P\",\"adset_id\":\"6036310195108\"},{\"id\":\"6036310265908\",\"name\":\"dIU4X\",\"adset_id\":\"6036310196908\"},{\"id\":\"6036310229708\",\"name\":\"ahrw6\",\"adset_id\":\"6036310195708\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0MDczOTM4MjEwOAZDZD\",\"after\":\"NjAzNjMxMDIyOTcwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjAzNjMxMDIyOTcwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjA0MDczOTM4MjEwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0MDczOTM4MjMwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0MjYwMTcyNzkwOAZDZD",
 :as :json}
(fn [req]{:request-time 682,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "LbZlgTtrA4gG4v68u4xOp8hp+sCsytRb3qg58fk6uOYAx1QZhpoPN3v2bbD/jMVbflceFph8Scju+GYbxRjDvQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"76499f7802fac300315d06db76e181f32c97f18d\"",
  "x-fb-trace-id" "Crz987i1PXt",
  "Date" "Sat, 15 Apr 2017 16:35:31 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6042601729508\",\"name\":\"xsGdn\",\"adset_id\":\"6042601725308\"},{\"id\":\"6042601727508\",\"name\":\"NP98Y\",\"adset_id\":\"6042601725508\"},{\"id\":\"6042601728708\",\"name\":\"HvKr3\",\"adset_id\":\"6042601725908\"},{\"id\":\"6042213731908\",\"name\":\"p3ux1\",\"adset_id\":\"6042213730708\"},{\"id\":\"6042213731708\",\"name\":\"2WEBO\",\"adset_id\":\"6042213730708\"},{\"id\":\"6042213731508\",\"name\":\"BPYxx\",\"adset_id\":\"6042213730708\"},{\"id\":\"6042213732308\",\"name\":\"T3Cls\",\"adset_id\":\"6042213730508\"},{\"id\":\"6042213732108\",\"name\":\"0zHix\",\"adset_id\":\"6042213730508\"},{\"id\":\"6042213731308\",\"name\":\"V6ClI\",\"adset_id\":\"6042213730508\"},{\"id\":\"6042191859108\",\"name\":\"vk7gH\",\"adset_id\":\"6042191852508\"},{\"id\":\"6042191859308\",\"name\":\"rODl0\",\"adset_id\":\"6042191852508\"},{\"id\":\"6042191859508\",\"name\":\"sdxYG\",\"adset_id\":\"6042191852508\"},{\"id\":\"6042191859908\",\"name\":\"FGfcs\",\"adset_id\":\"6042191851108\"},{\"id\":\"6042191859708\",\"name\":\"kh7wS\",\"adset_id\":\"6042191851108\"},{\"id\":\"6042191854308\",\"name\":\"Wm5bq\",\"adset_id\":\"6042191851108\"},{\"id\":\"6040740280108\",\"name\":\"ocPDh\",\"adset_id\":\"6040740278708\"},{\"id\":\"6040740279908\",\"name\":\"ZyWVO\",\"adset_id\":\"6040740278708\"},{\"id\":\"6040740279708\",\"name\":\"qU5e6\",\"adset_id\":\"6040740278708\"},{\"id\":\"6040740280508\",\"name\":\"V5iYx\",\"adset_id\":\"6040740278908\"},{\"id\":\"6040740280308\",\"name\":\"tFGjj\",\"adset_id\":\"6040740278908\"},{\"id\":\"6040740279508\",\"name\":\"jQHMk\",\"adset_id\":\"6040740278908\"},{\"id\":\"6039331730508\",\"name\":\"0VLre\",\"adset_id\":\"6039331670308\"},{\"id\":\"6039331706508\",\"name\":\"cmIxF\",\"adset_id\":\"6039331672708\"},{\"id\":\"6039331754908\",\"name\":\"qQ3BG\",\"adset_id\":\"6039331669708\"},{\"id\":\"6039331679108\",\"name\":\"uJQSW\",\"adset_id\":\"6039331670308\"},{\"id\":\"6039331811708\",\"name\":\"cvG0B\",\"adset_id\":\"6039331672708\"},{\"id\":\"6039331750308\",\"name\":\"H39rl\",\"adset_id\":\"6039331672708\"},{\"id\":\"6039331719308\",\"name\":\"8MpEo\",\"adset_id\":\"6039331669708\"},{\"id\":\"6039331717508\",\"name\":\"OfreY\",\"adset_id\":\"6039331669708\"},{\"id\":\"6039331689908\",\"name\":\"rSGCS\",\"adset_id\":\"6039331670308\"},{\"id\":\"6039331680708\",\"name\":\"qzZHj\",\"adset_id\":\"6039331670308\"},{\"id\":\"6039331705908\",\"name\":\"bzoFP\",\"adset_id\":\"6039331672708\"},{\"id\":\"6040740930308\",\"name\":\"fxd8O\",\"adset_id\":\"6040740929908\"},{\"id\":\"6040740930708\",\"name\":\"T1u9h\",\"adset_id\":\"6040740929908\"},{\"id\":\"6040740930508\",\"name\":\"ooHYT\",\"adset_id\":\"6040740929908\"},{\"id\":\"6040739728308\",\"name\":\"kUDiM\",\"adset_id\":\"6040739719108\"},{\"id\":\"6040739727308\",\"name\":\"Spcwo\",\"adset_id\":\"6040739718708\"},{\"id\":\"6040739727108\",\"name\":\"X9heb\",\"adset_id\":\"6040739718708\"},{\"id\":\"6040739728708\",\"name\":\"qgwoQ\",\"adset_id\":\"6040739719108\"},{\"id\":\"6040739728508\",\"name\":\"M3zWb\",\"adset_id\":\"6040739719108\"},{\"id\":\"6040739728908\",\"name\":\"IFx4G\",\"adset_id\":\"6040739719108\"},{\"id\":\"6040739727708\",\"name\":\"2r9Lp\",\"adset_id\":\"6040739718708\"},{\"id\":\"6040739729508\",\"name\":\"yC2yB\",\"adset_id\":\"6040739717108\"},{\"id\":\"6040739729308\",\"name\":\"cgM1w\",\"adset_id\":\"6040739717108\"},{\"id\":\"6040739729108\",\"name\":\"OHDXY\",\"adset_id\":\"6040739717108\"},{\"id\":\"6040739728108\",\"name\":\"Mn9YY\",\"adset_id\":\"6040739719108\"},{\"id\":\"6040739727908\",\"name\":\"XOc9m\",\"adset_id\":\"6040739718908\"},{\"id\":\"6040739727508\",\"name\":\"wEUl8\",\"adset_id\":\"6040739718708\"},{\"id\":\"6040739722108\",\"name\":\"JV4CF\",\"adset_id\":\"6040739717108\"},{\"id\":\"6040739382308\",\"name\":\"1Jfsw\",\"adset_id\":\"6040739381508\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0MjYwMTcyOTUwOAZDZD\",\"after\":\"NjA0MDczOTM4MjMwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0MDczOTM4MjMwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjA0MjYwMTcyOTUwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0MjYwMTcyNzkwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0NDMxNTc0NDUwOAZDZD",
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
  "2dnKu9V7MenKGNos2E+dPIJgb4Yk5aF1xerKJxQGMntc6xGkbtxWQkx5OruxiHU+EQecG3xbB1fFruI4rfjeUw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"0e6165763adcb97b12895dc9e3b606916b3aba53\"",
  "x-fb-trace-id" "G2b+P9tkwx7",
  "Date" "Sat, 15 Apr 2017 16:35:30 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6044315742508\",\"name\":\"GENja\",\"adset_id\":\"6044315732908\"},{\"id\":\"6044315741108\",\"name\":\"o9Hq3\",\"adset_id\":\"6044315731908\"},{\"id\":\"6044315739708\",\"name\":\"fkTkB\",\"adset_id\":\"6044315731508\"},{\"id\":\"6044315739108\",\"name\":\"4d0Pw\",\"adset_id\":\"6044315731708\"},{\"id\":\"6044315736708\",\"name\":\"998uh\",\"adset_id\":\"6044315730708\"},{\"id\":\"6044315745308\",\"name\":\"XbUEE\",\"adset_id\":\"6044315733108\"},{\"id\":\"6044315744108\",\"name\":\"wVyse\",\"adset_id\":\"6044315732508\"},{\"id\":\"6044315741908\",\"name\":\"6zVRz\",\"adset_id\":\"6044315732308\"},{\"id\":\"6044315741708\",\"name\":\"Pr5zd\",\"adset_id\":\"6044315732108\"},{\"id\":\"6044315741508\",\"name\":\"kP0td\",\"adset_id\":\"6044315732108\"},{\"id\":\"6044315741308\",\"name\":\"K2SyI\",\"adset_id\":\"6044315732108\"},{\"id\":\"6044315738708\",\"name\":\"Dxyo4\",\"adset_id\":\"6044315730908\"},{\"id\":\"6044315742108\",\"name\":\"CHm2W\",\"adset_id\":\"6044315732308\"},{\"id\":\"6044315740308\",\"name\":\"UqG3a\",\"adset_id\":\"6044315731508\"},{\"id\":\"6044315740108\",\"name\":\"7DJUv\",\"adset_id\":\"6044315731508\"},{\"id\":\"6044315739508\",\"name\":\"4u3Wr\",\"adset_id\":\"6044315731708\"},{\"id\":\"6042191855908\",\"name\":\"wW6F3\",\"adset_id\":\"6042191851508\"},{\"id\":\"6042191855708\",\"name\":\"L3lau\",\"adset_id\":\"6042191851508\"},{\"id\":\"6042191855308\",\"name\":\"DTDkC\",\"adset_id\":\"6042191851508\"},{\"id\":\"6042191854908\",\"name\":\"mYiUE\",\"adset_id\":\"6042191851508\"},{\"id\":\"6042191855108\",\"name\":\"qXOMb\",\"adset_id\":\"6042191851308\"},{\"id\":\"6042191854708\",\"name\":\"qFjza\",\"adset_id\":\"6042191851308\"},{\"id\":\"6042191854508\",\"name\":\"jBdPP\",\"adset_id\":\"6042191851308\"},{\"id\":\"6042191858908\",\"name\":\"eu7bg\",\"adset_id\":\"6042191852308\"},{\"id\":\"6042191858708\",\"name\":\"naHXZ\",\"adset_id\":\"6042191852308\"},{\"id\":\"6042191858508\",\"name\":\"LQemI\",\"adset_id\":\"6042191852308\"},{\"id\":\"6042191858308\",\"name\":\"dre7S\",\"adset_id\":\"6042191852308\"},{\"id\":\"6042191856508\",\"name\":\"ZElEC\",\"adset_id\":\"6042191851708\"},{\"id\":\"6042191856308\",\"name\":\"YB2mj\",\"adset_id\":\"6042191851708\"},{\"id\":\"6042191856108\",\"name\":\"g4jeF\",\"adset_id\":\"6042191851708\"},{\"id\":\"6042191855508\",\"name\":\"VhBRH\",\"adset_id\":\"6042191851708\"},{\"id\":\"6042191858108\",\"name\":\"PdDw7\",\"adset_id\":\"6042191852108\"},{\"id\":\"6042191857908\",\"name\":\"pdIOv\",\"adset_id\":\"6042191852108\"},{\"id\":\"6042191857708\",\"name\":\"NZzr8\",\"adset_id\":\"6042191852108\"},{\"id\":\"6042191857508\",\"name\":\"cKN59\",\"adset_id\":\"6042191852108\"},{\"id\":\"6042191857308\",\"name\":\"n02bv\",\"adset_id\":\"6042191851908\"},{\"id\":\"6042191857108\",\"name\":\"aXrad\",\"adset_id\":\"6042191851908\"},{\"id\":\"6042191856908\",\"name\":\"QnlrN\",\"adset_id\":\"6042191851908\"},{\"id\":\"6042191856708\",\"name\":\"VGQit\",\"adset_id\":\"6042191851908\"},{\"id\":\"6042601728908\",\"name\":\"ESYyU\",\"adset_id\":\"6042601725308\"},{\"id\":\"6042601726908\",\"name\":\"IKHzV\",\"adset_id\":\"6042601725508\"},{\"id\":\"6042601729108\",\"name\":\"efjWS\",\"adset_id\":\"6042601725308\"},{\"id\":\"6042601728108\",\"name\":\"rg66T\",\"adset_id\":\"6042601725908\"},{\"id\":\"6042601727308\",\"name\":\"wuQUO\",\"adset_id\":\"6042601725508\"},{\"id\":\"6042601729308\",\"name\":\"LdLto\",\"adset_id\":\"6042601725308\"},{\"id\":\"6042601728508\",\"name\":\"3B8se\",\"adset_id\":\"6042601725908\"},{\"id\":\"6042601727708\",\"name\":\"MQpk5\",\"adset_id\":\"6042601725508\"},{\"id\":\"6042601728308\",\"name\":\"nr8Nz\",\"adset_id\":\"6042601725908\"},{\"id\":\"6042601727108\",\"name\":\"5NweF\",\"adset_id\":\"6042601725308\"},{\"id\":\"6042601727908\",\"name\":\"iFF59\",\"adset_id\":\"6042601725708\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NDMxNTc0MjUwOAZDZD\",\"after\":\"NjA0MjYwMTcyNzkwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0MjYwMTcyNzkwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjA0NDMxNTc0MjUwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0NDMxNTc0NDUwOAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0NjgxNjYyNDMwOAZDZD",
 :as :json}
(fn [req]{:request-time 443,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "0JYtpO5aceVzavtoA8rmTIBjCe/cHpeX56ZZX8JLDBpCpZEiZw9/i9qpwa9M0mLolTdiO42L8uC3Y1XELdMJqA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"7799f3df994262e8e8375d48647d3d43c8aaf123\"",
  "x-fb-trace-id" "FvBfABbTH0W",
  "Date" "Sat, 15 Apr 2017 16:35:30 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6046816623108\",\"name\":\"LJuTG\",\"adset_id\":\"6046816616708\"},{\"id\":\"6046816619908\",\"name\":\"8LpMs\",\"adset_id\":\"6046816615308\"},{\"id\":\"6046816624508\",\"name\":\"wT85j\",\"adset_id\":\"6046816616508\"},{\"id\":\"6046816620508\",\"name\":\"cIVoi\",\"adset_id\":\"6046816615908\"},{\"id\":\"6046816622108\",\"name\":\"bOL8I\",\"adset_id\":\"6046816616308\"},{\"id\":\"6046816621108\",\"name\":\"8T4BR\",\"adset_id\":\"6046816615908\"},{\"id\":\"6046816622308\",\"name\":\"yHJhw\",\"adset_id\":\"6046816616308\"},{\"id\":\"6046816619308\",\"name\":\"OYWTi\",\"adset_id\":\"6046816615308\"},{\"id\":\"6046816624908\",\"name\":\"yOlYW\",\"adset_id\":\"6046816616508\"},{\"id\":\"6046816622908\",\"name\":\"CuNCH\",\"adset_id\":\"6046816616708\"},{\"id\":\"6046816622708\",\"name\":\"qMZYV\",\"adset_id\":\"6046816616308\"},{\"id\":\"6046816619108\",\"name\":\"RL6Ub\",\"adset_id\":\"6046816615508\"},{\"id\":\"6046816619508\",\"name\":\"egJQB\",\"adset_id\":\"6046816615308\"},{\"id\":\"6046816621708\",\"name\":\"ZiKdE\",\"adset_id\":\"6046816615508\"},{\"id\":\"6046816620308\",\"name\":\"rPhHQ\",\"adset_id\":\"6046816615508\"},{\"id\":\"6046816623508\",\"name\":\"5T7IG\",\"adset_id\":\"6046816616708\"},{\"id\":\"6046816623308\",\"name\":\"MUZSE\",\"adset_id\":\"6046816616708\"},{\"id\":\"6044315739908\",\"name\":\"tWYj5\",\"adset_id\":\"6044315731508\"},{\"id\":\"6044315740908\",\"name\":\"kaJkj\",\"adset_id\":\"6044315731908\"},{\"id\":\"6044315738308\",\"name\":\"XDVgy\",\"adset_id\":\"6044315730908\"},{\"id\":\"6044315739308\",\"name\":\"av2HZ\",\"adset_id\":\"6044315731708\"},{\"id\":\"6044315737708\",\"name\":\"RbDNb\",\"adset_id\":\"6044315731108\"},{\"id\":\"6044315743508\",\"name\":\"7jReS\",\"adset_id\":\"6044315732708\"},{\"id\":\"6044315743308\",\"name\":\"ENILk\",\"adset_id\":\"6044315732708\"},{\"id\":\"6044315742308\",\"name\":\"lPQ5z\",\"adset_id\":\"6044315732308\"},{\"id\":\"6044315736508\",\"name\":\"rLo5n\",\"adset_id\":\"6044315731108\"},{\"id\":\"6044315745108\",\"name\":\"LlhTZ\",\"adset_id\":\"6044315733108\"},{\"id\":\"6044315737108\",\"name\":\"HLZe5\",\"adset_id\":\"6044315731308\"},{\"id\":\"6044315742708\",\"name\":\"MmoOu\",\"adset_id\":\"6044315732908\"},{\"id\":\"6044315742908\",\"name\":\"uStdc\",\"adset_id\":\"6044315732908\"},{\"id\":\"6044315737508\",\"name\":\"oHmMI\",\"adset_id\":\"6044315731308\"},{\"id\":\"6044315745508\",\"name\":\"H0tmi\",\"adset_id\":\"6044315733308\"},{\"id\":\"6044315737308\",\"name\":\"ok76r\",\"adset_id\":\"6044315731108\"},{\"id\":\"6044315743108\",\"name\":\"6vMC5\",\"adset_id\":\"6044315732708\"},{\"id\":\"6044315737908\",\"name\":\"bYn8q\",\"adset_id\":\"6044315731108\"},{\"id\":\"6044315736908\",\"name\":\"tyR75\",\"adset_id\":\"6044315731308\"},{\"id\":\"6044315745908\",\"name\":\"16xxB\",\"adset_id\":\"6044315733308\"},{\"id\":\"6044315745708\",\"name\":\"Ht8f8\",\"adset_id\":\"6044315733308\"},{\"id\":\"6044315744308\",\"name\":\"W8gMn\",\"adset_id\":\"6044315732508\"},{\"id\":\"6044315743708\",\"name\":\"g8pvB\",\"adset_id\":\"6044315732508\"},{\"id\":\"6044315740508\",\"name\":\"2NP5u\",\"adset_id\":\"6044315731908\"},{\"id\":\"6044315738508\",\"name\":\"NFEtD\",\"adset_id\":\"6044315730908\"},{\"id\":\"6044315746108\",\"name\":\"xGdiD\",\"adset_id\":\"6044315733308\"},{\"id\":\"6044315743908\",\"name\":\"0gt1h\",\"adset_id\":\"6044315732508\"},{\"id\":\"6044315740708\",\"name\":\"7VGoh\",\"adset_id\":\"6044315731908\"},{\"id\":\"6044315738908\",\"name\":\"8k9d7\",\"adset_id\":\"6044315731708\"},{\"id\":\"6044315738108\",\"name\":\"6xo6U\",\"adset_id\":\"6044315730908\"},{\"id\":\"6044315744908\",\"name\":\"2kc1C\",\"adset_id\":\"6044315733108\"},{\"id\":\"6044315744708\",\"name\":\"L30Vf\",\"adset_id\":\"6044315733108\"},{\"id\":\"6044315744508\",\"name\":\"67zrq\",\"adset_id\":\"6044315732508\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NjgxNjYyMzEwOAZDZD\",\"after\":\"NjA0NDMxNTc0NDUwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0NDMxNTc0NDUwOAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&before=NjA0NjgxNjYyMzEwOAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0NjgxNjYyNDMwOAZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/ads",
 :as :json,
 :query-params
 {:path "ads",
  :limit "50",
  :fields "id,name,adset_id",
  :ids "act_10152412627713995",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:request-time 1639,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "9axIRx47aMuVGEeq1zgjayrOp9VruKkC1tG4j1YiRgeaR5DxqrntCcZVR7pClUMA86KIJNAwvd97PSKAPudp6Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961041",
  "ETag" "\"c1441aa824d797c6ae1e81b5831cfc5eb5b2829c\"",
  "x-fb-trace-id" "Ch1qF4IChST",
  "Date" "Sat, 15 Apr 2017 16:35:30 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"act_10152412627713995\":{\"data\":[{\"id\":\"6052149268308\",\"name\":\"JquP3\",\"adset_id\":\"6052149268508\"},{\"id\":\"6052149268108\",\"name\":\"uyKvR\",\"adset_id\":\"6052149268508\"},{\"id\":\"6052149267908\",\"name\":\"OytQ3\",\"adset_id\":\"6052149268508\"},{\"id\":\"6049130284108\",\"name\":\"Cnit9\",\"adset_id\":\"6049130284508\"},{\"id\":\"6049130284308\",\"name\":\"7Jho9\",\"adset_id\":\"6049130284508\"},{\"id\":\"6049130283308\",\"name\":\"yqlto\",\"adset_id\":\"6049130284508\"},{\"id\":\"6049130289308\",\"name\":\"bVbZC\",\"adset_id\":\"6049130291708\"},{\"id\":\"6049130289908\",\"name\":\"IRfvx\",\"adset_id\":\"6049130283908\"},{\"id\":\"6049130285108\",\"name\":\"2WhVB\",\"adset_id\":\"6049130290508\"},{\"id\":\"6049130286308\",\"name\":\"5EhM2\",\"adset_id\":\"6049130290908\"},{\"id\":\"6049130287708\",\"name\":\"4JyIB\",\"adset_id\":\"6049130291308\"},{\"id\":\"6049130289708\",\"name\":\"EfYCl\",\"adset_id\":\"6049130283908\"},{\"id\":\"6049130290108\",\"name\":\"Te9dU\",\"adset_id\":\"6049130283908\"},{\"id\":\"6049130288908\",\"name\":\"1Wv3y\",\"adset_id\":\"6049130291708\"},{\"id\":\"6049130287908\",\"name\":\"Hm62c\",\"adset_id\":\"6049130291308\"},{\"id\":\"6049130285908\",\"name\":\"40u5I\",\"adset_id\":\"6049130290708\"},{\"id\":\"6049130289508\",\"name\":\"6ayGW\",\"adset_id\":\"6049130291708\"},{\"id\":\"6049130284908\",\"name\":\"2T2nT\",\"adset_id\":\"6049130290508\"},{\"id\":\"6049130286508\",\"name\":\"mRrOI\",\"adset_id\":\"6049130290908\"},{\"id\":\"6049130287508\",\"name\":\"jx8Te\",\"adset_id\":\"6049130291308\"},{\"id\":\"6049130289108\",\"name\":\"7Vg0I\",\"adset_id\":\"6049130291708\"},{\"id\":\"6049130287108\",\"name\":\"6rhh5\",\"adset_id\":\"6049130290908\"},{\"id\":\"6049130287308\",\"name\":\"Kx99U\",\"adset_id\":\"6049130291108\"},{\"id\":\"6049130286108\",\"name\":\"ix2mw\",\"adset_id\":\"6049130290908\"},{\"id\":\"6049130285308\",\"name\":\"xKKIi\",\"adset_id\":\"6049130290508\"},{\"id\":\"6049130286708\",\"name\":\"BvOy0\",\"adset_id\":\"6049130291108\"},{\"id\":\"6049130290308\",\"name\":\"z13D9\",\"adset_id\":\"6049130283908\"},{\"id\":\"6049130284708\",\"name\":\"hG1Ix\",\"adset_id\":\"6049130290508\"},{\"id\":\"6049130285708\",\"name\":\"9lUOV\",\"adset_id\":\"6049130290708\"},{\"id\":\"6049130288708\",\"name\":\"HMtoE\",\"adset_id\":\"6049130291508\"},{\"id\":\"6049130288508\",\"name\":\"GUd83\",\"adset_id\":\"6049130291508\"},{\"id\":\"6049130288108\",\"name\":\"qoxeH\",\"adset_id\":\"6049130291308\"},{\"id\":\"6049130286908\",\"name\":\"NMOuh\",\"adset_id\":\"6049130291108\"},{\"id\":\"6049130288308\",\"name\":\"9RLIK\",\"adset_id\":\"6049130291508\"},{\"id\":\"6049130285508\",\"name\":\"rU7Fa\",\"adset_id\":\"6049130290708\"},{\"id\":\"6046816620708\",\"name\":\"MBXEY\",\"adset_id\":\"6046816615908\"},{\"id\":\"6046816624108\",\"name\":\"zjfuT\",\"adset_id\":\"6046816616908\"},{\"id\":\"6046816620108\",\"name\":\"XvHNq\",\"adset_id\":\"6046816615508\"},{\"id\":\"6046816621508\",\"name\":\"IbBDP\",\"adset_id\":\"6046816615708\"},{\"id\":\"6046816622508\",\"name\":\"WUOiy\",\"adset_id\":\"6046816616308\"},{\"id\":\"6046816620908\",\"name\":\"YyojQ\",\"adset_id\":\"6046816615908\"},{\"id\":\"6046816623708\",\"name\":\"ciBac\",\"adset_id\":\"6046816616908\"},{\"id\":\"6046816621308\",\"name\":\"oGM47\",\"adset_id\":\"6046816615708\"},{\"id\":\"6046816625108\",\"name\":\"InwrJ\",\"adset_id\":\"6046816616108\"},{\"id\":\"6046816623908\",\"name\":\"Vnlj6\",\"adset_id\":\"6046816616908\"},{\"id\":\"6046816619708\",\"name\":\"ogx2C\",\"adset_id\":\"6046816616108\"},{\"id\":\"6046816625308\",\"name\":\"aHis8\",\"adset_id\":\"6046816616108\"},{\"id\":\"6046816624708\",\"name\":\"xbQ9V\",\"adset_id\":\"6046816616508\"},{\"id\":\"6046816621908\",\"name\":\"B9Y1F\",\"adset_id\":\"6046816615708\"},{\"id\":\"6046816624308\",\"name\":\"OCoJP\",\"adset_id\":\"6046816616908\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1MjE0OTI2ODMwOAZDZD\",\"after\":\"NjA0NjgxNjYyNDMwOAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152412627713995/ads?access_token=XXTOKENXX&fields=id%2Cname%2Cadset_id&since&until&limit=50&after=NjA0NjgxNjYyNDMwOAZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/ads"]}
)
})