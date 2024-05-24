package oop2;

import java.util.ArrayList;
import java.util.List;

public class exdto {
	String productName, productPrice, productCount; 	//getter, setter 설정 변수
	ArrayList<String> al=null;
	List<List<String>> plist=new ArrayList<List<String>>();
	
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductCount() {
		return productCount;
	}

	public void setProductCount(String productCount) {
		this.productCount = productCount;
	}
	public void adding() {
		this.al=new ArrayList<String>();
		this.al.add(this.getProductName());
		this.al.add(this.getProductPrice());
		this.al.add(this.getProductCount());
		this.plist.add(this.al);
	}
}
