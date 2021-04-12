## # Calendar 클래스

- 추상클래스라서 직접 객체 생성이 불가능

- getInstance() 메서드로 완전히 구현된 클래스의 인스턴스를 얻음

  > Calendar cal = Calendar.getInstance();

  - 최소한의 변경으로 프로그램이 동작할 수 있도록. 다른 종류의 역법을 사용하는 국가에서 실행하거나 새로운 역법이 추가될 때 getInstance() 메서드만 수정하면 됨

- 인스턴스는 기본적으로 현재 시스템의 날짜와 시간에 대한 정보를 저장



#### 메서드

- set : 원하는 날짜나 시간으로 설정

  > void set(int field, int value)
  >
  > void set(int year, int month, int date, int hourOfDay, int minute, int second)

- get : 원하는 필드 값을 구함

  > int get(int field)

  - Calendar에 정의된 static 상수들을 매개변수로 사용
  - Calendar.MONTH의 범위는 0~11. 0부터 1월을 의미

- add(int field, int amount) : 지정한 필드의 값을 원하는 만큼 증가 또는 감소시킴

  - 다른 필드에 영향 있음. 일 필드의 값을 31 증가시키면 월 필드의 값도 1 증가

- roll(int field, int amount) : 지정한 필드의 값을 원하는 만큼 증가 또는 감소시킴

  - 다른 필드에 영향 없음. 단, 일 필드가 말일일 때 월 필드를 변경하면 일 필드에 영향을 미칠 수 있다.



#### Date 클래스와의 변환

- Calendar → Date

  > Calendar cal = Calendar.getInstance();
  >
  > . . .
  >
  > Date d = new Date(cal.getTimeInMillis());

- Date → Calendar

  > Date d = new Date();
  >
  > . . .
  >
  > Calendar cal = Calendar.getInstance();
  >
  > cal.setTime(d);