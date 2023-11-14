package model;
import java.util.Date;
import java.util.List;



public class Pedido extends Venda{

    private Date dataEntrega;
    private Endereco enderecoDeEntrega;
    private String statusEntrega;

    


    public Pedido() {
    }

    public Pedido(int id, List<ItemVenda> listaItem, Cliente cliente, Date dataVenda, Double total,
            Funcionario vendedor, String status, Date dataEntrega, Endereco enderecoDeEntrega, String statusEntrega) {

        super(id, listaItem, cliente, dataVenda, total, vendedor, status);


        this.dataEntrega = dataEntrega;
        this.enderecoDeEntrega = enderecoDeEntrega;
        this.statusEntrega = statusEntrega;
    }

    
    
}
