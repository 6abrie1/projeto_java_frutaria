package model;
import java.util.Date;
import java.util.List;

public class Venda {
   
    private String dataVenda;
    private Double total;
    private int id_intePv;
    private int id_vendas;
    private int id_cliente;

    
     public Venda(String dataVenda, Double total, int id_intePv, int id_vendas, int id_cliente) {
        this.dataVenda = dataVenda;
        this.total = total;
        this.id_intePv = id_intePv;
        this.id_vendas = id_vendas;
        this.id_cliente = id_cliente;
    }
    
    
    public String getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getId_intePv() {
        return id_intePv;
    }

    public void setId_intePv(int id_intePv) {
        this.id_intePv = id_intePv;
    }

    public int getId_vendas() {
        return id_vendas;
    }

    public void setId_vendas(int id_vendas) {
        this.id_vendas = id_vendas;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

   
    



}
    
 


   

    


    

    

    

