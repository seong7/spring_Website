<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Lecture Project</h3>
<a href="index">index</a>

<hr/><br/>
<h3>개발 순서</h3>
<ol>
	<li>table.sql 테이블 3개 -> MySql 에 생성</li><br/>
	<li>root-context.xml 에 DB resource 확인</li><br/>
	<li>main.jsp 실행</li><br/>
	<li>domain/~VO -> dto/~Dto(DTO)</li><br/>
	<li>persistence -> dao</li><br/>
	<li>controller -> service -> dao -> *Mapper.xml</li><br/>
	<li>회원가입 및 로그인 , 로그아웃 기능 추가</li><br/>
	<li>
		글쓰기 -> 이미지 업로드 시<br/>
		C:\Spring\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\Lecture\resources\editor\upload 에 이미지 저장됨
		<ul>
			<li>eclipse(sts) 에는 가상 공간으로 인식되어 파일들이 표시되지 않음 / MsWindow 탐색기에서는 파일들 확인 가능</li>
		</ul>
	</li>
</ol>
<hr/><br/>

<h3>DB 통신 process</h3>
<ol>
	<li>View -> Controller (request 보냄)</li>
	<li>Controller -> Service Method 호출</li>
	<li>Service -> Dao Method 호출</li>
	<li>
		Dao Method 에서 MyBatis 라이브러리의 'SqlSession객체'의 메소드에<br/> 
		Mapper.xml 의 sql 문을 호출하여 DB와 통신 ('namespace' 값과 xml의 tag id값을 이용해 연결된다. )
	</li>
</ol>
</body>
</html>