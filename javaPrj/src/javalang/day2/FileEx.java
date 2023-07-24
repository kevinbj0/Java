package javalang.day2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx {
	public static void main(String[] args) throws IOException{
		// 파일 읽고 쓰기
		FileInputStream fin = new FileInputStream("res/data.txt");
		FileOutputStream fout = new FileOutputStream("res/dataCopy.txt");
		
		int x;
		x=fin.read();
		System.out.println(x);
		fout.write(x);
	}

}
