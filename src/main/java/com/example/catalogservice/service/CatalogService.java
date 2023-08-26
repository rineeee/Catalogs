package com.example.catalogservice.service;

import com.example.catalogservice.domain.entity.CatalogEntity;

public interface CatalogService {
    Iterable<CatalogEntity> getAllCatalogs();
}
