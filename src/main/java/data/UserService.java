package data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//@Service
@Component
public class UserService {

    @PersistenceContext
    private EntityManager entityManager;

    UserService2 userService2 = new UserService2();

    @Transactional
    public List<User> allUsers() {
        return entityManager.createQuery("From User", User.class).getResultList();
    }


    @Transactional
    public void add(User user) {
        entityManager.persist(user);
        //entityManager.remove(user);
    }

    @Transactional
    public void delete(User user) {
        entityManager.remove(user);
    }

    @Transactional
    public void change(User user) {
        entityManager.merge(user);
    }

    @Transactional
    public User getById(int id) {
        return entityManager.find(User.class, id);
    }
}
