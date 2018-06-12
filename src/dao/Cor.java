package dao;
// Generated 12/jun/2018 12:19:24 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cor generated by hbm2java
 */
public class Cor  implements java.io.Serializable {


     private byte idcor;
     private String nome;
     private Set<Produto> produtos = new HashSet<Produto>(0);

    public Cor() {
    }

	
    public Cor(byte idcor, String nome) {
        this.idcor = idcor;
        this.nome = nome;
    }
    public Cor(byte idcor, String nome, Set<Produto> produtos) {
       this.idcor = idcor;
       this.nome = nome;
       this.produtos = produtos;
    }
   
    public byte getIdcor() {
        return this.idcor;
    }
    
    public void setIdcor(byte idcor) {
        this.idcor = idcor;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Set<Produto> getProdutos() {
        return this.produtos;
    }
    
    public void setProdutos(Set<Produto> produtos) {
        this.produtos = produtos;
    }




}


