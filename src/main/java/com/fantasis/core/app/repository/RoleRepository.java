package com.fantasis.core.app.repository;

import java.util.Optional;

import com.fantasis.core.app.models.users.ERole;
import com.fantasis.core.app.models.users.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
