package paba.b.latihanrecyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class adapterRevRevView(private val listwayang: ArrayList<wayang>) : RecyclerView
    .Adapter<adapterRevRevView.ListViewHolder> () {

        inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
            var _namaWayang = itemView.findViewById<TextView>(R.id.namaWayang)
            var _karakterWayang = itemView.findViewById<TextView>(R.id.karakterWayang)
            var _deskripsiWayang = itemView.findViewById<TextView>(R.id.deskripsiWayang)
            var _gambarWayang = itemView.findViewById<TextView>(R.id.gambarWayang)
        }
}