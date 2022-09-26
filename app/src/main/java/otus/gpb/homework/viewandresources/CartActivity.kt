package otus.gpb.homework.viewandresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.TextView
import androidx.activity.OnBackPressedCallback
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import otus.gpb.homework.viewandresources.adapters.CartAdapter
import otus.gpb.homework.viewandresources.adapters.CartItem

class CartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                finish()
            }
        })
        val adapter = CartAdapter(
            arrayOf(
                CartItem(
                    title = "On the top ",
                    subTitle = "Caption",
                    image = R.mipmap.ic_image_cake_foreground,
                    amount = 1.50
                ),
                CartItem(
                    title = "Forever Friends",
                    subTitle = "Caption",
                    image = R.mipmap.ic_music_disks,
                    amount = 4.50
                ),
                CartItem(
                    title = "Prototyping Kit ",
                    subTitle = "Caption",
                    image = R.mipmap.ic_clock,
                    amount = 8.00
                ),
                CartItem(
                    title = "Basket & Coffee ",
                    subTitle = "Caption",
                    image = R.mipmap.ic_flower,
                    amount = 8.00
                )

            )
        )
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

        val textCounter = findViewById<TextView>(R.id.textCounter)
        textCounter.text = getString(R.string.items_in_your_cart, adapter.itemCount)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_cart, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.getItemId()) {
            android.R.id.home -> {
                onBackPressedDispatcher.onBackPressed()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}

