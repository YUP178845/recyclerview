package com.soponivtk.recyclerview24

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.soponivtk.recyclerview24.databinding.RecyclerviewRowBinding

class RecyclerViewAdapter(var produckData: List<
        ProduckModel>):RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: RecyclerviewRowBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewAdapter.ViewHolder {
        val binding = RecyclerviewRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        with(holder){
            with(produckData[position]){
                binding.tvProductName.text =  this.produckName
                binding.tvProductDetail.text = this.produckDetail
                binding.tvProductPrice.text = this.produckPrice
            }
        }
    }

    override fun getItemCount(): Int {
        return produckData.size
    }
}