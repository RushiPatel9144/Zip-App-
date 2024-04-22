
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Centeral {
    
    public static void main(String[] args) throws FileNotFoundException{
        
        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        Scanner scanner = new Scanner(reader);
        
        
        
        System.out.println("File contents are : \n");
        System.out.println(scanner.nextLine());
    }
    
}
