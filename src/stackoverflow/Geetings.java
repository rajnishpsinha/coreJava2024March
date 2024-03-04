package stackoverflow;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Geetings {
	public static void main(String[] args) throws IOException {
	/*taking input from console*/
		String input = null;
		System.out.println("Enter the sentence");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		if (line.equals("-1"))
			br.close();
		else
			input = line;	
		/* finding frequency of greeting */
		String[] arr = input.split(" ");
		int counter = 0;
		for (String str : arr) {
			if (str.equalsIgnoreCase("Hi") || str.equalsIgnoreCase("Hello") || str.equalsIgnoreCase("Hey")) {
				counter++;
			}
		}
		System.out.println("Greetings : "+counter);
	}
}
