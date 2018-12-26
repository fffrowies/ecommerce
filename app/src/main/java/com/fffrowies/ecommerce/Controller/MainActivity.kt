package com.fffrowies.ecommerce.Controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager
import com.fffrowies.ecommerce.Adapter.ProductsAdapter
import com.fffrowies.ecommerce.Model.Product
import com.fffrowies.ecommerce.R

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val products = arrayListOf<Product>()

        for (i in 0..100) {
            // products.add(Product("Tarkus CD", "http://via.placeholder.com/350/ffff00/ff0000", 12.50))
            products.add(
                Product(
                "Tarkus CD",
                "https://images-na.ssl-images-amazon.com/images/I/61YKyEEL%2BuL._SX425_.jpg",
                12.50
                )
            )
        }

        recycler_view.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = ProductsAdapter(products)
        }
    }
}
