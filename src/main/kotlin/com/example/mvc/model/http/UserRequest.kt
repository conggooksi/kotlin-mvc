package com.example.mvc.model.http

data class UserRequest(
    var name: String? = null,
    var age: Int? = null,
    var address: String? = null,
    var email: String? = null
) {
}