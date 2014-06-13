package name.dargiri.data.dto;

import name.dargiri.data.dto.enums.RelationTypeEnum;
import name.dargiri.data.model.Person;

import java.util.UUID;

/**
 * Created by dmitry.karpenko on 12-Jun-14.
 */
public class RelativeDTO {

    public final UUID id;
    public final RelationTypeEnum relation;
    public final PersonDTO person;

    public RelativeDTO(UUID id, RelationTypeEnum relation, PersonDTO person) {
        this.id = id;
        this.relation = relation;
        this.person = person;
    }

    @Override
    public String toString() {
        return "RelativeDTO{" +
                "id=" + id +
                ", relation=" + relation +
                ", person=" + person +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public RelationTypeEnum getRelation() {
        return relation;
    }

    public PersonDTO getPerson() {
        return person;
    }
}
