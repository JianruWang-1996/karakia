package com.example.karakiaapp.ui.history.history2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel2 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Karakia are Māori incantations and prayers that are used to invoke spiritual guidance and protection, pay honor to those who came before us, and to bless the space."
    }
    val text: LiveData<String> = _text
}