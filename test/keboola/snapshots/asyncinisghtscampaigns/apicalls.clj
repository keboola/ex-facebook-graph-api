(ns keboola.snapshots.asyncinisghtscampaigns.apicalls)
(def recorded
{
{:method :get,
 :address
 "https://graph.facebook.com/v10.0/192025512975195/insights/?access_token=XXTOKENXX",
 :as :json}
(fn [req]{:status 200,
 :body
 "{\"data\":[{\"account_id\":\"522606278080331\",\"actions\":[{\"action_reaction\":\"wow\",\"action_type\":\"post_reaction\",\"value\":\"1\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"7\"},{\"action_type\":\"comment\",\"value\":\"3\"},{\"action_type\":\"onsite_conversion.post_save\",\"value\":\"1\"},{\"action_type\":\"link_click\",\"value\":\"106\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_type\":\"post_reaction\",\"value\":\"8\"},{\"action_type\":\"video_view\",\"value\":\"1711\"},{\"action_type\":\"landing_page_view\",\"value\":\"68\"},{\"action_type\":\"offsite_conversion.fb_pixel_add_payment_info\",\"value\":\"5\"},{\"action_type\":\"offsite_conversion.fb_pixel_add_to_cart\",\"value\":\"16\"},{\"action_type\":\"offsite_conversion.fb_pixel_initiate_checkout\",\"value\":\"5\"},{\"action_type\":\"offsite_conversion.fb_pixel_purchase\",\"value\":\"1\"},{\"action_type\":\"offsite_conversion.fb_pixel_search\",\"value\":\"3\"},{\"action_type\":\"offsite_conversion.fb_pixel_view_content\",\"value\":\"100\"},{\"action_type\":\"post_engagement\",\"value\":\"1830\"},{\"action_type\":\"page_engagement\",\"value\":\"1830\"},{\"action_type\":\"add_payment_info\",\"value\":\"5\"},{\"action_type\":\"omni_add_to_cart\",\"value\":\"16\"},{\"action_type\":\"omni_initiated_checkout\",\"value\":\"5\"},{\"action_type\":\"omni_purchase\",\"value\":\"1\"},{\"action_type\":\"omni_search\",\"value\":\"3\"},{\"action_type\":\"omni_view_content\",\"value\":\"100\"},{\"action_type\":\"add_to_cart\",\"value\":\"16\"},{\"action_type\":\"initiate_checkout\",\"value\":\"5\"},{\"action_type\":\"purchase\",\"value\":\"1\"},{\"action_type\":\"search\",\"value\":\"3\"},{\"action_type\":\"view_content\",\"value\":\"100\"}],\"date_start\":\"2021-08-07\",\"date_stop\":\"2021-08-07\"},{\"account_id\":\"522606278080331\",\"actions\":[{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"7\"},{\"action_type\":\"onsite_conversion.post_save\",\"value\":\"3\"},{\"action_type\":\"link_click\",\"value\":\"130\"},{\"action_type\":\"post\",\"value\":\"1\"},{\"action_type\":\"post_reaction\",\"value\":\"7\"},{\"action_type\":\"video_view\",\"value\":\"2364\"},{\"action_type\":\"landing_page_view\",\"value\":\"92\"},{\"action_type\":\"offsite_conversion.fb_pixel_add_payment_info\",\"value\":\"2\"},{\"action_type\":\"offsite_conversion.fb_pixel_add_to_cart\",\"value\":\"7\"},{\"action_type\":\"offsite_conversion.fb_pixel_initiate_checkout\",\"value\":\"3\"},{\"action_type\":\"offsite_conversion.fb_pixel_purchase\",\"value\":\"1\"},{\"action_type\":\"offsite_conversion.fb_pixel_search\",\"value\":\"1\"},{\"action_type\":\"offsite_conversion.fb_pixel_view_content\",\"value\":\"131\"},{\"action_type\":\"post_engagement\",\"value\":\"2505\"},{\"action_type\":\"page_engagement\",\"value\":\"2505\"},{\"action_type\":\"add_payment_info\",\"value\":\"2\"},{\"action_type\":\"omni_add_to_cart\",\"value\":\"7\"},{\"action_type\":\"omni_initiated_checkout\",\"value\":\"3\"},{\"action_type\":\"omni_purchase\",\"value\":\"1\"},{\"action_type\":\"omni_search\",\"value\":\"1\"},{\"action_type\":\"omni_view_content\",\"value\":\"131\"},{\"action_type\":\"add_to_cart\",\"value\":\"7\"},{\"action_type\":\"initiate_checkout\",\"value\":\"3\"},{\"action_type\":\"purchase\",\"value\":\"1\"},{\"action_type\":\"search\",\"value\":\"1\"},{\"action_type\":\"view_content\",\"value\":\"131\"}],\"date_start\":\"2021-08-08\",\"date_stop\":\"2021-08-08\"},{\"account_id\":\"522606278080331\",\"actions\":[{\"action_reaction\":\"wow\",\"action_type\":\"post_reaction\",\"value\":\"1\"},{\"action_reaction\":\"like\",\"action_type\":\"post_reaction\",\"value\":\"55\"},{\"action_reaction\":\"love\",\"action_type\":\"post_reaction\",\"value\":\"2\"},{\"action_type\":\"comment\",\"value\":\"6\"},{\"action_type\":\"onsite_conversion.post_save\",\"value\":\"13\"},{\"action_type\":\"link_click\",\"value\":\"558\"},{\"action_type\":\"post\",\"value\":\"9\"},{\"action_type\":\"post_reaction\",\"value\":\"58\"},{\"action_type\":\"video_view\",\"value\":\"6771\"},{\"action_type\":\"landing_page_view\",\"value\":\"422\"},{\"action_type\":\"offsite_conversion.fb_pixel_add_payment_info\",\"value\":\"21\"},{\"action_type\":\"offsite_conversion.fb_pixel_add_to_cart\",\"value\":\"62\"},{\"action_type\":\"offsite_conversion.fb_pixel_complete_registration\",\"value\":\"3\"},{\"action_type\":\"offsite_conversion.fb_pixel_initiate_checkout\",\"value\":\"34\"},{\"action_type\":\"offsite_conversion.fb_pixel_purchase\",\"value\":\"11\"},{\"action_type\":\"offsite_conversion.fb_pixel_search\",\"value\":\"8\"},{\"action_type\":\"offsite_conversion.fb_pixel_view_content\",\"value\":\"542\"},{\"action_type\":\"post_engagement\",\"value\":\"7415\"},{\"action_type\":\"page_engagement\",\"value\":\"7415\"},{\"action_type\":\"add_payment_info\",\"value\":\"21\"},{\"action_type\":\"omni_add_to_cart\",\"value\":\"62\"},{\"action_type\":\"omni_complete_registration\",\"value\":\"3\"},{\"action_type\":\"omni_initiated_checkout\",\"value\":\"34\"},{\"action_type\":\"omni_purchase\",\"value\":\"11\"},{\"action_type\":\"omni_search\",\"value\":\"8\"},{\"action_type\":\"omni_view_content\",\"value\":\"542\"},{\"action_type\":\"add_to_cart\",\"value\":\"62\"},{\"action_type\":\"complete_registration\",\"value\":\"3\"},{\"action_type\":\"initiate_checkout\",\"value\":\"34\"},{\"action_type\":\"purchase\",\"value\":\"11\"},{\"action_type\":\"search\",\"value\":\"8\"},{\"action_type\":\"view_content\",\"value\":\"542\"}],\"date_start\":\"2021-08-09\",\"date_stop\":\"2021-08-09\"}],\"paging\":{\"cursors\":{\"before\":\"MAZDZD\",\"after\":\"MgZDZD\"}}}"}
){:method :get,
 :address
 "https://graph.facebook.com/v10.0/192025512975195?access_token=XXTOKENXX",
 :as :json}
(fn [req]{:status 200,
 :body
 "{\"id\":\"192025512975195\",\"account_id\":\"522606278080331\",\"time_ref\":1628614274,\"time_completed\":1628614275,\"async_status\":\"Job Completed\",\"async_percent_completion\":100,\"date_start\":\"2021-08-07\",\"date_stop\":\"2021-08-09\"}"}
){:method :post,
 :address
 "https://graph.facebook.com/v10.0/act_522606278080331/insights?fields=account_id,campaign_id,actions&action_breakdowns=action_reaction&date_preset=last_3d&time_increment=1&level=account&access_token=XXTOKENXX",
 :as :json}
(fn [req]{:status 200, :body "{\"report_run_id\":\"192025512975195\"}"}
)
})
