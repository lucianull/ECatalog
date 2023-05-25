package CSVLogs;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class CSVReaderWriter {
    private static CSVReaderWriter instance = null;
    private BufferedReader inFile;
    private String line;
    private String path = "C:\\Informatica\\An 2\\Sem2\\PAO\\ECatalogV2\\src\\CSVLogs\\Logs.csv";
    private CSVReaderWriter() {
        this.path = path;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            byte[] bom = new byte[3];
            if (fileInputStream.read(bom) != -1 && bom[0] == (byte) 0xEF && bom[1] == (byte) 0xBB && bom[2] == (byte) 0xBF) {
                inFile = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
            }
            else {
                inFile = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bom), "UTF-8"));
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static CSVReaderWriter getInstance() {
        if(instance == null) {
            instance = new CSVReaderWriter();
        }
        return instance;
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
    
    public void WriteToFile(String text) {
        try(FileWriter outFile = new FileWriter(path)) {
            outFile.append(text);
        } catch(IOException e) {
            System.out.println("Error writing to " + path);
            e.printStackTrace();
        }
        
    }
}
