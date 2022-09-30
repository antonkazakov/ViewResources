package otus.gpb.homework.viewandresources

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.ActionBar
import androidx.appcompat.widget.Toolbar

class CartActivity : AppCompatActivity() {
    lateinit var listOrderView: ListView
    lateinit var textItems:TextView
    lateinit var listOrder:MutableList<UserOrder>
    lateinit var formatter :String
    lateinit var adapter:CartAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        findViewById<Toolbar>(R.id.toolbar_cart).setNavigationOnClickListener { finish() }
        listOrder = mutableListOf(
            UserOrder(R.drawable.cart_imgproduct_1, getString(R.string.name_order_1), getString(R.string.about_prodect), 1.5),
            UserOrder(R.drawable.cart_imgproduct_2, getString(R.string.name_order_2), getString(R.string.about_prodect), 4.5),
            UserOrder(R.drawable.cart_imgproduct_3, getString(R.string.name_order_3), getString(R.string.about_prodect), 8.0),
            UserOrder(R.drawable.cart_imgproduct_4, getString(R.string.name_order_4), getString(R.string.about_prodect), 22.0)
        )
        textItems=findViewById(R.id.text_userCart)
        formatter = getString(R.string.product_costs)
        createOrderAdapter()

    }

    private fun createOrderAdapter() {
        listOrderView = findViewById(R.id.list_userOrder)

        adapter = CartAdapter(this, listOrder,formatter) {
        listOrder.remove(it)
            updateTextItems(listOrder.size)
            adapter.notifyDataSetChanged()

        }
        listOrderView.adapter = adapter
        updateTextItems(listOrder.size)

    }

    private fun updateTextItems(values:Int){
        if(values==0) textItems.text = resources.getString(R.string.cart_not_items)
        else textItems.text = resources.getQuantityString(R.plurals.carts_item,values,values)
    }
}