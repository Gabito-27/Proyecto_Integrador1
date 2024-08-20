package com.first_api.GabrielT1.service;

import com.first_api.GabrielT1.model.Usuario;

import java.util.List;

public interface UsuarioService {
    List<Usuario> createUser(List<Usuario> usuarios);
    Usuario obtenerUsuarioPorId(Long id);
    List<Usuario> obtenerTodosLosUsuarios();
    Usuario actualizarUsuario(Long id, Usuario usuario);
    void eliminarUsuario(Long id);
}
