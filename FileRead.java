import java.io.*;

class FileRead {
	public static void main(String args[]) {
		
		try {
			FileReader fr = new FileReader(args[0]);
			BufferedReader br = new BufferedReader(fr);
			String s;
		
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}