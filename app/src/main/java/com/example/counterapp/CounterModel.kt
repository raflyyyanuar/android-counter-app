package com.example.counterapp

data class CounterModel(
    var count : Int
)

class CounterRepository {
    private var _counter = CounterModel(0)

    fun getCounter() = _counter

    fun increment() {
        _counter.count += 1
    }

    fun decrement() {
        _counter.count -= 1
    }
}