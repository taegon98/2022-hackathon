package com.TumbleProject.Controller.cafe.repository;

import com.TumbleProject.Controller.cafe.domain.Files;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FilesRepository extends JpaRepository<Files, Long> {
    Optional<Files> findById(Long id);
}
