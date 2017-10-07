//dev a program to count the no of words in the src file

import java.io.*;

class CountWord {
	
	public static void main(String args[]) {
		
		try {
				
			String s, x = "init";
			
			File in = new File("sample.txt");
			
			FileReader fr = new FileReader(in);
			
			BufferedReader br = new BufferedReader(fr);
			
			while((s = br.readLine()) != null) {
				System.out.println(s);
				x = s;
			}
			
			fr.close();

			int counter = 0;
			String[] stringArray = x.split(" ");
			
			for (int i = 0; i < stringArray.length; i++) {
				String numberAsString = stringArray[i];
				counter++;
			}
			
			
			System.out.println(counter);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}		
			