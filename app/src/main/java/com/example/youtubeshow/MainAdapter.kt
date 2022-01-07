package com.example.youtubeshow

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MainAdapter : RecyclerView.Adapter<CustomViewHolder>() {
 val vide_titles= listOf<String>("rangers","animater","bloodMoney","muay","giants","kenton","badgirl","hurray")
    //create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        // inflates the video_row_view
        // that is used to hold list item
        val layout_inflater = LayoutInflater.from(parent.context)
        val cell_row=layout_inflater.inflate(R.layout.video_row, parent, false)

        return CustomViewHolder(cell_row)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        holder.txtvid.text=vide_titles[position]

    }

    override fun getItemCount(): Int {
         return vide_titles.size
    }

}

// Holds the views for adding it to image and text
class CustomViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
    val txtvid=itemView.findViewById<TextView>(R.id.txt_vid)
}