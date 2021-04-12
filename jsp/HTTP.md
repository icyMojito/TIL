## # HTTP 기초

- **H**yper**T**ext **T**ransfer **P**rotocol : 웹 서버와 클라이언트 간의 통신, 즉 하이퍼 텍스트 문서를 교환하기 위하여 사용되는 통신 규약

- 웹에서만 사용되는 프로토콜

- TCP/IP 기반으로 한 지점에서 다른 지점(서버와 클라이언트)으로 요청과 응답을 전송

- 특징

  - HTTP 메시지는 HTTP 서버와 HTTP 클라이언트에 의해서 해석됨
  - TCP/IP를 이용하는 응용 프로토콜(application protocol)
  - 연결 상태를 유지하지 않는 비연결성 프로토콜
    - 이를 위해 Cookie와 Session 등장
  - 비연결성 프로토콜이므로 요청/응답(request/response) 방식으로 동작

- 기본 동작

  [Client] >>> HTTP request >>> [Server]

  ​             <<< HTTP response <<<

  - 사용자(Client)가 브라우저로 어떠한 서비스를 URL 등을 통해 요청(request)하면<br>서버(Server)에서는 해당 요청사항에 맞는 결과를 찾아서 사용자에게 응답(response)

| <span style="color:lightcoral">**GET 방식 전송**</span>      | <span style="color:teal">**POST 방식 전송**</span>           |
| :----------------------------------------------------------- | ------------------------------------------------------------ |
| 웹 브라우저가 파라미터를 전송할 때 사용하는 방식             | 웹 브라우저가 파라미터를 전송할 때 사용하는 방식             |
| 요청 URL에 파라미터를 붙여서 전송<br>URL 경로 뒤에 물음표(?)와 함께 파라미터를 붙이는데 이를 쿼리 문자열(query string)이라 함<br>→ http:// URL경로?이름1=값1&이름2=값2&..&이름n=값n<br>① < a > 태그의 링크 태그에 쿼리 문자열 추가<br>② HTML form의 method 속성값을 "GET"으로 지정해서 form을 전송<br>③ 웹 브라우저 주소창에 직접 쿼리 문자열을 포함한 URL 입력 | 데이터 영역을 이용해 파라미터를 전송<br>헤더 필드에 Content-Type(Body의 데이터를 설명하는 필드) 명시 필요 |
| 웹 브라우저가 HTTP 프로토콜에 맞춰 파라미터와 데이터를 전송할 때, 요청 헤더 첫 번째 줄에 파라미터 삽입 <br>→ GET  /URI?name=hkd&birth=Feb  HTTP/1.1<br> 요청방식     URI?요청 파라미터    HTTP 프로토콜 버전 | 쿼리 문자열(query string) 뿐만 아니라 라디오 버튼, 텍스트 박스 같은 객체들의 값도 전송 가능 |
| 웹 브라우저, 웹 서버, 웹 컨테이너에 따라 전송할 수 있는 파라미터 값의 길이에 제한 존재 가능 | 웹 브라우저, 웹 서버, 웹 컨테이너에 상관없이 전송할 수 있는 파라미터의 길이에 제한이 없음 |
| 전송방식 ① 웹 페이지 인코딩 사용<br>전송방식 ② 웹 페이지 인코딩 사용<br>전송방식 ③ 웹 브라우저마다 다름 | 웹 브라우저에서 파라미터 값을 인코딩할 때 입력 폼을 보여주는 응답 화면이 사용하는 캐릭터 셋을 사용 |
| 웹 서버에서 디코딩하는 방법은 WAS에 따라 다름<br>요청 라인에 URI와 함께 쿼리 문자열로 파라미터를 전달하기 때문에 setCharacterEncoding("캐릭터 셋") 메서드 적용이 불가능<br>→ 톰캣은 server.xml 파일에서 < Connector >의 useBodyEncodingForURI 속성 값을 true로 추가해주면 request.setCharacterEncoding("_{캐릭터 셋}_") 적용 가능 | 웹 서버에서는 인코딩에 사용한 캐릭터 셋을 이용해 디코딩<br>→ request.setCharacterEncoding("_{캐릭터 셋}_"); |
| URL에 데이터가 노출되어 보안에 취약                          | URL에 데이터가 노출되지 않음                                 |
| 캐싱 가능                                                    | 캐싱 불가능                                                  |



### ▣참조 링크

- <http://cris.joongbu.ac.kr/course/java/api/java/lang/IllegalArgumentException.html>
- <https://toma0912.tistory.com/69>
- <https://mangkyu.tistory.com/17>