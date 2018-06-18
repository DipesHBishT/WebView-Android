package com.example.dipeshbisht.googlewv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public class google extends AppCompatActivity {
    WebView ob1;
    ProgressBar ob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.google);
        ob1=findViewById(R.id.web);
        ob=findViewById(R.id.pgr);
        ob1.loadUrl("https://www.google.com/");
        ob1.setWebChromeClient(new WebChromeClient(){
            public void onProgressChanged(WebView view,int progress){
                if(progress==100){
                    ob.setVisibility(View.GONE);
                    ob1.setVisibility(View.VISIBLE);
                }
            }
        });

    }
}

