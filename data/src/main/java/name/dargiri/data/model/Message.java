package name.dargiri.data.model;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "message")
public class Message extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;
    private String message;
    private Long date;
    private Account account;

    public Message() {
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
    @JoinColumn(name = "account_id", nullable = false)
    public Account getAccount() {
        return account;
    }

    @Column
    public String getMessage() {
        return message;
    }

    @Column
    public Long getDate() {
        return date;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
