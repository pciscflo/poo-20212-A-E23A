package excepciones;

import java.io.FileNotFoundException;

public class Negocio {
    public void leerArchivo(String path) throws Exception {
        Utilitario.leerFile(path);
    }
}
