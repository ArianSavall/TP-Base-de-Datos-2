package org.example.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Path;
import java.time.LocalDate;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public abstract class JsonSerializer {
    public void convertirAJson(){
        Gson gson = new GsonBuilder().registerTypeAdapter(LocalDate.class, new LocalDateAdapter()).setPrettyPrinting().create();

        Path rutaArchivo = Paths.get("org/example/Json/" + this.getClass().getName() + ".json");

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
}
