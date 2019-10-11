(ns keboola.snapshots.runbyid.apicalls)
(def recorded 
{
{:method :get,
 :address "https://graph.facebook.com/v4.0/",
 :as :json,
 :query-params
 {:path "",
  :fields
  "insights.time_range({\"since\":\"2019-09-29\",\"until\":\"2019-09-30\"}).level(ad).time_increment(1){account_id,account_name,ad_name,ad_id,impressions}",
  :ids "act_1146726535372240",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:status 200,
 :body
 "{\"act_1146726535372240\":{\"insights\":{\"data\":[{\"account_id\":\"1146726535372240\",\"account_name\":\"Rn4f8\",\"ad_name\":\"p84kw\",\"ad_id\":\"6164363071480\",\"impressions\":\"hLbV2\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"bepJ8\",\"ad_name\":\"WKjha\",\"ad_id\":\"6164363071680\",\"impressions\":\"pHulH\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"xTlvB\",\"ad_name\":\"5xRHT\",\"ad_id\":\"6164363072080\",\"impressions\":\"loLpz\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"oUxmM\",\"ad_name\":\"3VhKN\",\"ad_id\":\"6164363072280\",\"impressions\":\"cMF7L\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"qEb8h\",\"ad_name\":\"UyTj0\",\"ad_id\":\"6164363072880\",\"impressions\":\"Mh4jx\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"RiDsp\",\"ad_name\":\"k3L8Z\",\"ad_id\":\"6164363073280\",\"impressions\":\"i6URx\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"3gaaK\",\"ad_name\":\"7SbGa\",\"ad_id\":\"6164363071480\",\"impressions\":\"lQ5Cp\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"eJNaw\",\"ad_name\":\"5M1Bg\",\"ad_id\":\"6164363071680\",\"impressions\":\"Mx0hJ\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"KLzUd\",\"ad_name\":\"RLycB\",\"ad_id\":\"6164363072080\",\"impressions\":\"03zWv\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"bVMN4\",\"ad_name\":\"4hyrr\",\"ad_id\":\"6164363072280\",\"impressions\":\"mYTK4\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"Dyzf7\",\"ad_name\":\"I8lef\",\"ad_id\":\"6164363072880\",\"impressions\":\"RBPma\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"},{\"account_id\":\"1146726535372240\",\"account_name\":\"viIso\",\"ad_name\":\"rqbRY\",\"ad_id\":\"6164363073280\",\"impressions\":\"RhNJN\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MTEZD\"}}},\"id\":\"act_1146726535372240\"}}"}
){:method :get,
 :address "https://graph.facebook.com/v4.0/",
 :as :json,
 :query-params
 {:path "",
  :fields
  "insights.time_range({\"since\":\"2019-09-29\",\"until\":\"2019-09-30\"}).level(ad).time_increment(1){account_id,account_name,ad_name,ad_id,impressions}",
  :ids "act_108176966036258",
  :access_token "XXTOKENXX",
  :since "",
  :until ""}}
(fn [req]{:status 200,
 :body
 "{\"act_108176966036258\":{\"insights\":{\"data\":[{\"account_id\":\"108176966036258\",\"account_name\":\"9OJDi\",\"ad_name\":\"cJ2fD\",\"ad_id\":\"6134702917855\",\"impressions\":\"801nU\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"108176966036258\",\"account_name\":\"QTiTQ\",\"ad_name\":\"Oq3jX\",\"ad_id\":\"6134760720255\",\"impressions\":\"Yp7Wh\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"108176966036258\",\"account_name\":\"ejkr5\",\"ad_name\":\"9Oh5V\",\"ad_id\":\"6134760720655\",\"impressions\":\"5UmnU\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"108176966036258\",\"account_name\":\"GCygF\",\"ad_name\":\"j7oPW\",\"ad_id\":\"6134760721055\",\"impressions\":\"k1Ila\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"108176966036258\",\"account_name\":\"xvb11\",\"ad_name\":\"ItqGO\",\"ad_id\":\"6134760721255\",\"impressions\":\"Ftcom\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"108176966036258\",\"account_name\":\"8e32I\",\"ad_name\":\"yHrYg\",\"ad_id\":\"6134760721455\",\"impressions\":\"oQSrN\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"108176966036258\",\"account_name\":\"KDsFR\",\"ad_name\":\"bJZaK\",\"ad_id\":\"6134760721655\",\"impressions\":\"PiS1l\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"108176966036258\",\"account_name\":\"UGHhF\",\"ad_name\":\"MCkrb\",\"ad_id\":\"6134760721855\",\"impressions\":\"ST4rD\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"108176966036258\",\"account_name\":\"1itYW\",\"ad_name\":\"V8pJn\",\"ad_id\":\"6134760722255\",\"impressions\":\"LFpYk\",\"date_start\":\"2019-09-29\",\"date_stop\":\"2019-09-29\"},{\"account_id\":\"108176966036258\",\"account_name\":\"8uHUi\",\"ad_name\":\"6Cgyi\",\"ad_id\":\"6134702917855\",\"impressions\":\"a5czK\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"},{\"account_id\":\"108176966036258\",\"account_name\":\"1MXgy\",\"ad_name\":\"p2qRE\",\"ad_id\":\"6134760721255\",\"impressions\":\"g2Ude\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"},{\"account_id\":\"108176966036258\",\"account_name\":\"OQ4HK\",\"ad_name\":\"G6SZI\",\"ad_id\":\"6134760721455\",\"impressions\":\"gZYka\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"},{\"account_id\":\"108176966036258\",\"account_name\":\"dwBfc\",\"ad_name\":\"zYoRl\",\"ad_id\":\"6134760721655\",\"impressions\":\"RjeTM\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"},{\"account_id\":\"108176966036258\",\"account_name\":\"rjTMp\",\"ad_name\":\"CIP6S\",\"ad_id\":\"6134760722255\",\"impressions\":\"U7dqW\",\"date_start\":\"2019-09-30\",\"date_stop\":\"2019-09-30\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MTMZD\"}}},\"id\":\"act_108176966036258\"}}"}
)
})