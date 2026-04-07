package com.example.erpproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.erpproject.databinding.ItemShiftBinding

class ShiftAdapter(private val shifts: List<Shift>) :
    RecyclerView.Adapter<ShiftAdapter.ShiftViewHolder>() {

    class ShiftViewHolder(val binding: ItemShiftBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShiftViewHolder {
        val binding = ItemShiftBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ShiftViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ShiftViewHolder, position: Int) {
        val shift = shifts[position]
        val binding = holder.binding

        binding.tvDate.text = shift.date
        binding.tvDay.text = shift.day
        binding.tvShiftType.text = shift.type

        // Apply Shift Colors (Day, Night, or Off Day)
        when (shift.type) {
            "Day Shift" -> {
                binding.tvShiftType.setBackgroundResource(R.drawable.badge_day_shift)
                binding.tvShiftType.setTextColor(ContextCompat.getColor(holder.itemView.context, R.color.shift_day_text))
            }
            "Night Shift" -> {
                binding.tvShiftType.setBackgroundResource(R.drawable.badge_night_shift)
                binding.tvShiftType.setTextColor(ContextCompat.getColor(holder.itemView.context, R.color.shift_night_text))
            }
            else -> {
                // For "Off Day" or others, use a neutral look
                binding.tvShiftType.setBackgroundResource(R.drawable.badge_off_day)
                binding.tvShiftType.setTextColor(ContextCompat.getColor(holder.itemView.context, R.color.dark_gray))
            }
        }

        // Handle the "Request Change" button visibility
        if (shift.canRequestChange) {
            binding.btnRequestChange.visibility = View.VISIBLE
            binding.tvNoAction.visibility = View.GONE
        } else {
            binding.btnRequestChange.visibility = View.GONE
            binding.tvNoAction.visibility = View.VISIBLE
        }
    }

    override fun getItemCount() = shifts.size
}
