package CSVDatabase;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class CSVReader {
    private BufferedReader inFile;
    private String line;
    public CSVReader(String path, String encoding) {
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            byte[] bom = new byte[3];
            if (fileInputStream.read(bom) != -1 && bom[0] == (byte) 0xEF && bom[1] == (byte) 0xBB && bom[2] == (byte) 0xBF) {
                inFile = new BufferedReader(new InputStreamReader(fileInputStream, encoding));
            }
            else {
                inFile = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bom), encoding));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String[] getLine()
    {
        try {
            if((line = inFile.readLine()) != null)
            {
                String[] values = line.split(",");
                if(values.length > 1) {
                    return values;
                }
                
            }
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
