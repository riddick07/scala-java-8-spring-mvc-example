package name.dargiri.data.model;

import name.dargiri.data.dto.enums.AccountTypeEnum;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "account")
public class Account extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;
    private AccountTypeEnum type;
    private String title;
    private Person person;
    private List<Message> messages;
    private List<DataStorage> media;
    private AccountCredentials accountCredentials;

    public Account() {
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

    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    public Person getPerson() {
        return person;
    }

    @OneToMany(mappedBy = "account", targetEntity = Message.class, cascade = CascadeType.ALL)
    public List<Message> getMessages() {
        return messages;
    }

    @OneToMany(mappedBy = "account", targetEntity = DataStorage.class, cascade = CascadeType.ALL)
    public List<DataStorage> getMedia() {
        return media;
    }

    @OneToOne(optional=false)
    @JoinColumn(
            name="account_credentials_id", unique=true, nullable=false, updatable=false)
    public AccountCredentials getAccountCredentials() {
        return accountCredentials;
    }

    @Column
    public AccountTypeEnum getType() {
        return type;
    }

    @Column
    public String getTitle() {
        return title;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setType(AccountTypeEnum type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAccountCredentials(AccountCredentials accountCredentials) {
        this.accountCredentials = accountCredentials;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public void setMedia(List<DataStorage> media) {
        this.media = media;
    }
}
