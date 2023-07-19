package com.example.cl.individual15kotlinjavamodulo5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cl.individual15kotlinjavamodulo5.databinding.ActivityMainBinding
import com.example.cl.individual15kotlinjavamodulo5.databinding.ItemLayoutBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        inirAdapter()
    }

    private fun inirAdapter() {
        val adapter = Adapter()
        val pokedex = Pokedex.getPokedex()
        adapter.setData(pokedex)
        binding.RV.adapter = adapter

    }
}