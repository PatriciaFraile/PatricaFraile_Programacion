import java.sql.PreparedStatement;

public class main {
    public static void main(String[] args) {

        String host = "127.0.0.1:80";
        String dtbs = "colegio_2";
        String user = "root";
        String pass = "admin";
        /*Connection conn=null;
        Statement st = conn.createStatement();
        ResultSet rs;*/

        PreparedStatement ps;



        String newConnectionURL = "jdbc:mysql://" + host + "/" + dtbs
                + "?" + "user=" + user + "&password=" + pass;
        /*
        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection(newConnectionURL);
            System.out.println(conn.getCatalog());
        } catch (SQLException e) {
            e.printStackTrace();
        }  finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }*/


    }
}
