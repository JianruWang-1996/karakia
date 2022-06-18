package com.example.karakiaapp.ui.video.video3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Video_ViewModel3 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is music video Fragment 3"
    }
    val text: LiveData<String> = _text
}