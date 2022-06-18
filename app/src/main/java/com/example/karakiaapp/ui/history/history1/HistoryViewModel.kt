package com.example.karakiaapp.ui.history.history1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "The power of karakia comes from the atua, and through karakia, the sacredness of the person and their links to atua are confirmed."
    }
    val text: LiveData<String> = _text
}