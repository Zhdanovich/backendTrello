package com.example.converter;

import com.example.DTO.UserDto;
import com.example.entity.User;

public class UserConverter {

    public UserDto convert (User user) {

        UserDto userDto = new UserDto();

        userDto.setNameSurname(user.getNameSurname());
        return userDto;
    }
}
