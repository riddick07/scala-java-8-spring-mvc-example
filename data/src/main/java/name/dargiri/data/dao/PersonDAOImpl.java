package name.dargiri.data.dao;

import name.dargiri.data.model.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public class PersonDAOImpl extends AbstractBaseDAO<Person, UUID> implements PersonDAO {

    @Override
    public List<Person> findAll() {
        return findByQuery("select p from Person p");
    }
}
