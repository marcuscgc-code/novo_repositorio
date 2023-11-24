package Marcus.teste.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PessoaController {
    /**
     * InnerPessoaController
     */
    public record InnerPessoaController(long id ,String nome) {
        

    }
    @GetMapping(name = "/pessoa")
    public InnerPessoaController PessoaCushi(){
        InnerPessoaController pessoa = new InnerPessoaController(8989, "cucuz");
        return pessoa;
    }


}
