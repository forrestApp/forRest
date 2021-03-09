package com.example.forrest.shared

class Greeting {
    fun greeting(): String {
        return "Nice to meet you, ${Platform().platform}!"
    }
}
