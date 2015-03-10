package com.parse.starter;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseCrashReporting;
import com.parse.ParseUser;

public class ParseApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    // Initialize Crash Reporting.
    ParseCrashReporting.enable(this);

    // Enable Local Datastore.
    Parse.enableLocalDatastore(this);

    // Add your initialization code here
    //Parse.initialize(this);

      //Parse.initialize(this, "WJ2dLTPWHKIOXwyu9bxmbb7dwt5v7nKUQZ8a34Bq", "spYM1jxN7M3LgTo9OZIxZnR03pyMGgClfGqNxR9J");
      Parse.initialize(this, "Cfw3CXG4HCeFhW03AiYFpplJYYH0V4nnZlzkPCFX", "Y9yq6bVaDvlBHCliVhk6OPQXb7OAklpiR3JDSIYb");


    ParseUser.enableAutomaticUser();
      ParseUser.getCurrentUser().saveInBackground();
    //ParseACL defaultACL = new ParseACL();
    // Optionally enable public read access.
    // defaultACL.setPublicReadAccess(true);
    //ParseACL.setDefaultACL(defaultACL, true);
  }
}
