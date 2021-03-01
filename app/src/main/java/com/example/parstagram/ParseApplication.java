package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("MPsFhRRncLf4px2JTjqI0VknZ1CInjl8saSBZFnP")
                .clientKey("QqGS8THqqPczIyXvEClxYvfBlmd0rDmqFEr5LTcL")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
