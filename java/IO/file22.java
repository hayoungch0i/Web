package IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;


public class file22 {

	public static void main(String[] args) throws Exception {
		new file22_csv();
		
	}

}

class file22_csv{
	
	private String pathSource="D:\\webpage\\agree\\src\\main\\java\\IO\\info.txt";
	private File fSource=null;
	private FileReader frSource=null;
	private BufferedReader brSource=null;
	
	private String pathCSV="D:\\webpage\\agree\\src\\main\\java\\IO\\member.csv";
	private File fCSV=null;
	private FileWriter fwCSV=null;
	private BufferedWriter bwCSV=null;
	
	private FileInputStream is=null;
	private FileOutputStream os=null;
	private OutputStreamWriter osw=null;
	
	public file22_csv() throws Exception {
		this.filecatch();
		this.loadNsave();
	}
	
	private void filecatch() throws Exception {
		try {
			this.is=new FileInputStream(this.pathSource);
			byte data[]=new byte[this.is.available()];
			this.is.read(data);
			String txt=new String(data,"utf-8");
			
			this.os=new FileOutputStream(this.pathCSV);
			this.osw=new OutputStreamWriter(os,"euc-kr");
			
			this.osw.write(txt);
			this.osw.flush();	
			
		} 
		catch (Exception e) {
			e.getStackTrace();
		}
		finally {
			this.osw.close();
			this.os.close();
			this.is.close();
		}
	}
	
	
	private void loadNsave() throws Exception {
		try {
			this.fSource=new File(pathSource);
			this.frSource=new FileReader(fSource);
			this.brSource=new BufferedReader(frSource);
			
			this.fCSV=new File(pathCSV);
			this.fwCSV=new FileWriter(fCSV, Charset.forName("euc-kr"),false);
			this.bwCSV=new BufferedWriter(fwCSV);
			
			String data="";
			while((data=this.brSource.readLine())!=null){
				bwCSV.write(data+"\n");
				bwCSV.flush();
			}
		} 
		catch (Exception e) {
			e.getMessage();
		}
		finally {
			this.bwCSV.close();
			this.fwCSV.close();
			this.brSource.close();
			this.frSource.close();			
		}
		
	}
	
}