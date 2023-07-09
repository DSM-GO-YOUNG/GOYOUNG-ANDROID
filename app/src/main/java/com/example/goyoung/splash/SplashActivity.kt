package com.example.goyoung.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.os.postDelayed
import com.example.goyoung.R
import com.example.goyoung.StartActivity
import com.example.goyoung.base.BaseActivity
import com.example.goyoung.databinding.ActivitySplashBinding
import com.example.goyoung.main.MainActivity

class SplashActivity : BaseActivity<ActivitySplashBinding>(R.layout.activity_splash) {

    private val splashDuration = 1500L

    override fun initView() {
        Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                finish()
        }, 1000)
    }

    override fun observeEvent() {
    }

}