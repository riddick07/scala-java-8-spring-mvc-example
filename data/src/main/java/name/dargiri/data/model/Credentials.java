package name.dargiri.data.model;

import name.dargiri.data.dto.enums.RelationTypeEnum;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "credentials")
public class Credentials extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;
//    private SystemUser systemUser;
    private String email;
    private String password;
    private String controlPhrase;

    public Credentials() {
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

//    public SystemUser getSystemUser() {
//        return systemUser;
//    }

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

//    public void setSystemUser(SystemUser systemUser) {
//        this.systemUser = systemUser;
//    }

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
