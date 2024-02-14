package com.example.a7minuteworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import android.widget.Toast
import com.example.a7minuteworkout.databinding.ActivityMainBinding
import com.example.a7minuteworkout.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = inflate(layoutInflater)
        setContentView(binding?.root)

       // val flstartButton: FrameLayout = findViewById(R.id.flstart)
        binding?.flstart?.setOnClickListener {
            val intent = Intent(this,ExerciseActivity::class.java)
            startActivity(intent)


        }

    }

    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}