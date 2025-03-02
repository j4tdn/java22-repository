package persistence;

import java.io.Serializable;
import java.util.Objects;

public class OrderDetailId implements Serializable {
    private Integer order;
    private Integer itemDetail;

    public OrderDetailId() {}

    public OrderDetailId(Integer order, Integer itemDetail) {
        this.order = order;
        this.itemDetail = itemDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderDetailId that = (OrderDetailId) o;
        return Objects.equals(order, that.order) && Objects.equals(itemDetail, that.itemDetail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, itemDetail);
    }
}
