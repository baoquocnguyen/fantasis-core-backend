package com.fantasis.core.app.repository;

import com.fantasis.core.app.models.applications.ApplicationSetting;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ApplicationSettingRepository extends MongoRepository<ApplicationSetting, String> {
  Optional<ApplicationSetting> findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByapplicationname(String applicationname);
}
