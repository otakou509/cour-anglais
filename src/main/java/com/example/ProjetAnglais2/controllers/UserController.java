/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjetAnglais2.controllers;

import com.example.ProjetAnglais2.models.User;
import com.example.ProjetAnglais2.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/inscription")
public class UserController {

    @Autowired
    private UserService userService;

    // Afficher le formulaire d'inscription
    @GetMapping
    public String afficherFormulaireInscription(Model model) {
        model.addAttribute("user", new User()); // Objet vide pour le formulaire
        return "inscription";  // Retourne la page inscription.html
    }

    // Gérer l'inscription de l'utilisateur
    @PostMapping
    public String inscrireUtilisateur(@ModelAttribute User user, Model model) {
        // Vérifier si l'email existe déjà
        if (userService.trouverParEmail(user.getEmail()) != null) {
            model.addAttribute("error", "Cet email est déjà utilisé !");
            return "inscription";
        }

        // Enregistrer l'utilisateur
        userService.enregistrerUtilisateur(user);
        // Rediriger vers la page de bienvenue
    return "redirect:/bienvenue";
}

// Afficher la page de bienvenue
@GetMapping("/bienvenue")
public String bienvenue() {
    return "bienvenue";
}
}