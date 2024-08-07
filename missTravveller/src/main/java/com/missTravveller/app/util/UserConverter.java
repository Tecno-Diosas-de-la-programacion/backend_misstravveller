package com.missTravveller.app.util;

import java.util.ArrayList;
import java.util.List;

import com.missTravveller.app.dto.UserDTO;
import com.missTravveller.app.model.User;

public final class UserConverter {
	
	private UserConverter() { }
	
	public static UserDTO userToUserDto( User user ) {
		UserDTO userDto = new UserDTO();
		
		userDto.setSerialNumber( user.getId());
		userDto.setFirstName( user.getName());
		userDto.setLastName( user.getMotherLastName() + user.getFatherLastName());
		userDto.setEmail( user.getEmail());
		
		return userDto;
	}
	
	public static Iterable<UserDTO> userToUserDto( Iterable<User> users ) {
		List<UserDTO> usersDto = new ArrayList<>();
		
		for (User user : users) {
			usersDto.add( userToUserDto(user) );
		}
		
		return usersDto;
	}

	

}