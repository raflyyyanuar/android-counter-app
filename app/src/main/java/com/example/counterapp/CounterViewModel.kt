package com.example.counterapp

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _count = mutableIntStateOf(0)

    val count : MutableIntState = _count

    fun increment() {
        _count.intValue += 1
    }

    fun decrement() {
        _count.intValue -= 1
    }
}
