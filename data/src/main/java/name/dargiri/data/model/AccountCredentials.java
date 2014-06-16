package name.dargiri.data.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "account_credentials")
public class AccountCredentials extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;
    private String email;
    private String password;
    private String controlPhrase;
    private Account account;

    public AccountCredentials() {
    }

    @Override
    public void assignId() {
        id = UUID.randomUUID();
    }

    @Override
    @Id
    @Column(name = "id")
    public UUID getId() {
        return id;
    }

    @OneToOne(optional = false, mappedBy = "accountCredentials")
    public Account getAccount() {
        return account;
    }

    @Column(unique = true)
    public String getEmail() {
        return email;
    }

    @Column
    public String getPassword() {
        return password;
    }

    @Column(name = "system_user_control_phrase")
    public String getControlPhrase() {
        return controlPhrase;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setControlPhrase(String controlPhrase) {
        this.controlPhrase = controlPhrase;
    }
}
