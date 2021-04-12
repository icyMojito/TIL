## # Math 클래스

- 기본적인 수학계산에 유용한 메서드로 구성

- 인스턴스 생성이 불가능

  - 생성자의 접근 제어자가 private
  - 클래스 내에 인스턴스 변수가 없음
  - 메서드도 모두 static

- 상수 2개

  > public static final double E = 2.718281828... ***// 자연로그의 밑***
  >
  > public static final double PI = 3.141592653... ***// 원주율***

- 메서드 _*낯선 메서드만 정리_

  - **static double ceil(double a)** : 주어진 값을 올림하여 반환

    > double d1 = Math.ceil(10.1);
    >
    > double d2 = Math.ceil(-10.1);
    >
    > ▶︎ d1 = 11.0
    >
    > ▶︎ d2 = -10.0

  - **static double floor(double a)** : 주어진 값을 버림하여 반환

    > double d1 = Math.floor(10.8);
    >
    > double d2 = Math.floor(-10.8);
    >
    > ▶︎ d1 = 10.0
    >
    > ▶︎ d2 = -11.0

  - **static double rint(double a)** : 주어진 double값과 가장 가까운 정수값을 double형으로 반환. 단, 두 정수의 정 가운데의 값(1.5, 2.5 등)은 짝수를 반환

    > double d1 = Math.rint(1.2);
    >
    > double d2 = Math.rint(2.6);
    >
    > double d3 = Math.rint(3.5);
    >
    > ▶︎ d1 = 1.0
    >
    > ▶︎ d2 = 3.0
    >
    > ▶︎ d3 = 4.0
