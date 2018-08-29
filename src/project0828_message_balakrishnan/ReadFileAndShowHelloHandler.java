package project0828_message_balakrishnan;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ReadFileAndShowHelloHandler {
	@Execute
	public void execute(Shell shell) {
		MessageDialog.openInformation(shell, "Title", "Hello "+ testReadFile());

	}
	
	   //@Test
	   public String testReadFile() {
		List<String> contents = readFile("C:/eclipse/workspace/project0828-message-balakrishnan/config.txt");
		String name = null;  
		for (int i = 0; i < contents.size(); i++) {
	         String line = contents.get(i);
	         System.out.println("[DBG] Line " + i + " - " + line);

	         name = line.split(":")[0].trim();
	         System.out.println("[DBG] \tName: " + name);
	         
	      }
		return name;
	   }

	   public static List<String> readFile(String filePath) {
	      List<String> contents = new ArrayList<String>();
	      File file = new File(filePath);
	      Scanner scanner = null;
	      try {
	         scanner = new Scanner(file);
	         while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            contents.add(line);
	         }
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } finally {
	         if (scanner != null)
	            scanner.close();
	      }
	      return contents;
	   }
		
}