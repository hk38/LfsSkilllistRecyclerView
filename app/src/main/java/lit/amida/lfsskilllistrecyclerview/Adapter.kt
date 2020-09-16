package lit.amida.lfsskilllistrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val context: Context): RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        val image = v.findViewById<ImageView>(R.id.imageView)
        val name = v.findViewById<TextView>(R.id.textName)
        val detail = v.findViewById<TextView>(R.id.textDescription)
    }

    val items: MutableList<CourseData> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(context).inflate(R.layout.item_course_data_cell, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.image.setImageResource(item.resID)
        holder.name.text = item.name
        holder.detail.text = item.description
    }

    fun addAll(items: List<CourseData>){
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return items.size
    }
}