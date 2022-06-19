package com.example.karakiaapp.ui.viewpage

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.karakiaapp.R
import com.example.karakiaapp.ui.karakia.KarakiaData

class ViewFragment( exampleList: ArrayList<KarakiaData>): Fragment() {

    private var position: Int = 0
    private var exampleList= ArrayList<KarakiaData>()
    constructor(position: Int,exampleList :ArrayList<KarakiaData> ) : this(exampleList) {
        this.position = position
        this.exampleList = exampleList
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_page, container, false)
        //Assign Viewpage text
        val textDescription: TextView = root.findViewById(R.id.text_description)
        val currentItem = exampleList[0]
        val description = when (position + 1) {
            2 -> currentItem.inEnglish
            else -> currentItem.inMaori
        }
        textDescription.text = description
        return root
    }
}