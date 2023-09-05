package homeWorkFifth;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CreateBackup {
    public static void createBackup (String path, String pathSours) throws IOException {
        Files.createDirectory(Path.of(path));
        DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of(pathSours));
        for (Path file : dir) {
            if (Files.isDirectory(file)) continue;
            try {
                Files.copy(file, Path.of(path + file.toString()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
