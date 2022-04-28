package controller;
import  com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;

public class JSONController {
    String jsonString = "{\n" +
            "  \"nombre\": \"Borja\",\n" +
            "  \"apellidos\": \"Martin Herrera\",\n" +
            "  \"edad\": 38,\n" +
            "  \"hobbies\": [\n" +
            "    \"musica\",\n" +
            "    \"deporte\",\n" +
            "    \"cine\",\n" +
            "    \"informática\"\n" +
            "  ]}";
    public void pasarStringJSON(){
        //System.out.println(jsonString);
        JSONObject jsonObject = new JSONObject(jsonString);
       // System.out.println(jsonObject);
         String nombre = jsonObject.getString("nombre");
         int edad = jsonObject.getInt("edad");
         JSONArray hoobies = jsonObject.getJSONArray("hobbies");
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println("Tus hobbies son : ");
        for (int i = 0; i < hoobies.length(); i++) {
            System.out.println(hoobies.getString(i));
        }

    }

    public void leerFicheros(){
        FileReader reader = new FileReader("")

    }
}
