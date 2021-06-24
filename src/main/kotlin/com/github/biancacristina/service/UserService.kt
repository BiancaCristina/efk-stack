package com.github.biancacristina.service

import com.github.biancacristina.data.LogRecord
import com.github.biancacristina.data.model.User
import com.github.biancacristina.data.request.UserRequest
import com.github.biancacristina.data.response.UserResponse
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.util.*
import javax.inject.Singleton

@Singleton
class UserService {
    private val logger: Logger = LoggerFactory.getLogger(UserService::class.java)

    fun save(request: UserRequest): UserResponse {
        val user: User = User(uuid = UUID.randomUUID().toString(),
                              username = request.username,
                              name = request.name)
        logger.info(LogRecord(type = "SAVE_USER", uuid = user.uuid).toString())
        return UserResponse.from(user)
    }

    fun delete(uuid: String) {
        logger.info(LogRecord(type = "DELETE_USER", uuid = uuid).toString())
    }
}