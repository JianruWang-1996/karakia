package com.example.karakiaapp.ui.video.video5

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Video_ViewModel5 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is music video Fragment 5"
    }
    val text: LiveData<String> = _text
}