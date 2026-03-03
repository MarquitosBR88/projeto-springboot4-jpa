package com.projetonelio.course.repositories;

import com.projetonelio.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
