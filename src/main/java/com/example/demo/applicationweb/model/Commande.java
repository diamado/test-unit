package com.example.demo.applicationweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
@Table(name = "Commande")
@AllArgsConstructor
@NoArgsConstructor
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int numCommande;
    private String typeCommande;
    private String dateCommande;
    private double montant;
    private double consommation;

    @OneToMany(mappedBy = "commande")
    private List<Materiel> materiels;
    @ManyToOne
    private Fournisseur fournisseur;
    
    
}