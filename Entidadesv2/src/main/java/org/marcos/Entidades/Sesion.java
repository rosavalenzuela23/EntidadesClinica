/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author natsu
 * 
 * TODO: CAMBIAR EL TIPO DE CASCADA
 */
@Entity
@Table(name = "sesiones")
@AllArgsConstructor
@NoArgsConstructor
public class Sesion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter Long id;
    
    @Cascade(CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @OneToMany()
    private @Getter @Setter List<ComentarioSesion> comentarios;
    
    @Cascade(CascadeType.ALL)
    @PrimaryKeyJoinColumn
    @OneToMany
    private @Getter @Setter List<Problema> problemasSesion;
    
}
