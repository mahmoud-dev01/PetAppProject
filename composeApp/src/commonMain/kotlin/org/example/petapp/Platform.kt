package org.example.petapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform