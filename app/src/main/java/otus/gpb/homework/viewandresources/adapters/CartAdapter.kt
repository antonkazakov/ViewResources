package otus.gpb.homework.viewandresources.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import otus.gpb.homework.viewandresources.R

class CartAdapter(private val dataSet: Array<CartItem>) :
    RecyclerView.Adapter<CartAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textTitle: TextView
        val textSubTitle: TextView
        val textAmount: TextView
        val imageView: ImageView

        init {
            textTitle = view.findViewById(R.id.textTitle)
            textSubTitle = view.findViewById(R.id.textSubTitle)
            textAmount = view.findViewById(R.id.textAmount)
            imageView = view.findViewById(R.id.imageView)

        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): CartAdapter.ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_cart, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: CartAdapter.ViewHolder, position: Int) {
        viewHolder.textTitle.text = dataSet[position].title
        viewHolder.textSubTitle.text = dataSet[position].subTitle
        viewHolder.textAmount.text = "\$US,${dataSet[position].amount}"
        viewHolder.imageView.setImageResource(dataSet[position].image)
    }

    override fun getItemCount() = dataSet.size

}