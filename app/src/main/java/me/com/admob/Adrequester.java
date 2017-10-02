package me.com.admob;

import android.content.Context;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/**
 * Created by dxman on 7/28/2017.
 */

public class Adrequester {

    Context cx;
    AdView view;
    public Adrequester(Context cx, AdView View)
    {
        this.cx=cx;
        this.view=View;
        loadAd();
    }
    public void loadAd()
    {
        AdRequest adRequest=new AdRequest.Builder().build();
        view.loadAd(adRequest);
    }
}
