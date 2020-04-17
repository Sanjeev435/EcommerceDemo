package com.example.ecommerce.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IEntityRepository<T, ID> extends JpaRepository<T, ID>, Serializable {
}
