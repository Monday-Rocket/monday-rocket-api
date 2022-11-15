package com.monday.rocket.acproject.controller.user

import com.fasterxml.jackson.databind.ObjectMapper
import com.monday.rocket.acproject.exception.TokenNotValidException
import com.monday.rocket.acproject.service.user.UserService
import org.springframework.boot.json.BasicJsonParser
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*


@RestController
@RequestMapping(value = ["/users"])
class UserController(
    val userService: UserService,
) {

    companion object {
        const val AUTH_TOKEN_HEADER_KEY = "X-Auth-Token"
    }

    @PostMapping
    fun create(
        @RequestHeader(AUTH_TOKEN_HEADER_KEY) token: String,
    ) {
        //https://www.baeldung.com/java-jwt-token-decode
        userService.add(token)
    }
}