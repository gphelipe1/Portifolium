package com.ufma.portifolium.entities;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ProjetoTecnologia
 */

@Entity
@Table(name="projeto_tecnologia",schema="public")

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProjetoTecnologia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_projeto")
    private Projeto projeto;

    @ManyToOne
    @JoinColumn(name="id_tecnologia")
    private Tecnologia tecnologia;

}