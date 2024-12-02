package models;

public class Servico {
    private TipoServico tipo;
    private double preco;
    private int duracao; // em minutos

    public Servico(TipoServico tipo, double preco, int duracao) {
        this.tipo = tipo;
        this.preco = preco;
        this.duracao = duracao;
    }

    public TipoServico getTipo() {
        return tipo;
    }

    public void setTipo(TipoServico tipo) {
        this.tipo = tipo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "Serviço: " + tipo + ", Preço: R$" + preco + ", Duração: " + duracao + " minutos";
    }
}
