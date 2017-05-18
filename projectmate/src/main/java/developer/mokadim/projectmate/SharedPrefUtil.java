package developer.mokadim.projectmate;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ahmed.elmokadem on 2015-09-22.
 * Handle working with Shared preferences.
 */
public class SharedPrefUtil {

    private static Context context;
    private static SharedPrefUtil instance = null;
    private static String preferenceName;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    /**
     * A private Constructor prevents any other class from instantiating.
     */
    private SharedPrefUtil() {
        preferences = context.getSharedPreferences(preferenceName, context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    /**
     * * Make sure that there is only one SharedPrefUtil instance.
     *
     * @param context              The android Context instance.
     * @return Returns only one instance of SharedPrefUtil.
     */
    public static SharedPrefUtil getInstance(Context context) {

        SharedPrefUtil.context = context;
        SharedPrefUtil.preferenceName = context.getPackageName();
        if (instance == null) {
            instance = new SharedPrefUtil();
        }
        return instance;
    }

    /**
     * Write string preferences.
     *
     * @param preferenceName  The unique name of preference.
     * @param preferenceValue The value to save in preference.
     */
    public void write(String preferenceName, String preferenceValue) {

        editor.putString(preferenceName, preferenceValue);
        /* Using apply() instead of commit() because
         *commit() writes its preferences out to persistent storage synchronously
         *apply() commits its changes to the in-memory SharedPreferences immediately
         *but starts an asynchronous commit to disk and you won't be notified of any failures
         **/
        editor.apply();
    }

    /**
     * Read string preferences.
     *
     * @param preferenceName The unique name of preference.
     * @param defaultValue   The value if there is no saved one.
     * @return The value of saved preference.
     */
    public String read(String preferenceName, String defaultValue) {

        return preferences.getString(preferenceName, defaultValue);
    }

    /**
     * Write boolean preferences.
     *
     * @param preferenceName  The unique name of preference.
     * @param preferenceValue The value to save in preference.
     */
    public void write(String preferenceName, boolean preferenceValue) {

        editor.putBoolean(preferenceName, preferenceValue);
        /* Using apply() instead of commit() because
         *commit() writes its preferences out to persistent storage synchronously
         *apply() commits its changes to the in-memory SharedPreferences immediately
         *but starts an asynchronous commit to disk and you won't be notified of any failures
         **/
        editor.apply();
    }

    /**
     * Read boolean preferences
     *
     * @param preferenceName The unique name of preference.
     * @param defaultValue   The value if there is no saved one.
     * @return The value of saved preference.
     */
    public boolean read(String preferenceName, boolean defaultValue) {

        return preferences.getBoolean(preferenceName, defaultValue);
    }

    /**
     * Write int preferences.
     *
     * @param preferenceName  The unique name of preference.
     * @param preferenceValue The value to save in preference.
     */
    public void write(String preferenceName, int preferenceValue) {

        editor.putInt(preferenceName, preferenceValue);
        /* Using apply() instead of commit() because
         *commit() writes its preferences out to persistent storage synchronously
         *apply() commits its changes to the in-memory SharedPreferences immediately
         *but starts an asynchronous commit to disk and you won't be notified of any failures
         **/
        editor.apply();
    }

    /**
     * Read int preferences.
     *
     * @param preferenceName The unique name of preference.
     * @param defaultValue   The value if there is no saved one.
     * @return The value of saved preference.
     */
    public int read(String preferenceName, int defaultValue) {

        return preferences.getInt(preferenceName, defaultValue);
    }

    /**
     * Write long preferences.
     *
     * @param preferenceName  The unique name of preference.
     * @param preferenceValue The value to save in preference.
     */
    public void write(String preferenceName, long preferenceValue) {

        editor.putLong(preferenceName, preferenceValue);
        /* Using apply() instead of commit() because
         *commit() writes its preferences out to persistent storage synchronously
         *apply() commits its changes to the in-memory SharedPreferences immediately
         *but starts an asynchronous commit to disk and you won't be notified of any failures
         **/
        editor.apply();
    }

    /**
     * Read long preferences.
     *
     * @param preferenceName The unique name of preference.
     * @param defaultValue   The value if there is no saved one.
     * @return The value of saved preference.
     */
    public long read(String preferenceName, long defaultValue) {

        return preferences.getLong(preferenceName, defaultValue);
    }

    /**
     * Write float preferences.
     *
     * @param preferenceName  The unique name of preference.
     * @param preferenceValue The value to save in preference.
     */
    public void write(String preferenceName, float preferenceValue) {

        editor.putFloat(preferenceName, preferenceValue);
        /* Using apply() instead of commit() because
         *commit() writes its preferences out to persistent storage synchronously
         *apply() commits its changes to the in-memory SharedPreferences immediately
         *but starts an asynchronous commit to disk and you won't be notified of any failures
         **/
        editor.apply();
    }

    /**
     * Read float preferences.
     *
     * @param preferenceName The unique name of preference.
     * @param defaultValue   The value if there is no saved one.
     * @return The value of saved preference.
     */
    public float read(String preferenceName, float defaultValue) {

        return preferences.getFloat(preferenceName, defaultValue);
    }

    /**
     * Remove one or more preference from shared preferences.
     *
     * @param preferencesNames Name of preference(s) you want to remove
     */
    public void remove(String... preferencesNames) {
        for (String preferenceName : preferencesNames) {
            editor.remove(preferenceName);
            /* Using apply() instead of commit() because
             *commit() writes its preferences out to persistent storage synchronously
             *apply() commits its changes to the in-memory SharedPreferences immediately
             *but starts an asynchronous commit to disk and you won't be notified of any failures
             **/
            editor.apply();
        }
    }
}