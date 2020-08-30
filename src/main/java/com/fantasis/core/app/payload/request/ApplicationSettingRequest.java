package com.fantasis.core.app.payload.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

public class ApplicationSettingRequest {
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
