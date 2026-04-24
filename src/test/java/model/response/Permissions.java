package model.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Permissions{

	@JsonProperty("admin_spots")
	private List<String> adminSpots;

	@JsonProperty("stats_reports")
	private List<String> statsReports;

	@JsonProperty("create_more_than_one_spot_per_tag_adformats")
	private List<String> createMoreThanOneSpotPerTagAdformats;

	@JsonProperty("tags")
	private List<String> tags;

	@JsonProperty("manage_spots_adformats")
	private List<String> manageSpotsAdformats;

	@JsonProperty("stats")
	private List<String> stats;

	@JsonProperty("spots")
	private List<String> spots;

	@JsonProperty("admin_payment_requests")
	private List<String> adminPaymentRequests;

	@JsonProperty("notification_users")
	private List<String> notificationUsers;

	@JsonProperty("payment_claims")
	private List<String> paymentClaims;

	@JsonProperty("see_adformats")
	private List<String> seeAdformats;

	@JsonProperty("landings")
	private List<String> landings;

	@JsonProperty("ad_network_spot_links")
	private List<String> adNetworkSpotLinks;

	public List<String> getAdminSpots(){
		return adminSpots;
	}

	public List<String> getStatsReports(){
		return statsReports;
	}

	public List<String> getCreateMoreThanOneSpotPerTagAdformats(){
		return createMoreThanOneSpotPerTagAdformats;
	}

	public List<String> getTags(){
		return tags;
	}

	public List<String> getManageSpotsAdformats(){
		return manageSpotsAdformats;
	}

	public List<String> getStats(){
		return stats;
	}

	public List<String> getSpots(){
		return spots;
	}

	public List<String> getAdminPaymentRequests(){
		return adminPaymentRequests;
	}

	public List<String> getNotificationUsers(){
		return notificationUsers;
	}

	public List<String> getPaymentClaims(){
		return paymentClaims;
	}

	public List<String> getSeeAdformats(){
		return seeAdformats;
	}

	public List<String> getLandings(){
		return landings;
	}

	public List<String> getAdNetworkSpotLinks(){
		return adNetworkSpotLinks;
	}
}