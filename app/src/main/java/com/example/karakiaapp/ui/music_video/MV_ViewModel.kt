package com.example.karakiaapp.ui.music_video

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MV_ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is music video Fragment"
    }
    val text: LiveData<String> = _text
}