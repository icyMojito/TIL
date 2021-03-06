## # XSS 공격

- **XSS**

  - cross-site scripting의 약어
  - 사이트 간 스크립팅
  - 웹 애플리케이션에서 관리자가 아닌 이가 웹 페이지에 악성 스크립트를 삽입할 수 있는 취약점
  - 웹 어플리케이션이 사용자로부터 입력받은 값을 검증하지 않고 사용하면 발생
  - 출력 시 위험 데이터를 무효화시키지 않을 때 발생

- **XSS 공격**

  - 웹 서버와 클라이언트간 HTTP 프로토콜 동작과정 중에 발생

  - 브라우저로 전달되는 데이터에 악성 스크립트가 포함되어 개인의 브라우저에서 실행되면서 해킹하는 행위

    웹 서버에 구현된 웹 애플리케이션의 XSS 취약점을 이용하여 서버 또는 URL에 악성 스크립트를 미리 삽입해 놓음

  - 사용자의 정보(쿠키, 세션 등)나 시스템 관리자 권한을 탈취하거나 비정상적인 기능을 자동 수행하게 할 수 있음

  - 자바스크립트를 사용한 공격이 많음

- **공격 종류**

  - 저장 XSS 공격 : 웹 서버에 악성 스크립트를 영구적으로 저장해 놓아 사용자 브라우저의 요청 응답으로 실행되면 공격
  - 반사 XSS 공격 : 사용자에게 악성 스크립트가 포함된 URL을 배포하여 클릭한 사용자를 바로 공격
  - DOM 기반 XSS 공격 : 서버와 관계없이 브라우저가 HTML 페이지를 구문 분석할 때마다 공격 스크립트가 DOM(Document Object Model) 생성의 일부로 실행되며 공격

- **공격 기법**

  - 스크립트 태그, 링크 태그, 이벤트 속성, 블랙리스트 우회, 내용 난독화, 스크립트 난독화 등

- **방어 기법**

  - _공격받을 수 있는 코딩에 사용되는 입력 및 출력 값에 대해서 검증과 무효화 필수_

  - 입력필터

    - xss 필터를 만들고 web.xml에 선언하여 모든 파라미터가 해당 필터를 거치도록 함

    - 일부 태그와 속성만 허용하는 것이 좋음

      ㄴ 일부 태그만 막는 방식은 HTML 태그나 속성이 변할 때마다 주기적으로 필터를 수정해야 하고, 

      ​	수정이 완료되기 전에 공격당할 수 있음

    - 공신력있는 라이브러리를 이용해서 필터 제작
      - _NAVER Lucy XSS Filter_
      - OWASP Antisamy
      - AntiXSS
      - ESAPI
    - BBCode 사용
      - 글을 꾸미되 필터 제작이 어려운 경우 사용
      - < > 대신 [ ] 사용 

  - 출력필터

- **방지 7계명**

  1. 허용된 위치가 아닌 곳에 신뢰할 수 없는 데이터가 들어가는 것을 허용하지 않는다.
  2. 신뢰할 수 없는 데이터는 검증을 하여라.
  3. HTML 속성에 신뢰할 수 없는 데이터가 들어갈 수 없도록 하여라.
  4. 자바스크립트에 신뢰할 수 없는 값이 들어갈 수 없도록 하여라.
  5. CSS의 모든 신뢰할 수 없는 값에 대해 검증하여라.
  6. URL 파라미터에 신뢰할 수 없는 값이 있는지 검증하여라.
  7. HTML 코드를 전체적으로 한 번 더 검증하여라.



### ▣ 참조 링크

- https://ko.wikipedia.org/wiki/%EC%82%AC%EC%9D%B4%ED%8A%B8_%EA%B0%84_%EC%8A%A4%ED%81%AC%EB%A6%BD%ED%8C%85

- https://brownbears.tistory.com/250
- https://www.kisa.or.kr/uploadfile/201312/201312161355109566.pdf