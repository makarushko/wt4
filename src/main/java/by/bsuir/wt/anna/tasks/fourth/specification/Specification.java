package by.bsuir.wt.dshparko.tasks.fourth.specification;

import java.util.List;

public interface Specification {
    String toSql();

    List<Object> getParameters();
}
