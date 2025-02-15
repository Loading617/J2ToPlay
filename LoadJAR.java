import java.io.*;
import java.util.jar.*;

public class JarLoader {
    public static void loadJar(String path) throws IOException {
        JarFile jarFile = new JarFile(path);
        jarFile.stream().forEach(entry -> System.out.println("Loaded: " + entry.getName()));
    }
}