package controller;

import database.SchemeDB;

import java.sql.*;
import java.util.Scanner;

public class ControllerBD<UPDATE, SET> implements SchemeDB {
    private static final Object WHERE = null;
    Scanner entradaTeclado = new Scanner(System.in);

    private  Connection conn;
    private Statement statement;
    //comprueba tipos de datos
    private PreparedStatement  preparedStatement;

    private void getConection(){
        String host = "127.0.0.1:3306";
        String dtbs = "colegio_2";
        String user = "root";
        String pass = "admin";

        /*Connection conn=null;
        Statement st = conn.createStatement();
        ResultSet rs;*/

        PreparedStatement ps;



        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void closeConnection(){
        try {
            if(conn!=null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void insertarAlumnosStatement(){
        String nombre = "Patricia";
        String apellido = "Gomez";
        int edad = 18;
        //INSERT INTO alumnos (nombre , apellido , edad ) VALUES ('PAULA','GOMEZ',38)
        try {
            getConection();
            statement = conn.createStatement();
            String query ="INSERT INTO alumnos (nombre , apellido , edad ) VALUES ('PAULA','GOMEZ',38)";
            String format = String.format("INSERT INTO %s (%s , %s , %s ) VALUES ('%s','%s',%d)", SchemeDB.TAB_ALUMNOS,SchemeDB.COL_NAME, SchemeDB.COL_APELLIDO,SchemeDB.COL_EDAD,nombre,apellido,edad);
            int numeroRow =  statement.executeUpdate(format);
            System.out.println(numeroRow);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // es recomendable
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            //se tiene que cerrar
            closeConnection();
        }

    }
    public void introducirAlumnos(Alumno alumno){
        int opcion = 0;

            try {
                getConection();
                statement = conn.createStatement();
                String format = String.format("INSERT INTO %s (%s , %s , %s ) VALUES ('%s','%s',%d)", SchemeDB.TAB_ALUMNOS,SchemeDB.COL_NAME, SchemeDB.COL_APELLIDO,SchemeDB.COL_EDAD,alumno.getNombre(),alumno.getApellido(),alumno.getEdad());
                //int numeRow = statement.executeUpdate(format);
                //System.out.println(numeRow);
                if (statement.executeUpdate(format)>0){
                    System.out.println("Alumno insertado correctamente");
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }





    }
    public void insertarAlumnosPrepare(){
        String nombre = "Paulqa";
        String apellido = "Martin";
        int edad = 12;
        String query = "INSERT INTO alumnos (nombre , apellido , edad ) VALUES (?,?,?)";

        try {
            getConection();
            preparedStatement  =conn.prepareStatement(query);
            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,apellido);
            preparedStatement.setInt(3,edad);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                closeConnection();
            }
        }
    }
    public  void actualizarUsuario(String nombre ,int edad) {
        String query = "UPDATE %s SET %s = ? WHERE %s = ?";
        getConection();
        try {
            preparedStatement = conn.prepareStatement(String.format(query, SchemeDB.TAB_ALUMNOS,
                    SchemeDB.COL_EDAD, SchemeDB.COL_NAME, nombre));
            preparedStatement.setInt(1, edad);
            preparedStatement.setString(2, nombre);
            int rows = preparedStatement.executeUpdate();
            System.out.println("Los cambios afectados son" + rows);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
       /* public void borrar(){
            String quer = "DELETE FROM %s WHERE %s < ?";
            getConection();
            try {
                preparedStatement = conn.prepareStatement(String.format(query, SchemeDB.TAB_ALUMNOS,
                        SchemeDB.COL_EDAD));
                preparedStatement.setInt(1, edad);
                int rows = preparedStatement.executeUpdate();
                System.out.println("Los cambios afectados son" + rows);

            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }


        }*/

    }


}
