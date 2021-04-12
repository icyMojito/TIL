### # Maven으로 JSP 프로젝트 만들기

 1. Maven 프로젝트 생성

 2. JSP 프로젝트에 필요한 web.xml 파일이 들어가는 web 디렉토리 생성 (일반 디렉토리)

 3. Project Settings의 Modules에서 프로젝트에 Add(+)로 Web 모듈 추가

    / Web Resource Directories에 설정된 경로는 2.에서 만든 web 디렉토리

 4. Artifacts에서 Add(+)로 Web Application : Exploded - Empty 추가하여 Output Layout에 모든 Available Elements의 요소를 옮김

    / Artifacts는 브라우저에서 실제로 보여질 결과물을 가리킴

 5. Build Artifacts ... 로 out 폴더 생성

    / out 폴더(폴더 이름은 변경 가능)에 있는 작업 내용이 실제로 반영됨

 6. Add Configuration 에서 Add New Configuration으로 Tomcat Server Local 추가 

    / Tomcat 위치를 잡고 Deployment 메뉴에서 현재 프로젝트의 artifact 추가



