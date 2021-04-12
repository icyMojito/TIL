## # StringBuffer 클래스

- 내부적으로 문자열 편집을 위한 버퍼(buffer)를 가지고 있기 때문에 인스턴스를 생성할 때 지정된 문자열을 변경할 수 있다.

- String 클래스처럼 문자열을 저장하기 위한 char형 배열의 참조변수가 인스턴스 변수로 선언되어 있다.

  - 이 배열을 문자열을 저장하고 편집하기 위한 공간인 버퍼로 사용

- 버퍼의 길이는 충분히 잡는다.

  - 편집 중인 문자열이 버퍼의 길이를 넘으면 버퍼의 길이를 늘려주는 작업 = 새로운 길이의 배열을 생성한 후에 이전 배열의 값을 복사하는 작업이 추가로 수행되므로 작업효율이 떨어짐
  - _생성자(StringBuffer(int length))_를 사용해서 크기 지정 *미지정시 16개의 문자를 저장할 수 있는 버퍼 생성

- 내용 변경 메서드 : append()

  - 반환타입이 StringBuffer이며 자신의 주소를 반환

  - 하나의 StringBuffer 인스턴스에 대해 연속적으로 append() 호출이 가능

    > StringBuffer sb = new StringBuffer("abc");
    >
    > sb.append("123").append("ZZ");
    >
    > _// sb.append("123") 자체가 다시 인스턴스 sb를 반환함_

- 객체 비교 : 등가비교연산자(==), equals

- 문자열 비교 방법 : toString() → equals

  - StringBuffer 인스턴스에 toString()을 호출해서 String 인스턴스를 얻고 eqauls 메서드로 비교

    > StringBuffer sb1 = new StringBuffer("abc");
    >
    > StringBuffer sb2 = new StringBuffer("abc");
    >
    > System.out.println(sb1.equals(sb2));     ***// false***
    >
    > String s1 = sb1.toString();
    >
    > String s2 = sb2.toString();
    >
    > System.out.println(s.equals(s2));   ***// true***

- _메서드 *낯선 메서드만 정리_

  - **int capacity()** : StringBuffer 인스턴스의 버퍼크기를 알려줌
  - **StringBuffer reverse()** : StringBuffer 인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열
  - **void setLength(int newLength)** : 지정된 길이로 문자열의 길이를 변경



## # StringBuilder 클래스

- StringBuffer에서 성능을 떨어뜨리는 쓰레드의 동기화만 뺀 클래스
- 멀티쓰레드로 작성된 프로그램이 아닌 경우 성능 향상을 위해 사용 권장