package com.example.project2200

import android.app.Activity
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.Toast
import android.widget.VideoView
import com.example.project2200.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

  //  private var videoPlayer:VideoView? = null
  //  private var videoController: MediaController? = null
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bottomNavigation.setOnItemSelectedListener {
            Toast.makeText(this@MainActivity,"Item Clicked", Toast.LENGTH_SHORT).show()
            return@setOnItemSelectedListener true
        }



       // videoPlayer = findViewById(R.id.videoPlayer)
       // configVideoPlayer()


    }

//    private fun configVideoPlayer(){
//        if(videoController == null){
//            videoController = MediaController(this)
//            videoController!!.setAnchorView(this.videoPlayer)
//
//        }
//        videoPlayer!!.setMediaController(videoController)
//        videoPlayer!!.setVideoURI(Uri.parse(
//            "android.resource://"+packageName+"/"+R.raw.test1
//
//        ))
//        videoPlayer!!.requestFocus()
//        videoPlayer!!.pause()
//        videoPlayer!!.resume()
//        videoPlayer!!.setOnErrorListener{
//                _, _, _ ->
//            Toast.makeText(applicationContext,"Getting Error",Toast.LENGTH_SHORT).show()
//            false
//        }
//        videoPlayer!!.setOnCompletionListener {
//            Toast.makeText(applicationContext,"Video Completed",Toast.LENGTH_SHORT).show()
//        }
//
//    }


}