package IO;

import java.io.FileOutputStream;

//Stream을 이용하여 구구단 8단을 dan.txt로 저장

public class file14 {

	public static void main(String[] args) {
		try {
			String name="dan.txt";
			String url="D:\\webpage\\agree\\src\\main\\java\\IO\\";
			url+=name;
			FileOutputStream os=new FileOutputStream(url,false); //true:이어쓰기, false:새롭게 데이터 생성
			byte[]data=null;
			for(int i=1;i<10;i++) {
				String ag=("8 * "+i+" = "+8*i+"\n");
				data=ag.getBytes();
				os.write(data);	
			}
			os.flush(); //Stream에 있는 잔류 byte를 모두 출력 후 빈공간으로 변경
			os.close();
			
		} 
		catch (Exception e) {
			e.getMessage();
		}

	}

}
