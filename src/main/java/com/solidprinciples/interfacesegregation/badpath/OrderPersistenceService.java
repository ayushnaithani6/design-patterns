package src.main.java.com.solidprinciples.interfacesegregation.badpath;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderPersistenceService implements PersistenceService<Order> {
    private static final Map<Long, Order> ORDERS = new HashMap<>();
    @Override
    public void save(Order entity) {
        synchronized (ORDERS) {
            ORDERS.put(entity.getId(), entity);
        }
    }

    @Override
    public void delete(Order entity) {
        synchronized (ORDERS) {
            ORDERS.remove(entity.getId(), entity);
        }
    }

    @Override
    public Order findById(Long id) {
        synchronized (ORDERS) {
            return ORDERS.get(id);
        }
    }

    @Override
    public List<Order> findByName(String name) {
        // There is no attribute called name in order, so this method will remain empty forever
        return null;
    }
}
