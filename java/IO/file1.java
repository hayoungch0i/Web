package IO;

import java.io.FileReader;

/*oop -> IO -> network -> security -> aop 

I/O: input(키보드, 마우스, HDD, File), output(모니터, 프린터, 파일)

*/
public class file1 {

	public static void main(String[] args) {
		/*
		 FileReader: 문자 데이터(ASCII)만 해당 됩니다.
		 FileWriter: 문자 데이터 저장 파일(ASCII)
 		 load 할 파일명과 경로가 올바른 상황이면 try, 올바르지 않은 상황은 catch
		*/
		try {
			FileReader fr=new FileReader("D:\\webpage\\agree\\src\\main\\java\\IO\\agree.txt");
			System.out.println(fr.getEncoding()); //파일 언어셋
			System.out.println(fr.read()); //파일의 데이터 크기
			while(true) {//무한 루프로 파일 전체를 읽어들임
				int size=fr.read(); //read(): 파일을 읽어들임(ASCII)
				System.out.println((char)size);
				if(size==-1) { //해당 파일에 더 이상 읽을 내용이 없음(끝까지 읽음)
					break;
				}
			}
			fr.close();
		} 
		
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	

	}

}
