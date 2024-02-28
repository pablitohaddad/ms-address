package io.github.pablitohaddad.msaddress.repository;

import io.github.pablitohaddad.msaddress.entities.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long> {

}
