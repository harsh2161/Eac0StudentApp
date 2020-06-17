package com.example.eac0studentapp;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("pN2dB3pBlObaAfEGzyE9PvhhSvOgyc5zR5UAA1yc")
                .clientKey("3Kz2McfuPq0UBQHr8JD8qMpxoGeqk52IgM84atb2")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
