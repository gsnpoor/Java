package CommonsIO;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class CommonsIODemo1 {
    public static void main(String[] args) throws IOException {
        /*File src = new File("Stream\\a.txt");
        File dest = new File("Stream\\b.txt");
        FileUtils.copyFile(src, dest);*/

        File src = new File("Stream\\aaa");
        File dest = new File("Stream\\bbb");
        /*FileUtils.copyDirectory(src,dest);
        FileUtils.copyDirectoryToDirectory(src,dest);
        FileUtils.deleteDirectory(dest);

        FileUtils.cleanDirectory(dest);*/

    }
}
