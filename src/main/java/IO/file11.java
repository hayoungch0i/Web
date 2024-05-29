package IO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Reader, Writer, File -> ASCII
//Stream -> 바이너리(이미지, 동영상, 오디오, pdf, zip...)
//InputStream(입력), outputStream(출력)
//InputStream -> FileInputStream, AudioInputStream, ObjectInputStream(하위)

public class file11 {

	public static void main(String[] args) {
		try {
			
			//Files.createDirectories(경로): 디렉토리를 생성
			Files.createDirectories(Paths.get("d://images")); 
			/*
			//파일 복사 Path(interface) copy로 복사
			Path data1=Paths.get("d://images//gugu.txt");
			Path data2=Paths.get("d://images//gugu2.txt");
			Files.copy(data1, data2); 
			*/
			
			
			//Files.move(원래경로, 목적경로): 파일을 다른 경로로 이동
			Path data3=Paths.get("d://images//gugu2.txt");
			Path data4=Paths.get("d://gugu2.txt");
			Files.move(data3, data4);
			
			
			/*
			//Files.createFile(경로): 파일 생성
			Path data5=Paths.get("d://images//gugu_copy.txt");
			Files.createFile(data5);
			*/
			
			/*
			//Files.delete(경로): 파일 삭제
			Path data6=Paths.get("d://images//gugu_copy.txt");
			Files.delete(data6);
			*/
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}