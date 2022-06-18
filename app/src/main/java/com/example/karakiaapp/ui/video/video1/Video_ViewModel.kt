package com.example.karakiaapp.ui.video.video1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Video_ViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is music video Fragment"
    }
    val text: LiveData<String> = _text
}