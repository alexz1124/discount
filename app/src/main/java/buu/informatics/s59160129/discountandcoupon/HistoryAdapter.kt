package buu.informatics.s59160129.discountandcoupon

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HistoryAdapter: RecyclerView.Adapter<HistoryAdapter.ViewHolder>() {

    var list1 = listOf("Bigsu","Korea")
    var list2 = listOf("ice cream","dary")
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val itemName: TextView = itemView.findViewById(R.id.shortnessText)
        val itemShort: TextView = itemView.findViewById(R.id.nameText)
        val itemImage: ImageView = itemView.findViewById(R.id.imageView)


        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val view = layoutInflater
                    .inflate(R.layout.historylayout, parent, false)
                return ViewHolder(view)
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)

    }

    fun ViewHolder.bind(item: List<String>) {
        itemName.text = item.get(0)
        itemShort.text = item.get(1)
        itemImage.setImageResource(R.drawable.about)

    }


    var data =  listOf(list1,list2)
        set(value) {
            field = value
            notifyDataSetChanged()
        }

}
