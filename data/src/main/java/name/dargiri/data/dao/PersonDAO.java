package name.dargiri.data.dao;

import name.dargiri.data.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDAO extends BaseDAO<Person, UUID> {
    @Override
    default Class<Person> getEntityClass() {
        return Person.class;
    }

    List<Person> findAll();
}
