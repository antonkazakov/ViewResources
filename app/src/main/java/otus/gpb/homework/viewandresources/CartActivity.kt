package otus.gpb.homework.viewandresources

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources

class CartActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        findViewById<View>(R.id.fixBikeItem).apply {
            findViewById<ImageView>(R.id.itemImageView).setImageDrawable(
                AppCompatResources.getDrawable(
                    context,
                    R.drawable.fix_gear
                )
            )
            findViewById<TextView>(R.id.itemProductNameTW).text =
                context.getString(R.string.fix_gear)
            findViewById<TextView>(R.id.itemPrice).text =
                context.getString(R.string.price).plus("20.00")
        }

        findViewById<View>(R.id.skateItem).apply {
            findViewById<ImageView>(R.id.itemImageView).setImageDrawable(
                AppCompatResources.getDrawable(
                    context,
                    R.drawable.skate
                )
            )
            findViewById<TextView>(R.id.itemProductNameTW).text =
                context.getString(R.string.skateboard)
            findViewById<TextView>(R.id.itemPrice).text =
                context.getString(R.string.price).plus("15.00")
        }

        findViewById<View>(R.id.rollersItem).apply {
            findViewById<ImageView>(R.id.itemImageView).setImageDrawable(
                AppCompatResources.getDrawable(
                    context,
                    R.drawable.rollers
                )
            )
            findViewById<TextView>(R.id.itemProductNameTW).text =
                context.getString(R.string.rollers)
            findViewById<TextView>(R.id.itemPrice).text =
                context.getString(R.string.price).plus("5.00")
        }

        findViewById<View>(R.id.kickScooterItem).apply {
            findViewById<ImageView>(R.id.itemImageView).setImageDrawable(
                AppCompatResources.getDrawable(
                    context,
                    R.drawable.kick_scooter
                )
            )
            findViewById<TextView>(R.id.itemProductNameTW).text =
                context.getString(R.string.kick_scooter)
            findViewById<TextView>(R.id.itemPrice).text =
                context.getString(R.string.price).plus("10.00")
        }

        findViewById<TextView>(R.id.orderDetailTextView).text = "Subtotal \nShipping \nTax"

        findViewById<TextView>(R.id.orderCountTextView).text = "50.00\n 5.00\n10.00"

        findViewById<TextView>(R.id.amountTextView).text = "65.00"

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_cart, menu)
        return super.onCreateOptionsMenu(menu)
    }
}