package impaq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
* Point Of Sale - recruitment task.
* BarCodesScanner class is responsible for getting input (bar codes) from user.
* @author Patryk Pankiewicz
*/
public class BarCodesScanner {
	
	static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static String scannedCode () throws IOException{
		return reader.readLine();
	}
	
}
