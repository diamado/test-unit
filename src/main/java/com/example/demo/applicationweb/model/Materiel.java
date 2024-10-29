package com.example.demo.applicationweb.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Materiel")
@AllArgsConstructor
@NoArgsConstructor
public class Materiel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int numMateriel;
    private String typeMateriel;
    private String libelle;

    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private Commande commande;
    @ManyToOne
    private Categorie categorie;
    private Departement departement;
    @ManyToOne
    private RapportMouvement rapportMouvement;
    
    @OneToMany(mappedBy = "materiel")
    private Set<TracePret> tracesPrets;

    
}