package com.example.reiseplanlegger;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import android.content.Context;

public class MainGET {

    String heleResponsen = "LOL";

    public interface OnResponseListener {
        void onSuccess(String response);

        void onError(String error);
    }

    public void getAvailableBikes(String lokasjon, Context context, OnResponseListener listener) {
        RequestQueue volleyQueue = Volley.newRequestQueue(context);
        String url = "https://gbfs.urbansharing.com/oslobysykkel.no/station_status.json";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        listener.onSuccess(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                listener.onError(error.getMessage());
            }
        });

        volleyQueue.add(stringRequest);
    }
}