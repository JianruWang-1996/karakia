package com.example.karakiaapp.ui.karakia

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.os.bundleOf
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.karakiaapp.R
import kotlinx.android.synthetic.main.home_section.view.*

class KarakiaAdapter(val exampleList: ArrayList<KarakiaData>):
    RecyclerView.Adapter<KarakiaAdapter.KarakiaItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KarakiaItemViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.home_section, parent, false)
        return KarakiaItemViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: KarakiaItemViewHolder, position: Int) {
        val currentItem = exampleList[position]
        holder.imageView.setImageResource(currentItem.imageUrl)
        holder.textView1.text = currentItem.itemName
        holder.textView2.text = currentItem.shortName
        holder.itemView.setOnClickListener ( object : View.OnClickListener {
            override fun onClick(v: View?) {
                val bundle = bundleOf(
                    "id" to currentItem.itemId,
                    "imageUrl" to currentItem.imageUrl,
                    "itemName" to currentItem.itemName,
                    "shortName" to currentItem.shortName,
                    "inEnglish" to currentItem.inEnglish,
                    "inMaori" to currentItem.inMaori,)

                Navigation.findNavController(holder.itemView)
                    .navigate(R.id.action_nav_home_to_nowPlayingFragment, bundle)
            }

        })
    }
    override fun getItemCount() = exampleList.size
    inner class KarakiaItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView: ImageView = itemView.image_view
        val textView1: TextView = itemView.text_view_1
        val textView2: TextView = itemView.text_view_2
    }

}