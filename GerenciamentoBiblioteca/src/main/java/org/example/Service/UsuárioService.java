package org.example.Service;

import java.sql.SQLException;
import java.sql.Statement;

import static org.example.Conexão.CONEXÃO.conexãoBancoDados;
    public class UsuárioService{
    private Statement statement;

       public UsuárioService(){
        try {
            statement = conexãoBancoDados().createStatement();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public void inserirDados(String nome, String senha){
           String sql = "INSERT INTO usuarios (nome,senha) VALUES('"+nome+senha+"')";
        .
    }
}
