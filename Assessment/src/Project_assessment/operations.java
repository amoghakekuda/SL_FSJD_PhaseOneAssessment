package Project_assessment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

abstract class operations {
	
	abstract void Welcome();
	abstract void RepeatedChoice();
	abstract public void createfile(String s) throws IOException, FileNotFoundException;
	abstract public File addfile();
	abstract public void deletefile(String s)throws IOException, FileNotFoundException;
	abstract public void Showfiles();
	abstract public void searchfile(String s)throws IOException, FileNotFoundException;
	abstract public String yesno();
	
}
