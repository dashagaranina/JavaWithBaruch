package foo.bar.lab05;

import javax.annotation.PostConstruct;
import java.io.FileWriter;
import java.io.IOException;

public class FileCreator {

    private String fileName;

    public FileCreator(String fileName) {
        this.fileName = fileName;
    }

    @PostConstruct
    public void writeFile() throws IOException {
        try(FileWriter fileWriter = new FileWriter(fileName)){
           fileWriter.write("qwerty");
        }
    }
}
