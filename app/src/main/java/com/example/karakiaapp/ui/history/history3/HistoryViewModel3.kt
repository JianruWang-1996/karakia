package com.example.karakiaapp.ui.history.history3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HistoryViewModel3 : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Traditionally, Māori would say a karakia of acknowledgement and thanks to the gods of the food that they were to partake of. They would also offer some food to the deities or atua. There were also strict rules about not eating various foods together as it would cause the deities and gods to clash."
    }
    val text: LiveData<String> = _text
}