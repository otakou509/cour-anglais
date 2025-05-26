/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjetAnglais2.controllers;

/**
 *
 * @author owner
 */

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/bienvenue")
    public String bienvenue() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null || !authentication.isAuthenticated()) {
            System.out.println("Utilisateur non authentifié !");
            return "redirect:/connexion"; // Redirige vers la page de connexion si non connecté
        }
        System.out.println("Utilisateur connecté : " + authentication.getName());
        return "bienvenue";
    }

    @GetMapping("/choisir-niveau")
    public String choisirNiveau() {
        return "choisir-niveau";
    }
}
