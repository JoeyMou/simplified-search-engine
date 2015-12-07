import java.io.*;

/**
 * Created by Joey on 2015/12/6.
 */
public class Utils {
    /**
     * A util method written to read a file to String
     * @param file
     * @return A String contains the content of the file
     */
    public static String readFileToString(File file) {
        Long fileLength = file.length();
        byte[] fileContent = new byte[fileLength.intValue()];
        try {
            FileInputStream in = new FileInputStream(file);
            in.read(fileContent);
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String res = null;
        try {
            res =  new String(fileContent, "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return res;
    }

}
