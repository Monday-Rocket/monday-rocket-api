package com.monday.rocket.acproject.service.user

import com.monday.rocket.acproject.domain.User
import com.monday.rocket.acproject.exception.TokenNotValidException
import com.monday.rocket.acproject.repository.UserRepository
import org.springframework.boot.json.BasicJsonParser
import org.springframework.stereotype.Service
import java.util.*

@Service
class UserServiceImpl(
    userRepository: UserRepository,
) : UserService {
    override fun add(token: String): User {
        val chunks = token.split("\\.")
        val decoder = Base64.getUrlDecoder()
        val payload = decoder.decode(chunks[1]).toString()
        val jsonParser = BasicJsonParser()
        val jsonArray = jsonParser.parseMap(payload)

        if (!jsonArray.containsKey("sub")) {
            throw TokenNotValidException.byToken(payload)
        }

        val uid = jsonArray["user_id"].toString()

        val user = findById(uid) ?:
    }

    override fun findById(id: String): User {
        TODO("Not yet implemented")
    }

    override fun update(token: String, nickname: String, jobGroupId: Int): User {
        TODO("Not yet implemented")
    }
}