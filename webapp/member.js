function agree_text1(){		/* 약관 동의 파일에서 불러오기1 */
	var agree1=document.getElementById("ag1");
	var result1=new XMLHttpRequest();
	//open("통신메소드","파일 경로","통신 동기 여부"): 이미지 동영상 문서파일등을 가져오는 함수
	//true:비동기통신, false:동기통신
	result1.open("GET","agree1.txt",true);
	result1.onreadystatechange=function(){
	if(result1.readyState==XMLHttpRequest.DONE &&result1.status==200){
		var texts=result1.response;
		agree1.innerText=texts;
	}
		//파일명 또는 해당 파일이 없어서 오류
	else if(result1.status==404){
		alert("해당 파일을 정상적으로  로드하지 못하셨습니다.");
		}
	}
	result1.send();
}

function agree_text2(){		/* 약관 동의 파일에서 불러오기2 */
	var agree2=document.getElementById("ag2");
	var result2=new XMLHttpRequest();
	result2.open("GET","agree2.txt?v=2",true);
	result2.onreadystatechange=function(){
		if(result2.readyState==XMLHttpRequest.DONE &&result2.status==200){
			var texts=result2.response;
			agree2.innerText=texts;
			console.log("join");
		}
		//파일명 또는 해당 파일이 없어서 오류
		else if(result2.status==404){
			alert("해당 파일을 정상적으로  로드하지 못하셨습니다.");
		}
	}
	result2.send();
}
agree_text1();
agree_text2();

/*모든 약관 동의시 가입 페이지로 이동 */
function join(){ 
	var check1=document.getElementById("agck1");
	var check2=document.getElementById("agck2");
	//console.log("join");
	if(check1.checked==true && check2.checked==true){
		//location.href: JavaScript 해당 페이지 강제 이동시 사용됨
		location.href="./new_join.html?all_agree=Y";	
	}
	else{
		alert("약관에 동의를 하셔야만 회원가입이 진행됩니다.");
	}
}

function all_checked(){ //약관 2가지 모두 체크되면 전체동의체크 true / 한가지라도 체크가 안되어있으면 전체동의체크 false
	var check1=document.getElementById("agck1");
	var check2=document.getElementById("agck2");
	var all_check=document.getElementById("all_agree");
	if(check1.checked==true && check2.checked==true){
		all_check.checked=true;
	}
	else{
		all_check.checked=false;
	}
}
	
function all_check(){ //전체동의체크에 따라 각각의 동의도 체크
	var check1=document.getElementById("agck1");
	var check2=document.getElementById("agck2");
	var all_check=document.getElementById("all_agree");
	if(all_check.checked==true){
		check1.checked=true; 
		check2.checked=true;
	}	
	if(all_check.checked==false){
		check1.checked=false; 
		check2.checked=false;
	}
}