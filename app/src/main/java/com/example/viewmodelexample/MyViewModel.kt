package com.example.viewmodelexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel:ViewModel() {

    var counter = MutableLiveData<Int>()

    fun addone(){
        val count = counter.value ?: 0
        counter.value = count + 1
    }

    fun resest(){
        counter.value = 0
    }
}