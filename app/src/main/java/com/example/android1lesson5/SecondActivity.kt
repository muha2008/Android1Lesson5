package com.example.android1lesson5

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.android1lesson5.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private val carsListAdapter = CarListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fillCarsList()
        setupRecyclerView()
    }

    private fun fillCarsList() {
        val carsList = listOf(
            Car("Bugatti Divo", R.drawable.bugatti, 4, 380),
            Car("Bmw", R.drawable.ferarri, 4, 290),
            Car("bmw f90", R.drawable.bmwf90, 4, 240),
            Car("Lamborghini Aventador", R.drawable.lambotghini, 4, 230),
            Car("Ford Mustang", R.drawable.mustang, 4, 210),
            Car("Lamborghini", R.drawable.lamborghini, 4, 420),
        )
        carsListAdapter.setData(carsList)
    }

    private fun setupRecyclerView() {
        binding.rvCar.adapter = carsListAdapter
    }
}