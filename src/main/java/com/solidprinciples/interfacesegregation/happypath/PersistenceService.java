package src.main.java.com.solidprinciples.interfacesegregation.happypath;

import java.util.List;

public interface PersistenceService<T extends Entity> {
    public void save(T entity);
    public void delete(T entity);
    public T findById(Long id);
}
