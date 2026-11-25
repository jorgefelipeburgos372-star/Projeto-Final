package edu.senac.modelsinterface.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/")
    public String menu() {
        return "menu";
    }

    @GetMapping("/Cadastro-Centro")
    public String CadastroCentro() {return "Cadastro-Centro";}

    @GetMapping("/Cadastro-de-Contas-a-Pagar")
    public String CadastrodeContasaPagar() {
        return "Cadastro-de-Contas-a-Pagar";
    }

    @GetMapping("/consultar")
    public String consultar() {
        return "consultar";
    }

    @GetMapping("/Doacoes")
    public String Doacoes() {
        return "Doacoes";
    }


}