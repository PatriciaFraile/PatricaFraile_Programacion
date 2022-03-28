package Explicacion.Excepciones;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Coche {
    public void metodoUno() throws IOException {
        File file = new File("");
        FileWriter fw = new FileWriter(file);

    }
    public void metodoDos(boolean acierto){
        if(acierto){
            System.out.println("Pasado en un true");
        }else{
            throw  new NullPointerException();
        }

    }
    public void metodoTres(){

    }
}
