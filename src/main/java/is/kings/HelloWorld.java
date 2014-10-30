package is.kings;

import java.io.BufferedReader; 
import java.io.InputStreamReader;
public class HelloWorld {
	
	public static String greet()
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String text = "";
		try {
			text = br.readLine();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int numReadIn = 0;
		numReadIn = Integer.parseInt(text);
		System.out.print(numReadIn);
		return "Hello World!";
	}
	
	public static void main(String[] args){
		greet();
	}
}
