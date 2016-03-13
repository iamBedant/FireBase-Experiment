package com.iambedant.nanodegree.firebaseexperiment;

import com.firebase.client.Firebase;

/**
 * Created by Kuliza-193 on 3/12/2016.
 */
public class Application extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
    }
}
