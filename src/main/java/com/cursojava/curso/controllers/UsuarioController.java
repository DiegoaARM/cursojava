package com.cursojava.curso.controllers;

import com.cursojava.curso.dao.UsuarioDao;
import com.cursojava.curso.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;


    @RequestMapping("api/usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("ola");
        usuario.setApellido("ola");
        usuario.setEmail("ola");
        usuario.setTelefono("ola");
        usuario.setPassword("123");
    return usuario;
    }

    @RequestMapping("api/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        return usuario;
    }


}
