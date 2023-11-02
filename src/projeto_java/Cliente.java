/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto_java;

/**
 *
 * @author gabri
 */
public class Cliente extends Endereco{
  private String nome,email,telefone;

    public Cliente(String rua, String bairro, String numero, String cep, String complemento) {
        super(rua, bairro, numero, cep, complemento);
    }

    public Cliente(String nome, String email, String telefone, String rua, String bairro, String numero, String cep, String complemento) {
        super(rua, bairro, numero, cep, complemento);
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
   
   
   
   
}
