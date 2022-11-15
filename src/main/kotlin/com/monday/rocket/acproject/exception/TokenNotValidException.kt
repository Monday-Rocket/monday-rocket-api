package com.monday.rocket.acproject.exception

class TokenNotValidException(message: String) : RuntimeException(message) {
    companion object {
        fun byToken(token: String): TokenNotValidException {
            val message = "token is not valid not found, token: $token"
            return TokenNotValidException(message)
        }
    }
}