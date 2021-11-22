package archetype.app.dao;

import java.util.Collection;

public interface CommonDao<T> {

    T save(T entity);

    T findById(String id);

    Collection<T> findAll();

    void delete(String id);
}
