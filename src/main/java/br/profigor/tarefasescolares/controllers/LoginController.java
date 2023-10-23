package br.profigor.tarefasescolares.controllers;

import br.profigor.tarefasescolares.models.Usuario;
import br.profigor.tarefasescolares.services.UsuarioService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public String login(Model model, Usuario usuario, BindingResult br, HttpSession session){
        if(br.hasErrors())
            return "login";

        model.addAttribute("usuario", usuarioService.loginUsuario(usuario.getEmail(), usuario.getSenha()));//Util.md5(senha)

        if(usuario == null)
            model.addAttribute("msg", "Usuário não encontrado. Tente novamente!");
        else {
            session.setAttribute("usuarioLogado", usuario);
        }

        return "loginSaida";
    }
}
