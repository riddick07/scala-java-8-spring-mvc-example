package name.dargiri.data.dto;

import name.dargiri.data.model.Account;

import java.util.UUID;

public class AccountCredentialsDTO {

    public final UUID id;
    public final String email;
    public final String password;
    public final String controlPhrase;
    public final Account account;

    public AccountCredentialsDTO(UUID id, String email, String password, String controlPhrase, Account account) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.controlPhrase = controlPhrase;
        this.account = account;
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

    public Account getAccount() {
        return account;
    }
}
