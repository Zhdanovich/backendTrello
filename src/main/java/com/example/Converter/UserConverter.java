package com.example.Converter;

import com.example.DTO.UserDto;
import com.example.User;

public class UserConverter {

    public UserDto convert (User user) {

        UserDto userDto = new UserDto();

        userDto.setNameSurname(user.getNameSurname());
        return userDto;
    }
}
