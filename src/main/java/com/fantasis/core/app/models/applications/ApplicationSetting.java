package com.fantasis.core.app.models.applications;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Document(collection = "applications")
public class ApplicationSetting {
  @Id
  private String id;

  @NotBlank
  @Size(max = 20)
  private String applicationname;

  @NotBlank
  @Size(max = 20)
  private String userdefined;

  @NotBlank
  @Size(max = 20)
  private String defaut;

  @NotBlank
  @Size(max = 20)
  private String username;

  @NotBlank
  @Size(max = 120)
  private String password;

  public ApplicationSetting() {
  }


  public ApplicationSetting(@NotBlank @Size(max = 20) String applicationname, @NotBlank @Size(max = 20) String userdefined, @NotBlank @Size(max = 20) String defaut, @NotBlank @Size(max = 20) String username, @NotBlank @Size(max = 120) String password) {
    this.applicationname = applicationname;
    this.userdefined = userdefined;
    this.defaut = defaut;
    this.username = username;
    this.password = password;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getApplicationname() {
    return applicationname;
  }

  public void setApplicationname(String applicationname) {
    this.applicationname = applicationname;
  }

  public String getUserdefined() {
    return userdefined;
  }

  public void setUserdefined(String userdefined) {
    this.userdefined = userdefined;
  }

  public String getDefaut() {
    return defaut;
  }

  public void setDefaut(String defaut) {
    this.defaut = defaut;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
