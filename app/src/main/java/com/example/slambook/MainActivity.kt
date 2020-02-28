package com.example.slambook

import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.example.slambook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val user: UserInfo = UserInfo("")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.submit.setOnClickListener { showDetails() }
    }


    private fun showDetails(){

        binding.apply {

            nicknameHeader.textAlignment = TextView.TEXT_ALIGNMENT_CENTER
            nicknameHeader.textSize = 30f
            nicknameHeader.text = nicknameEdit.text.toString()


        }

    }

}
