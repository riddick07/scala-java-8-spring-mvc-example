package name.dargiri.data.model;

import name.dargiri.data.dto.enums.RelationTypeEnum;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "media_data_storage")
public class DataStorage extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;
    private Account account;
    private String path;
    private String name;
    private String catalog;
    private String type;
    private String description;
    private Long date;

    public DataStorage() {
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


    public void setId(UUID id) {
        this.id = id;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
