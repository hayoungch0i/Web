package IO;

import java.io.FileInputStream;

//Stream 활용법(FileinputStream)
//txt, jpg, png... 파일도 가능 => byte
//FileInputStream: 파일을 로드한 후 해당 내용을 byte로 변환하여 저장
public class file12 {

	public static void main(String[] args) {
		try {
			String url="D:\\webpage\\agree\\src\\main\\java\\IO\\agree.txt";
			FileInputStream fs=new FileInputStream(url);
			System.out.println(fs.available()); //FileInputStream명.availiable(): 파일 용량
			byte temp[]=new byte[fs.available()];
			fs.read(temp); //byte 전체를 읽어들임
			String munja=new String(temp); //문자열로 반영
			System.out.println(munja);
			fs.close();
		} 
		catch (Exception e) {
			e.getMessage();
		}

	}

}
