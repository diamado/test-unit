package com.example.demo.applicationweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TracePret")
@AllArgsConstructor
@NoArgsConstructor
public class TracePret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String etat;
    private String dateDebut;
    private String dateFin;
    
    @ManyToOne
    private Materiel materiel;
    @ManyToOne
    private Employe employe;



    
}