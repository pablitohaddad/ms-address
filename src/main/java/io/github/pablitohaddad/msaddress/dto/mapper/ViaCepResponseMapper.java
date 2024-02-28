package io.github.pablitohaddad.msaddress.dto.mapper;

import io.github.pablitohaddad.msaddress.dto.ViaCepResponseDTO;
import io.github.pablitohaddad.msaddress.entities.UserAddress;

public class ViaCepResponseMapper {
    public static void complementAddress(ViaCepResponseDTO dto, UserAddress address){
        if(address.getCity()==null)
            address.setCity(dto.getCity());
        if(address.getStreet()==null)
            address.setStreet(dto.getStreet());
        if(address.getState()==null)
            address.setState(dto.getState());
    }
}
