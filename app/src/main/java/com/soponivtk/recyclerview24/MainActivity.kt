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

    private lateinit var binding: ActivityMainBinding

    private lateinit var recyclerViewAdapter: RecyclerViewAdapter

    private lateinit var produckList: List<ProduckModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        loadProduck()

        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)

        binding.recyclerview.setLayoutManager(layoutManager)

        recyclerViewAdapter = RecyclerViewAdapter(produckList)

        binding.recyclerview.adapter = recyclerViewAdapter

    }

    private fun loadProduck() {
        produckList = listOf(
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),
            ProduckModel("iphone 16","Datail of iphone 16","39,900"),)
    }
}