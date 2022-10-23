package com.example.lessonkotlin25

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }
    fun onClick(view: View){
        val i = Intent()
        i.putExtra("key1", "done")
        setResult(RESULT_OK, i)
        Log.d("MainActivity2Log", "Result from MainActivity $i")
        finish()
    }

}