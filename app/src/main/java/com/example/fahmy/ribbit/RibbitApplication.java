package com.example.fahmy.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

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
    }
}
