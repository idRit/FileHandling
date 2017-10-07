import java.io.*;

class ScoreTest {
	
	public static void main(String args[]) {

		try {
				
			String s, x = "jv";
			
			File in = new File("SCORE.dat");
			
			FileReader fr = new FileReader(in);
			
			BufferedReader br = new BufferedReader(fr);
			
			while((s = br.readLine()) != null) {
				//System.out.println(s);
				x = s;
			}
			
			fr.close();
	
			int y[] = new int[x.length()];
			
			String[] stringArray = x.split(":");
			
			for (int i = 0; i < stringArray.length; i++) {
				String numberAsString = stringArray[i];
				y[i] = Integer.parseInt(numberAsString);
			}
			int temp;
			
			for(int i1 = 0; i1 < 10; i1 ++) {
				for(int p = 0; p < 10; p ++) {
					if(y[i1] >= y[p]) {
						temp = y[i1];
						y[i1] = y[p];
						y[p] = temp;
					}
				}
			}
			
			System.out.println(y[0]);
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
}		
			