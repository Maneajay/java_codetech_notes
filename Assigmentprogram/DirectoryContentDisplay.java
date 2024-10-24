package Assigmentprogram;
import java.io.File;

public class DirectoryContentDisplay {
public static void main(String[] args) {
	String directorypath ="path/to/your/directory";
	File dirctory =new File(directorypath);
	
	if(directory.isDirectory()) {
		for(File file: directory.listFiles()) {
System.out.println(file.isDirectory()? "directory:":"file: "+file.getName());
	}
}else {
	System.out.println("the specified is not valid directory:");
}
}
}