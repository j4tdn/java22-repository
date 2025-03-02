package persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "T03_ITEM_DETAIL")

public class ItemDetail {
    @Id
    @Column(name = "C03_ITEM_DETAIL_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "C03_ITEM_ID")
    private Item item;
}
