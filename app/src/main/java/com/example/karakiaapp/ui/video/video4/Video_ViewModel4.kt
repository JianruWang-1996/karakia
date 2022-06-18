package com.example.karakiaapp.ui.video.video4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Video_ViewModel4 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is music video Fragment 4"
    }
    val text: LiveData<String> = _text
}