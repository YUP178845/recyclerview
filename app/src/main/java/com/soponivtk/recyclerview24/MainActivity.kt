package com.soponivtk.recyclerview24

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.soponivtk.recyclerview24.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: AppCompatActivity

    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    private lateinit var produckList: List<ProduckModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        loadProduck()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)

        binding.recyclerview.setLayoutManger(LayoutManager)

    }

    private fun loadProduck() {
        TODO("Not yet implemented")
    }
}