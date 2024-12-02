package interfaces;

import models.Agendamento;

public interface IAtendimento {
    void agendarServico(Agendamento agendamento);
    void cancelarAgendamento(int idAgendamento);
    void listarAgendamentos();
}
