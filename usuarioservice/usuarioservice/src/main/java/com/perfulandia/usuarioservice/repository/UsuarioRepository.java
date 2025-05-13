package com.perfulandia.usuarioservice.repository;

import com.perfulandia.usuarioservice.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
//importe sus metodos para trabajar con un crud
//findAll()bo - listar
//findById(id) - buscar
//save() - guardar
//delete - borrar
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
