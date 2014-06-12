package name.dargiri.data.model;

import java.io.Serializable;

public interface Model<ID extends Serializable> {
    ID getId();

    void assignId();

    boolean isNew();


}
