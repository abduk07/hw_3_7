package com.example.hw_3_7

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.hw_3_7.databinding.FragmentFirstBinding

class FirstFragment : Fragment(), Click {
    private lateinit var bundle: Bundle
    private lateinit var binding: FragmentFirstBinding
    private var arrayList: ArrayList<Phone> = ArrayList()
    private lateinit var adapter: PhoneAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initList()
    }

    private fun initList() {
        arrayList.add(
            Phone(
                "IPHONE 13", "https://softech.kg/image/cache/02bc8f67ae321d261ebdac4fc65402f3.png",
                112.6,
                "Система камер Pro получила самое масштабное обновление.\n" +
                        "Улучшенная аппаратная часть позволяет передать ещё больше деталей. " +
                        "Интеллектуальное программное обеспечение открывает новые возможности для " +
                        "съёмки фото и видео. Супербыстрый чип поддерживает все эти инновации. " +
                        "Так вы ещё не снимали.\n"
            )
        )
        arrayList.add(
            Phone(
                "IPHONE 13", "https://softech.kg/image/cache/02bc8f67ae321d261ebdac4fc65402f3.png",
                112.6,
                "Система камер Pro получила самое масштабное обновление.\n" +
                        "Улучшенная аппаратная часть позволяет передать ещё больше деталей. " +
                        "Интеллектуальное программное обеспечение открывает новые возможности для " +
                        "съёмки фото и видео. Супербыстрый чип поддерживает все эти инновации. " +
                        "Так вы ещё не снимали.\n"
            )
        )
        arrayList.add(
            Phone(
                "IPHONE 13", "https://softech.kg/image/cache/02bc8f67ae321d261ebdac4fc65402f3.png",
                112.6,
                "Система камер Pro получила самое масштабное обновление.\n" +
                        "Улучшенная аппаратная часть позволяет передать ещё больше деталей. " +
                        "Интеллектуальное программное обеспечение открывает новые возможности для " +
                        "съёмки фото и видео. Супербыстрый чип поддерживает все эти инновации. " +
                        "Так вы ещё не снимали.\n"
            )
        )
        adapter = PhoneAdapter(arrayList, this)
        binding.recyclerView.adapter = adapter
    }

    override fun clicked(position: Int) {
        var phone = arrayList[position]
        bundle = Bundle()
        println("shfbhskbfkh")
        bundle.putSerializable("phone", phone)
        val fragment = SecondFragment()
        fragment.arguments = bundle
        parentFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment)
            .addToBackStack(null).commit()
    }
}



