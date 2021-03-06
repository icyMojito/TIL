## # Object 클래스

- ***모든 클래스의 최고 조상***

- java.lang 패키지에 속하는 클래스

- **equals() 메서드**

  - 매개변수로 다른 객체의 참조변수를 받아 두 참조변수에 저장된 값이 같은지 비교하여 그 결과를 boolean값으로 알림
  - 오버라이딩으로 변형하여 참조변수에 저장된 값뿐만 아니라 다른 요소의 비교도 가능

- **hashCode() 메서드**

  - 찾고자하는 값을 입력하면 그 값이 저장된 위치를 알려주는 해시코드를 반환
  - 객체의 주소값으로 해시코드를 생성
  - String 클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 오버라이딩되어 있음

- **toString() 메서드**

  - 인스턴스에 대한 정보(주로 인스턴스 변수에 저장된 값들)를 문자열(String)로 제공

  - 클래스이름과 16진수의 해시코드 

    > public String toString() {
    >
    > ​	return getClass().getName()+"@"+Integer.toHexString(hashCode());
    >
    > }

    - _따라서 클래스 작성 시 toString()을 오버라이딩하지 않으면 위와 같이 그대로 사용됨_

      ❖ String 클래스는 인스턴스가 갖고 있는 문자열을 반환하도록 오버라이딩 됨

      ❖ Date 클래스는 인스턴스가 갖고 있는 날짜와 시간을 문자열로 변환하여 반환하도록 오버라이딩 됨

