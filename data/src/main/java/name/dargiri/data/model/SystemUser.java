package name.dargiri.data.model;

import name.dargiri.data.dto.enums.RelationTypeEnum;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "system_users")
public class SystemUser extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;

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

}
