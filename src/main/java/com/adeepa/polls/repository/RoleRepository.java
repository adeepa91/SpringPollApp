/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adeepa.polls.repository;

import com.adeepa.polls.model.Role;
import com.adeepa.polls.model.RoleName;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Adeepa91
 */
public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(RoleName rolename);
}
