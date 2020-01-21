import interfaces.IConverter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ConverterApplication {
    public static void main(String[] args) {
        String filePath = args[args.length-1];
        if (args.length <=1 | !filePath.endsWith(".csv")){
            System.out.println("No input file defined");
            return;
        }
        try {
            String text = FileReader(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

    }

    public void test(){
        System.out.println("Test!");
    }

    public static String FileReader(String path) throws IOException {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        String output = new String();
        while ((st = br.readLine()) != null)
        output += st;
        return output;
    }
}
