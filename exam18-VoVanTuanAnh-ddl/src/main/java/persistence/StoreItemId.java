package persistence;

import java.io.Serializable;

public class StoreItemId implements Serializable {
    private Integer store;
    private Integer item;

    public StoreItemId() {}

    public StoreItemId(Integer store, Integer item) {
        this.store = store;
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StoreItemId that = (StoreItemId) o;
        return store.equals(that.store) && item.equals(that.item);
    }

    @Override
    public int hashCode() {
        return store.hashCode() + item.hashCode();
    }
}
