package Unit_8;

import java.io.*;

public class ReadMe{

	public static void main(String[] args) throws Exception{

		RandomAccessFile pledgeFile = new RandomAccessFile("Pledge.txt", "r");

		try{           
			pledgeFile.seek(124);
			System.out.println("the char at position(124) is: '"+(char)pledgeFile.read() + "'");
			pledgeFile.seek(135);
			System.out.println("the char at position(135) is: '"+(char)pledgeFile.read() + "'");           

		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			pledgeFile.close(); 
		}
	}
}