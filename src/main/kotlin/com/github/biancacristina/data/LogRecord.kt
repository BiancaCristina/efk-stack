package com.github.biancacristina.data

import java.time.LocalDateTime

data class LogRecord (
    val type: String,
    val uuid: String,
    val created: LocalDateTime = LocalDateTime.now()
)