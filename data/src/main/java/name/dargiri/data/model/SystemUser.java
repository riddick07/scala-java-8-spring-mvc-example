package name.dargiri.data.model;

import name.dargiri.data.dto.enums.RelationTypeEnum;
import name.dargiri.data.dto.enums.UserRoleEnum;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "system_user")
public class SystemUser extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;
    private UserRoleEnum role;
    private String email;
    private String name;
    private String surname;
    private String phone;
    private Set<Person> persons = new HashSet<>();
    private Credentials credentials;

    public SystemUser() {
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

    @OneToMany(mappedBy = "systemUser", targetEntity = Person.class, cascade = CascadeType.ALL)
    public Set<Person> getPersons() {
        return persons;
    }

    @OneToOne(optional=false)
    @JoinColumn(
            name="credentials_id", unique=true, nullable=false, updatable=false)
    public Credentials getCredentials() {
        return credentials;
    }

    @Column
    public UserRoleEnum getRole() {
        return role;
    }

    @Column
    public String getEmail() {
        return email;
    }

    @Column
    public String getName() {
        return name;
    }

    @Column
    public String getSurname() {
        return surname;
    }

    @Column
    public String getPhone() {
        return phone;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPersons(Set<Person> persons) {
        this.persons = persons;
    }

    public void setRole(UserRoleEnum role) {
        this.role = role;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }
}
