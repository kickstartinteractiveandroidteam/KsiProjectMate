package developer.mokadim.projectmate.location;

import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.provider.Settings;

/**
 * Created by ahmed.elmokadem on 2015-11-30.
 * Check and manipulate location service status.
 */
public class LocationServiceUtil {

    /**
     * Check Location Service status.
     *
     * @param context The android Context instance.
     * @return Location Service Status.
     */
    public static boolean isLocationServiceEnabled(Context context) {
        if (LocationServiceUtil.getLocationServiceStatus(context) ==
                LocationServiceStatus.GPS_NETWORK_PROVIDERS_ENABLED ||
                LocationServiceUtil.getLocationServiceStatus(context) ==
                        LocationServiceStatus.GPS_PROVIDER_ENABLED ||
                LocationServiceUtil.getLocationServiceStatus(context) ==
                        LocationServiceStatus.NETWORK_PROVIDER_ENABLED) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Get Location Service status.
     *
     * @param context The android Context instance.
     * @return Location Service Status.
     */
    public static LocationServiceStatus getLocationServiceStatus(Context context) {
        LocationManager locationManager =
                (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);

        if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) &&
                locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            return LocationServiceStatus.GPS_NETWORK_PROVIDERS_ENABLED;
        } else if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) &&
                !locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            return LocationServiceStatus.GPS_NETWORK_PROVIDERS_DISABLED;
        } else if (locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            return LocationServiceStatus.GPS_PROVIDER_ENABLED;
        } else if (!locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            return LocationServiceStatus.GPS_PROVIDER_DISABLED;
        } else if (locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)) {
            return LocationServiceStatus.NETWORK_PROVIDER_ENABLED;
        } else {
            return LocationServiceStatus.NETWORK_PROVIDER_DISABLED;
        }
    }

    /**
     * Control GPS status.
     *
     * @param context The android Context instance.
     */
    public static void setLocationServiceStatus(Context context) {
        context.startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS));
    }
}
