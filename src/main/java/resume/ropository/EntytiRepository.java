package resume.ropository;

import java.sql.SQLException;
import java.util.List;

public interface EntytiRepository<T> {
    T get(Integer id) throws SQLException;

    List<T> getAll() throws SQLException;

    T save(T t) throws SQLException;

    int remove(int id) throws SQLException;
}
