package co.istad.springsecuritybasic.model.dto;

import lombok.Builder;

@Builder
public record UserRequest(
        String email,
        String password
){
}
