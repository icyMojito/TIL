

## # Comparable & Comparator

- ***컬렉션을 정렬하는데 필요한 메서드를 정의한 인터페이스***



#### Comparable

- 기본 정렬기준을 구현할 때 사용

- 구현 클래스들은 같은 타입의 인스턴스끼리 서로 비교할 수 있는 클래스들임

- 오름차순 정렬이 되도록 구현됨

  > _// java.lang 패키지_
  >
  > public interface Comparable {
  >
  > ​		**int compareTo(Object o);   _▶︎ 객체 자신과 o를 비교_**
  >
  > }

  - 비교하는 두 객체가 같으면 0, 비교하는 값보다 작으면 음수, 크면 양수를 반환하도록 구현
  - String의 Comparable 구현은 문자의 유니코드의 값 순서(공백>숫자>대문자>소문자)대로 정렬되도록 작성됨



#### Comparator

- 기본 정렬기준 외에 다른 기준(내림차순 등)으로 정렬하고자 할 때 사용

  > _// java.util 패키지_
  >
  > public interface Comparator {
  >
  > ​		**int compare(Object o1, Object o2);   _▶︎ o1과 o2를 비교_**
  >
  > ​		boolean equals(Object obj);
  >
  > }

  - 두 객체를 비교해서 음수, 0, 양수 중의 하나를 반환하도록 구현
  - equals 메서드는 오버라이딩이 필요할 수도 있다는 것을 알리기 위해 정의