package com.example.karakiaapp.ui.video.video2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Video_ViewModel2 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is music video Fragment 2"
    }
    val text: LiveData<String> = _text
}