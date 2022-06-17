package com.example.karakiaapp.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutusViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is About Us Fragment"
    }
    val text: LiveData<String> = _text
}