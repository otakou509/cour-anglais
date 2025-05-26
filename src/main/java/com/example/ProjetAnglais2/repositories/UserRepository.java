/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.ProjetAnglais2.repositories;

/**
 *
 * @author owner
 */
import com.example.ProjetAnglais2.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository <User,Long> {
Optional<User>findByEmail(String email);    

    }
