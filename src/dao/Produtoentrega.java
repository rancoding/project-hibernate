package dao;
// Generated 12/jun/2018 12:19:24 by Hibernate Tools 4.3.1



/**
 * Produtoentrega generated by hbm2java
 */
public class Produtoentrega  implements java.io.Serializable {


     private ProdutoentregaId id;
     private Entrega entrega;
     private Produto produto;
     private short quantidade;

    public Produtoentrega() {
    }

    public Produtoentrega(ProdutoentregaId id, Entrega entrega, Produto produto, short quantidade) {
       this.id = id;
       this.entrega = entrega;
       this.produto = produto;
       this.quantidade = quantidade;
    }
   
    public ProdutoentregaId getId() {
        return this.id;
    }
    
    public void setId(ProdutoentregaId id) {
        this.id = id;
    }
    public Entrega getEntrega() {
        return this.entrega;
    }
    
    public void setEntrega(Entrega entrega) {
        this.entrega = entrega;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public short getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(short quantidade) {
        this.quantidade = quantidade;
    }




}


