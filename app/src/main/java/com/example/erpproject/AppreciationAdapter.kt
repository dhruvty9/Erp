package com.example.erpproject

import android.content.res.ColorStateList
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.worksuite.databinding.ItemAppreciationBinding

class AppreciationAdapter(private val items: List<Appreciation>) :
    RecyclerView.Adapter<AppreciationAdapter.ViewHolder>() {

    // FIXED: Inherit from RecyclerView.ViewHolder
    class ViewHolder(val binding: ItemAppreciationBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemAppreciationBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        with(holder.binding) {
            nameText.text = item.name
            roleText.text = item.role
            appreciationTitle.text = item.title
            dateText.text = item.date

            appreciationIcon.setImageResource(item.iconRes)
            appreciationIcon.imageTintList = ColorStateList.valueOf(item.iconTint)
            iconContainer.setCardBackgroundColor(ColorStateList.valueOf(item.iconBgTint))

            profileImage.setImageResource(item.profileImgRes)
        }
    }

    override fun getItemCount() = items.size
}