/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.awt.event.ActionListener;

/**
 *
 * @author 88178
 */
public class ControladorTelaInicial {
    
    private final Display tela;
    private ActionListener listener;
    
    public static interface Display{
        void addAcaoCadastro(ActionListener listener);

        void addAcaoListarPacientes(ActionListener listener);

        void addAcaoVisitante(ActionListener listener);

        void fecharTela();
    }

    public ControladorTelaInicial(Display tela) {
        this.tela = tela;
        inicializar();
    }
    
    public void inicializar(){
        
    }

   
    
}
