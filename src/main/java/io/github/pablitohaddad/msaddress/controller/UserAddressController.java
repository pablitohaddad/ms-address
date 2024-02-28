package io.github.pablitohaddad.msaddress.controller;

import io.github.pablitohaddad.msaddress.dto.UserCreateAddressDTO;
import io.github.pablitohaddad.msaddress.dto.UserResponseAddressDTO;
import io.github.pablitohaddad.msaddress.service.UserAddressService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/v1/address")
@RequiredArgsConstructor
@RestController
public class UserAddressController {
    private final UserAddressService addressService;
    @PostMapping
    public ResponseEntity<UserResponseAddressDTO> complementAddress(@Valid @RequestBody UserCreateAddressDTO createDto){
        UserResponseAddressDTO address = addressService.complementAddress(createDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(address);
    }

}
