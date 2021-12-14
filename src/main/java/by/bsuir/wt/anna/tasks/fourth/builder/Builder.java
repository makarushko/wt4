package by.bsuir.wt.dshparko.tasks.fourth.builder;

import by.bsuir.wt.dshparko.tasks.fourth.exception.RepositoryException;

import java.sql.ResultSet;

public interface Builder<T> {
    T build(ResultSet resultSet) throws RepositoryException;
}
