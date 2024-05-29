package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
Stream 

*/

public class file15 {

	public static void main(String[] args) {
		try {
			//반복문으로 progress 구현
			String img="D:\\webpage\\agree\\src\\main\\java\\IO\\img.png";
			FileInputStream fs= new FileInputStream(img);
			System.out.println(fs.available()/100);
			
			String cpimg="D:\\webpage\\agree\\src\\main\\java\\IO\\";
			FileOutputStream os=new FileOutputStream(cpimg+"img2.png");
			byte[] by=new byte[fs.available()/100];
			int i=0; //읽은 바이트 수 
			int check=0; //읽은 횟수
			while(true) {
				i=fs.read(by);	//byte숫자(전체 용량을 /100) => 분해해서 용량을 읽어들임
				if(i==-1) {
					break;
				}
				else {
					os.write(by,0,i); //해당 byte만큼 지속적으로 이미지 조합(byte객체 이름, 0, 읽은 byte 수)
				}
				check++;
				if(check%2==0) {
					System.out.println(check+"%");
				}
			}
			
			os.flush();
			os.close();
			fs.close();
			
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
