package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataProperty {
	public static void main(String[] args) throws IOException {
    FileInputStream file=new FileInputStream("./data/commondata.property");
    Properties p=new Properties();
    p.load(file);
    System.out.println(p.getProperty("username"));
    System.out.println(p.getProperty("password"));
    file.close();
	}
}
