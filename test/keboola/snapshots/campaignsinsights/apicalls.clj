(ns keboola.snapshots.campaignsinsights.apicalls)
(def recorded 
{
{:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMDkxNjUyNjY3MAZDZD",
 :as :json}
(fn [req]{:request-time 403,
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
  "PIgyEFQntYIsqnxA/mbsval9wJeHqlp/NHR7OeZQUIxHBJHnaxtWpIdh3SEC7P0zLW9OKVnNYBNhukpuUvxH3Q==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"fb99aae2e5fbe870fd64271dad8cfdbe5015a0b0\"",
  "x-fb-trace-id" "GAgLxSsINNz",
  "Date" "Sat, 15 Apr 2017 14:47:22 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6020663864070\"},{\"id\":\"6020590268670\"},{\"id\":\"6020470065070\"},{\"id\":\"6020469208070\"},{\"id\":\"6020416026470\"},{\"id\":\"6020411414470\"},{\"id\":\"6019681080270\"},{\"id\":\"6019644104070\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMDY2Mzg2NDA3MAZDZD\",\"after\":\"NjAxOTY0NDEwNDA3MAZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjAyMDY2Mzg2NDA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMDkxNjUyNjY3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyNzE3MDI0MDQ3MAZDZD",
 :as :json}
(fn [req]{:request-time 613,
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
  "JxIOl0HrhZ6nErLXD+42AUjouMAa0n/y/RFnhRi7NnPlIz68Y0cMtpY8aMMuSRF3oJZ73lRsnuUqtqHFQv9jdw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"7c68a61699cff5a328173489da440d40693da1fa\"",
  "x-fb-trace-id" "GpSdMaDnm8i",
  "Date" "Sat, 15 Apr 2017 14:47:22 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6026798951070\"},{\"id\":\"6026567452670\"},{\"id\":\"6026542970670\"},{\"id\":\"6026542970270\"},{\"id\":\"6026542970070\"},{\"id\":\"6026392074870\"},{\"id\":\"6026011237870\"},{\"id\":\"6025695642470\"},{\"id\":\"6025687679470\"},{\"id\":\"6025591979870\"},{\"id\":\"6025562944470\"},{\"id\":\"6025560438470\"},{\"id\":\"6025560438270\"},{\"id\":\"6024565463270\"},{\"id\":\"6023187817470\"},{\"id\":\"6023044208270\"},{\"id\":\"6022819846270\"},{\"id\":\"6022818793470\"},{\"id\":\"6022738122670\"},{\"id\":\"6022421550870\"},{\"id\":\"6022120952670\"},{\"id\":\"6021919243270\"},{\"id\":\"6021754733070\"},{\"id\":\"6020917424270\"},{\"id\":\"6020916526670\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyNjc5ODk1MTA3MAZDZD\",\"after\":\"NjAyMDkxNjUyNjY3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMDkxNjUyNjY3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjAyNjc5ODk1MTA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyNzE3MDI0MDQ3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAzNTU2MTczNjI3MAZDZD",
 :as :json}
(fn [req]{:request-time 619,
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
  "tyeEN56QuzoRNsMqH8N8lIDX6CP1peAuHU5qEAkCeA1JA53ZfEr7hKgZDRTHJO4Sy1cffWVl53Ul72pmjfctjg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"ce0ef2a1a3531db18e03d7d7fe5d3bb8f6639f87\"",
  "x-fb-trace-id" "G5YvShbuCd2",
  "Date" "Sat, 15 Apr 2017 14:47:21 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6035560883270\"},{\"id\":\"6034785536270\"},{\"id\":\"6034265603470\"},{\"id\":\"6034264589670\"},{\"id\":\"6032861605270\"},{\"id\":\"6032749476870\"},{\"id\":\"6032749083470\"},{\"id\":\"6032111463870\"},{\"id\":\"6031717809670\"},{\"id\":\"6031491138270\"},{\"id\":\"6031490818470\"},{\"id\":\"6031489843470\"},{\"id\":\"6030606674870\"},{\"id\":\"6030029668070\"},{\"id\":\"6029842967270\"},{\"id\":\"6029750174870\"},{\"id\":\"6029341869270\"},{\"id\":\"6029058309270\"},{\"id\":\"6028994834670\"},{\"id\":\"6028356677270\"},{\"id\":\"6028346486870\"},{\"id\":\"6028270919670\"},{\"id\":\"6027882130070\"},{\"id\":\"6027570733670\"},{\"id\":\"6027170240470\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzNTU2MDg4MzI3MAZDZD\",\"after\":\"NjAyNzE3MDI0MDQ3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyNzE3MDI0MDQ3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjAzNTU2MDg4MzI3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAzNTU2MTczNjI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0NDQ0MTQ0MjQ3MAZDZD",
 :as :json}
(fn [req]{:request-time 605,
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
  "2GgWhiw+Sf5fJqS3dI+zZu00Nd4LoSwHPl/QgZ8TJPcdJ6qyirF9mg9V/HsjhtckSQ5Q5EcVHlflMLhQxlOopw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"90ee4aea2ac8cca881d48551bacef790565bf4df\"",
  "x-fb-trace-id" "Dqu7ra50rd6",
  "Date" "Sat, 15 Apr 2017 14:47:20 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6044438044870\"},{\"id\":\"6044356472870\"},{\"id\":\"6044354569870\"},{\"id\":\"6044285810470\"},{\"id\":\"6044125274470\"},{\"id\":\"6044004779270\"},{\"id\":\"6043918161870\"},{\"id\":\"6043742649270\"},{\"id\":\"6043633602670\"},{\"id\":\"6043374806070\"},{\"id\":\"6042985120870\"},{\"id\":\"6042976332870\"},{\"id\":\"6042973616070\"},{\"id\":\"6042906710270\"},{\"id\":\"6042138678870\"},{\"id\":\"6042063797070\"},{\"id\":\"6041830861470\"},{\"id\":\"6041002071870\"},{\"id\":\"6040759465870\"},{\"id\":\"6040021891070\"},{\"id\":\"6039831650670\"},{\"id\":\"6038701396470\"},{\"id\":\"6038388592270\"},{\"id\":\"6035594872670\"},{\"id\":\"6035561736270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NDQzODA0NDg3MAZDZD\",\"after\":\"NjAzNTU2MTczNjI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAzNTU2MTczNjI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA0NDQzODA0NDg3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0NDQ0MTQ0MjQ3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0Njg0NTg3MDI3MAZDZD",
 :as :json}
(fn [req]{:request-time 777,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.03,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "v7PSwLN1Fmc0z4RtA9kzKzOFG4DTYcVW6wkJTfkb0cNdTZmzg3kmLbTU0SRi0X30cbN2K7RooIYpcIBQtTguYQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"769c39af58b06d8da132d4c582b9309ad3729618\"",
  "x-fb-trace-id" "HxmJy6tf+KC",
  "Date" "Sat, 15 Apr 2017 14:47:20 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6046839574670\"},{\"id\":\"6046826881670\"},{\"id\":\"6046758110470\"},{\"id\":\"6046742077270\"},{\"id\":\"6046739319070\"},{\"id\":\"6046557726070\"},{\"id\":\"6046313822470\"},{\"id\":\"6046072317270\"},{\"id\":\"6045767050470\"},{\"id\":\"6045748996670\"},{\"id\":\"6045681095470\"},{\"id\":\"6045680477270\"},{\"id\":\"6045679590270\"},{\"id\":\"6045675780870\"},{\"id\":\"6045211083870\"},{\"id\":\"6045135612470\"},{\"id\":\"6045058522470\"},{\"id\":\"6045056840070\"},{\"id\":\"6044901291270\"},{\"id\":\"6044802438470\"},{\"id\":\"6044801305070\"},{\"id\":\"6044647763270\"},{\"id\":\"6044647679270\"},{\"id\":\"6044442014070\"},{\"id\":\"6044441442470\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NjgzOTU3NDY3MAZDZD\",\"after\":\"NjA0NDQ0MTQ0MjQ3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0NDQ0MTQ0MjQ3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA0NjgzOTU3NDY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0Njg0NTg3MDI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0OTY3MjU5OTA3MAZDZD",
 :as :json}
(fn [req]{:request-time 448,
 :repeatable? false,
 :protocol-version {:name "HTTP", :major 1, :minor 1},
 :streaming? true,
 :chunked? false,
 :reason-phrase "OK",
 :headers
 {"x-fb-ads-insights-platform" "2.0",
  "x-fb-ads-insights-throttle"
  "{\"app_id_util_pct\": 0.03,\"acc_id_util_pct\": 0.00}",
  "Content-Type" "text/javascript; charset=UTF-8",
  "Access-Control-Allow-Origin" "*",
  "X-FB-Debug"
  "2YX0xzKPBAIdOYegy8C+oA/cVXnRNqE6odOVvd6lBA1AUz/9IkLVCdTvRvUNotraKRdHu7zsQhdRIlwsSHZPlQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"e8e7f84945de1c938af3feca92618c75b90abe8f\"",
  "x-fb-trace-id" "C8WUGO0g1zB",
  "Date" "Sat, 15 Apr 2017 14:47:19 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6049664623270\"},{\"id\":\"6049541694670\"},{\"id\":\"6049477071070\"},{\"id\":\"6049477055470\"},{\"id\":\"6049242019670\"},{\"id\":\"6049022368270\"},{\"id\":\"6048947178270\"},{\"id\":\"6048780289870\"},{\"id\":\"6048770169470\"},{\"id\":\"6048738596870\"},{\"id\":\"6048736766070\"},{\"id\":\"6048676993470\"},{\"id\":\"6048570034270\"},{\"id\":\"6048275369870\"},{\"id\":\"6048273191270\"},{\"id\":\"6047396558670\"},{\"id\":\"6047307283670\"},{\"id\":\"6047306634870\"},{\"id\":\"6047081632270\"},{\"id\":\"6047063290470\"},{\"id\":\"6047042026070\"},{\"id\":\"6046855206270\"},{\"id\":\"6046854391470\"},{\"id\":\"6046849858470\"},{\"id\":\"6046845870270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0OTY2NDYyMzI3MAZDZD\",\"after\":\"NjA0Njg0NTg3MDI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0Njg0NTg3MDI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA0OTY2NDYyMzI3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0OTY3MjU5OTA3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA1NDk3Njg5MjY3MAZDZD",
 :as :json}
(fn [req]{:request-time 586,
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
  "kYIx5GTF6ip+LjuMRiDKOk/UAe4AJqPf86UxAic+WNKmLh3/2STbX0HAr8f1iTa2DO+/PFcFZi84VY4ePjV2OA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"93e047c5eac87f2ef0c02cda389a9945ac205951\"",
  "x-fb-trace-id" "AK8qc0LyScK",
  "Date" "Sat, 15 Apr 2017 14:47:19 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6054824761470\"},{\"id\":\"6054543737270\"},{\"id\":\"6054420781470\"},{\"id\":\"6054416868470\"},{\"id\":\"6054156231270\"},{\"id\":\"6054100441670\"},{\"id\":\"6054021363670\"},{\"id\":\"6053526258870\"},{\"id\":\"6053503508270\"},{\"id\":\"6053440027070\"},{\"id\":\"6053438440070\"},{\"id\":\"6052346706870\"},{\"id\":\"6052284860670\"},{\"id\":\"6051389683270\"},{\"id\":\"6051325162670\"},{\"id\":\"6051274943470\"},{\"id\":\"6051273672470\"},{\"id\":\"6051207170470\"},{\"id\":\"6051206502470\"},{\"id\":\"6050849364870\"},{\"id\":\"6050791810470\"},{\"id\":\"6050387155470\"},{\"id\":\"6050185887270\"},{\"id\":\"6050020410270\"},{\"id\":\"6049672599070\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1NDgyNDc2MTQ3MAZDZD\",\"after\":\"NjA0OTY3MjU5OTA3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0OTY3MjU5OTA3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA1NDgyNDc2MTQ3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA1NDk3Njg5MjY3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMjcwMzg0NTI5MQZDZD",
 :as :json}
(fn [req]{:request-time 328,
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
  "lAOftrd1OHQwPTV3S8UMHGVcmK5Mziv7llSkJMGO8Zzr6/xAy8oDv78IWLrfyKpqvF4Ug3E8y6YdvHAG0cIfjQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"e8a8b0ac62ff226fa047b32042bf5d4432d320df\"",
  "x-fb-trace-id" "GLA6TnXldua",
  "Date" "Sat, 15 Apr 2017 14:47:18 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6022061422691\"},{\"id\":\"6022061422491\"},{\"id\":\"6021366361491\"},{\"id\":\"6021358043091\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMjA2MTQyMjY5MQZDZD\",\"after\":\"NjAyMTM1ODA0MzA5MQZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjAyMjA2MTQyMjY5MQZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMjcwMzg0NTI5MQZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0MDA4MDc4NzQ5MQZDZD",
 :as :json}
(fn [req]{:request-time 613,
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
  "GsSc15Kz3vt4dCuCZr1EXp+OTdbBhwiQ6AInNt4nQNu4CYAuPC53KP0QoDUdVlu+pKJQV2s04ZhJQ9qZd9kEmQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"8c65085e9783abbb60dab64b1c5377f371887a19\"",
  "x-fb-trace-id" "CBgDcIHN3Zc",
  "Date" "Sat, 15 Apr 2017 14:47:18 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6040080787291\"},{\"id\":\"6038584660491\"},{\"id\":\"6038584660291\"},{\"id\":\"6036015877691\"},{\"id\":\"6036015877491\"},{\"id\":\"6033247058891\"},{\"id\":\"6033247058691\"},{\"id\":\"6030987390091\"},{\"id\":\"6030987180891\"},{\"id\":\"6029847645491\"},{\"id\":\"6029847645091\"},{\"id\":\"6028435214091\"},{\"id\":\"6028435026491\"},{\"id\":\"6027316298291\"},{\"id\":\"6027316298091\"},{\"id\":\"6026456340691\"},{\"id\":\"6026456340291\"},{\"id\":\"6024913957091\"},{\"id\":\"6024912977291\"},{\"id\":\"6023897973491\"},{\"id\":\"6023897973091\"},{\"id\":\"6023226201691\"},{\"id\":\"6023226201491\"},{\"id\":\"6022703845491\"},{\"id\":\"6022703845291\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0MDA4MDc4NzI5MQZDZD\",\"after\":\"NjAyMjcwMzg0NTI5MQZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMjcwMzg0NTI5MQZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA0MDA4MDc4NzI5MQZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0MDA4MDc4NzQ5MQZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/campaigns",
 :as :json,
 :query-params
 {:path "campaigns",
  :fields
  "insights.action_breakdowns(action_reaction).date_preset(last_3_days).time_increment(1){account_id,account_name,campaign_id,campaign_name,actions}",
  :ids "act_10152562141153995,act_10152437784203995",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:request-time 779,
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
  "8+ezfH+rN16Z1z9jRfHkX2YeokqedqfxHb83XhE1s+YBxgxqL4iWiPHHFebBWEZrtz4PCt4jp5TJObXvoRgMkg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"dc086deebc214a6fdafd55dc8c59da34036d63fe\"",
  "x-fb-trace-id" "FhyHfGN+MQP",
  "Date" "Sat, 15 Apr 2017 14:47:17 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"act_10152562141153995\":{\"data\":[{\"insights\":{\"data\":[{\"account_id\":\"10152562141153995\",\"account_name\":\"3Mnux\",\"campaign_id\":\"6064029033691\",\"campaign_name\":\"Jnscb\",\"actions\":[{\"action_type\":\"offsite_conversion.custom.270601453373563\",\"value\":\"1\"},{\"action_type\":\"like\",\"value\":\"3\"},{\"action_type\":\"link_click\",\"value\":\"175\"},{\"action_type\":\"offsite_conversion.fb_pixel_lead\",\"value\":\"1\"},{\"action_type\":\"offsite_conversion.registration\",\"value\":\"12\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"9\"},{\"action_reaction\":\"love\",\"action_type\":\"post_reaction\",\"value\":\"1\"}],\"date_start\":\"2017-04-13\",\"date_stop\":\"2017-04-13\"},{\"account_id\":\"10152562141153995\",\"account_name\":\"QE8m7\",\"campaign_id\":\"6064029033691\",\"campaign_name\":\"krciI\",\"actions\":[{\"action_type\":\"offsite_conversion.custom.270601453373563\",\"value\":\"6\"},{\"action_type\":\"like\",\"value\":\"3\"},{\"action_type\":\"link_click\",\"value\":\"183\"},{\"action_type\":\"offsite_conversion.fb_pixel_lead\",\"value\":\"6\"},{\"action_type\":\"offsite_conversion.registration\",\"value\":\"16\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"7\"}],\"date_start\":\"2017-04-14\",\"date_stop\":\"2017-04-14\"},{\"account_id\":\"10152562141153995\",\"account_name\":\"R4uIX\",\"campaign_id\":\"6064029033691\",\"campaign_name\":\"xnlo5\",\"actions\":[{\"action_type\":\"comment\",\"value\":\"2\"},{\"action_type\":\"offsite_conversion.custom.270601453373563\",\"value\":\"3\"},{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"100\"},{\"action_type\":\"offsite_conversion.fb_pixel_lead\",\"value\":\"3\"},{\"action_type\":\"offsite_conversion.registration\",\"value\":\"3\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"3\"}],\"date_start\":\"2017-04-15\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}},\"id\":\"6064029033691\"},{\"id\":\"6062362317291\"},{\"id\":\"6061135790891\"},{\"id\":\"6060853608091\"},{\"id\":\"6059433582691\"},{\"id\":\"6059433582291\"},{\"id\":\"6057598024691\"},{\"id\":\"6057529087491\"},{\"id\":\"6054030251891\"},{\"id\":\"6054030251691\"},{\"id\":\"6052269660491\"},{\"id\":\"6052269659691\"},{\"id\":\"6050373553091\"},{\"id\":\"6050373552891\"},{\"id\":\"6048599743691\"},{\"id\":\"6048599743491\"},{\"id\":\"6046869215491\"},{\"id\":\"6046869215291\"},{\"id\":\"6045105640291\"},{\"id\":\"6045105640091\"},{\"id\":\"6043050813291\"},{\"id\":\"6043050813091\"},{\"id\":\"6041314496091\"},{\"id\":\"6041314495891\"},{\"id\":\"6040080787491\"}],\"paging\":{\"cursors\":{\"before\":\"NjA2NDAyOTAzMzY5MQZDZD\",\"after\":\"NjA0MDA4MDc4NzQ5MQZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0MDA4MDc4NzQ5MQZDZD\"}},\"act_10152437784203995\":{\"data\":[{\"insights\":{\"data\":[{\"account_id\":\"10152437784203995\",\"account_name\":\"QSblP\",\"campaign_id\":\"6065546046870\",\"campaign_name\":\"wkP3G\",\"actions\":[{\"action_type\":\"like\",\"value\":\"2\"},{\"action_type\":\"link_click\",\"value\":\"66\"},{\"action_type\":\"post\",\"value\":\"2\"},{\"action_type\":\"video_play\",\"value\":\"61\"},{\"action_type\":\"video_view\",\"value\":\"12217\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"165\"},{\"action_reaction\":\"love\",\"action_type\":\"post_reaction\",\"value\":\"3\"}],\"date_start\":\"2017-04-13\",\"date_stop\":\"2017-04-13\"},{\"account_id\":\"10152437784203995\",\"account_name\":\"wwx3p\",\"campaign_id\":\"6065546046870\",\"campaign_name\":\"XREr0\",\"actions\":[{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"62\"},{\"action_type\":\"post\",\"value\":\"3\"},{\"action_type\":\"video_play\",\"value\":\"55\"},{\"action_type\":\"video_view\",\"value\":\"10674\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"187\"},{\"action_reaction\":\"love\",\"action_type\":\"post_reaction\",\"value\":\"3\"},{\"action_reaction\":\"wow\",\"action_type\":\"post_reaction\",\"value\":\"1\"}],\"date_start\":\"2017-04-14\",\"date_stop\":\"2017-04-14\"},{\"account_id\":\"10152437784203995\",\"account_name\":\"D8cD4\",\"campaign_id\":\"6065546046870\",\"campaign_name\":\"dKq2h\",\"actions\":[{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"52\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_type\":\"video_play\",\"value\":\"16\"},{\"action_type\":\"video_view\",\"value\":\"5597\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"73\"},{\"action_reaction\":\"love\",\"action_type\":\"post_reaction\",\"value\":\"2\"}],\"date_start\":\"2017-04-15\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}},\"id\":\"6065546046870\"},{\"id\":\"6064534431070\"},{\"id\":\"6064532436470\"},{\"insights\":{\"data\":[{\"account_id\":\"10152437784203995\",\"account_name\":\"OX073\",\"campaign_id\":\"6064431745270\",\"campaign_name\":\"1Hm7I\",\"actions\":[{\"action_type\":\"like\",\"value\":\"2\"},{\"action_type\":\"link_click\",\"value\":\"149\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"1\"}],\"date_start\":\"2017-04-13\",\"date_stop\":\"2017-04-13\"},{\"account_id\":\"10152437784203995\",\"account_name\":\"EExK6\",\"campaign_id\":\"6064431745270\",\"campaign_name\":\"CPks6\",\"actions\":[{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"139\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"3\"}],\"date_start\":\"2017-04-14\",\"date_stop\":\"2017-04-14\"},{\"account_id\":\"10152437784203995\",\"account_name\":\"9VfIZ\",\"campaign_id\":\"6064431745270\",\"campaign_name\":\"ZsP2n\",\"actions\":[{\"action_type\":\"link_click\",\"value\":\"60\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"2\"}],\"date_start\":\"2017-04-15\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}},\"id\":\"6064431745270\"},{\"id\":\"6063345207270\"},{\"id\":\"6063304977870\"},{\"id\":\"6062984300870\"},{\"id\":\"6062511159270\"},{\"id\":\"6058727884070\"},{\"id\":\"6058582351470\"},{\"id\":\"6058442622270\"},{\"id\":\"6057691860670\"},{\"id\":\"6056334638670\"},{\"id\":\"6056278906470\"},{\"id\":\"6056276209070\"},{\"id\":\"6056083058270\"},{\"id\":\"6056082641870\"},{\"id\":\"6055927657670\"},{\"id\":\"6055518600270\"},{\"id\":\"6055518574070\"},{\"id\":\"6055383466070\"},{\"id\":\"6055319065470\"},{\"id\":\"6055103761870\"},{\"id\":\"6054977645870\"},{\"id\":\"6054976892670\"}],\"paging\":{\"cursors\":{\"before\":\"NjA2NTU0NjA0Njg3MAZDZD\",\"after\":\"NjA1NDk3Njg5MjY3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_3_days%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA1NDk3Njg5MjY3MAZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/campaigns"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMDkxNjUyNjY3MAZDZD",
 :as :json}
(fn [req]{:request-time 345,
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
  "xeyOOcP8N7S+tyuqBnLtJoW/AnRYLYtpPZQ7QyE+LWg+DvyYZWhW7/jP0+QuTNj2IBpAKS5e+cBl/Ui7oI4cVw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"f197c9d160ae5765a379f8f6234c9bc17e1364ae\"",
  "x-fb-trace-id" "FdNrbj9OQ0t",
  "Date" "Sat, 15 Apr 2017 14:47:16 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6020663864070\"},{\"id\":\"6020590268670\"},{\"id\":\"6020470065070\"},{\"id\":\"6020469208070\"},{\"id\":\"6020416026470\"},{\"id\":\"6020411414470\"},{\"id\":\"6019681080270\"},{\"id\":\"6019644104070\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMDY2Mzg2NDA3MAZDZD\",\"after\":\"NjAxOTY0NDEwNDA3MAZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjAyMDY2Mzg2NDA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMDkxNjUyNjY3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyNzE3MDI0MDQ3MAZDZD",
 :as :json}
(fn [req]{:request-time 614,
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
  "1ck1Tdbmzh3iLKcC5ObNsj1oBCnuksj/A7AU28AkWFAGfFTOHSWp1DNIT27sLPWXxgA8wZ8xsIK+wp9ZPGB9Gg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"4ba8930721098a7a8b70f4b4668b1d9f653e1172\"",
  "x-fb-trace-id" "GC6PFQVMYr2",
  "Date" "Sat, 15 Apr 2017 14:47:16 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6026798951070\"},{\"id\":\"6026567452670\"},{\"id\":\"6026542970670\"},{\"id\":\"6026542970270\"},{\"id\":\"6026542970070\"},{\"id\":\"6026392074870\"},{\"id\":\"6026011237870\"},{\"id\":\"6025695642470\"},{\"id\":\"6025687679470\"},{\"id\":\"6025591979870\"},{\"id\":\"6025562944470\"},{\"id\":\"6025560438470\"},{\"id\":\"6025560438270\"},{\"id\":\"6024565463270\"},{\"id\":\"6023187817470\"},{\"id\":\"6023044208270\"},{\"id\":\"6022819846270\"},{\"id\":\"6022818793470\"},{\"id\":\"6022738122670\"},{\"id\":\"6022421550870\"},{\"id\":\"6022120952670\"},{\"id\":\"6021919243270\"},{\"id\":\"6021754733070\"},{\"id\":\"6020917424270\"},{\"id\":\"6020916526670\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyNjc5ODk1MTA3MAZDZD\",\"after\":\"NjAyMDkxNjUyNjY3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMDkxNjUyNjY3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjAyNjc5ODk1MTA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyNzE3MDI0MDQ3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAzNTU2MTczNjI3MAZDZD",
 :as :json}
(fn [req]{:request-time 612,
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
  "XZL7cNiyZC/zB2VHqttXlK/7H8OTQf8sySvCozaHY0hlJcPOPwVVvX/1h1a0sa67klbOot3JDLQ8G4+bZXCspw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"2bdc577a17a28f5633c2a2886b64db99b1bb279c\"",
  "x-fb-trace-id" "G6VLC4fhrIf",
  "Date" "Sat, 15 Apr 2017 14:47:15 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6035560883270\"},{\"id\":\"6034785536270\"},{\"id\":\"6034265603470\"},{\"id\":\"6034264589670\"},{\"id\":\"6032861605270\"},{\"id\":\"6032749476870\"},{\"id\":\"6032749083470\"},{\"id\":\"6032111463870\"},{\"id\":\"6031717809670\"},{\"id\":\"6031491138270\"},{\"id\":\"6031490818470\"},{\"id\":\"6031489843470\"},{\"id\":\"6030606674870\"},{\"id\":\"6030029668070\"},{\"id\":\"6029842967270\"},{\"id\":\"6029750174870\"},{\"id\":\"6029341869270\"},{\"id\":\"6029058309270\"},{\"id\":\"6028994834670\"},{\"id\":\"6028356677270\"},{\"id\":\"6028346486870\"},{\"id\":\"6028270919670\"},{\"id\":\"6027882130070\"},{\"id\":\"6027570733670\"},{\"id\":\"6027170240470\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzNTU2MDg4MzI3MAZDZD\",\"after\":\"NjAyNzE3MDI0MDQ3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyNzE3MDI0MDQ3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjAzNTU2MDg4MzI3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAzNTU2MTczNjI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0NDQ0MTQ0MjQ3MAZDZD",
 :as :json}
(fn [req]{:request-time 612,
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
  "U8qQxhvB5IzvPKK5PN1MO2mmZ9BcZlTsPn3iGjNgDs3KDvqjW9qr4wgY+Hrw1kZPk/lChyfhhgvpeXN1fCMJDQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"0aee138d64b38d14b85d97bb472d13282e1cee8c\"",
  "x-fb-trace-id" "Ev0OoC4n8zW",
  "Date" "Sat, 15 Apr 2017 14:47:14 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6044438044870\"},{\"id\":\"6044356472870\"},{\"id\":\"6044354569870\"},{\"id\":\"6044285810470\"},{\"id\":\"6044125274470\"},{\"id\":\"6044004779270\"},{\"id\":\"6043918161870\"},{\"id\":\"6043742649270\"},{\"id\":\"6043633602670\"},{\"id\":\"6043374806070\"},{\"id\":\"6042985120870\"},{\"id\":\"6042976332870\"},{\"id\":\"6042973616070\"},{\"id\":\"6042906710270\"},{\"id\":\"6042138678870\"},{\"id\":\"6042063797070\"},{\"id\":\"6041830861470\"},{\"id\":\"6041002071870\"},{\"id\":\"6040759465870\"},{\"id\":\"6040021891070\"},{\"id\":\"6039831650670\"},{\"id\":\"6038701396470\"},{\"id\":\"6038388592270\"},{\"id\":\"6035594872670\"},{\"id\":\"6035561736270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NDQzODA0NDg3MAZDZD\",\"after\":\"NjAzNTU2MTczNjI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAzNTU2MTczNjI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA0NDQzODA0NDg3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0NDQ0MTQ0MjQ3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0Njg0NTg3MDI3MAZDZD",
 :as :json}
(fn [req]{:request-time 611,
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
  "SWaY6jDE4liQU3urJeOL7PuyKJE86v9RGOBHyDFc6KSdjvGqGXtWEQ7KFF7nzaKenwqVhOZQ8rin2FSfHXNAEA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"e82fe28fb7c19ddc093b37aa0870c69637a24d62\"",
  "x-fb-trace-id" "DzihvlqHusD",
  "Date" "Sat, 15 Apr 2017 14:47:14 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6046839574670\"},{\"id\":\"6046826881670\"},{\"id\":\"6046758110470\"},{\"id\":\"6046742077270\"},{\"id\":\"6046739319070\"},{\"id\":\"6046557726070\"},{\"id\":\"6046313822470\"},{\"id\":\"6046072317270\"},{\"id\":\"6045767050470\"},{\"id\":\"6045748996670\"},{\"id\":\"6045681095470\"},{\"id\":\"6045680477270\"},{\"id\":\"6045679590270\"},{\"id\":\"6045675780870\"},{\"id\":\"6045211083870\"},{\"id\":\"6045135612470\"},{\"id\":\"6045058522470\"},{\"id\":\"6045056840070\"},{\"id\":\"6044901291270\"},{\"id\":\"6044802438470\"},{\"id\":\"6044801305070\"},{\"id\":\"6044647763270\"},{\"id\":\"6044647679270\"},{\"id\":\"6044442014070\"},{\"id\":\"6044441442470\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NjgzOTU3NDY3MAZDZD\",\"after\":\"NjA0NDQ0MTQ0MjQ3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0NDQ0MTQ0MjQ3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA0NjgzOTU3NDY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0Njg0NTg3MDI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0OTY3MjU5OTA3MAZDZD",
 :as :json}
(fn [req]{:request-time 509,
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
  "Qi3ym+DKy8JIPmdvDOerMFUDoITaWbniWJRrLoK7BZXyquOd6BQJsKXqPnvGt1WcrZp8b74gS0hnYozaKD1DqA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"fe15bfb22d76b3d3d858b1d8e235ba8b312f86cc\"",
  "x-fb-trace-id" "AnBeaENekzx",
  "Date" "Sat, 15 Apr 2017 14:47:13 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6049664623270\"},{\"id\":\"6049541694670\"},{\"id\":\"6049477071070\"},{\"id\":\"6049477055470\"},{\"id\":\"6049242019670\"},{\"id\":\"6049022368270\"},{\"id\":\"6048947178270\"},{\"id\":\"6048780289870\"},{\"id\":\"6048770169470\"},{\"id\":\"6048738596870\"},{\"id\":\"6048736766070\"},{\"id\":\"6048676993470\"},{\"id\":\"6048570034270\"},{\"id\":\"6048275369870\"},{\"id\":\"6048273191270\"},{\"id\":\"6047396558670\"},{\"id\":\"6047307283670\"},{\"id\":\"6047306634870\"},{\"id\":\"6047081632270\"},{\"id\":\"6047063290470\"},{\"id\":\"6047042026070\"},{\"id\":\"6046855206270\"},{\"id\":\"6046854391470\"},{\"id\":\"6046849858470\"},{\"id\":\"6046845870270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0OTY2NDYyMzI3MAZDZD\",\"after\":\"NjA0Njg0NTg3MDI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0Njg0NTg3MDI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA0OTY2NDYyMzI3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0OTY3MjU5OTA3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA1NDk3Njg5MjY3MAZDZD",
 :as :json}
(fn [req]{:request-time 476,
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
  "bw3D6Hmir9Jf85wYPg3e3Lc9eh6j8BBBVyg2F7UcQFpTxfWwKw8ldMGE9j4x9IgVs6iA1e4J/A+EPqox15S6Uw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"44a7cf24e0d47b694c51913c8276222c366df286\"",
  "x-fb-trace-id" "E9qeatZMoB5",
  "Date" "Sat, 15 Apr 2017 14:47:13 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6054824761470\"},{\"id\":\"6054543737270\"},{\"id\":\"6054420781470\"},{\"id\":\"6054416868470\"},{\"id\":\"6054156231270\"},{\"id\":\"6054100441670\"},{\"id\":\"6054021363670\"},{\"id\":\"6053526258870\"},{\"id\":\"6053503508270\"},{\"id\":\"6053440027070\"},{\"id\":\"6053438440070\"},{\"id\":\"6052346706870\"},{\"id\":\"6052284860670\"},{\"id\":\"6051389683270\"},{\"id\":\"6051325162670\"},{\"id\":\"6051274943470\"},{\"id\":\"6051273672470\"},{\"id\":\"6051207170470\"},{\"id\":\"6051206502470\"},{\"id\":\"6050849364870\"},{\"id\":\"6050791810470\"},{\"id\":\"6050387155470\"},{\"id\":\"6050185887270\"},{\"id\":\"6050020410270\"},{\"id\":\"6049672599070\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1NDgyNDc2MTQ3MAZDZD\",\"after\":\"NjA0OTY3MjU5OTA3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0OTY3MjU5OTA3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA1NDgyNDc2MTQ3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA1NDk3Njg5MjY3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMjcwMzg0NTI5MQZDZD",
 :as :json}
(fn [req]{:request-time 351,
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
  "XImtDW9pdzwnSATZZWJlc4DdgFQKY7vMH0+iy0AlRwNuo/rjWhD2W4KD8dMyQwaHEYS2KMPyePL133itXds4vQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"7a485add4090cc80be662bb35f390d36373bf01e\"",
  "x-fb-trace-id" "CAZhZq/sLXc",
  "Date" "Sat, 15 Apr 2017 14:47:12 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6022061422691\"},{\"id\":\"6022061422491\"},{\"id\":\"6021366361491\"},{\"id\":\"6021358043091\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMjA2MTQyMjY5MQZDZD\",\"after\":\"NjAyMTM1ODA0MzA5MQZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjAyMjA2MTQyMjY5MQZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMjcwMzg0NTI5MQZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0MDA4MDc4NzQ5MQZDZD",
 :as :json}
(fn [req]{:request-time 487,
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
  "1Ma23zE5vjtJjMM/dzkxevUH60c742Xl+HJ3FzTZvCN3oR2ob2Wi90ucrzH0fFpjB5y0GxuzErcj4CgUwQ4dUw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"b2bc2fd06cee5ac71fb879456bf74d1d186b665f\"",
  "x-fb-trace-id" "HFsxEljoW5u",
  "Date" "Sat, 15 Apr 2017 14:47:12 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6040080787291\"},{\"id\":\"6038584660491\"},{\"id\":\"6038584660291\"},{\"id\":\"6036015877691\"},{\"id\":\"6036015877491\"},{\"id\":\"6033247058891\"},{\"id\":\"6033247058691\"},{\"id\":\"6030987390091\"},{\"id\":\"6030987180891\"},{\"id\":\"6029847645491\"},{\"id\":\"6029847645091\"},{\"id\":\"6028435214091\"},{\"id\":\"6028435026491\"},{\"id\":\"6027316298291\"},{\"id\":\"6027316298091\"},{\"id\":\"6026456340691\"},{\"id\":\"6026456340291\"},{\"id\":\"6024913957091\"},{\"id\":\"6024912977291\"},{\"id\":\"6023897973491\"},{\"id\":\"6023897973091\"},{\"id\":\"6023226201691\"},{\"id\":\"6023226201491\"},{\"id\":\"6022703845491\"},{\"id\":\"6022703845291\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0MDA4MDc4NzI5MQZDZD\",\"after\":\"NjAyMjcwMzg0NTI5MQZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjAyMjcwMzg0NTI5MQZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&before=NjA0MDA4MDc4NzI5MQZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0MDA4MDc4NzQ5MQZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/campaigns",
 :as :json,
 :query-params
 {:path "campaigns",
  :fields
  "insights.time_range({'since':'2017-04-01','until':'2017-04-06'}).action_breakdowns(action_type).time_increment(1){account_id,account_name,campaign_id,campaign_name,actions}",
  :ids "act_10152562141153995,act_10152437784203995",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:request-time 1390,
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
  "N6S3oDFg6vW9/WkGbxHyRMBzIxMdnaVNmoTCn1bVuk2odLCugJgmbwwlRNf0hQGyGazlqg1nNYkePpJCsNqCWA==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"ced103496c3869d66c1f7f990df4ddea466ce067\"",
  "x-fb-trace-id" "C20Ixv3I9hn",
  "Date" "Sat, 15 Apr 2017 14:47:11 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"act_10152562141153995\":{\"data\":[{\"insights\":{\"data\":[{\"account_id\":\"10152562141153995\",\"account_name\":\"k8FEa\",\"campaign_id\":\"6064029033691\",\"campaign_name\":\"rdvGN\",\"actions\":[{\"action_type\":\"like\",\"value\":\"3\"},{\"action_type\":\"link_click\",\"value\":\"163\"},{\"action_type\":\"offsite_conversion.registration\",\"value\":\"5\"},{\"action_type\":\"post_reaction\",\"value\":\"14\"},{\"action_type\":\"page_engagement\",\"value\":\"180\"},{\"action_type\":\"post_engagement\",\"value\":\"177\"},{\"action_type\":\"offsite_conversion\",\"value\":\"5\"}],\"date_start\":\"2017-04-01\",\"date_stop\":\"2017-04-01\"},{\"account_id\":\"10152562141153995\",\"account_name\":\"tGGfQ\",\"campaign_id\":\"6064029033691\",\"campaign_name\":\"KjDHC\",\"actions\":[{\"action_type\":\"comment\",\"value\":\"2\"},{\"action_type\":\"offsite_conversion.custom.270601453373563\",\"value\":\"7\"},{\"action_type\":\"like\",\"value\":\"9\"},{\"action_type\":\"link_click\",\"value\":\"304\"},{\"action_type\":\"offsite_conversion.fb_pixel_lead\",\"value\":\"7\"},{\"action_type\":\"offsite_conversion.registration\",\"value\":\"3\"},{\"action_type\":\"post\",\"value\":\"3\"},{\"action_type\":\"post_reaction\",\"value\":\"22\"},{\"action_type\":\"page_engagement\",\"value\":\"340\"},{\"action_type\":\"post_engagement\",\"value\":\"331\"},{\"action_type\":\"offsite_conversion\",\"value\":\"17\"}],\"date_start\":\"2017-04-02\",\"date_stop\":\"2017-04-02\"},{\"account_id\":\"10152562141153995\",\"account_name\":\"gYZOa\",\"campaign_id\":\"6064029033691\",\"campaign_name\":\"qSxsR\",\"actions\":[{\"action_type\":\"offsite_conversion.custom.270601453373563\",\"value\":\"5\"},{\"action_type\":\"like\",\"value\":\"3\"},{\"action_type\":\"link_click\",\"value\":\"214\"},{\"action_type\":\"offsite_conversion.fb_pixel_lead\",\"value\":\"5\"},{\"action_type\":\"offsite_conversion.registration\",\"value\":\"4\"},{\"action_type\":\"post_reaction\",\"value\":\"8\"},{\"action_type\":\"page_engagement\",\"value\":\"225\"},{\"action_type\":\"post_engagement\",\"value\":\"222\"},{\"action_type\":\"offsite_conversion\",\"value\":\"14\"}],\"date_start\":\"2017-04-03\",\"date_stop\":\"2017-04-03\"},{\"account_id\":\"10152562141153995\",\"account_name\":\"IZ3fL\",\"campaign_id\":\"6064029033691\",\"campaign_name\":\"ngueB\",\"actions\":[{\"action_type\":\"offsite_conversion.custom.270601453373563\",\"value\":\"7\"},{\"action_type\":\"like\",\"value\":\"6\"},{\"action_type\":\"link_click\",\"value\":\"225\"},{\"action_type\":\"offsite_conversion.fb_pixel_lead\",\"value\":\"7\"},{\"action_type\":\"offsite_conversion.registration\",\"value\":\"9\"},{\"action_type\":\"post\",\"value\":\"2\"},{\"action_type\":\"post_reaction\",\"value\":\"6\"},{\"action_type\":\"page_engagement\",\"value\":\"239\"},{\"action_type\":\"post_engagement\",\"value\":\"233\"},{\"action_type\":\"offsite_conversion\",\"value\":\"23\"}],\"date_start\":\"2017-04-04\",\"date_stop\":\"2017-04-04\"},{\"account_id\":\"10152562141153995\",\"account_name\":\"jiUZw\",\"campaign_id\":\"6064029033691\",\"campaign_name\":\"ZWXWc\",\"actions\":[{\"action_type\":\"offsite_conversion.custom.270601453373563\",\"value\":\"2\"},{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"232\"},{\"action_type\":\"offsite_conversion.fb_pixel_lead\",\"value\":\"2\"},{\"action_type\":\"offsite_conversion.registration\",\"value\":\"10\"},{\"action_type\":\"post\",\"value\":\"2\"},{\"action_type\":\"post_reaction\",\"value\":\"8\"},{\"action_type\":\"page_engagement\",\"value\":\"243\"},{\"action_type\":\"post_engagement\",\"value\":\"242\"},{\"action_type\":\"offsite_conversion\",\"value\":\"14\"}],\"date_start\":\"2017-04-05\",\"date_stop\":\"2017-04-05\"},{\"account_id\":\"10152562141153995\",\"account_name\":\"G3eHL\",\"campaign_id\":\"6064029033691\",\"campaign_name\":\"GmLgV\",\"actions\":[{\"action_type\":\"offsite_conversion.custom.270601453373563\",\"value\":\"1\"},{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"252\"},{\"action_type\":\"offsite_conversion.fb_pixel_lead\",\"value\":\"1\"},{\"action_type\":\"offsite_conversion.registration\",\"value\":\"7\"},{\"action_type\":\"post_reaction\",\"value\":\"12\"},{\"action_type\":\"page_engagement\",\"value\":\"265\"},{\"action_type\":\"post_engagement\",\"value\":\"264\"},{\"action_type\":\"offsite_conversion\",\"value\":\"9\"}],\"date_start\":\"2017-04-06\",\"date_stop\":\"2017-04-06\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"NQZDZD\"}}},\"id\":\"6064029033691\"},{\"id\":\"6062362317291\"},{\"id\":\"6061135790891\"},{\"id\":\"6060853608091\"},{\"id\":\"6059433582691\"},{\"id\":\"6059433582291\"},{\"id\":\"6057598024691\"},{\"id\":\"6057529087491\"},{\"id\":\"6054030251891\"},{\"id\":\"6054030251691\"},{\"id\":\"6052269660491\"},{\"id\":\"6052269659691\"},{\"id\":\"6050373553091\"},{\"id\":\"6050373552891\"},{\"id\":\"6048599743691\"},{\"id\":\"6048599743491\"},{\"id\":\"6046869215491\"},{\"id\":\"6046869215291\"},{\"id\":\"6045105640291\"},{\"id\":\"6045105640091\"},{\"id\":\"6043050813291\"},{\"id\":\"6043050813091\"},{\"id\":\"6041314496091\"},{\"id\":\"6041314495891\"},{\"id\":\"6040080787491\"}],\"paging\":{\"cursors\":{\"before\":\"NjA2NDAyOTAzMzY5MQZDZD\",\"after\":\"NjA0MDA4MDc4NzQ5MQZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA0MDA4MDc4NzQ5MQZDZD\"}},\"act_10152437784203995\":{\"data\":[{\"id\":\"6065546046870\"},{\"id\":\"6064534431070\"},{\"id\":\"6064532436470\"},{\"insights\":{\"data\":[{\"account_id\":\"10152437784203995\",\"account_name\":\"EQkkF\",\"campaign_id\":\"6064431745270\",\"campaign_name\":\"iBSZj\",\"actions\":[{\"action_type\":\"like\",\"value\":\"5\"},{\"action_type\":\"link_click\",\"value\":\"202\"},{\"action_type\":\"post_reaction\",\"value\":\"1\"},{\"action_type\":\"page_engagement\",\"value\":\"208\"},{\"action_type\":\"post_engagement\",\"value\":\"203\"}],\"date_start\":\"2017-04-01\",\"date_stop\":\"2017-04-01\"},{\"account_id\":\"10152437784203995\",\"account_name\":\"uNzgw\",\"campaign_id\":\"6064431745270\",\"campaign_name\":\"dVz51\",\"actions\":[{\"action_type\":\"comment\",\"value\":\"1\"},{\"action_type\":\"like\",\"value\":\"2\"},{\"action_type\":\"link_click\",\"value\":\"216\"},{\"action_type\":\"post_reaction\",\"value\":\"2\"},{\"action_type\":\"page_engagement\",\"value\":\"221\"},{\"action_type\":\"post_engagement\",\"value\":\"219\"}],\"date_start\":\"2017-04-02\",\"date_stop\":\"2017-04-02\"},{\"account_id\":\"10152437784203995\",\"account_name\":\"zX8pk\",\"campaign_id\":\"6064431745270\",\"campaign_name\":\"ygETj\",\"actions\":[{\"action_type\":\"comment\",\"value\":\"2\"},{\"action_type\":\"link_click\",\"value\":\"213\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_type\":\"post_reaction\",\"value\":\"7\"},{\"action_type\":\"page_engagement\",\"value\":\"223\"},{\"action_type\":\"post_engagement\",\"value\":\"223\"}],\"date_start\":\"2017-04-03\",\"date_stop\":\"2017-04-03\"},{\"account_id\":\"10152437784203995\",\"account_name\":\"dcZK4\",\"campaign_id\":\"6064431745270\",\"campaign_name\":\"jT6GV\",\"actions\":[{\"action_type\":\"like\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"213\"},{\"action_type\":\"post_reaction\",\"value\":\"4\"},{\"action_type\":\"page_engagement\",\"value\":\"218\"},{\"action_type\":\"post_engagement\",\"value\":\"217\"}],\"date_start\":\"2017-04-04\",\"date_stop\":\"2017-04-04\"},{\"account_id\":\"10152437784203995\",\"account_name\":\"ZHmGE\",\"campaign_id\":\"6064431745270\",\"campaign_name\":\"OowfN\",\"actions\":[{\"action_type\":\"comment\",\"value\":\"2\"},{\"action_type\":\"like\",\"value\":\"2\"},{\"action_type\":\"link_click\",\"value\":\"196\"},{\"action_type\":\"post_reaction\",\"value\":\"4\"},{\"action_type\":\"page_engagement\",\"value\":\"204\"},{\"action_type\":\"post_engagement\",\"value\":\"202\"}],\"date_start\":\"2017-04-05\",\"date_stop\":\"2017-04-05\"},{\"account_id\":\"10152437784203995\",\"account_name\":\"f0DN3\",\"campaign_id\":\"6064431745270\",\"campaign_name\":\"BmZU5\",\"actions\":[{\"action_type\":\"like\",\"value\":\"4\"},{\"action_type\":\"link_click\",\"value\":\"195\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_type\":\"post_reaction\",\"value\":\"1\"},{\"action_type\":\"page_engagement\",\"value\":\"201\"},{\"action_type\":\"post_engagement\",\"value\":\"197\"}],\"date_start\":\"2017-04-06\",\"date_stop\":\"2017-04-06\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"NQZDZD\"}}},\"id\":\"6064431745270\"},{\"id\":\"6063345207270\"},{\"id\":\"6063304977870\"},{\"id\":\"6062984300870\"},{\"id\":\"6062511159270\"},{\"id\":\"6058727884070\"},{\"id\":\"6058582351470\"},{\"id\":\"6058442622270\"},{\"id\":\"6057691860670\"},{\"id\":\"6056334638670\"},{\"id\":\"6056278906470\"},{\"id\":\"6056276209070\"},{\"id\":\"6056083058270\"},{\"id\":\"6056082641870\"},{\"id\":\"6055927657670\"},{\"id\":\"6055518600270\"},{\"id\":\"6055518574070\"},{\"id\":\"6055383466070\"},{\"id\":\"6055319065470\"},{\"id\":\"6055103761870\"},{\"id\":\"6054977645870\"},{\"id\":\"6054976892670\"}],\"paging\":{\"cursors\":{\"before\":\"NjA2NTU0NjA0Njg3MAZDZD\",\"after\":\"NjA1NDk3Njg5MjY3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.time_range%28%7B%27since%27%3A%272017-04-01%27%2C%27until%27%3A%272017-04-06%27%7D%29.action_breakdowns%28action_type%29.time_increment%281%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cactions%7D&since&until&limit=25&after=NjA1NDk3Njg5MjY3MAZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/campaigns"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAyMDkxNjUyNjY3MAZDZD",
 :as :json}
(fn [req]{:request-time 612,
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
  "a1wPho3A0WnVWlTZ23vvH3unQIclBiXO1eFWNnuSFGVRof34c1vtFxRLmsIkYn2B08CS0LnKaU6+ZXH2EAArcQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"28e2f6d13962758a44ec0e8d177c10d6511a1cb0\"",
  "x-fb-trace-id" "Cn3/RkT5IWG",
  "Date" "Sat, 15 Apr 2017 14:47:10 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6020663864070\"},{\"id\":\"6020590268670\"},{\"id\":\"6020470065070\"},{\"id\":\"6020469208070\"},{\"id\":\"6020416026470\"},{\"id\":\"6020411414470\"},{\"id\":\"6019681080270\"},{\"id\":\"6019644104070\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMDY2Mzg2NDA3MAZDZD\",\"after\":\"NjAxOTY0NDEwNDA3MAZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&before=NjAyMDY2Mzg2NDA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAyMDkxNjUyNjY3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAyNzE3MDI0MDQ3MAZDZD",
 :as :json}
(fn [req]{:request-time 904,
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
  "H0hm3X6r0uzVQp1AyVXKx4XWhrTKW1sZtIQYqzKvsvhEEJeOU8cUnB3LDklY0iIEJwc9/iGwK7w9V06reiSuGg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"8ee56c2a0e39fb0d5b38f2f56acf6d51691625a9\"",
  "x-fb-trace-id" "BiDPwP4rT2l",
  "Date" "Sat, 15 Apr 2017 14:47:09 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6026798951070\"},{\"id\":\"6026567452670\"},{\"id\":\"6026542970670\"},{\"id\":\"6026542970270\"},{\"id\":\"6026542970070\"},{\"id\":\"6026392074870\"},{\"id\":\"6026011237870\"},{\"id\":\"6025695642470\"},{\"id\":\"6025687679470\"},{\"id\":\"6025591979870\"},{\"id\":\"6025562944470\"},{\"id\":\"6025560438470\"},{\"id\":\"6025560438270\"},{\"id\":\"6024565463270\"},{\"id\":\"6023187817470\"},{\"id\":\"6023044208270\"},{\"id\":\"6022819846270\"},{\"id\":\"6022818793470\"},{\"id\":\"6022738122670\"},{\"id\":\"6022421550870\"},{\"id\":\"6022120952670\"},{\"id\":\"6021919243270\"},{\"id\":\"6021754733070\"},{\"id\":\"6020917424270\"},{\"id\":\"6020916526670\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyNjc5ODk1MTA3MAZDZD\",\"after\":\"NjAyMDkxNjUyNjY3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAyMDkxNjUyNjY3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&before=NjAyNjc5ODk1MTA3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAyNzE3MDI0MDQ3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAzNTU2MTczNjI3MAZDZD",
 :as :json}
(fn [req]{:request-time 428,
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
  "MhxJdX0sloH72TfUFJsCN6S1Vu1CuVDrSde8+ET9+7czyIAmlz8GIT7gBAiOeAZBR6bBpfr5LpACGUM32KGkeg==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"25e658dd8a186651d31141c1586c25766d92376e\"",
  "x-fb-trace-id" "Ce2HI0kpzjI",
  "Date" "Sat, 15 Apr 2017 14:47:08 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6035560883270\"},{\"id\":\"6034785536270\"},{\"id\":\"6034265603470\"},{\"id\":\"6034264589670\"},{\"id\":\"6032861605270\"},{\"id\":\"6032749476870\"},{\"id\":\"6032749083470\"},{\"id\":\"6032111463870\"},{\"id\":\"6031717809670\"},{\"id\":\"6031491138270\"},{\"id\":\"6031490818470\"},{\"id\":\"6031489843470\"},{\"id\":\"6030606674870\"},{\"id\":\"6030029668070\"},{\"id\":\"6029842967270\"},{\"id\":\"6029750174870\"},{\"id\":\"6029341869270\"},{\"id\":\"6029058309270\"},{\"id\":\"6028994834670\"},{\"id\":\"6028356677270\"},{\"id\":\"6028346486870\"},{\"id\":\"6028270919670\"},{\"id\":\"6027882130070\"},{\"id\":\"6027570733670\"},{\"id\":\"6027170240470\"}],\"paging\":{\"cursors\":{\"before\":\"NjAzNTU2MDg4MzI3MAZDZD\",\"after\":\"NjAyNzE3MDI0MDQ3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAyNzE3MDI0MDQ3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&before=NjAzNTU2MDg4MzI3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAzNTU2MTczNjI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0NDQ0MTQ0MjQ3MAZDZD",
 :as :json}
(fn [req]{:request-time 503,
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
  "x7IUdB4XPZ5n3SGvJtF+gIAIf2VVHFSZv6Wa9PmDu9iTPz/xqz/6izlbZ7208+kKdVnfFqxku4KeCXLP/DArlQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"ce43fdba0cd07e0a119866994766ec071b4aedb0\"",
  "x-fb-trace-id" "D9QD15cRDOV",
  "Date" "Sat, 15 Apr 2017 14:47:08 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6044438044870\"},{\"id\":\"6044356472870\"},{\"id\":\"6044354569870\"},{\"id\":\"6044285810470\"},{\"id\":\"6044125274470\"},{\"id\":\"6044004779270\"},{\"id\":\"6043918161870\"},{\"id\":\"6043742649270\"},{\"id\":\"6043633602670\"},{\"id\":\"6043374806070\"},{\"id\":\"6042985120870\"},{\"id\":\"6042976332870\"},{\"id\":\"6042973616070\"},{\"id\":\"6042906710270\"},{\"id\":\"6042138678870\"},{\"id\":\"6042063797070\"},{\"id\":\"6041830861470\"},{\"id\":\"6041002071870\"},{\"id\":\"6040759465870\"},{\"id\":\"6040021891070\"},{\"id\":\"6039831650670\"},{\"id\":\"6038701396470\"},{\"id\":\"6038388592270\"},{\"id\":\"6035594872670\"},{\"id\":\"6035561736270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NDQzODA0NDg3MAZDZD\",\"after\":\"NjAzNTU2MTczNjI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAzNTU2MTczNjI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&before=NjA0NDQzODA0NDg3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0NDQ0MTQ0MjQ3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0Njg0NTg3MDI3MAZDZD",
 :as :json}
(fn [req]{:request-time 612,
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
  "Zu5mNdJvTv9i1Syafr4YYBzf5vmnSs/4U98T5gXEQfMRe9KS0YOtmgB8JQb8n5ulFP03snNoDrw9fsMsUYdfuQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"db960b284e89a659591621dc00f0b2c5be101d34\"",
  "x-fb-trace-id" "CaiG70Ao03d",
  "Date" "Sat, 15 Apr 2017 14:47:07 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6046839574670\"},{\"id\":\"6046826881670\"},{\"id\":\"6046758110470\"},{\"id\":\"6046742077270\"},{\"id\":\"6046739319070\"},{\"id\":\"6046557726070\"},{\"id\":\"6046313822470\"},{\"id\":\"6046072317270\"},{\"id\":\"6045767050470\"},{\"id\":\"6045748996670\"},{\"id\":\"6045681095470\"},{\"id\":\"6045680477270\"},{\"id\":\"6045679590270\"},{\"id\":\"6045675780870\"},{\"id\":\"6045211083870\"},{\"id\":\"6045135612470\"},{\"id\":\"6045058522470\"},{\"id\":\"6045056840070\"},{\"id\":\"6044901291270\"},{\"id\":\"6044802438470\"},{\"id\":\"6044801305070\"},{\"id\":\"6044647763270\"},{\"id\":\"6044647679270\"},{\"id\":\"6044442014070\"},{\"id\":\"6044441442470\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0NjgzOTU3NDY3MAZDZD\",\"after\":\"NjA0NDQ0MTQ0MjQ3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0NDQ0MTQ0MjQ3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&before=NjA0NjgzOTU3NDY3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0Njg0NTg3MDI3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0OTY3MjU5OTA3MAZDZD",
 :as :json}
(fn [req]{:request-time 611,
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
  "oUy22++r7deGPL8SafZxUejV6a5JjoZ5OAjp4/P3IZw1TEJqlBA+SAtA8sNBnapbnDyaEfXDhrGkZE8/tb0GOw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"a3c6a3c685d9ec54da1ce6b882879d8a0ae51440\"",
  "x-fb-trace-id" "FP78o7IIzEI",
  "Date" "Sat, 15 Apr 2017 14:47:07 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6049664623270\"},{\"id\":\"6049541694670\"},{\"id\":\"6049477071070\"},{\"id\":\"6049477055470\"},{\"id\":\"6049242019670\"},{\"id\":\"6049022368270\"},{\"id\":\"6048947178270\"},{\"id\":\"6048780289870\"},{\"id\":\"6048770169470\"},{\"id\":\"6048738596870\"},{\"id\":\"6048736766070\"},{\"id\":\"6048676993470\"},{\"id\":\"6048570034270\"},{\"id\":\"6048275369870\"},{\"id\":\"6048273191270\"},{\"id\":\"6047396558670\"},{\"id\":\"6047307283670\"},{\"id\":\"6047306634870\"},{\"id\":\"6047081632270\"},{\"id\":\"6047063290470\"},{\"id\":\"6047042026070\"},{\"id\":\"6046855206270\"},{\"id\":\"6046854391470\"},{\"id\":\"6046849858470\"},{\"id\":\"6046845870270\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0OTY2NDYyMzI3MAZDZD\",\"after\":\"NjA0Njg0NTg3MDI3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0Njg0NTg3MDI3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&before=NjA0OTY2NDYyMzI3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0OTY3MjU5OTA3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA1NDk3Njg5MjY3MAZDZD",
 :as :json}
(fn [req]{:request-time 504,
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
  "5Vyv6owMwf8ARIeDOa1AEObOGncWvLU0JszIqx7kOVpN0bAogYTMxiIZIExJhDjw2YzAtEge/hGrQDwzjA0Kuw==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"299d6d7b1c31729fc8ba259062e2664e39008069\"",
  "x-fb-trace-id" "C1fCfsxmg3x",
  "Date" "Sat, 15 Apr 2017 14:47:06 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6054824761470\"},{\"id\":\"6054543737270\"},{\"id\":\"6054420781470\"},{\"id\":\"6054416868470\"},{\"id\":\"6054156231270\"},{\"id\":\"6054100441670\"},{\"id\":\"6054021363670\"},{\"id\":\"6053526258870\"},{\"id\":\"6053503508270\"},{\"id\":\"6053440027070\"},{\"id\":\"6053438440070\"},{\"id\":\"6052346706870\"},{\"id\":\"6052284860670\"},{\"id\":\"6051389683270\"},{\"id\":\"6051325162670\"},{\"id\":\"6051274943470\"},{\"id\":\"6051273672470\"},{\"id\":\"6051207170470\"},{\"id\":\"6051206502470\"},{\"id\":\"6050849364870\"},{\"id\":\"6050791810470\"},{\"id\":\"6050387155470\"},{\"id\":\"6050185887270\"},{\"id\":\"6050020410270\"},{\"id\":\"6049672599070\"}],\"paging\":{\"cursors\":{\"before\":\"NjA1NDgyNDc2MTQ3MAZDZD\",\"after\":\"NjA0OTY3MjU5OTA3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0OTY3MjU5OTA3MAZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&before=NjA1NDgyNDc2MTQ3MAZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA1NDk3Njg5MjY3MAZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAyMjcwMzg0NTI5MQZDZD",
 :as :json}
(fn [req]{:request-time 408,
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
  "dHcj8wL/qiD9BiH4TT/th2V/ojniFoXelGTWWGmTX5yO1axSorDZwa7OeIU9UE/MiA6pRvKQQvPuwKx9krc6MQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"42c20df312feb810a7ad08813cf2ad60d1f9fad6\"",
  "x-fb-trace-id" "BmG4/Q0IcMx",
  "Date" "Sat, 15 Apr 2017 14:47:06 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6022061422691\"},{\"id\":\"6022061422491\"},{\"id\":\"6021366361491\"},{\"id\":\"6021358043091\"}],\"paging\":{\"cursors\":{\"before\":\"NjAyMjA2MTQyMjY5MQZDZD\",\"after\":\"NjAyMTM1ODA0MzA5MQZDZD\"},\"previous\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&before=NjAyMjA2MTQyMjY5MQZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAyMjcwMzg0NTI5MQZDZD"]}
){:method :get,
 :address
 "https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0MDA4MDc4NzQ5MQZDZD",
 :as :json}
(fn [req]{:request-time 870,
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
  "blu3IYMdgv15+rKm8dOo5ylBD9Y7zu2SH4G1LYefd6Wj4Yt5YW0LIsVlhwr+yeUVQwfKKbuSWT1/wfiCmlwd/w==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"8539de21c51bc08d6d168e1112a8bc2f2ca69aca\"",
  "x-fb-trace-id" "AQDJvc8+sU+",
  "Date" "Sat, 15 Apr 2017 14:47:05 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"data\":[{\"id\":\"6040080787291\"},{\"id\":\"6038584660491\"},{\"id\":\"6038584660291\"},{\"id\":\"6036015877691\"},{\"id\":\"6036015877491\"},{\"id\":\"6033247058891\"},{\"id\":\"6033247058691\"},{\"id\":\"6030987390091\"},{\"id\":\"6030987180891\"},{\"id\":\"6029847645491\"},{\"id\":\"6029847645091\"},{\"id\":\"6028435214091\"},{\"id\":\"6028435026491\"},{\"id\":\"6027316298291\"},{\"id\":\"6027316298091\"},{\"id\":\"6026456340691\"},{\"id\":\"6026456340291\"},{\"id\":\"6024913957091\"},{\"id\":\"6024912977291\"},{\"id\":\"6023897973491\"},{\"id\":\"6023897973091\"},{\"id\":\"6023226201691\"},{\"id\":\"6023226201491\"},{\"id\":\"6022703845491\"},{\"id\":\"6022703845291\"}],\"paging\":{\"cursors\":{\"before\":\"NjA0MDA4MDc4NzI5MQZDZD\",\"after\":\"NjAyMjcwMzg0NTI5MQZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjAyMjcwMzg0NTI5MQZDZD\",\"previous\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&before=NjA0MDA4MDc4NzI5MQZDZD\"}}",
 :trace-redirects
 ["https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0MDA4MDc4NzQ5MQZDZD"]}
){:method :get,
 :address "https://graph.facebook.com/v2.8/campaigns",
 :as :json,
 :query-params
 {:path "campaigns",
  :fields
  "insights.action_breakdowns(action_reaction).date_preset(last_28_days){account_id,account_name,campaign_id,campaign_name,impressions,clicks,spend,reach} ",
  :ids "act_10152562141153995,act_10152437784203995",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:request-time 1651,
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
  "JrQR83/A78eNgZ5p+5B4c5wvoNN7X2eWtODF6hAe6wdRIdnr8Ip8+9DgfuVTOaj6WLxyNriVZ7Z6kdXUozvVSQ==",
  "facebook-api-version" "v2.8",
  "Connection" "close",
  "Pragma" "no-cache",
  "Expires" "Sat, 01 Jan 2000 00:00:00 GMT",
  "x-fb-rev" "2961016",
  "ETag" "\"7305cd31477a4c10f3f2fda608bf89e02c50cfa2\"",
  "x-fb-trace-id" "CtatfYGDYW+",
  "Date" "Sat, 15 Apr 2017 14:47:04 GMT",
  "Vary" "Accept-Encoding",
  "Cache-Control" "private, no-cache, no-store, must-revalidate"},
 :orig-content-encoding nil,
 :status 200,
 :length -1,
 :body
 "{\"act_10152562141153995\":{\"data\":[{\"insights\":{\"data\":[{\"campaign_name\":\"HIEuW\",\"impressions\":\"467265\",\"campaign_id\":\"6064029033691\",\"account_id\":\"10152562141153995\",\"clicks\":\"4920\",\"reach\":\"123719\",\"spend\":\"879.31\",\"date_start\":\"2017-03-19\",\"account_name\":\"i6S6N\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MAZDZD\"}}},\"id\":\"6064029033691\"},{\"insights\":{\"data\":[{\"campaign_name\":\"2Zgkh\",\"impressions\":\"447348\",\"campaign_id\":\"6062362317291\",\"account_id\":\"10152562141153995\",\"clicks\":\"4087\",\"reach\":\"112503\",\"spend\":\"827.03\",\"date_start\":\"2017-03-19\",\"account_name\":\"g7OUy\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MAZDZD\"}}},\"id\":\"6062362317291\"},{\"id\":\"6061135790891\"},{\"id\":\"6060853608091\"},{\"id\":\"6059433582691\"},{\"id\":\"6059433582291\"},{\"id\":\"6057598024691\"},{\"id\":\"6057529087491\"},{\"id\":\"6054030251891\"},{\"id\":\"6054030251691\"},{\"id\":\"6052269660491\"},{\"id\":\"6052269659691\"},{\"id\":\"6050373553091\"},{\"id\":\"6050373552891\"},{\"id\":\"6048599743691\"},{\"id\":\"6048599743491\"},{\"id\":\"6046869215491\"},{\"id\":\"6046869215291\"},{\"id\":\"6045105640291\"},{\"id\":\"6045105640091\"},{\"id\":\"6043050813291\"},{\"id\":\"6043050813091\"},{\"id\":\"6041314496091\"},{\"id\":\"6041314495891\"},{\"id\":\"6040080787491\"}],\"paging\":{\"cursors\":{\"before\":\"NjA2NDAyOTAzMzY5MQZDZD\",\"after\":\"NjA0MDA4MDc4NzQ5MQZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152562141153995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA0MDA4MDc4NzQ5MQZDZD\"}},\"act_10152437784203995\":{\"data\":[{\"insights\":{\"data\":[{\"campaign_name\":\"SDwW5\",\"impressions\":\"321945\",\"campaign_id\":\"6065546046870\",\"account_id\":\"10152437784203995\",\"clicks\":\"1398\",\"reach\":\"187161\",\"spend\":\"508.17\",\"date_start\":\"2017-03-19\",\"account_name\":\"upz9b\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MAZDZD\"}}},\"id\":\"6065546046870\"},{\"insights\":{\"data\":[{\"campaign_name\":\"cC8uy\",\"impressions\":\"505232\",\"campaign_id\":\"6064534431070\",\"account_id\":\"10152437784203995\",\"clicks\":\"6120\",\"reach\":\"244700\",\"spend\":\"1970.33\",\"date_start\":\"2017-03-19\",\"account_name\":\"zUaNF\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MAZDZD\"}}},\"id\":\"6064534431070\"},{\"insights\":{\"data\":[{\"campaign_name\":\"fDNXM\",\"impressions\":\"432453\",\"campaign_id\":\"6064532436470\",\"account_id\":\"10152437784203995\",\"clicks\":\"5096\",\"reach\":\"249675\",\"spend\":\"1522.89\",\"date_start\":\"2017-03-19\",\"account_name\":\"vgCIU\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MAZDZD\"}}},\"id\":\"6064532436470\"},{\"insights\":{\"data\":[{\"campaign_name\":\"gN3cD\",\"impressions\":\"160542\",\"campaign_id\":\"6064431745270\",\"account_id\":\"10152437784203995\",\"clicks\":\"4779\",\"reach\":\"94987\",\"spend\":\"649.29\",\"date_start\":\"2017-03-19\",\"account_name\":\"JWRXU\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MAZDZD\"}}},\"id\":\"6064431745270\"},{\"id\":\"6063345207270\"},{\"id\":\"6063304977870\"},{\"id\":\"6062984300870\"},{\"insights\":{\"data\":[{\"campaign_name\":\"OMx6V\",\"impressions\":\"609861\",\"campaign_id\":\"6062511159270\",\"account_id\":\"10152437784203995\",\"clicks\":\"13573\",\"reach\":\"214091\",\"spend\":\"634.78\",\"date_start\":\"2017-03-19\",\"account_name\":\"7JMKJ\",\"date_stop\":\"2017-04-15\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MAZDZD\"}}},\"id\":\"6062511159270\"},{\"id\":\"6058727884070\"},{\"id\":\"6058582351470\"},{\"id\":\"6058442622270\"},{\"id\":\"6057691860670\"},{\"id\":\"6056334638670\"},{\"id\":\"6056278906470\"},{\"id\":\"6056276209070\"},{\"id\":\"6056083058270\"},{\"id\":\"6056082641870\"},{\"id\":\"6055927657670\"},{\"id\":\"6055518600270\"},{\"id\":\"6055518574070\"},{\"id\":\"6055383466070\"},{\"id\":\"6055319065470\"},{\"id\":\"6055103761870\"},{\"id\":\"6054977645870\"},{\"id\":\"6054976892670\"}],\"paging\":{\"cursors\":{\"before\":\"NjA2NTU0NjA0Njg3MAZDZD\",\"after\":\"NjA1NDk3Njg5MjY3MAZDZD\"},\"next\":\"https://graph.facebook.com/v2.8/act_10152437784203995/campaigns?access_token=XXTOKENXX&fields=insights.action_breakdowns%28action_reaction%29.date_preset%28last_28_days%29%7Baccount_id%2Caccount_name%2Ccampaign_id%2Ccampaign_name%2Cimpressions%2Cclicks%2Cspend%2Creach%7D+&since&until&limit=25&after=NjA1NDk3Njg5MjY3MAZDZD\"}}}",
 :trace-redirects ["https://graph.facebook.com/v2.8/campaigns"]}
)
})