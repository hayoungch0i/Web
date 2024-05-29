package IO;
import java.io.FileReader;
//여러개의 라인이 있는 파일 읽기
//fileReader: 읽기, fileWriter: 쓰기(저장)
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class file3 {

	public static void main(String[] args) throws Exception{
		try {
			String url = "D:\\webpage\\agree\\src\\main\\java\\io\\agree.txt";	
			FileReader fr = new FileReader(url);	
			Scanner sc = new Scanner(fr);
			//System.out.println(sc.hasNext());	//true, false
			/*
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
			*/
			do {
				System.out.println(sc.nextLine());
			}while(sc.hasNext());
			
			/*	
			//해당 라인외에 경고메세지 까지 출력이 되어버림
			for(;;) {
				String result = sc.nextLine();
				if(result != null) {
					System.out.println(result);
				}
				else {
					break;
				}
			}
			*/
			
			sc.close();
			fr.close();

			//추가 글쓰기 
			file3_box fb = new file3_box();
			fb.file_write();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
}

class file3_box{
	String url="D:\\webpage\\agree\\src\\main\\java\\IO\\agree.txt";
	FileWriter fw=null;
	Scanner sc2=null;
	
	public void file_write() {
		System.out.println("추가 내용을 입력하세요: ");
		try {
			this.sc2=new Scanner(System.in);
			String msg=this.sc2.nextLine();
			this.fw=new FileWriter(this.url, true); //true: 기존 데이터 보존, false: 새롭게 데이터 삽입
			this.fw.write("\n"+msg);
			System.out.println("저장 완료 되었습니다.");
			this.sc2.close();
			this.fw.close();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}	
}
