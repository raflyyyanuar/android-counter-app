package com.example.counterapp

import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    private val _repository = CounterRepository()
    private val _count = mutableIntStateOf(_repository.getCounter().count)

    val count : MutableIntState = _count

    fun increment() {
        _repository.increment()
        _count.intValue = _repository.getCounter().count
    }

    fun decrement() {
        _repository.decrement()
        _count.intValue = _repository.getCounter().count
    }
}
