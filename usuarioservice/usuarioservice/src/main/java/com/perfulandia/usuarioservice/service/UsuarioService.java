package com.perfulandia.usuarioservice.service;
import com.perfulandia.usuarioservice.model.Usuario;
import com.perfulandia.usuarioservice.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//ahahaass

@Service
public class UsuarioService {

    private final UsuarioRepository repo;
    //Contructor para poder inyectar mi interfaz
    public UsuarioService(UsuarioRepository repo) {
        this.repo = repo;
    }

    public List<Usuario> listar() {
        return repo.findAll();
    }

    public Usuario guardar(Usuario usuario) { //usuario - Se reciben los argumentos o atributos de mi clase usuario
        return repo.save(usuario);
    }

    private Usuario buscar(long id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(long id) {
        repo.deleteById(id);
    }



}
