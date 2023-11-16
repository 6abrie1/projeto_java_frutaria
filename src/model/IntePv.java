package model;

public class IntePv {
    private int id_intePv;
    private int id_vendas;
    private int id_produto;

    public IntePv(int id_intePv, int id_vendas, int id_produto) {
        this.id_intePv = id_intePv;
        this.id_vendas = id_vendas;
        this.id_produto = id_produto;
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

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

   

}
