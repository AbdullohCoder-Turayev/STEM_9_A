package example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FictionMovie implements Movie{

    private String filePath;

    public FictionMovie(String filePath){
        this.filePath = filePath;
    }

    @Override
    public String getMovie() throws IOException {
        File file = new File(filePath);
        byte[] bytes = Files.readAllBytes(file.toPath());
        return new String(bytes);
    }
}
