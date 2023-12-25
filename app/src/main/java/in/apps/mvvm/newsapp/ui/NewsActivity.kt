package `in`.apps.mvvm.newsapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import `in`.apps.mvvm.newsapp.R

class NewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        findViewById<BottomNavigationView>(R.id.bottomNavigationView).setupWithNavController(findNavController(R.id.newsHostFrag))
    }
}