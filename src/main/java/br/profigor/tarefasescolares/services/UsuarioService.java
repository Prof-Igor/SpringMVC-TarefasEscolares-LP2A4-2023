package br.profigor.tarefasescolares.services;

import br.profigor.tarefasescolares.models.Usuario;
import br.profigor.tarefasescolares.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repositorioUsuario;

    public Usuario loginUsuario(String email, String senha) {
        Usuario usuarioLogado = repositorioUsuario.buscarLogin(email, senha);
        return usuarioLogado;
    }
}
