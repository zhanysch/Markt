package com.baish.internship.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.baish.internship.R
import com.baish.internship.databinding.ActivityMainBinding
import com.baish.internship.utils.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBotomMenu()
    }



    private fun setupBotomMenu() {
        val navView = findViewById<BottomNavigationView>(R.id.bottomNav)

        val navId = listOf(
            R.navigation.home,
            R.navigation.features,
            R.navigation.add,
            R.navigation.comment,
            R.navigation.profile
        )

        navView.setupWithNavController(
            navGraphIds = navId,
            fragmentManager = supportFragmentManager,
            containerId = R.id.navView,
            intent = intent
        )

    }
}