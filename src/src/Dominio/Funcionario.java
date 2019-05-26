package Dominio;

public class Funcionario {

    private String nome;
    private Double salario;
    private Vale value;

    public Funcionario(String _nome){
        this.nome = _nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Vale getValue() {
        return value;
    }

    public void setValue(Vale value) {
        this.value = value;
    }
}
