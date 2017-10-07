import java.io.*;

class EchoStuff {
	
	public static void main(String args[]) {
		
		try {
			File out = new File("out2.txt");
			FileWriter fw = new FileWriter(out);
			
			String s;
			
			System.out.println("Enter some Text:");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			s = br.readLine();
			
			fw.write(s);
		
			fw.flush();
			fw.close();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}