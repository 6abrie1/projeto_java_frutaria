package model;
import java.util.Date;
import java.util.List;

public class Venda {
    private int id;
    private List<Produto> listaProdutos;
    private Cliente cliente;
    private Date dataVenda;
    private Double total;
    private Funcionario vendedor;
    private String status;


    public Venda() {
    }


    public Venda(int id, List<Produto> listaProdutos, Cliente cliente, Date dataVenda, Double total, Funcionario vendedor, String status) {
        this.id = id;
        this.listaProdutos = listaProdutos;
        this.cliente = cliente;
        this.dataVenda = dataVenda;
        this.total = total;
        this.vendedor = vendedor;
        this.status = status;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public List<Produto> getListaProdutos() {
        return listaProdutos;
    }


    public void setListaProdutos(List<Produto> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }


    public Cliente getCliente() {
        return cliente;
    }


    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public Date getDataVenda() {
        return dataVenda;
    }


    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }


    public Double getTotal() {
        return total;
    }


    public void setTotal(Double total) {
        this.total = total;
    }


    public Funcionario getVendedor() {
        return vendedor;
    }


    public void setVendedor(Funcionario vendedor) {
        this.vendedor = vendedor;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    


    

    

    
}
