package otus.gpb.homework.viewandresources

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class CartItemAdapter(private val data: ArrayList<CartItem>): RecyclerView.Adapter<CartItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartItemViewHolder {
        val root = LayoutInflater.from(parent.context)
            .inflate(R.layout.cart_item, parent,false)
        return CartItemViewHolder(root)
    }

    override fun onBindViewHolder(holder: CartItemViewHolder, position: Int) {
        val item = data[position]
        holder.itemName.text = item.name
        holder.itemCaption.text = item.caption
        holder.itemPrice.text = item.price
        holder.itemPic.setImageResource(item.resourceId)
    }

    override fun getItemCount(): Int = data.size
}

class CartItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemName: TextView
        val itemCaption: TextView
        val itemPrice: TextView
        val itemPic: ImageView

        init {
            itemName = itemView.findViewById(R.id.cart_item_name)
            itemCaption = itemView.findViewById(R.id.cart_item_caption)
            itemPrice = itemView.findViewById(R.id.cart_item_price)
            itemPic = itemView.findViewById(R.id.cart_item_image)
        }
}