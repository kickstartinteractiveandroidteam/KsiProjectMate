package developer.mokadim.projectmate.webservice;

/**
 * Created by ahmed.elmokadem on 2015-09-22.
 * Determine the request status.
 */
public enum RequestStatus {

    SUCCEED, // Request succeed
    FAILED, // Request failed
    NO_CONNECTION, // There is no internet connection
    NO_INTERNET; // Wifi connected but no internet
}
