package com.danieladams.android.aca.finale;


import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;




/**
 * A simple {@link Fragment} subclass.
 */
public class PatchNotesFragment extends Fragment {

    public static final String URL_PATCH_NOTES = "https://api.lootbox.eu/patch_notes";
    public static final int INDEX_PATCH_NOTES = 0;
    public static final int TIMEOUT = 2000;
    public static final String COLOR = "#FFFFFF";

    private TextView patchNotes;
    private WebView webview;

    public PatchNotesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_patch_notes, container, false);

        patchNotes = (TextView)v.findViewById(R.id.lbl_patch_notes);
        webview = (WebView)v.findViewById(R.id.webview);
        webview.getSettings().setDefaultFontSize(13);
        webview.setBackgroundColor(Color.TRANSPARENT);
        RequestTask task = new RequestTask();
        task.execute();
        return v;
    }

    private class RequestTask extends AsyncTask<String, Void, String>{
        @Override
        protected String doInBackground(String... params) {
            String urlString = "https://api.lootbox.eu/patch_notes";
            HttpURLConnection c = null;
            String result = "";

            try {
                c = (HttpURLConnection)(new URL(urlString).openConnection());
                c.setRequestMethod("GET");

                InputStream is = c.getInputStream();
                BufferedReader rd = new BufferedReader(new InputStreamReader(is));
                StringBuilder sb = new StringBuilder();
                String line;
                while((line = rd.readLine())!=null){
                    sb.append(line);
                    sb.append('\r');
                }
                rd.close();
                result = sb.toString();
            } catch (Exception e){
                e.printStackTrace();
                result = "";
            } finally {
            }
            return result;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            if(!s.equals("")){
                try {
                    JSONObject json = new JSONObject(s);
                    JSONArray jArray = json.getJSONArray("patchNotes");
                    String htmlString = "<html><head>"
                    + "<style type=\"text/css\">body{color: #b7b9bc; background-color: #1a1a1a;}"
                    + "</style></head>"
                    + "<body link=\"orange\">" + jArray.getJSONObject(0).getString("detail") + "</body></html>";
                    patchNotes.setVisibility(View.GONE);
                    webview.loadData(htmlString, "text/html; charset=utf-8", "UTF-8");
                } catch (Exception e){
                    e.printStackTrace();
                    patchNotes.setText("Failed to retrieve data");
                    patchNotes.setVisibility(View.VISIBLE);
                }
            }else{
                patchNotes.setText("Failed to retrieve data");
                patchNotes.setVisibility(View.VISIBLE);
            }
        }
    }
}
