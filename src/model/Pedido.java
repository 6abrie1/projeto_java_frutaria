package model;
import java.util.Date;
import java.util.List;



public class Pedido {
 
private int  id_vendas;
private int  id_pedidos;
private String status;
private String data_da_entregar;

    public Pedido(int id_vendas, int id_pedidos, String status, String data_da_entregar) {
        this.id_vendas = id_vendas;
        this.id_pedidos = id_pedidos;
        this.status = status;
        this.data_da_entregar = data_da_entregar;
    }



    public int getId_vendas() {
        return id_vendas;
    }

    public void setId_vendas(int id_vendas) {
        this.id_vendas = id_vendas;
    }

    public int getId_pedidos() {
        return id_pedidos;
    }

    public void setId_pedidos(int id_pedidos) {
        this.id_pedidos = id_pedidos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData_da_entregar() {
        return data_da_entregar;
    }

    public void setData_da_entregar(String data_da_entregar) {
        this.data_da_entregar = data_da_entregar;
    }


   
    
    
}
