package com.example.hw_3_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.hw_3_7.databinding.ItemPhoneBinding

class PhoneAdapter(var arrayList: ArrayList<Phone>, var click: FirstFragment) :
    RecyclerView.Adapter<PhoneAdapter.PhoneViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhoneViewHolder {
        return PhoneViewHolder(ItemPhoneBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: PhoneViewHolder, position: Int) {
        holder.onBind(arrayList[position])
        holder.itemView.setOnClickListener {
            click.clicked(position)
        }
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    class PhoneViewHolder(
        private val
        binding: ItemPhoneBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(phone: Phone) {
            Glide.with(binding.imageView)
                .load(phone.image)
                .into(binding.imageView)
            binding.tvName.text = phone.name
            binding.tvPrice.text = phone.price.toString()
            binding.description.text = phone.description
        }
    }
}
