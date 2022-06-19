package com.example.karakiaapp.ui.karakia

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.karakiaapp.R
import com.example.karakiaapp.ui.karakia.KarakiaData
import com.example.karakiaapp.ui.karakia.KarakiaAdapter
import com.example.karakiaapp.ui.viewpage.ViewAdapater
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class VideoFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_video, container, false)
        val id = arguments?.getInt("id")
        val itemName = arguments?.getString("itemName").toString()
        val shortname = arguments?.getString("itemName").toString()
        val inEnglish = arguments?.getString("inEnglish").toString()
        val inMaori = arguments?.getString("inMaori").toString()
        //Fragment name change
        (activity as AppCompatActivity).supportActionBar?.title = shortname
        //settings
        val videoLink = when (id) {
            2 -> R.raw.opening2
            3 -> R.raw.blessing
            4 -> R.raw.closing1
            5 -> R.raw.closing2
            else -> R.raw.opening1
        }
        val video =  view.findViewById<VideoView>(R.id.video_view)
        val uri = "android.resource://" + activity?.packageName + "/" + videoLink;
        video.setVideoURI(Uri.parse(uri))
        video.start()
        val mediaController = MediaController(this.context)
        video.setMediaController(mediaController)
        val karakiStringList = ArrayList<KarakiaData>()
        karakiStringList.add(
            KarakiaData(
                1,
                itemName,
                "",
                0,
                inEnglish,
                inMaori,
                videoLink
            )
        )
        //value setting
        val viewer= view.findViewById<ViewPager2>(R.id.pagerMain)
        val viewAdapter = activity?.let { ViewAdapater(it,karakiStringList) }
        viewer.adapter = viewAdapter
        //header setting
        var Tile = arrayOf("English","Māori")
        val Layout = view.findViewById<TabLayout>(R.id.tab_layout)
        TabLayoutMediator(Layout, viewer) { tab, position ->
            tab.text = Tile[position]
        }.attach()
        return view

    }
}