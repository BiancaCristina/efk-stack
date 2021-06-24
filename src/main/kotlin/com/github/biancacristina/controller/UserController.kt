package com.github.biancacristina.controller

import com.github.biancacristina.data.request.UserRequest
import com.github.biancacristina.data.response.UserResponse
import com.github.biancacristina.service.UserService
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Post

@Controller("/users")
class UserController(private val userService: UserService) {

    @Post
    fun save(@Body request: UserRequest): UserResponse {
        return userService.save(request)
    }

    @Delete("/{uuid}")
    fun delete(uuid: String) {
        userService.delete(uuid)
    }
}