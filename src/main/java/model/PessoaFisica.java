package model;

public class PessoaFisica extends Cliente {
  private String cpf;
  private String data_nascimento;

  // public PessoaFisica(String nome, String endereco, String telefone, String
  // cep, String cpf, String data_nascimento) {
  // super(nome, endereco, telefone, cep);
  // this.cpf = cpf;
  // this.data_nascimento = data_nascimento;
  // }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getData_nascimento() {
    return this.data_nascimento;
  }

  public void setData_nascimento(String data_nascimento) {
    this.data_nascimento = data_nascimento;
  }

}