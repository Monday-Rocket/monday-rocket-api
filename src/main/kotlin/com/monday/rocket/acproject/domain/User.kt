package com.monday.rocket.acproject.domain

data class User(
    val uid: String,
    val nickname: String,
    val jobGroup: JobGroup,
) {
    companion object {
        val default: User = User(
            uid = "test",
            nickname = "test",
            jobGroup = JobGroup(
                id = 0,
                name = "test"
            )
        )
    }
}