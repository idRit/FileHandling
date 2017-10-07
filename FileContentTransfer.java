import java.io.*;

class FileContentTransfer {
	
	public static void main(String args[]) {
		
		try {

			String s;
		
			File in =  new File("xyz.txt");
			File out =  new File("output.txt");
			
			FileReader fr = new FileReader(in);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(out);
			
			while((s = br.readLine()) != null) {
				fw.write(s);
			}
			
			fr.close();
			fw.close();
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}