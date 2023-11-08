package model;

import java.util.List;

public class Cliente {
    private int id;
    private String nome, telefone, email;
    private List<Endereco> enderecos;

    
    public Cliente() {
    }


    public Cliente(int id, String nome, String telefone, String email, List<Endereco> enderecos) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.enderecos = enderecos;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public List<Endereco> getEndereco() {
        return enderecos;
    }
    public void setEndereco(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    

    
}
