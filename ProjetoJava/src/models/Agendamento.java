package models;

import java.time.LocalDateTime;

public class Agendamento {
    private static int contador = 1;
    private int id;
    private Cliente cliente;
    private Animal animal;
    private Servico servico;
    private LocalDateTime dataHora;

    public Agendamento(Cliente cliente, Animal animal, Servico servico, LocalDateTime dataHora) {
        this.id = contador++;
        this.cliente = cliente;
        this.animal = animal;
        this.servico = servico;
        this.dataHora = dataHora;
    }

    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Animal getAnimal() {
        return animal;
    }

    public Servico getServico() {
        return servico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "Agendamento #" + id + ": Cliente=" + cliente.getNome() +
                ", Animal=" + animal.getNome() +
                ", Serviço=" + servico +
                ", Data e Hora=" + dataHora;
    }
}
