package lamstr;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class App {

    public static void main(String[] args) throws IOException {
    	// Clean up previous iteration
    	Files.deleteIfExists(Paths.get("output.txt"));
        
        List<String> list = Files.readAllLines(Paths.get("input.txt"));
        
        list
        	.stream()
        	.filter(s -> s.contains("5"))
        	.map(s -> s + "\n")
        	.forEach(s -> {
				try {
					Files.writeString(Paths.get("output.txt"), s, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});;    
        
    }
}
