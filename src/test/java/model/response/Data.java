package model.response;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Data{

	@JsonProperty("dashly_hash")
	private String dashlyHash;

	@JsonProperty("roles")
	private List<String> roles;

	@JsonProperty("utm_medium")
	private Object utmMedium;

	@JsonProperty("wrong_email_address")
	private boolean wrongEmailAddress;

	@JsonProperty("has_pending_email_change")
	private boolean hasPendingEmailChange;

	@JsonProperty("test_group_name")
	private String testGroupName;

	@JsonProperty("has_pending_profile_email_change")
	private boolean hasPendingProfileEmailChange;

	@JsonProperty("uuid")
	private String uuid;

	@JsonProperty("account_manager")
	private Object accountManager;

	@JsonProperty("balance")
	private String balance;

	@JsonProperty("permissions")
	private Permissions permissions;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("email")
	private String email;

	@JsonProperty("utm_content")
	private Object utmContent;

	@JsonProperty("manager")
	private Manager manager;

	@JsonProperty("utm_campaign")
	private Object utmCampaign;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("email_verified_at")
	private String emailVerifiedAt;

	@JsonProperty("yandex_metrika_token_status")
	private String yandexMetrikaTokenStatus;

	@JsonProperty("utm_term")
	private Object utmTerm;

	@JsonProperty("google_analytics_refresh_token_status")
	private String googleAnalyticsRefreshTokenStatus;

	@JsonProperty("has_deleted_tags")
	private boolean hasDeletedTags;

	@JsonProperty("registration_date")
	private String registrationDate;

	@JsonProperty("has_tags")
	private boolean hasTags;

	@JsonProperty("referrer_url")
	private Object referrerUrl;

	@JsonProperty("utm_source")
	private Object utmSource;

	public String getDashlyHash(){
		return dashlyHash;
	}

	public List<String> getRoles(){
		return roles;
	}

	public Object getUtmMedium(){
		return utmMedium;
	}

	public boolean isWrongEmailAddress(){
		return wrongEmailAddress;
	}

	public boolean isHasPendingEmailChange(){
		return hasPendingEmailChange;
	}

	public String getTestGroupName(){
		return testGroupName;
	}

	public boolean isHasPendingProfileEmailChange(){
		return hasPendingProfileEmailChange;
	}

	public String getUuid(){
		return uuid;
	}

	public Object getAccountManager(){
		return accountManager;
	}

	public String getBalance(){
		return balance;
	}

	public Permissions getPermissions(){
		return permissions;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getEmail(){
		return email;
	}

	public Object getUtmContent(){
		return utmContent;
	}

	public Manager getManager(){
		return manager;
	}

	public Object getUtmCampaign(){
		return utmCampaign;
	}

	public String getLastName(){
		return lastName;
	}

	public String getEmailVerifiedAt(){
		return emailVerifiedAt;
	}

	public String getYandexMetrikaTokenStatus(){
		return yandexMetrikaTokenStatus;
	}

	public Object getUtmTerm(){
		return utmTerm;
	}

	public String getGoogleAnalyticsRefreshTokenStatus(){
		return googleAnalyticsRefreshTokenStatus;
	}

	public boolean isHasDeletedTags(){
		return hasDeletedTags;
	}

	public String getRegistrationDate(){
		return registrationDate;
	}

	public boolean isHasTags(){
		return hasTags;
	}

	public Object getReferrerUrl(){
		return referrerUrl;
	}

	public Object getUtmSource(){
		return utmSource;
	}

    public Permissions getResponce() {
        return null;
    }
}