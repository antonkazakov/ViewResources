package otus.gpb.homework.viewandresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class CartItem(
    val name: String,
    val caption: String,
    val price: String,
    val resourceId: Int
)

class CartActivity : AppCompatActivity() {
    private val cartItems = arrayListOf(
        CartItem("On the top","Caption1", "\$US,1.50",
            R.drawable.ph_item1),
        CartItem("Forever Friends", "Caption2", "\$US, 4.50",
            R.drawable.ph_item2),
        CartItem("Prototyping Kit", "Caption3", "\$US, 8.00",
            R.drawable.ph_item3),
        CartItem("Basket & Coffee", "Caption4", "\$US, 22.00",
            R.drawable.ph_item4)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        findViewById<RecyclerView>(R.id.cart_items_list).also {
            it.layoutManager = LinearLayoutManager(this)
            it.adapter = CartItemAdapter(cartItems)
        }
    }
}