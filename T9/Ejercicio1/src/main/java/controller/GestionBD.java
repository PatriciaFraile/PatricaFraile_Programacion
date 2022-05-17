package controller;

import database.SchemeDB;
import model.Perfil;

import java.sql.*;

public class GestionBD {
    private Connection conn;
    // no comprueba tipos
    // comprueba tipos de datos
     private PreparedStatement preparedStatement;
   private ResultSet resultSet;


    private void getConnection() {
        String host = SchemeDB.URL_SERVER;
        String dtbs = SchemeDB.DB_NAME;
        String user = "root";
        String pass = "admin";

        // jdbc:mysql://127.0.0.1:3306/colegio?user=root&pass=
        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
        try {
            conn = DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void closeConnection() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

   /* public void gestion(Perfil perfil) {
        Statement statement = null;
        try {
            getConnection();
            statement = conn.createStatement();

            String queryFormat = String.format("INSERT INTO %s (%s, %s) VALUES ('%s','%s')", SchemeDB.TAB_PERFIL,
                    SchemeDB.COL_ID_NUMERICO,SchemeDB.COL_NAME,
                    perfil.getId_numerico(), perfil.getNombre());
            //int numeroRow = statement.executeUpdate(queryFormat);
            if (statement.executeUpdate(queryFormat) > 0) {
                System.out.println("Alumno insertado correctamente");
            }
            //System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            closeConnection();
        }
    }*/

   /* public void insertarPerfiles(){
        getConnection();
        Statement statement = null;
        try {
            statement = conn.createStatement();
            String query1 = "INSERT INTO %s (%s) VALUES ('gerente')";
            statement.execute(String.format(query1,SchemeDB.TAB_PERFIL, SchemeDB.COL_NAME));
            String query2 = "INSERT INTO %s (%s) VALUES ('trabajador')";
            statement.execute(String.format(query2,SchemeDB.TAB_PERFIL,SchemeDB.COL_NAME));
            String query3 = "INSERT INTO %s (%s) VALUES ('director')";
            statement.execute(String.format(query3,SchemeDB.TAB_PERFIL,SchemeDB.COL_NAME));




      */  public void insertarUsuarios(){
          

    }
}









