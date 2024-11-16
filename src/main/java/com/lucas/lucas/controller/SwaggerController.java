package com.lucas.lucas.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.lucas.dto.UsuarioDto;

@Controller
@RestController
@RequestMapping("/api")
public class SwaggerController {


    @GetMapping("/buscar-nome")
    public String BuscarNome(@RequestParam String nome){
        List<String> names = new ArrayList<>();

        names.add("Lucas");
        names.add("Maria");
        names.add("Joaquim");

        if(names.contains(nome)){
            return "O nome " + nome + " foi encontrado.";
        }

        return "O nome " + nome + " nao foi encontrado.";
    }

    @PostMapping("/listar-usuarios")
    public List<UsuarioDto> ListarUsuarios(@RequestBody List<UsuarioDto> listaNomes){
        return listaNomes;
    }

    @GetMapping("/exibir-idade")
    public String ExibirIdade(@RequestParam int idade){
        return "A idade informada é: " + idade;
    }

}
