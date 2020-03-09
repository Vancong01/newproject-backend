package com.horizonevent.project.repository;

import java.util.Optional;

import com.horizonevent.project.models.user.ERole;
import com.horizonevent.project.models.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}