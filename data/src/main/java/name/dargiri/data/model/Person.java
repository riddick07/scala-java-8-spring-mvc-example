package name.dargiri.data.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "person")
public class Person extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;
    private String name;
    private String surname;
    private String mobilePhone;
    private String personalPhone;
    private String secondName;
    private String sex;
    private String dob;
    private List<Address> addresses;
    private String jobPosition;
    private List<Account> accounts;
    private String aboutMe;
    private SystemUser systemUser;
    private Set<Relative> relations = new HashSet<Relative>();

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

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @OneToMany(mappedBy = "person", targetEntity = Relative.class, cascade = CascadeType.ALL)
    public Set<Relative> getRelations() {
        return relations;
    }

    @OneToMany(mappedBy = "person", targetEntity = Address.class, cascade = CascadeType.ALL)
    public List<Address> getAddresses() {
        return addresses;
    }

    @OneToMany(mappedBy = "person", targetEntity = Account.class, cascade = CascadeType.ALL)
    public List<Account> getAccounts() {
        return accounts;
    }

    @ManyToOne
    @JoinColumn(name = "system_user_id")
    public SystemUser getSystemUser() {
        return systemUser;
    }

    @Column
    public String getSurname() {
        return surname;
    }

    @Column
    public String getMobilePhone() {
        return mobilePhone;
    }

    @Column
    public String getPersonalPhone() {
        return personalPhone;
    }

    @Column
    public String getSecondName() {
        return secondName;
    }

    @Column
    public String getSex() {
        return sex;
    }

    @Column(name = "date_of_bith")
    public String getDob() {
        return dob;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSystemUser(SystemUser systemUser) {
        this.systemUser = systemUser;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public void setPersonalPhone(String personalPhone) {
        this.personalPhone = personalPhone;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String username) {
        this.name = username;
    }

    public void setRelations(Set<Relative> relations) {
        this.relations = relations;
    }
}
