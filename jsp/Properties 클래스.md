## # Properties

- 프로퍼티(이름, 값)를 관리할 때 사용하는 클래스

  > Properties prop = new Properties();
  >
  > prop.setProperty("name1", "value1");
  >
  > String name1 = prop.getProperty("name1");

- load() 메서드로 프로퍼티(이름, 값) 목록을 파일에서 읽어올 수 있음



### 프로퍼티 파일

- 프로퍼티 정보를 갖고 있는 파일

- 프로퍼티 파일의 형식

  > #주석
  >
  > 프로퍼티이름1 = 프로퍼티값1
  >
  > 프로퍼티이름2 = 프로퍼티값2

  - 한 줄에 한 개의 프로퍼티 이름과 값을 설정하고 등호(=)를 사용해서 이름과 값을 구분

