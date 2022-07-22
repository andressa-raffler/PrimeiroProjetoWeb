package br.com.letscode.primeiroprojetoweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data //Adiciona getters, setters, toString, equals e HashCode
@AllArgsConstructor
//@ToString(); posso sobrepor metodos do lombock colocando como anotaçoes
public class Cliente {


    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private Integer idade;

    public Cliente(String nome, String cpf, String email, Integer idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.idade = idade;
    }
}
