package data;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class UserService2 {

    @PersistenceContext
    private EntityManager entityManager2;

    @Transactional
    public void delete(User user) {
        //int a = 5/0;
        entityManager2.remove(user);
    }

    @Override
    public String toString() {
        return "UserService2{" +
                "entityManager=" + entityManager2 +
                '}';
    }
}
