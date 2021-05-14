package com.example.top100crypto.about

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.top100crypto.R
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.MobileAds

class AboutActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val btn_rate = findViewById<Button>(R.id.btn_rate_app)
        btn_rate.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=${applicationContext.packageName}")))
        }

        MobileAds.initialize(this) {}

        val adRequst = AdRequest.Builder().build()
        val adView = findViewById<AdView>(R.id.adView)
        adView.loadAd(adRequst)


    }
}