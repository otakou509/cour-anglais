

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjetAnglais2.services;

/**
 *
 * @author owner
 */


import com.example.ProjetAnglais2.models.User;
import com.example.ProjetAnglais2.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

   @Autowired
private PasswordEncoder passwordEncoder;  // Change en PasswordEncoder

     @Autowired
    private UserRepository userRepository;



    public User enregistrerUtilisateur(User user) {
        user.setMotDePasse(passwordEncoder.encode(user.getMotDePasse())); // Correction ici
        return userRepository.save(user);
    }

    public User trouverParEmail(String email) {
        return userRepository.findByEmail(email).orElse(null);
    }
}

