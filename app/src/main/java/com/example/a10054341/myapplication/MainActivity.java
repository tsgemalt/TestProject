package com.example.a10054341.myapplication;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onReceivedError(WebView view, int errorCode, String desc, String url) {
                Log.w("w", desc + " -> failed");
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                Log.w("w", "onPageStarted");
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                Log.w("w", "onPageFinished");
            }
        });

        webView.loadUrl("http://www.google.com");
    }
}
