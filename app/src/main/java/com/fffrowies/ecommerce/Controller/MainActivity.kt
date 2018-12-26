package com.fffrowies.ecommerce.Controller

import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.fffrowies.ecommerce.Adapter.ProductsAdapter
import com.fffrowies.ecommerce.R
import com.fffrowies.ecommerce.Services.DataService

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val products = DataService.product

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount += 2
        }

        recycler_view.apply {
            layoutManager = GridLayoutManager(this@MainActivity, spanCount)
            adapter = ProductsAdapter(products)
        }
    }
}