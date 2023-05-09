package com.example.hw_3_7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.hw_3_7.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        val bundle = Bundle()
        val phone: Phone = arguments?.getSerializable("phone") as Phone
        binding.tvNameFinal.text = phone.name
        binding.tvPriceFinal.text = phone.price.toString()
        binding.description.text = phone.description
        if (phone != null) {
            Glide.with(binding.finalImageView)
                .load(phone.image)
                .into(binding.finalImageView)
        }
    }
}