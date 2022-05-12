package controller;

import database.SchemeDB;

import java.sql.*;

public class GestionBD {
    private Connection conn;
    // no comprueba tipos
    private Statement statement;
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

    /*public void gestion() {
        String nombre = "Trabajador";
        String nombre1 = "Director";
        String nombre
        // INSERT INTO alumnos (nombre, apellido, edad) VALUES ('BORJA','MARTIN',38)
        try {
            getConnection();
            statement = conn.createStatement();
            String query = "INSERT INTO" + SchemeDB.TAB_PERFIL + " (" + SchemeDB.COL_NAME + "," + SchemeDB.COL_APELLIDO + "," + SchemeDB.COL_EDAD + ") " +
                    "VALUES ('" + nombre + "','" + apellido + "'," + edad + ")";
            String queryFormat = String.format("INSERT INTO %s (%s, %s, %s) VALUES ('%s','%s',%d)", SchemeDB.TAB_ALUMNOS,
                    SchemeDB.COL_NAME, SchemeDB.COL_APELLIDO, SchemeDB.COL_EDAD,
                    nombre, apellido, edad);
            int numeroRow = statement.executeUpdate(queryFormat);
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

    }

