/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.jp.Repository;

import com.portfolio.jp.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author usuario
 */
public interface IPersonaRepository extends JpaRepository<Persona,Long> {
    
}
