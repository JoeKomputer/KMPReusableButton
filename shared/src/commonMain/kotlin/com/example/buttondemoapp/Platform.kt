package com.example.buttondemoapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform