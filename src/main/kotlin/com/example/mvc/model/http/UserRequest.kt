package com.example.mvc.model.http

import com.example.mvc.annotation.StringFormatDateTime
import jakarta.validation.constraints.AssertTrue
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.PositiveOrZero
import jakarta.validation.constraints.Size
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

data class UserRequest(
    @field:NotEmpty
    @field:Size(min = 2, max = 8)
    var name: String?= null,

    @field:PositiveOrZero
    var age: Int?= null,

    @field:Email
    var email: String?= null,

    @field:NotBlank
    var address: String?= null,

    @field:Pattern(regexp = "^\\d{2,3}-\\d{3,4}-\\d{4}\$")
    var phoneNumber: String?= null,

    @field:StringFormatDateTime(pattern = "yyyy-MM-dd HH:mm:ss", message = "패턴이 올바르지 않습니다.")
    var createdAt: String?= null,

//    @JsonProperty("phone_number")
//    var phoneNumber: String?= nul
) {
//    @AssertTrue(message = "생성일자의 패턴은 yyyy-MM-dd HH:mm:ss 여야 합니다.")
//    private fun isValidCratedAt(): Boolean {
//        return try {
//            LocalDateTime.parse(this.createdAt, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"))
//            true
//        } catch (e: Exception) {
//            false
//        }
//    }
}