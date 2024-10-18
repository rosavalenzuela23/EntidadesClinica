/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.CascadeType;
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
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author natsu
 */
@Entity
@Table(name = "expediente_paciente")
@AllArgsConstructor
@NoArgsConstructor
public @Data class Expediente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    //NO RECUERDO COMO SE REPRESENTA ESTO
    //NO SE SI PONER List<MedicamentoExpediente> o List<Medicamento>
    //VOY A PONER EL PRIMERO PORQUE ME HACE MAS SENTIDO
    @Column(name = "enfermedad_previa")
    private String enfermedadPrevia;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    @JoinColumn(name = "id_diagnostico")
    private Diagnostico diagnostico;
    
    @Column(name = "antecedentes")
    private String antecedentes;
    
    @Column(name = "pregunta_magica")
    private String preguntaMagica;
    
    @PrimaryKeyJoinColumn
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "id")
    private List<IntegranteHogar> integranteHogar;
    
    @PrimaryKeyJoinColumn
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "id")
    private List<FamiliarConfianza> familiaresConfianza;
    
    @Column(name = "motivo_consulta")
    private String motivoConsulta;
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "expediente")
    private List<MedicamentoDelExpediente> medicamentos;
    
}
