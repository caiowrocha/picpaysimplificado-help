package com.picpay_simplificado.picpay_simplificado.dtos;

import com.picpay_simplificado.picpay_simplificado.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String firstName, String lastName, String document, String email, String password, BigDecimal balance, UserType userType) {
}
