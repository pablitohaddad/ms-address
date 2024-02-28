package io.github.pablitohaddad.msaddress.service;

import io.github.pablitohaddad.msaddress.consumer.ViaCepConsumerFeign;
import io.github.pablitohaddad.msaddress.dto.UserCreateAddressDTO;
import io.github.pablitohaddad.msaddress.dto.UserResponseAddressDTO;
import io.github.pablitohaddad.msaddress.dto.ViaCepResponseDTO;
import io.github.pablitohaddad.msaddress.dto.mapper.UserAddressMapper;
import io.github.pablitohaddad.msaddress.dto.mapper.ViaCepResponseMapper;
import io.github.pablitohaddad.msaddress.entities.UserAddress;
import io.github.pablitohaddad.msaddress.exceptions.PostalCodeNotFoundException;
import io.github.pablitohaddad.msaddress.repository.UserAddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserAddressService {
    private final UserAddressRepository userAddressRepository;
    private final ViaCepConsumerFeign viaCepConsumerFeign;

    @Transactional
    public UserResponseAddressDTO complementAddress(UserCreateAddressDTO dto){
        UserAddress address = UserAddressMapper.toUser(dto);
        ViaCepResponseDTO viaCepResponseDTO = viaCepConsumerFeign.getAddressByPostalCode(dto.getPostalCode());
        if (viaCepResponseDTO.getPostalCode()==null) throw new PostalCodeNotFoundException("The postal code provided is invalid");
        ViaCepResponseMapper.complementAddress(viaCepResponseDTO, address);
        userAddressRepository.save(address);
        return UserAddressMapper.toDTO(address);
    }



}
