package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class file16 {

	public static void main(String[] args) throws Exception {
		String path="D:\\product\\";
		String newPath="D:\\upload\\";
		file16_box fb=new file16_box();
		List<String> products=fb.property(path);//{"pd1.jpg", "pd2.jpg", "pd3.jpeg", "pd4.jpg"};
		try {
			for(int i=0;i<products.size();i++) {
				FileInputStream fs= new FileInputStream(path+products.get(i));
				byte[] by=new byte[fs.available()/10];
				int readByte=fs.read(by);
				FileOutputStream fo=new FileOutputStream(newPath+products.get(i));
				
				while((Boolean)(readByte!=-1)) {
					fo.write(by,0,readByte); 
					readByte=fs.read(by);
				}
				fo.flush();
				fo.close();
				fs.close();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}

class file16_box{
	
	public List<String> property(String path) throws Exception {
		
		File dir=new File(path);
		File files[]=dir.listFiles();
		List<String> matchFile=new ArrayList<String>();
		for (File file : files) {
			String fileName=file.getName();
			if(Files.probeContentType(file.toPath())!=null) {
				if(Files.probeContentType(file.toPath()).contains("image")) {
						matchFile.add(fileName);
				}
				else {
					System.out.println(Files.probeContentType(file.toPath()));
				}
			}
		}
		return matchFile;
	}
	
}