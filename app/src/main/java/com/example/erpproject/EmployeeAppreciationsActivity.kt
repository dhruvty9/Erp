package com.example.erpproject

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.erpproject.databinding.ActivityEmployeeAppreciationsBinding

class EmployeeAppreciationsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEmployeeAppreciationsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmployeeAppreciationsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val dummyData = listOf(
            Appreciation(
                "Angelica O'Keefe D",
                "Trainee",
                "Top Code Contributor",
                "18-03-2026",
                R.drawable.ic_thumbs_up,
                Color.parseColor("#4B5563"),
                Color.parseColor("#F3F4F6"),
                R.mipmap.ic_launcher
            ),
            Appreciation(
                "Alison Hintz PhD",
                "Team Lead",
                "Most Improved Employee",
                "18-03-2026",
                R.drawable.ic_medal,
                Color.parseColor("#0891B2"),
                Color.parseColor("#E1F5FE"),
                R.mipmap.ic_launcher
            ),
            Appreciation(
                "Dr. Chadd Cormier",
                "Junior",
                "Best Technical Solution",
                "18-03-2026",
                R.drawable.ic_puzzle,
                Color.parseColor("#4B5563"),
                Color.parseColor("#F3F4F6"),
                R.mipmap.ic_launcher
            ),
            Appreciation(
                "Alison Hintz PhD",
                "Team Lead",
                "Best New Hire",
                "18-03-2026",
                R.drawable.ic_thumbs_up,
                Color.parseColor("#0EA5E9"),
                Color.parseColor("#F0F9FF"),
                R.mipmap.ic_launcher
            )
        )

        binding.appreciationsRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.appreciationsRecyclerView.adapter = AppreciationAdapter(dummyData)
    }
}
