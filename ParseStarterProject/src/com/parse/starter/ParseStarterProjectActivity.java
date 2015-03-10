package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.parse.LogInCallback;
import com.parse.ParseAnalytics;
import com.parse.ParseAnonymousUtils;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;

public class ParseStarterProjectActivity extends Activity {

    Button btnCreateObj;

	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

        btnCreateObj = (Button) findViewById(R.id.buttonCreateObjet);
        btnCreateObj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ParseObject testObject = new ParseObject("TestObject2");
                testObject.put("foo", "bar");
                testObject.saveInBackground();
            }
        });

		ParseAnalytics.trackAppOpenedInBackground(getIntent());

        /*
        ParseAnonymousUtils.logIn(new LogInCallback() {
            @Override
            public void done(ParseUser user, ParseException e) {
                if (e != null) {
                    Log.d("MyApp", "Anonymous login failed.");
                } else {
                    Log.d("MyApp", "Anonymous user logged in.");
                }
            }
        });
        */

	}
}
