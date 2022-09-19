package otus.gpb.homework.viewandresources

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

typealias OnDeletPressListener = (UserOrder) -> Unit

class CartAdapter(

    val context: Context,
    val listOrder: List<UserOrder>,
    val costString:String,
    private val onDeletPressListener: OnDeletPressListener
) : BaseAdapter(),View.OnClickListener {

    override fun getCount(): Int {
        return listOrder.size
    }

    override fun getItem(position: Int): Any {
        return listOrder[position]
    }

    override fun getItemId(position: Int): Long {
        return -1
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var adview = convertView?.tag as? View ?: createView(context, parent)
        val product = getItem(position) as UserOrder
        val image = adview.findViewById<ImageView>(R.id.image_order)
        val nameOrder = adview.findViewById<TextView>(R.id.name_order)
        val aboutOrder = adview.findViewById<TextView>(R.id.name_about)
        val costOrder = adview.findViewById<TextView>(R.id.cost_order)
        val deleteOrder = adview.findViewById<ImageView>(R.id.order_del)
        image.setImageResource(product.imageOrder)
        nameOrder.text = product.nameOrder
        aboutOrder.text = product.aboutOrder
        costOrder.text = String.format(costString,product.costOrder.toFloat())
        deleteOrder.tag=product
        return adview
    }

    fun createView(context: Context, parent: ViewGroup): View {
        var adview: View = LayoutInflater
            .from(context)
            .inflate(R.layout.list_cart_order_items, parent, false);
        adview.findViewById<ImageView>(R.id.order_del).setOnClickListener(this)
        adview.tag = adview
        return adview
    }

    override fun onClick(v: View) {
        val oneProductDel = v.tag as UserOrder
        onDeletPressListener.invoke(oneProductDel)
    }

}