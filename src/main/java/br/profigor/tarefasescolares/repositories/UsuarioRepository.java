package br.profigor.tarefasescolares.repositories;

import br.profigor.tarefasescolares.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<Usuario, Short> {

    @Query("select u from Usuario u where u.email = :email and u.senha = :senha")
    public  Usuario buscarLogin(String email, String senha);
}
