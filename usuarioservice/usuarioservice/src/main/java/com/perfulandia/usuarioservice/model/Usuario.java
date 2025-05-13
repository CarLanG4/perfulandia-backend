package com.perfulandia.usuarioservice.model;

import jakarta.persistence.*;
import lombok.*;


//Entidad que se va a comportar como una tabla
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder //Me permite generar contructores flexibles
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String correo;
    private String rol; //ADMIN - GERENTE - USUARIO

}


