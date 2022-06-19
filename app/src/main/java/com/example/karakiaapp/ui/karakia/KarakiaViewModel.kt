package com.example.karakiaapp.ui.karakia

import android.os.Handler
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.karakiaapp.R

class KarakiaViewModel : ViewModel() {
    private var karakilist: MutableLiveData<List<KarakiaData>>? = null
    internal fun getList(): MutableLiveData<List<KarakiaData>> {
        if (karakilist == null) {
            karakilist = MutableLiveData()
            loadKarakiList()
        }
        return karakilist as MutableLiveData<List<KarakiaData>>
    }
    private fun loadKarakiList() {
        val myHandler = Handler()
        myHandler.postDelayed({
            val karakiStringList = ArrayList<KarakiaData>()
            karakiStringList.add(KarakiaData(1,"Opening","Karakia Timatanga",
                R.drawable.ic_home,"","", R.raw.opening1))
            karakiStringList.add(KarakiaData(2,"Opening 2","Karakia Timatanga",
                R.drawable.ic_home,"","", R.raw.opening2))
            karakiStringList.add(KarakiaData(3,"Blessing for food","Karakia ki te kai",
                R.drawable.ic_home,"","", R.raw.blessing))
            karakiStringList.add(KarakiaData(4,"Closing","Karakia Whakamutunga",
                R.drawable.ic_home,"","", R.raw.closing1))
            karakiStringList.add(KarakiaData(5,"Closing 2","Karakia Whakamutunga",
                R.drawable.ic_home,"","", R.raw.closing2))
            val seed = System.nanoTime()
            karakilist!!.postValue(karakiStringList)//for background postValue
        }, 2000)

    }
}