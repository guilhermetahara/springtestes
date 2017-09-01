package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Identifica a classe como controller das rotas

//localhost:8080/demo
@RequestMapping(path="/demo")
public class MainController {

    @Autowired //Spring instancia um bean userRepository (Injeçao de dependencia)
    private UserRepository userRepository;

    //mapeamento para pedidos GET para a pagina de adiçao de usuarios
    ////localhost:8080/demo/add?name=seunome&email=seuemail
    @GetMapping(path="/add")
    public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email) {

        //grava o usuario no db e retorna uma string "Saved" se tudo der certo
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    ////localhost:8080/demo/all
    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers(){
        //retorn todos os usruarios do repositorio em formato JSON
        return userRepository.findAll();
    }
}
