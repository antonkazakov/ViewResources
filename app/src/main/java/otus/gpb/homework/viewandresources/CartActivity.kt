package otus.gpb.homework.viewandresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

data class CartItem(
    val name: String,
    val caption: String,
    val price: String,
    val imageUrl: String
)

class CartActivity : AppCompatActivity() {
    private val cartItems = arrayListOf(
        CartItem("On the top","Caption1", "\$US,1.50",
            "https://i.pinimg.com/originals/4d/a0/4b/4da04bba4b96c86f3d0ef9b7cd0801a2.jpg"),
        CartItem("Forever Friends", "Caption2", "\$US, 4.50",
            "https://audiodigital.ru/image/cache/catalog/demo/000536-440x440w.jpg"),
        CartItem("Prototyping Kit", "Caption3", "\$US, 8.00",
            "https://www.distinctlybritish.com/Files/102248/Img/19/IMP-118x800.jpg"),
        CartItem("Basket & Coffee", "Caption4", "\$US, 22.00",
            "https://i.pinimg.com/736x/2d/c8/47/2dc84713f50a92160caa76beb1c15976.jpg")
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