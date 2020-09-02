package com.camisnew.emotinaltracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.fragment.app.FragmentManager
import com.camisnew.emotinaltracker.fragments.CheckList
import com.camisnew.emotinaltracker.fragments.Home
import com.camisnew.emotinaltracker.fragments.MoodAnalysis
import com.camisnew.emotinaltracker.fragments.MoodEntry
import com.camisnew.emotinaltracker.util.Transaction
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    private val fragmentManager : FragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_home -> {
                Transaction.transactionMainFrame(R.string.home.toString(),
                    Home(), fragmentManager)
            }
            R.id.nav_screen_checklist -> {
                Transaction.transactionMainFrame(R.string.checklist.toString(), CheckList(), fragmentManager)
            }
            R.id.nav_screen_mood_entry -> {
                Transaction.transactionMainFrame(R.string.mood_entry.toString(), MoodEntry(), fragmentManager)
            }
            R.id.nav_screen_mood_analysis -> {
                Transaction.transactionMainFrame(R.string.mood_analysis.toString(), MoodAnalysis(), fragmentManager)
            }
            R.id.nav_exit -> {
                finish()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}