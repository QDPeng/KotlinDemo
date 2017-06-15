package com.penck.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import com.penck.kotlin.notification.NotifyActivity
import com.penck.picinpic.VideoActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
    }


    fun onViewClick(view: View) {
        when (view.id) {
            R.id.notification_channel -> startActivity(NotifyActivity.getStartActivityIntent(this))
            R.id.picture_in_picture -> {
                startActivity(Intent(this@MainActivity, VideoActivity::class.java))
            }
            else -> Toast.makeText(this, "do nothing", Toast.LENGTH_LONG).show()
        }
    }
}
