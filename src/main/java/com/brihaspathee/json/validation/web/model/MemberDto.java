package com.brihaspathee.json.validation.web.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 13, November 2024
 * Time: 5:59 AM
 * Project: json-jakarta-validator
 * Package Name: com.brihaspathee.json.validation.web.model
 * To change this template use File | Settings | File and Code Template
 */
@Builder
public record MemberDto(

        @NotNull
        @NotBlank
        @Size(min = 3, max = 30)
        String firstName,

        @NotNull
        @NotBlank
        @Size(min = 3, max = 30)
        String lastName,

        @NotNull
        AddressDto addressDto
) {
}
