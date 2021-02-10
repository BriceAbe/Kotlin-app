package com.training.lecab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.training.lecab.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // injecter le fragement dans la boute ( frgment container)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack((null))
        transaction.commit()



    }
}