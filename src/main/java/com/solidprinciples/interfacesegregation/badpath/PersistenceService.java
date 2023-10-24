package src.main.java.com.solidprinciples.interfacesegregation.badpath;

import java.util.List;

public interface PersistenceService<T extends Entity> {
    public void save(T entity);
    public void delete(T entity);
    public T findById(Long id);
    public List<T> findByName(String name);
}
