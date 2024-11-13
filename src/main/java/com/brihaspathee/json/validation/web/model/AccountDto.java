package com.brihaspathee.json.validation.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.UUID;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 13, November 2024
 * Time: 5:57 AM
 * Project: json-jakarta-validator
 * Package Name: com.brihaspathee.json.validation.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Builder
public record AccountDto(
        @NotNull
        @NotBlank
        @Size(min = 5, max = 15)
        String accountNumber,

        UUID accountSK,

        @NotNull
        @NotBlank
        @Size(min = 5, max = 15)
        String lobTypeCode,

        @NotNull
        MemberDto memberDto
) {
}
