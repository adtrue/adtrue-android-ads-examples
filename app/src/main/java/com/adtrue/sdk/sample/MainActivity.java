package com.adtrue.sdk.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.adtrue.sdk.InterstitialAd;
import com.adtrue.sdk.adx.AdView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdView adView;

        ((Button) findViewById(R.id.showInterstitial)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InterstitialAd interstitialAd = new InterstitialAd(MainActivity.this, "9285");
                interstitialAd.showAd();
            }
        });
    }
}
