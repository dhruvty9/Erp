package com.example.erpproject

data class Shift(
    val date: String,
    val day: String,
    val type: String, // "Day Shift" or "Night Shift"
    val canRequestChange: Boolean
)
