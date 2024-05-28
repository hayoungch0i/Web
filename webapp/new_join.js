var sec_number_check=0;
function signup_check(){
	if(document.getElementById("sec_num").value==sec_number_check){
		console.log("collect");
		alert("자동등록방지 collect");
	}
	else{
		console.log("wrong");
		alert("자동등록방지 wrong");
	}
}

function sec_load(){
	var w=1;
	var security="";
	var seimg=""; //이미지 출력 태그에 사용하는 변수
	do{
		var n=Math.floor(Math.random()*10);
		security+=n;
		seimg+="<img src='./no/no"+n+".png' style='width:40px;height:50px;float:left'>";
		w++;
	}while(w<5); //4자리 난수 이미지 생성
	document.getElementById("sec").innerHTML=seimg;
	//document.getElementById("seco").value=security;
	//document.getElementById("sec_num").innerHTML=seimg;
	console.log(security);
	sec_number_check=security;
}
sec_load();

function page_load(){
	window.location.reload(); //전체 새로고침
}