# AdTrue Mobile Ads SDK for Android
The AdTrue Mobile Ads SDK enables mobile app developers to maximize their monetization in native mobile apps.
This repository contains open source examples and developer resources for both the Android SDK

# Step 1: Add the Repo
![](http://cdn.adtrue.com//img/sdk/step1.png)

```Groovy
allprojects {
    repositories {
       ...
        maven {
            url "https://repo.adtrue.io/artifactory/android-sdk"
            credentials {
                username "adtrue-public"
                password "adtrue-public"
            }
        }
    }
}
```

# Step 2: Including the SDK
![](http://cdn.adtrue.com//img/sdk/step2.png)

```Groovy
dependencies {
  ...
  compile 'com.adtrue:android-sdk:1.6.9'
  compile 'com.facebook.android:audience-network-sdk:4.+'
  compile 'com.google.android.gms:play-services-ads:11.8.0'
}
```

# Adding Interstitial Ads
Add the following code at the top of your Activity in order to import the AdTrue Ads SDK:

```Groovy
import com.adtrue.sdk.*;
```
Initialize the InterstitialAd.

```Groovy
private InterstitialAd interstitialAd;

@Override
public void onCreate(Bundle savedInstanceState) {
...
  // Instantiate an InterstitialAd object
  interstitialAd = new InterstitialAd(this, "YOUR_PLACEMENT_ID");
...  
```

Set an InterstitialAdListener and load the Ad / Showing Interstitial Ads
```Groovy
public void onCreate(Bundle savedInstanceState) {
   ...
    // Set listeners for the Interstitial Ad
   interstitialAd.setAdListener(new OnAdListener() {
        @Override
        public void onInterstitialDisplayed(Ad a) {
            // Interstitial displayed callback
        }
        @Override
        public void onInterstitialDismissed(Ad a) {
             // Interstitial dismissed callback
        }
    });
    //Call InterstitialAd
    interstitialAd.showAd();
  }
```
# Adding Banner Ads
Adding a Layout Container for the Banner Ad
```Groovy
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout
 xmlns:adtrue="http://schemas.android.com/apk/res-auto"
 ...
 >
   ...
     <com.adtrue.sdk.adx.AdView
            android:id="@+id/adView"
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:gravity="center"
            adtrue:placementId="YOUR_PLACEMENT_ID">
    </com.adtrue.sdk.adx.AdView>
   ...
</RelativeLayout>
```

You can alternatively create AdView programmatically in your Activity:
```Groovy
AdView adView = new AdView(this,"YOUR_PLACEMENT_ID");
// TODO: Add adView to your view hierarchy.
```
# Sample ad units

| Ad format       | Sample ad unit ID
|-----------------|-----------------
| Banner          | 9286 
| Interstitial    | 9285 









