package com.example.catalogservice.domain.service;

import com.example.catalogservice.domain.entity.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
