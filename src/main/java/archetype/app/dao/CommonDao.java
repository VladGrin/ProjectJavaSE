package archetype.app.dao;

import archetype.app.entity.Entity;

import java.util.Collection;

public interface CommonDao<T extends Entity> {

    T save(T entity);

    T findById(String id);

    Collection<T> findAll();

    void delete(String id);
}
//
//@Data
//class Order extends Entity{
//    private String name;
//}
//@Data
//class Car extends Entity {
//    private String model;
//}
//class Shop{
//    // ....
//}