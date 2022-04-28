package controller;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;

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

    public void leerFicheros() {
        File file = new File("src\\main\\resources\\persona.json");
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
            String linea = null;
            StringBuffer lectura = new StringBuffer();
            while((linea = br.readLine())!=null){
                lectura.append(linea);
            }
            JSONObject jsonObject = new JSONObject(lectura.toString());
            JSONArray arrayConocimientos = jsonObject.getJSONArray("conocimientos");
            System.out.println(arrayConocimientos);
            for (int i = 0; i < arrayConocimientos.length(); i++) {
                JSONObject conocimiento = arrayConocimientos.getJSONObject(i);
                String concepto = conocimiento.getString("concepto");
                int experiencia = conocimiento.getInt("experiencia");
                System.out.println("Los detalles del conocimiento"+concepto+"son:");
                JSONArray detalles = conocimiento.getJSONArray("detalle");
                for (int j = 0; j < detalles.length(); j++) {
                    String detalle = detalles.getString(j);
                    System.out.println(detalle);
                }
            }
            System.out.println(jsonObject);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(br!=null){
                    br.close();                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
