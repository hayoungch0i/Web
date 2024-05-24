package IO;

import java.io.BufferedReader;
import java.io.FileReader;

/*
FileReader -> Buffer
buffer : 메모리를 활용하여 데이터를 출력 또는 입력 (temp)
buffer는 임시 저장 공간의 데이터이므로 read 또는 readline 사용시
무조건 데이터는 순차적으로 삭제 시킵니다. 
*/

public class file6 {

	public static void main(String[] args) {
		try {
			String url="D:\\webpage\\agree\\src\\main\\java\\IO\\agree.txt";
			FileReader fr=new FileReader(url); //reader, writer 선언
			BufferedReader bf=new BufferedReader(fr); //buffer 선언
			String msg="";
			
			while((msg=bf.readLine())!=null) { //null이면 자동 종료
				System.out.println(msg);
			}
			
			/*
			while(true) {
				String msg = bf.readLine();		//Buffer readLine : 공백포함 임시저장소 값 읽기
				if(msg != null) {
					System.out.println(msg);	//출력
				}
				else {
					break;
				}
			}
			*/
			
			bf.close(); //buffer 종료
			fr.close(); //FileReader 종료
		} 
		catch (Exception e) {
			e.getMessage();
		}

	}

}
