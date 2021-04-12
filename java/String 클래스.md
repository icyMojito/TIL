## # String 클래스

- **변경 불가능(immutable)한 클래스**
  - 문자열을 저장하기 위해 인스턴스 변수로 문자형 배열 참조변수(char[]) value를 가지고 있음
  
  - char배열에 기능(메서드)을 추가한 것
  
  - char배열과 중요한 차이로 String 객체(문자열)은 읽기만 가능하고 내용 변경이 불가능
  
    - _'+' 연산자로 문자열을 결합하면 인스턴스 내의 문자열이 바뀌지 않고 새로운 문자열이 담긴 인스턴스가 생성됨_
  
      > String str = "Java";
      >
      > str = str + "8"
  
      - 문자열 str의 내용이 변경되는 것이 아니라 새로운 내용의 문자열이 생성됨
  
    - 메모리공간을 절약하기 위해서 가능한 결합횟수를 줄이거나, 결합횟수가 많으며 StringBuffer 클래스 사용 추천



- **문자열의 비교**

  - 문자열 리터럴을 지정하여 같은 문자열을 만든 두 객체가 있다면

    이미 존재하는 것을 재사용하므로 equals()나 인스턴스 주소 등가비교('==') 시 결과는 모두 true

    > String str1 = "abc";   // 문자열 리터럴 "abc"의 주소가 str1에 저장됨

  - String 클래스의 생성자를 이용하여 같은 문자열을 만든 두 객체가 있다면

    각각 새로운 String 인스턴스가 생성되므로 equals()는 true여도 인스턴스 주소 등가비교('==') 시 결과는 false

    > String str2 = new String("abc");   // 새로운 String 인스턴스를 생성



- **문자열 리터럴**
  - 자바 소스파일에 포함된 모든 문자열 리터럴은 컴파일 시 클래스 파일에 저장됨
  - 같은 내용의 문자열 리터럴은 한 번만 저장
    - String 인스턴스이며 한 번 생성하면 내용을 바꿀 수 없어 하나의 인스턴스를 공유하면 되기 때문



- **빈 문자열**

  - new char[0]과 같이 길이가 0인 char형 배열이 저장 가능하므로 빈 문자열 생성이 가능

    > String s = "";

    - 단, char형 변수는 빈 문자 생성이 불가능하며 반드시 하나의 문자나 공백이라도 지정해야 함



- ***메서드***   _*낯선 메서드만 정리_

  - **String(char[] value)** : 주어진 문자열(value)을 갖는 String 인스턴스 생성

    > char[] c = {'H', 'i'};
    >
    > String s = new String(c);
    >
    > ▶︎ s = "Hi";

  - **String(StringBuffer buf)** : StringBuffer가 갖고 있는 문자열과 같은 내용의 String 인스턴스 생성

    > StringBuffer sb = new StringBuffer("Hello");
    >
    > String s = new String(sb);
    >
    > ▶︎ s = "Hello";

  - **int compareTo(String str)** : 문자열(str)과 사전순서로 비교. 같으면 0, 이전이면 음수, 이후면 양수 반환

    > int i1 = "aaa".compareTo("aaa");  ▶︎ i1 = 0;
    >
    > int i2 = "aaa".compareTo("bbb"); ▶︎ i2 = -1;
    >
    > int i3 = "bbb".compareTo("aaa"); ▶︎ i3 = 1;

  - **String concat(String str)** : 뒤에 문자열(str)을 덧붙임

    > String s1 = "Hello";
    >
    > String s2 = s1.concat(" world");
    >
    > ▶︎ s2 = "Hello world";

  - **boolean startsWith(String prefix)** : 주어진 문자열(prefix)로 시작하는지 검사

    > String s = "java.lang.Object";
    >
    > boolean b = s.startsWith("java");
    >
    > ▶︎ b = true;

  - **boolean endsWith(String suffix)** : 지정된 문자열(suffix)로 끝나는지 검사

    > String file = "Hello.txt";
    >
    > boolean b = file.endsWith("txt");
    >
    > ▶︎ b = true;

  - **int indexOf(int ch, int pos)** : 주어진 문자(ch)가 문자열에 존재하는지 지정된 위치(pos)부터 확인하여 위치(index, 0부터 시작)를 반환. 못 찾으면 -1을 반환. 

    > String s = "Hello";
    >
    > int idx1 = s.indexOf('e', 0);   ▶︎ idx1 = 1;
    >
    > int idx2 = s.indexOf('e', 2);   ▶︎ idx2 = -1;

  - **String intern()** : 문자열을 상수풀(constant pool)에 등록. 이미 상수풀에 같은 내용의 문자열이 있으면 그 문자열의 주소값을 반환

    > String s1 = new String("abc");
    >
    > String s2 = new String("abc");
    >
    > boolean b1 = (s1 == s2);	▶︎ false;
    >
    > boolean b2 = s1.equals(s2);    ▶︎ true;
    >
    > boolean b3 = (s1.intern() == s2.intern());    ▶︎ true;

  - **String replaceFirst(String regex, String replacement)** : 문자열 중에 지정된 문자열(regex)과 일치하는 것 중 첫 번째 것만 새로운 문자열(replacement)로 변경

    > String ab = "AABBAABB";
    >
    > String r = ab.replaceFirst("BB", "bb");
    >
    > ▶︎ r = "AAbbAABB";

  - **String[] split(String regex, int limit)** : 문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환하되 문자열 전체를 지정된 수(limit)로 자름

    > String animals = "dog, cat, bear";
    >
    > String[] arr = animals.split(",",2);
    >
    > ▶︎ arr[0] = "dog", arr[1] = "cat, bear";

  - **static String valueOf(boolean b | char c | int i | long l | float f | double d | Object o)** : 지정된 값을 문자열로 변환하여 반환. 참조변수가 매개변수이면 toString()을 호출한 결과를 반환

    > String a = String.valueOf(true);   ▶︎ a = "true";
    >
    > String b = String.valueOf('b');   ▶︎ b = "b";
    >
    > String c = String.valueOf(100);   ▶︎ c = "100";
    >
    > String d = String.valueOf(100L);    ▶︎ d = "100";
    >
    > String e = String.valueOf(10f);    ▶︎ e = "10.0";
    >
    > String f = String.valueOf(10.0);    ▶︎ f = "10.0";
    >
    > java.util.Date date = new java.util.Date();
    >
    > String date = String.valueOf(date);   ▶︎ date = "Thu Jan 23 23:14:19 KST 2020";

  - **String.join("구분자", 문자열 배열 참조변수)** : 문자열 배열의 요소인 문자열들 사이에 구분자를 넣어서 결합

    