package model;

public class ItemVenda {
    private int Id;
    private int quantidade;
    private double valorUnitario;
    private int idVenda;
    private int idProduto;


    
    public ItemVenda() {
    }



    public ItemVenda(int id, int quantidade, double valorUnitario, int idVenda, int idProduto) {
        Id = id;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.idVenda = idVenda;
        this.idProduto = idProduto;
    }
    



    public int getId() {
        return Id;
    }



    public void setId(int id) {
        Id = id;
    }



    public int getQuantidade() {
        return quantidade;
    }



    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }



    public double getValorUnitario() {
        return valorUnitario;
    }



    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }



    public int getIdVenda() {
        return idVenda;
    }



    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }



    public int getIdProduto() {
        return idProduto;
    }



    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    } 

    
}
