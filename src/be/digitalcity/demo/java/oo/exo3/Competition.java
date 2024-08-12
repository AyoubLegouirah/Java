package be.digitalcity.demo.java.oo.exo3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Competition {
    int minParticipants = 3;
    int maxParticipants = 12;
    boolean status = false;
    List<Personne> participants = new ArrayList<>();

    Competition(int minParticipants, int maxParticipants){
        this.minParticipants = minParticipants;
        this.maxParticipants = maxParticipants;
    }

    void ajouterParticipant(Personne participant){
        if (participant.nom != null && participant.prenom != null){
            this.participants.add(participant);
            System.out.println("Participant ajouté");
        }
        else {
            System.out.println("Impossible d'ajouter un participant");
        }
    }

    void lancerCompetition(){
        if (!status && participants.size() >= minParticipants ){
            status = true;
            System.out.println("Compétition lancée");
        } else {
            System.out.println("La compétition ne possède pas suffisamment de participants");
        }
    }


}




//Exo OO 3 - Constructeurs
//Créez une classe Competition permettant de gérer un compétition.
//
//La compétition possède:
//un nombre min de participants (par défaut 3)
//un nombre max de participants (par défaut 12)
//un status (lancée/pas lancée)
//des participants (des Personne)
//
//Il est possible de:
//lancer la compétition: seulement si pas lancée et possède min participants, elle devient lancée
//ajouter un participant: si pas lancé et ne dépasse pas le max
//
//Il sera possible de créer une compétition en donnant:
//rien
//le min de participants
//le max de participants (un problème se produira)
//le min et le max de participants