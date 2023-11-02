package model;
import model.Produto;

public class Funcionario {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public void cadastrarProduto(Produto produto){

        // TODO: implementar logica de cadastrar Produto no banco.

    }

    public void efetuarVenda(Venda venda){
        // TODO: implementar logica de cadastrar venda no banco.
    }

     public void anotarPedido(Pedido pedidto){
        // TODO: implementar logica de cadastrar pedido no banco.
    }

    public void cadastrarCliente(Cliente cliente){
        // TODO: implementar logica de cadastrar pedido no banco.
    }

    public void ConfirmarPagamento(Venda venda){
        // TODO implementar logica de update de statusPagamento no banco.
    }

    public void ConfirmarEntrega(Pedido pedido){
        // TODO implementar logica de update de statusEntrega no banco.
    }
    
    public Funcionario() {
    }

    public Funcionario(int id, String nome, String email,String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
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


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }
}
