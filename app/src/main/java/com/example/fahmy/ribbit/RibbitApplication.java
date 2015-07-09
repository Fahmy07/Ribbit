package com.example.fahmy.ribbit;

import android.app.Application;

import com.example.fahmy.ribbit.ui.MainActivity;
import com.example.fahmy.ribbit.utils.ParseConstants;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.PushService;

/**
 * Created by hp on 6/20/2015.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "wMFM1ZLpUHt8IVV1j5lmnRstezZevqkYzJyUjp6h", "QwQ1TNEdl048u2K1yHNTpiwcacqPkz2s71R08pZB");
        //PushService.setDefaultPushCallback(this, MainActivity.class);
        PushService.setDefaultPushCallback(this,
                MainActivity.class,
                R.drawable.ic_stat_ic_launcher);
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
