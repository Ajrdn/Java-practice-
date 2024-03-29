package stream.decorator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try(InputStreamReader irs = new InputStreamReader(System.in)) {
			int i = 0;
			while((i = irs.read()) != -1) {
				System.out.print((char)i);
			}
		} catch(IOException e) {
			System.out.println(e);
		}
		
		Socket socket = new Socket();
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			br.readLine();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
