package io.github.pablitohaddad.msaddress.dto.mapper;

import io.github.pablitohaddad.msaddress.dto.UserCreateAddressDTO;
import io.github.pablitohaddad.msaddress.dto.UserResponseAddressDTO;
import io.github.pablitohaddad.msaddress.entities.UserAddress;
import org.modelmapper.ModelMapper;

public class UserAddressMapper {
    public static UserAddress toUser(UserCreateAddressDTO dto) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(dto, UserAddress.class);
    }

    public static UserResponseAddressDTO toDTO(UserAddress address) {
        ModelMapper mapper = new ModelMapper();
        return mapper.map(address, UserResponseAddressDTO.class);
    }
}
