package controller;
import org.json.*;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JSONController {


    public void lecturaUrl(){
        String urlString = "https://www.thesportsdb.com/api/v1/json/2/all_leagues.php";
        URL url = null;

            try {
                url = new URL(urlString);
                HttpURLConnection connection = null;
                connection = (HttpURLConnection) url.openConnection();
                BufferedReader bufferedReader;
                bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuffer stringBuffer =new StringBuffer();
                String linea = null;
                while ((linea=bufferedReader.readLine())!= null){
                    stringBuffer.append(linea);
                }
                String response = stringBuffer.toString();
                JSONObject responseJSON = new JSONObject(response);
                //JSONArray arrayResultados = responseJSON.getJSONArray("results");
                for (int i = 0; i < arrayResultados.length(); i++) {
                    JSONObject objetoResultado = arrayResultados.getJSONObject(i);
                    //System.out.println(objetoResultado);
                    //String mail = objetoResultado.getString("email");
                    System.out.println(mail);
                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }




    }
}
