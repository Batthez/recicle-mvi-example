package com.matthbr.recicle.view.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.matthbr.recicle.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))
    }

}