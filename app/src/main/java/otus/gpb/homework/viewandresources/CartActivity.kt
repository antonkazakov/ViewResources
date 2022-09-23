package otus.gpb.homework.viewandresources

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import otus.gpb.homework.viewandresources.databinding.ActivityCartBinding

class CartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.cartItemCake.apply {
            cartItemImage.setImageDrawable(
                ContextCompat.getDrawable(
                    this@CartActivity,
                    R.drawable.cake
                )
            )
            cartItemTitle.text = getString(R.string.cake_title)
            cartItemSubtitle.text = getString(R.string.caption)
            cartItemCost.text = getString(R.string.cost, 1.50)
        }

        binding.cartItemVinylRecord.apply {
            cartItemImage.setImageDrawable(
                ContextCompat.getDrawable(
                    this@CartActivity,
                    R.drawable.vinyl_record
                )
            )
            cartItemTitle.text = getString(R.string.vinyl_record_title)
            cartItemSubtitle.text = getString(R.string.caption)
            cartItemCost.text = getString(R.string.cost, 4.50)
        }

        binding.cartItemAlarm.apply {
            cartItemImage.setImageDrawable(
                ContextCompat.getDrawable(
                    this@CartActivity,
                    R.drawable.cake
                )
            )
            cartItemTitle.text = getString(R.string.alarm_title)
            cartItemSubtitle.text = getString(R.string.caption)
            cartItemCost.text = getString(R.string.cost, 8.00)
        }

        binding.cartItemStrawberry.apply {
            cartItemImage.setImageDrawable(
                ContextCompat.getDrawable(
                    this@CartActivity,
                    R.drawable.strawberry
                )
            )
            cartItemTitle.text = getString(R.string.strawberry_title)
            cartItemSubtitle.text = getString(R.string.caption)
            cartItemCost.text = getString(R.string.cost, 22.00)
        }

    }

}
