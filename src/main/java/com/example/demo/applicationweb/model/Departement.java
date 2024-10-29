package com.example.demo.applicationweb.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Departements")
@AllArgsConstructor
@NoArgsConstructor
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nomDpt;

    @Column(name = "type")
    private String typeDpt;

    @OneToMany(mappedBy = "departement")
    private List<Materiel> materiels;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomDpt() {
        return nomDpt;
    }

    public void setNomDpt(String nomDpt) {
        this.nomDpt = nomDpt;
    }

    public String getTypeDpt() {
        return typeDpt;
    }

    public void setTypeDpt(String typeDpt) {
        this.typeDpt = typeDpt;
    }

    public List<Materiel> getMateriels() {
        return materiels;
    }

    public void setMateriels(List<Materiel> materiels) {
        this.materiels = materiels;
    }
}