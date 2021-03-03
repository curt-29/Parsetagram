package com.example.parse;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class parseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("mPz9SESgtTwbvpjI0PclDzOwOgy0BGKerZ079qhg")
                .clientKey("hToq3YXAtl4ApCOn8PRMZ9n1HTBO7rPCyFCxd5VU")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
