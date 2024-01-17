package com.curso.spring.controllers;

//manejar URLS

import com.curso.spring.models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "prueba")
    public Usuario getUsuario(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Dario");
        usuario.setApellido("Guardia");
        usuario.setEmail("rimuu48@gmail.com");
        usuario.setTelefono("3804533905");
        usuario.setPassword("123456");
        return usuario;

    }
}
