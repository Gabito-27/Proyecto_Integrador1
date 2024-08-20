package com.first_api.GabrielT1.service.impl;

import com.first_api.GabrielT1.model.Usuario;
import com.first_api.GabrielT1.service.UsuarioService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private Map<Long, Usuario> usuarios = new HashMap<>();
    private Long idCouter = 1L;

    @Override
    public List<Usuario> createUser(List<Usuario> usuarios) {
        for(Usuario usuario: usuarios){
            usuario.setId(idCouter++);
            this.usuarios.put(usuario.getId(),usuario);
        }
        return usuarios;
    }

    @Override
    public Usuario obtenerUsuarioPorId(Long id) {
        return usuarios.get(id);
    }

    @Override
    public List<Usuario> obtenerTodosLosUsuarios() {
        return new ArrayList<>(usuarios.values());
    }

    @Override
    public Usuario actualizarUsuario(Long id, Usuario usuario) {
        if(usuarios.containsKey(id)){
            usuario.setId(id);
            usuarios.put(id,usuario);
            return usuario;
        }
        return null;
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarios.remove(id);
    }
}
