package com.nuuly;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Favorites {
    @Id
    private String sku;
    private int count;

    protected Favorites() {}

    public Favorites(String sku, int count) {
        this.sku = sku;
        this.count = count;
    }

    @Override
    public String toString() {
        return String.format(
                "Inventory[sku='%s', count=%d]",
                sku, count
        );
    }
}
