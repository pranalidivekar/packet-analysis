import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class pktanalyser {

	public static void main(String[] args) throws IOException{
		//String filename = "";
		//filename = args[0];
		byte b[] = new byte[1024];
		int n=0;
		try (
				DataOutputStream out = new DataOutputStream(
						new FileOutputStream(args[1]));  //writing 
				
//				DataInputStream in = new DataInputStream(
//						new FileInputStream(args[0])); 	//reading
//				
				FileInputStream in = new FileInputStream(args[0]);
				InputStreamReader reader = new InputStreamReader(in,StandardCharsets.UTF_16);
//				 InputStream in = new FileInputStream(args[0]);
//	            OutputStream out = new FileOutputStream(args[1]);
						) {
					while((n = reader.read())!=-1) {
						out.write(b,0,n);
						System.out.println(n);
						}
				}catch(Exception e) {
					return;
		

	}
	}

}
