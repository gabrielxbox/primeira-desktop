package src.dto;

import java.util.Date;



public class DtoProduto {
   private int idproduto;
   private String nome;
   private double preco;
    private Date valiDate;
   private String descricao;
    private Date validate;
    
   public DtoProduto() {
    }

 

    


    public DtoProduto(int idproduto, String nome, double preco, Date valiDate, String descricao) {
        this.idproduto = idproduto;
        this.nome = nome;
        this.preco = preco;
        this.validate = valiDate;
        this.descricao = descricao;
    }

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Date getValidate() {
        return valiDate;
    }

    public void setValidate(Date valiDate) {
        this.valiDate = valiDate;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
   

}