package learnscreenshot;

import java.time.LocalDateTime;

public class TimeStamp {
public static void main(String[] args) {
	
//	//capture the local date and time of the machine 
//	 LocalDateTime local =LocalDateTime.now();
//	 LocalDateTime.now(); 
//	 System.out.println(local); //convert it into string
//	 String timeString = local.toString(); System.out.println(timeString); String
//	 updatedString = timeString.replace(':', '-');
//	 System.out.println(updatedString);
	 
	String timeStamp = LocalDateTime.now().toString().replace(':', '-');
	System.out.println(timeStamp );
}
}
