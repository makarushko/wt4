package by.bsuir.wt.anna.tasks.fourth.builder;

import by.bsuir.wt.anna.tasks.fourth.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
