package com.inventive.test

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.beautybebo.libs.toast.FancyToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        FancyToast.makeText(
            this@MainActivity,
            "MainActivity",
            FancyToast.LENGTH_LONG,
            FancyToast.ERROR,
            false
        ).show()
    }
}