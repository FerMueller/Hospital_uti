/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import cadastro.Conexao;
import dados.Visitante;
import estado.Status;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 88178
 */
public class VisitanteDAO {
    
       private static final String TABELA = "visitante";
       private static VisitanteDAO dao;//Exemplo para fazer o padrão de projeto Singleton

    private VisitanteDAO() {
        //Exemplo para fazer o padrão de projeto Singleton
    }
    
    public static VisitanteDAO getInstance(){//Exemplo para fazer o padrão de projeto Singleton
        if (dao == null) {
            dao = new VisitanteDAO();
        }
        return dao;
    }

    private Connection conn;
    private Statement stmt;
   

    public void salvar(Visitante v) {
        if (v == null) {
            return;
        }

        if (v.getId() == null) {
            try {
                inserir(v);
            } catch (SQLException ex) {
                Logger.getLogger(VisitanteDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            alterar(v);
        }

        
    }


    public void conectar() {
        try {
            conn = Conexao.getConnection();
            stmt = conn.createStatement();

        } catch (ClassNotFoundException ex) {
            System.out.println("Problemas ao conectar ao banco de dados");
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void desconectar() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Problemas ao desconectar no banco de dados");
        }
    }

    public List<Visitante> buscarTodos() {
        List<Visitante> visitantes = new ArrayList<Visitante>();
        try {

            conectar();

            ResultSet rs = stmt.executeQuery("SELECT * FROM " + TABELA);
            while (rs.next()) {
                Visitante visitante = new Visitante();

                visitante = criaVisitante(rs);

                visitantes.add(visitante);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VisitanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
        return visitantes;
    }

    public Visitante criaVisitante(ResultSet rs) {
        Visitante visitante = new Visitante();
        PacienteDAO.getInstance();

        try {
            visitante.setId(rs.getLong("id"));
            visitante.setPaciente(PacienteDAO.getInstance().getPorID(rs.getLong("id_paciente")));
            visitante.setNome(rs.getString("nome"));
            visitante.setEstado(Status.valueOf("status"));
            
        } catch (SQLException ex) {
            Logger.getLogger(VisitanteDAO.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }

        return visitante;
    }

    public void removerVisitante(Long id) {
        conectar();

        try {
            stmt.executeQuery("DELETE FROM " + TABELA + " WHERE id = " + id);
        } catch (SQLException ex) {
            //desconectar();
        }
        desconectar();
    }

    public void inserir(Visitante v) throws SQLException {
        conectar();

        stmt.executeQuery("INSERT INTO " + TABELA + " VALUES("             
                + "'" + v.getPaciente() + "'"   
                + "'" + v.getNome()+ "'"
                + "'" + v.getEstado() + "')");

        desconectar();
    }
    
    public void alterar(Visitante v) {
        conectar();

        try {
            stmt.executeQuery("UPDATE pessoa1 SET nome='" + v.getPaciente() +  "',nome ='" + v.getNome() + "', status ='" + v.getPaciente()
                    + "' WHERE id = " + v.getId());
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        desconectar();
    }

 
    
}
