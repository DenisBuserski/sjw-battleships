package com.battleships.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDTO {
    @Size(min = 3, max = 10)
    @NotBlank
    private String username;

    @Size(min = 5, max = 20)
    @NotBlank
    private String fullName;

    @Email
    @NotBlank
    private String email;

    @Size(min = 3)
    @NotBlank
    private String password;

    @Size(min = 3)
    @NotBlank
    private String confirmPassword;
}
