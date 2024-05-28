package com.niraj.inventory_service.repository;

import com.niraj.inventory_service.dto.InventoryResponse;
import com.niraj.inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
   // boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode, int quantity);

    List<Inventory> findBySkuCodeIn(List<String> skuCode);
}