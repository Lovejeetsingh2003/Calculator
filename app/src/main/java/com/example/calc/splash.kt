package com.example.calc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.calc.databinding.ActivitySplashBinding

class splash : AppCompatActivity() {
    var binding : ActivitySplashBinding?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        animateZooMOut()
    }
    private fun animateZooMOut()
    {
        binding?.splashImage?.animate()
            ?.scaleX(0.5f)
            ?.scaleY(0.5f)
            ?.setDuration(1000)
            ?.withEndAction {
                animateZooMIn()
            }
            ?.start()
    }


    private fun animateZooMIn()
    {
        binding?.splashImage?.animate()
            ?.scaleX(300f)
            ?.scaleY(300f)
            ?.setDuration(500)
            ?.withEndAction {
                startNewActivity()
            }
            ?.start()
    }

    private  fun startNewActivity()
    {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    }