package com.monday.rocket.acproject.service.user

import com.monday.rocket.acproject.domain.User
import org.springframework.stereotype.Service

interface UserService {
    fun add(token: String): User
    fun findById(id: String): User
    fun update(token: String, nickname: String, jobGroupId: Int): User
}