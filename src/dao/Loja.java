package dao;
// Generated 12/jun/2018 12:19:24 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Loja generated by hbm2java
 */
public class Loja  implements java.io.Serializable {


     private byte idloja;
     private Localidade localidade;
     private String nome;
     private Set<Produtoloja> produtolojas = new HashSet<Produtoloja>(0);
     private Set<Entrega> entregas = new HashSet<Entrega>(0);
     private Set<Venda> vendas = new HashSet<Venda>(0);

    public Loja() {
    }

	
    public Loja(byte idloja, Localidade localidade, String nome) {
        this.idloja = idloja;
        this.localidade = localidade;
        this.nome = nome;
    }
    public Loja(byte idloja, Localidade localidade, String nome, Set<Produtoloja> produtolojas, Set<Entrega> entregas, Set<Venda> vendas) {
       this.idloja = idloja;
       this.localidade = localidade;
       this.nome = nome;
       this.produtolojas = produtolojas;
       this.entregas = entregas;
       this.vendas = vendas;
    }
   
    public byte getIdloja() {
        return this.idloja;
    }
    
    public void setIdloja(byte idloja) {
        this.idloja = idloja;
    }
    public Localidade getLocalidade() {
        return this.localidade;
    }
    
    public void setLocalidade(Localidade localidade) {
        this.localidade = localidade;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Produtoloja> getProdutolojas() {
        return this.produtolojas;
    }
    
    public void setProdutolojas(Set<Produtoloja> produtolojas) {
        this.produtolojas = produtolojas;
    }
    public Set<Entrega> getEntregas() {
        return this.entregas;
    }
    
    public void setEntregas(Set<Entrega> entregas) {
        this.entregas = entregas;
    }
    public Set<Venda> getVendas() {
        return this.vendas;
    }
    
    public void setVendas(Set<Venda> vendas) {
        this.vendas = vendas;
    }




}


