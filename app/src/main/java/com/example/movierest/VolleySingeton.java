package com.example.movierest;

import android.content.Context;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class VolleySingeton {
    private RequestQueue requestQueue;
    private static VolleySingeton instance;


    private VolleySingeton(Context context) {
        requestQueue = Volley.newRequestQueue(context.getApplicationContext());
    }

    // synchronized => thread safe : only one thread can access at a time
    public static synchronized VolleySingeton getInstance(Context context) {
        if (instance == null) {
            instance = new VolleySingeton(context.getApplicationContext());
        }
        return instance;
    }

    public RequestQueue getRequestQueue() {
       return requestQueue;
    }
}
