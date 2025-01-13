package com.bookmyshow.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SignUpUserDtoResponse {

    private Long userId;
    private ResponseStatus responseStatus;

    public SignUpUserDtoResponse(Long userId, ResponseStatus responseStatus) {
        this.userId = userId;
        this.responseStatus = responseStatus;
    }
}