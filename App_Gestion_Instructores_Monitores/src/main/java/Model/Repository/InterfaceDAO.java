package Model.Repository;

import java.sql.SQLException;
import java.util.List;

public interface InterfaceDAO<T> {
    public void createTable() throws SQLException;

    public T readOne(int id) throws SQLException;

    public T create(T t) throws SQLException;

    public void delete(int id) throws SQLException;

    public T update(T t) throws SQLException;

    public List<T> readEveryone() throws SQLException;
}
