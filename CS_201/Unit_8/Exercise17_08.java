package Unit_8;

import java.io.*;

public class Exercise17_08 {

	public static void main(String[] args) throws Exception {

		try{
			RandomAccessFile exercise17_08 = new RandomAccessFile("Exercise17_08.dat", "rw");
			
			int accessCount = 0;

			if (exercise17_08.length() > 0){
				accessCount = exercise17_08.readInt();
			}				

			exercise17_08.seek(0);
			exercise17_08.writeInt(++accessCount);
			System.out.println("This file has been accessed " + accessCount + " times");
			exercise17_08.close();
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}
