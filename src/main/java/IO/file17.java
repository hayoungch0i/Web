package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

//파일 용량 체크로 업로드 방식(Buffered)
public class file17 {

	public static void main(String[] args) {
		String url="D:\\product\\img8.png";
		try {
			InputStream is=new FileInputStream(url);
			BufferedInputStream bs=new BufferedInputStream(is); //BufferedInputStream: byte 내용을 temp 임시 메모리에 저장함
			System.out.println(bs.available());
			if(bs.available()>2097152) {
				System.out.println("2메가 이하의 파일만 업로드 간으");
			}
			else {
				//byte file[]= new byte[bs.available()]; //buffer로 해당 값을 byte로 변환
				FileOutputStream fs=new FileOutputStream("D:\\upload\\fd.jpeg"); //FileOutputStream 사용 시 파일명 변경 가능
				int total=bs.read();
				fs.write(total);
				fs.flush();
				fs.close();
				bs.close();
				is.close();
				
				System.out.println("정상적으로 업로드 되었습니다.");
			}
		} 
		catch (Exception e) {
			e.getMessage();
		}

	}

}
