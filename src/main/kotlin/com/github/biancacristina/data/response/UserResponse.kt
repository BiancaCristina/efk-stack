package com.github.biancacristina.data.response

import com.github.biancacristina.data.model.User
import io.micronaut.core.annotation.Introspected

@Introspected
data class UserResponse (
    val name: String
) {
    companion object {
        fun from(user: User): UserResponse {
            return UserResponse(name = user.name)
        }
    }
}