/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author natsu
 */
@Entity
@Table(name = "pacientes")
@AllArgsConstructor
@NoArgsConstructor
public @Data class Paciente implements Cloneable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "fecha_nacimiento")
    private @Getter @Setter Date fecha;
    
    @Column(name = "telefono_emergencia")
    private String telefonoEmergencia;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "escolaridad")
    private String escolaridad;
    
    @Column(name = "nombres")
    private String nombre;
    
    @Column(name = "apellido_paterno")
    private String apellidoPaterno;
    
    @Column(name = "apellido_materno")
    private String apellidoMaterno;
    
    @Column(name = "estado_civil")
    @Enumerated(EnumType.STRING)
    private EstadoCivil estadoCivil;
    
    @Column(name = "vivienda")
    @Enumerated(EnumType.STRING)
    private TipoVivienda tipoVivienda;
    
    
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "pacientes_psicologos",
            joinColumns = @JoinColumn(name = "id_paciente"),
            inverseJoinColumns = @JoinColumn(name = "id_psicologo")
            )
    private List<Psicologo> psicologos;
    
    @OneToOne(
            mappedBy ="paciente", cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private Expediente expediente;
    
    @OneToOne(
            mappedBy="paciente", cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
    private CartaConcentimiento carta;
    
}
