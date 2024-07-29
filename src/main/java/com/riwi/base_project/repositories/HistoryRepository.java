package com.riwi.base_project.repositories;

import com.riwi.base_project.domain.entities.HistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<HistoryEntity,Long>  {

}
