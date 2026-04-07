package com.example.erpproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.worksuite.databinding.ActivityBirthdayBinding

class BirthdayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBirthdayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Initialize ViewBinding for Birthday Activity
        binding = ActivityBirthdayBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
