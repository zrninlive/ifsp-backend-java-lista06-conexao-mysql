package model;

public class PessoaJuridica extends Cliente {
  private String cnpj;
  private String razao_social;

  // public PessoaJuridica(String nome, String endereco, String telefone, String
  // cep, String cnpj, String razao_social) {
  // super(nome, endereco, telefone, cep);
  // this.cnpj = cnpj;
  // this.razao_social = razao_social;
  // }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public String getRazao_social() {
    return this.razao_social;
  }

  public void setRazao_social(String razao_social) {
    this.razao_social = razao_social;
  }

}