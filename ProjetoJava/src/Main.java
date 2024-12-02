import models.*;
import interfaces.IAtendimento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main implements IAtendimento {
    private List<Agendamento> agendamentos = new ArrayList<>();

    public static void main(String[] args) {
        Main sistema = new Main();

        // Exemplo de uso
        Cliente cliente1 = new Cliente("João Carlos", "99999-9999", "Rua A, 123");
        Animal cachorro = new Cachorro("Duke", 4, "Labrador");
        Servico banho = new Servico(TipoServico.TOSA, 25.0, 30);

        sistema.agendarServico(new Agendamento(cliente1, cachorro, banho, LocalDateTime.now()));

        Animal gato = new Gato("Mimi", 2, "Siamês");
        Servico vacina = new Servico(TipoServico.VACINA, 80.0, 15);

        sistema.agendarServico(new Agendamento(cliente1, gato, vacina, LocalDateTime.now().plusDays(1)));

        sistema.listarAgendamentos();
    }

    @Override
    public void agendarServico(Agendamento agendamento) {
        agendamentos.add(agendamento);
        System.out.println("Agendamento realizado: " + agendamento);
    }

    @Override
    public void cancelarAgendamento(int idAgendamento) {
        agendamentos.removeIf(agendamento -> agendamento.getId() == idAgendamento);
        System.out.println("Agendamento #" + idAgendamento + " cancelado.");
    }

    @Override
    public void listarAgendamentos() {
        System.out.println("Lista de Agendamentos:");
        for (Agendamento agendamento : agendamentos) {
            System.out.println(agendamento);
        }
    }
}
