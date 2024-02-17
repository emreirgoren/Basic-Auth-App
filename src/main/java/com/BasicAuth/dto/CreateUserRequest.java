package com.BasicAuth.dto;

import com.BasicAuth.model.Role;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Builder
public record CreateUserRequest(

        String name,
        String username,

        String password,

        Set<Role> authorities

){

}
