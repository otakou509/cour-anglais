/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ProjetAnglais2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NiveauController {

    @GetMapping("/niveau")
    public String afficherNiveau(@RequestParam String type, Model model) {
        model.addAttribute("niveau", type);
        return "niveau"; // Affiche la page de bienvenue
    }

   
    
    @GetMapping("/cours/debutant")
    public String coursDebutant() {
        return "cours/debutant"; // Page pour le niveau débutant
    }

    @GetMapping("/cours/avance")
    public String coursAvance() {
        return "cours/avance"; // Page pour le niveau avancé
    }

    @GetMapping("/cours/extreme")
    public String coursExtreme() {
        return "cours/extreme"; // Page pour le niveau extrême
    }
    
    //PARTIE DEBUTANT 
    @GetMapping("/cours/debutant/lecon1")
    public String lecon1(){
            return "cours/debutant/lecon1";// page pour la permiere lecon
}
    @GetMapping("/cours/debutant/lecon2")
    public String lecon2(){
        return"cours/debutant/lecon2";// page pour la lecon#2
        
    }
    @GetMapping("/cours/debutant/lecon3")
    public String lecon3(){
        return"cours/debutant/lecon3";
    }
    
    @GetMapping("/cours/debutant/lecon4")
    public String lecon4(){
       return"cours/debutant/lecon4";
    }
    //QUIZ
    @GetMapping("/cours/debutant/lecon5")
    public String lecon5(){
        return"cours/debutant/lecon5";
    }
    //LECON 2
    @GetMapping("/cours/debutant/lecon1/apple")
    public String apple(){
        return"cours/debutant/lecon1/apple";
    }
    @GetMapping("/cours/debutant/lecon1/School")
    public String School(){
        return"cours/debutant/lecon1/School";
    }
     @GetMapping("/cours/debutant/lecon1/hello")
    public String hello(){
        return"cours/debutant/lecon1/hello";
    }
     @GetMapping("/cours/debutant/lecon1/hello2")
    public String hello2(){
        return"cours/debutant/lecon1/hello2";
    }
    @GetMapping("/cours/debutant/lecon1/thank")
    public String thank(){
        return"cours/debutant/lecon1/thank";
    }
     @GetMapping("/cours/debutant/lecon1/thank2")
    public String thank2(){
        return"cours/debutant/lecon1/thank2";
    }
    
    //LECON 3
    @GetMapping("/cours/debutant/lecon3/Morning")
    public String Morning(){
        return"cours/debutant/lecon3/Morning";
    }
    
    @GetMapping("/cours/debutant/lecon3/Evening")
    public String Evening(){
        return"cours/debutant/lecon3/Evening";
    }
      @GetMapping("/cours/debutant/lecon3/Bonjour")
    public String Bonjour(){
        return"cours/debutant/lecon3/Bonjour";
    }
    
    //Partie lecon 4
     @GetMapping("/cours/debutant/lecon4/name")
    public String name(){
        return"cours/debutant/lecon4/name";
    }
    
    @GetMapping("/cours/debutant/lecon4/presentation")
    public String presentation(){
        return"cours/debutant/lecon4/presentation";
    }

    @GetMapping("/cours/debutant/lecon4/NiceToMeetYou")
    public String NiceToMeetYou(){
        return"cours/debutant/lecon4/NiceToMeetYou";
    }
    
    //QUIZ LECON2
     @GetMapping("/cours/debutant/lecon1/Quiz/Quiz1")
    public String Quiz1(){
        return"cours/debutant/lecon1/Quiz/Quiz1";
    }
    
    //QUIZ LECON3
     @GetMapping("/cours/debutant/lecon3/Quiz/Quizl3")
    public String Quizl3(){
        return"cours/debutant/lecon3/Quiz/Quizl3";
    }
    //QUIZ LECON4
     @GetMapping("/cours/debutant/lecon4/Quizl4/Quizl4")
    public String Quizl4(){
        return"cours/debutant/lecon4/Quizl4/Quizl4";
    }
    
    //Niveau 2 
    @GetMapping("/cours/debutant/Niveau2")
    public String Niveau2(){
        return"cours/debutant/Niveau2";
    }
    
    @GetMapping("/cours/debutant/Niveau21")
    public String Niveau21(){
        return"cours/debutant/Niveau21";
    }
    
    //n2l2
    @GetMapping("/cours/debutant/n2l2/preposition")
    public String n2l2(){
        return "cours/debutant/n2l2/preposition";
    }
    
    @GetMapping("/cours/debutant/n2l2/lieu")
    public String lieu(){
        return "cours/debutant/n2l2/lieu";
    }
    
    @GetMapping("/cours/debutant/n2l2/time")
    public String time(){
        return"cours/debutant/n2l2/time";
    } 
    
     @GetMapping("/cours/debutant/n2l2/QPrepo")
    public String QPrepo(){
        return"cours/debutant/n2l2/QPrepo";
    }
    
     @GetMapping("/cours/debutant/n2l2/question")
    public String question(){
        return"cours/debutant/n2l2/question";
    }
    
    @GetMapping("/cours/debutant/n2l2/EQuest")
    public String EQuest(){
        return"cours/debutant/n2l2/EQuest";
    }
    
    @GetMapping("/cours/debutant/n2l2/QuiQ")
    public String QuiQ(){
        return"cours/debutant/n2l2/QuiQ";
    }
    
    @GetMapping("/cours/debutant/n2l2/routine")
    public String routine(){
        return"cours/debutant/n2l2/routine";
    }
    
     @GetMapping("/cours/debutant/n2l2/rdeta")
    public String rdeta(){
        return"cours/debutant/n2l2/rdeta";
    }
    
     @GetMapping("/cours/debutant/n2l2/Qr")
    public String Qr(){
        return"cours/debutant/n2l2/Qr";
    }
    
     @GetMapping("/cours/debutant/n2l2/QuizN2")
    public String QuizN2(){
        return"cours/debutant/n2l2/QuizN2";
    }
    
    //Partie AVANCE
    // leconA1
    @GetMapping("/cours/avance/leconA1")
    public String leconA1(){
        return"cours/avance/leconA1";
    }
    
     @GetMapping("/cours/avance/leconA1/Indirect")
    public String Indirect(){
        return"cours/avance/leconA1/Indirect";
    }
     @GetMapping("/cours/avance/leconA1/QuizA1")
    public String QuizA1(){
        return"cours/avance/leconA1/QuizA1";
    }
    
    //PHRASE-->LECON2
     @GetMapping("/cours/avance/phrase")
    public String phrase(){
        return"cours/avance/phrase";
    }
    
    @GetMapping("/cours/avance/leconA2/cdtype2")
    public String cdtype2(){
        return"/cours/avance/leconA2/cdtype2";
    }
    
    @GetMapping("/cours/avance/leconA2/exemple")
    public String exemple(){
        return"/cours/avance/leconA2/exemple";
    }
    //REMARQUE
    @GetMapping("/cours/avance/leconA2/remarque")
    public String remarque(){
        return"/cours/avance/leconA2/remarque";
    }
    
    @GetMapping("/cours/avance/leconA2/QuizA2")
    public String Quiza2(){
        return"/cours/avance/leconA2/QuizA2";
    }
    
    
    //LECON3 PASSIVE
     @GetMapping("/cours/avance/passive")
    public String passive(){
        return"/cours/avance/passive";
    }
    
     @GetMapping("/cours/avance/passive/vpassive")
    public String vpassive(){
        return"/cours/avance/passive/vpassive";
    }
    
    @GetMapping("/cours/avance/passive/vpassive1")
    public String vpassive1(){
        return"/cours/avance/passive/vpassive1";
    }
    
    @GetMapping("/cours/avance/passive/utilisation")
    public String utilisation(){
        return"/cours/avance/passive/utilisation";
    }
    @GetMapping("/cours/avance/passive/verbe")
    public String verbe(){
        return"/cours/avance/passive/verbe";
    }
    @GetMapping("/cours/avance/passive/QuizA3")
    public String QuizA3(){
        return"/cours/avance/passive/QuizA3";
    }
    //LECON4--> MODAUX 
    @GetMapping("/cours/avance/modaux")
    public String modaux(){
        return"/cours/avance/modaux";
    }
    
    @GetMapping("/cours/avance/modaux/mproba")
    public String mproba(){
        return"/cours/avance/modaux/mproba";
    }
    
    @GetMapping("/cours/avance/modaux/passe")
    public String passe(){
        return"/cours/avance/modaux/passe";
    }
    
    
    @GetMapping("/cours/avance/QUIZAV")
    public String QUIZAV(){
        return"/cours/avance/QUIZAV";
    }
    
    //niveau2
    @GetMapping("/cours/avance/A2/ep")
    public String ep(){
        return"cours/avance/A2/ep";
    }
    
     @GetMapping("/cours/avance/A2/epd")
    public String epd(){
        return"cours/avance/A2/epd";
    }
    
     @GetMapping("/cours/avance/A2/Quizep")
    public String Quizep(){
        return"cours/avance/A2/Quizep";
    }
    
     @GetMapping("/cours/avance/A2/co")
    public String co(){
        return"cours/avance/A2/co";
    }
    
    @GetMapping("/cours/avance/A2/cod")
    public String cod(){
        return"cours/avance/A2/cod";
    }
    
    @GetMapping("/cours/avance/A2/Qcod")
    public String Qcod(){
        return"cours/avance/A2/Qcod";
    }
    
     @GetMapping("/cours/avance/A2/ph")
    public String ph(){
        return"cours/avance/A2/ph";
    }
    
     @GetMapping("/cours/avance/A2/phd")
    public String phd(){
        return"cours/avance/A2/phd";
    }
    
    @GetMapping("/cours/avance/A2/Qph")
    public String Qph(){
        return"cours/avance/A2/Qph";
    }
    
    
    //PARTIE EXTREME
        @GetMapping("/cours/extreme/present")
    public String present(){
        return"/cours/extreme/present";
    }
    
    @GetMapping("/cours/extreme/preterit")
    public String preterit(){
        return"/cours/extreme/preterit";
    }
    
     @GetMapping("/cours/extreme/vocabulaire")
    public String vocabulaire(){
        return"/cours/extreme/vocabulaire";
    }
    
     @GetMapping("/cours/extreme/present/between")
    public String between(){
        return"/cours/extreme/present/between";
    }
    
     @GetMapping("/cours/extreme/present/between2")
    public String between2(){
        return"/cours/extreme/present/between2";
    }
    
    
     @GetMapping("/cours/extreme/QuizE1")
    public String QuizE1(){
        return"/cours/extreme/QuizE1";
    }
    
//NIVEAU 2 PARIE EXTREME
     @GetMapping("/cours/extreme/presentP")
    public String presentP(){
        return"/cours/extreme/presentP";
    }
    
     @GetMapping("/cours/extreme/pastP")
    public String pastP(){
        return"/cours/extreme/pastP";
    }

}


