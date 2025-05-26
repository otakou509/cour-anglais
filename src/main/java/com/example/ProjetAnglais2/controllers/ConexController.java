/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjetAnglais2.controllers;

/**
 *
 * @author owner
 */
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConexController {

    @GetMapping("/connexion")
    public String afficherPageConnexion(Model model) {
        return "connexion";  // Renvoie vers la page connexion.html
    }
}