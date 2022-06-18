package com.example.karakiaapp.ui.history.history4

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel4 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "There are karakia for all occasions – birth, death, sickness, warfare, waka building or the growing and harvesting of kai."
    }
    val text: LiveData<String> = _text
}