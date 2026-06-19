package org.example.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Path;
import java.time.LocalDate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class JsonSerializer {
    public void convertirAJson(){
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).setPrettyPrinting().create();

        Path rutaArchivo = Paths.get("src/main/resources/Json/" + this.getClass().getName() + ".json");

        // 4. GUARDAR EL ARCHIVO
        try {
            // Escribimos el String en la ruta especificada
            Files.writeString(rutaArchivo, gson.toJson(this));
            System.out.println("¡Archivo JSON creado con éxito!");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al guardar el archivo: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void convertirListaAJson(List<?> lista) throws IOException {
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).setPrettyPrinting().create();

        for(int i = 0; i < lista.size(); i++){
            Path rutaArchivo = Paths.get("src/main/resources/Json/"+ lista.get(i).getClass().getSimpleName() + (i+1) + ".json");
            if(!Files.exists(rutaArchivo)){
                Files.createFile(rutaArchivo);
            }
            try {
                Files.writeString(rutaArchivo, gson.toJson(lista.get(i)));
                System.out.println("Archivo JSON de la lista creado con exito");
            }catch (IOException e){
                System.out.println("Ocurrio un error al guardar el archivo: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}
