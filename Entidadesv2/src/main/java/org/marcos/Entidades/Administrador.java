/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.marcos.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 *
 * @author natsu
 */
@Entity
@Table(name = "administradores")
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Administrador extends Psicologo {
//le dio anemia
}
