package name.dargiri.data.dto;

import name.dargiri.data.model.SystemUser;

import java.util.UUID;

public class CredentialsDTO {

    public final UUID id;
    public final String email;
    public final String password;
    public final String controlPhrase;
    public final SystemUser systemUser;


    public CredentialsDTO(UUID id, String email, String password, String controlPhrase, SystemUser systemUser) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.controlPhrase = controlPhrase;
        this.systemUser = systemUser;
    }

    public UUID getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getControlPhrase() {
        return controlPhrase;
    }

    public SystemUser getSystemUser() {
        return systemUser;
    }
}
