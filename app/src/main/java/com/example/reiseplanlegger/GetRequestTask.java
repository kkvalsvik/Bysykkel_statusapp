package com.example.reiseplanlegger;


import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetRequestTask extends AsyncTask<Void, Void, String> {

    // URL to make the GET request
    private String url;

    public GetRequestTask(String url) {
        this.url = url;
    }

    @Override
    protected String doInBackground(Void... params) {
        String response = null;
        try {
            // Make the GET request
            URL requestUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) requestUrl.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            // Get the response
            InputStream inputStream = connection.getInputStream();
            response = convertStreamToString(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    @Override
    protected void onPostExecute(String response) {
        // Parse the response here
        response.substring(0,8);
        MainActivity mainActivity = new MainActivity(); //Går dette?
        mainActivity.setOutput(response);
    }

    private String convertStreamToString(InputStream inputStream) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                sb.append(line).append('\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}