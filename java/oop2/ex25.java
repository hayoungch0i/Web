package oop2;
/*
 //String,char
 FileReader,FileWriter -> ASCII
 BufferedReader, BufferedWriter -> 단독사용X
 
 //Stream + Reader, Writer
 InputStreamReader + BufferedReader
 OutputStreamWriter + BufferedWriter
 
 //byte[] + read + available + String byte변환(getBytes)
 InputStream -> FileInputStream, BufferedInputStream(read, readLine) 
 OutputStream -> FileOutputStream, BufferedOutputStream(read, readLine) 
  
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

//응용문제 사용자가 도메인을 입력하면 ex.http://www.naver.com -> 이동할 URL을 입력하세요 -> 모든 내용은 url.txt로 저장
//URL입력은 무한루프, 종료라고 입력하면 더이상 질문X, 파일 저장은 d:\\url.txt
public class ex25 {

	public static void main(String[] args) {
		

	}
}

class savefile{
	String url="d:\\url.txt";
	Scanner sc=null;
	File f=null;
	FileOutputStream fos=null;
	OutputStreamWriter osw=null;
	BufferedWriter bw=null;
	
	public void urlSave(){
		f=new File(url);
		sc=new Scanner(System.in);
		String moved=null;
		try {
			fos=new FileOutputStream(f,true); 
			osw=new OutputStreamWriter(fos); 
			bw=new BufferedWriter(osw); 
			System.out.println("이동할 URL을 입력하세요");
			while((moved=sc.nextLine().intern())!="종료") {
				bw.append(moved);
				bw.flush(); //메모리 영역 완전 초기화
			}
			
			//Input으로 출력
			InputStream is=new FileInputStream(f);
			InputStreamReader isr=new InputStreamReader(is);
			BufferedReader br=new BufferedReader(isr);
			
			br.close();
			isr.close();
			is.close();
			bw.close();
			osw.close();
			fos.close();
		} 
		catch (Exception e) {
			e.getMessage();
		}
		finally {
	
		}
	}
	
	
}
