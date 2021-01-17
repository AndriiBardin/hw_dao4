package taxi.dao;

import java.util.List;
import java.util.Optional;

import taxi.lib.Dao;
import taxi.model.Car;

@Dao
public interface CarDao {
    Car create(Car car);

    Optional<Car> get(Long id);

    List<Car> getAll();

    Car update(Car car);

    boolean delete(Long id);

    List<Car> getAllById(Long driverId);
}