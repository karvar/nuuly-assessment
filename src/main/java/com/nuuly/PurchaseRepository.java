package com.nuuly;

import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Inventory, Long> {
    Inventory findById(long id);
}
