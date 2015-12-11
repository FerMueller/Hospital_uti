/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import cadastro.UtilitarioLogin;
import dados.Visitante;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import tela.AdmUsuario;
import tela.ListaPacienteUti;
import tela.ListaVisitante;

/**
 *
 * @author 88178
 */
public class ControladorTelaInicial {

    private final Display tela;
    private ActionListener listener;

    public static interface Display {

        void addAcaoCadastro(ActionListener listener);

        void addAcaoListarPacientes(ActionListener listener);

        void addAcaoVisitante(ActionListener listener);

        void setVisibilidadeCadastro(boolean visibilidade);           

        void setVisibilidadeListarPacientes(boolean visibilidade);

        void setVisibilidadeVisitantes(boolean visibilidade);

        void fecharTela();
    }

    public ControladorTelaInicial(Display tela) {
        this.tela = tela;
        inicializar();
    }

    public void inicializar() {
        tela.addAcaoCadastro((ActionEvent e) -> entrarCadastrar());
        tela.addAcaoListarPacientes((ActionEvent e) -> listarPacientes());
        tela.addAcaoVisitante((ActionEvent e) -> listarVisitantes());
        definirAcesso();
    }

    public void entrarCadastrar() {
        new AdmUsuario().setVisible(true);
    }

    public void listarPacientes() {
        new ListaPacienteUti().setVisible(true);
    }

    public void listarVisitantes() {
        new ListaVisitante().setVisible(true);
    }
    public void definirAcesso(){
        switch (UtilitarioLogin.usuarioLogado.getTipo()) {
            case ATENDENTE:
                tela.setVisibilidadeCadastro(false);
                tela.setVisibilidadeListarPacientes(false);
                break;
            case GERENTE:
                break;
            case MÉDICO:
                tela.setVisibilidadeCadastro(false);
                break;
            default:
                throw new AssertionError();
        }
    }

}
