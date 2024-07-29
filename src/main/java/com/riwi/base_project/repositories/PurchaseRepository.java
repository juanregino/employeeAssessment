package com.riwi.base_project.repositories;

import com.riwi.base_project.domain.entities.PurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseEntity,Long> {
}
