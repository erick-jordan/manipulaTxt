import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        String text
            = "Erick Jordan Libânio dos Santos";

        Path fileName = Path.of(
            "teste.txt");
 
        Files.writeString(fileName, text);
 
        String file_content = Files.readString(fileName);
 
        System.out.println(file_content);
        
        deleteFile("C:\\Users\\Erick Jordan\\eclipse-workspace\\WritingTxt2\\teste.txt");
        
	}
	
	static void deleteFile(String end) {
		
	
		Path xPath = Paths.get(end);
		try {
			Files.delete(xPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
