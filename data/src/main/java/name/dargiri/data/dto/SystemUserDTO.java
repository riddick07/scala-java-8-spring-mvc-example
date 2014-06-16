package name.dargiri.data.dto;

import name.dargiri.data.dto.enums.UserRoleEnum;
import name.dargiri.data.model.AbstractModel;
import name.dargiri.data.model.Credentials;
import name.dargiri.data.model.Model;
import name.dargiri.data.model.Person;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class SystemUserDTO {

    public final UUID id;
    public final UserRoleEnum role;
    public final String email;
    public final String name;
    public final String surname;
    public final String phone;
    public final Set<Person> persons = new HashSet<>();
    public final Credentials credentials;

    public SystemUserDTO(UUID id, UserRoleEnum role, String email, String name, String surname, String phone, Credentials credentials) {
        this.id = id;
        this.role = role;
        this.email = email;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.credentials = credentials;
    }

    public UUID getId() {
        return id;
    }

    public UserRoleEnum getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public Set<Person> getPersons() {
        return persons;
    }

    public Credentials getCredentials() {
        return credentials;
    }
}
