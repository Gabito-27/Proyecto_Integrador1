package com.first_api.GabrielT1.controller;

import com.first_api.GabrielT1.model.Usuario;
import com.first_api.GabrielT1.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/batch")
    public List<Usuario> createUsuario(@RequestBody List<Usuario> usuarios){
        return usuarioService.createUser(usuarios);
    }

    @GetMapping("/{id}")
    public Usuario obtenerUsuarioPorId(@RequestBody Long id){
        return usuarioService.obtenerUsuarioPorId(id);
    }

    @GetMapping
    public List<Usuario> obtenerTodosLosUsuarios(){
        return usuarioService.obtenerTodosLosUsuarios();
    }

    @PutMapping("/{id}")
    public Usuario actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario){
        return usuarioService.actualizarUsuario(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable Long id){
        usuarioService.eliminarUsuario(id);
    }
}
