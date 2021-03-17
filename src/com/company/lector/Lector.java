package com.company.lector;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Lector {

    public static String lee(String recurso) {
        String texto = null;
        try {
            texto = new String(Files.readAllBytes(Path.of("src/recursos/" + recurso)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return texto;
    }
}
