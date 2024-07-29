package com.riwi.base_project.repositories;

import com.riwi.base_project.domain.entities.PurchaseProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseProductRepository extends JpaRepository<PurchaseProductEntity,Long> {
}
