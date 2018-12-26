package com.fffrowies.ecommerce.Adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.fffrowies.ecommerce.Model.Product
import com.fffrowies.ecommerce.R
import com.squareup.picasso.Picasso

class ProductsAdapter(private val products: ArrayList<Product>) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {
    override fun onBindViewHolder(p0: ProductsAdapter.ViewHolder, p1: Int) {
        Picasso.get().load(products[p1].photoUrl).into(p0.image)
        p0.title.text = products[p1].title
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ProductsAdapter.ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.product_row, p0, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = products.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.photo)
        val title: TextView = itemView.findViewById(R.id.title)
    }

}