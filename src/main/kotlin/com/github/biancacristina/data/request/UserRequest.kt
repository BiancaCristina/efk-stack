package com.github.biancacristina.data.request

import io.micronaut.core.annotation.Introspected

@Introspected
data class UserRequest (
    val username: String,
    val name: String
)