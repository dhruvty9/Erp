package com.example.erpproject

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.erpproject.databinding.DashboardBinding
import kotlin.jvm.java

class DashboardActivity : AppCompatActivity() {

    private lateinit var binding: DashboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewBinding
        binding = DashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Setup Toolbar
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)

        // Initialize Dashboard Logic
        setupNavigation()
        setupButtons()
        setupShiftSchedule()
        setupAdditionalSections()
    }

    private fun setupNavigation() {
        binding.btnAppreciations.setOnClickListener {
            startActivity(Intent(this, EmployeeAppreciationsActivity::class.java))
        }

        binding.btnBirthdays.setOnClickListener {
            startActivity(Intent(this, BirthdayActivity::class.java))
        }
    }

    private fun setupButtons() {
        binding.btnClockIn.setOnClickListener {
            Toast.makeText(this, "Clocking in...", Toast.LENGTH_SHORT).show()
        }

        binding.btnEmployeeShift.setOnClickListener {
            Toast.makeText(this, "Opening Shift Details...", Toast.LENGTH_SHORT).show()
        }
    }

    private fun setupShiftSchedule() {
        val shifts = listOf(
            Shift("07-04-2026", "Tuesday", "Day Shift", false),
            Shift("08-04-2026", "Wednesday", "Day Shift", false),
            Shift("09-04-2026", "Thursday", "Night Shift", true),
            Shift("10-04-2026", "Friday", "Night Shift", true),
            Shift("11-04-2026", "Saturday", "Off Day", false),
            Shift("12-04-2026", "Sunday", "Off Day", false),
            Shift("13-04-2026", "Monday", "Day Shift", false),
            Shift("14-04-2026", "Tuesday", "Day Shift", false),
            Shift("15-04-2026", "Wednesday", "Night Shift", true),
            Shift("16-04-2026", "Thursday", "Night Shift", true)
        )

        binding.rvShifts.layoutManager = LinearLayoutManager(this)
        binding.rvShifts.adapter = ShiftAdapter(shifts)
    }

    private fun setupAdditionalSections() {
        binding.cardOnLeave.setOnClickListener {
            Toast.makeText(this, "Viewing Leave Records", Toast.LENGTH_SHORT).show()
        }

        binding.cardWFH.setOnClickListener {
            Toast.makeText(this, "Viewing WFH Records", Toast.LENGTH_SHORT).show()
        }

        binding.cardJoinings.setOnClickListener {
            Toast.makeText(this, "Viewing Joinings & Anniversaries", Toast.LENGTH_SHORT).show()
        }

        binding.cardNoticePeriod.setOnClickListener {
            Toast.makeText(this, "Notice Period Duration", Toast.LENGTH_SHORT).show()
        }

        binding.cardProbationDate.setOnClickListener {
            Toast.makeText(this, "Probation Date Details", Toast.LENGTH_SHORT).show()
        }

        binding.cardInternshipDate.setOnClickListener {
            Toast.makeText(this, "Internship Date Details", Toast.LENGTH_SHORT).show()
        }

        binding.cardContractDate.setOnClickListener {
            Toast.makeText(this, "Contract Date Details", Toast.LENGTH_SHORT).show()
        }
    }
}
