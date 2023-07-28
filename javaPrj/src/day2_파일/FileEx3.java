package day2_파일;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileEx3 {
	public static void main(String[] args) throws IOException{
		// 파일 읽고 쓰기
		FileInputStream fin = new FileInputStream("res/data.txt");
		FileOutputStream fout = new FileOutputStream("res/dataCopy3.txt");
		
		int x;
		
		while((x=fin.read()) != -1) { //파일의 끝이 아닐동안
			fout.write(x);
		}
	}

}
