package com.utn.sprint3.entidades;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "usuario")
@Data
@Builder
public class Usuario extends BaseEntidad{

    @NotNull
    @Column(name = "auth0_id", nullable = false, unique = true)
    private String auth0Id;

    @NotNull
    @Column(name = "username", nullable = false)
    private String username;

    @NotNull
    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;

}