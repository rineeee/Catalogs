package com.example.catalogservice.infrastructure.db.jpa;

import com.example.catalogservice.domain.entity.CatalogEntity;
import org.springframework.data.repository.CrudRepository;

public interface CatalogRepository extends CrudRepository<CatalogEntity, Long> {
    CatalogEntity findByProductId(String productId);
}
