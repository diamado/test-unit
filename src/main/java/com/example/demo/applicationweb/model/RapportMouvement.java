package com.example.demo.applicationweb.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Rapport")
@AllArgsConstructor
@NoArgsConstructor
public class RapportMouvement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String typeRapport;
    private String description;
    private String date;
    
    @ManyToMany
    private Set<Materiel> materiels;

    
}