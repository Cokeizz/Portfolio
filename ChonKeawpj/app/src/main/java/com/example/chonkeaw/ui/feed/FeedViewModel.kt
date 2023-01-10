package com.example.chonkeaw.ui.feed

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FeedViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Loading..."
    }
    val text: LiveData<String> = _text


}