package org.example.Conexão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CONEXÃO {
        public static Connection conexãoBancoDados(){
            try {
                Connection conexão = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                        "postgres","ana123");

                if (conexão != null ){
                    System.out.println("Conexão bem sucedida");
                }else {
                    System.out.println("Conexão falha");
                }
                return conexão;
            }catch (SQLException e){
                e.printStackTrace();
                return null;
            }

        }
    }
