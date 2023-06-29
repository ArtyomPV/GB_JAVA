import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class TXTFileRepository implements Repository{
    private static int idKey = 0;
    FileWriter fileWriter;
    File file;
    BufferedWriter bw;
    public TXTFileRepository(String filePath) throws IOException {
        fileWriter = new FileWriter(new File(filePath));
        bw = new BufferedWriter(fileWriter);
    }

    @Override
    public void saveFile(String text) throws IOException {
        idKey += 1;
        bw.write(idKey + "\t" + text );
        bw.write("\n");
        bw.flush();

    }
}
