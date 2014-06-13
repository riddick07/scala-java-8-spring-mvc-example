package name.dargiri.data.model;

import name.dargiri.data.dto.enums.RelationTypeEnum;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "relation")
public class Relative extends AbstractModel<UUID> implements Model<UUID> {

    private UUID id;
    private Person person;
    private RelationTypeEnum relationType;

    public Relative() {
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
    @JoinColumn(name="person_id", nullable=false)
    public Person getPerson() {
        return person;
    }

    @Column(name = "type")
    public RelationTypeEnum getRelationType() {
        return relationType;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setRelationType(RelationTypeEnum relation) {
        this.relationType = relation;
    }
}
