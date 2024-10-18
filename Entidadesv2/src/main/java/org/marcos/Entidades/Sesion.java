/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
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
public @Data class Sesion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private @Getter Long id;
    
    @Cascade(CascadeType.ALL)
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "sesion")
    private @Getter @Setter List<ComentarioSesion> comentarios;
    
    @Column(name = "fecha_hora")
    private @Getter @Setter Date fecha;
    
    @Column(name = "puntuacion_vestimenta")
    private byte puntuacionVestimenta;
    
    @Column(name = "puntuacion_bienestar")
    private byte puntuacionBienestar;
    
    @Column(name = "puntuacion_arreglo_personal")
    private byte puntuacionArregloPersonal;
    
    @Column(name = "puntuacion_postura")
    private byte puntuacionPostura;
    
    @Column(name = "puntuacion_contacto_visual")
    private byte puntuacionContactoVisual;
    
    @Column(name = "puntuacion_habla")
    private byte puntuacionHabla;
    
    @Column(name = "puntuacion_velocidad_habla")
    private byte puntuacionVelocidadHabla;
    
    @Column(name = "puntuacion_volumen_habla")
    private byte puntuacionVolumenHabla;
    
    @Column(name = "puntuacion_articulacion")
    private byte puntuacionArticulacion;
    
    @Column(name = "puntuacion_coherencia")
    private byte puntuacionCoherencia;
    
    @Column(name = "puntuacion_espontaneidad")
    private byte puntuacionEspontaneidad;
    
    @Column(name = "comentario_psicologa")
    private String comentarioPsicologa;
    
    @Cascade(CascadeType.ALL)
    @OneToMany(mappedBy = "sesion", fetch = FetchType.EAGER)
    private @Getter @Setter List<Problema> problemasSesion;
    
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_expediente")
    private Expediente expediente;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_psicologo")
    private Psicologo psicologo;
      
}
