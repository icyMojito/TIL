## # Arrays의 메서드

- ***모두 static 메서드이다.***



#### 배열의 복사 1. copyOf()

- 배열 전체를 복사해서 새로운 배열을 만들어 반환

  > int[] arr1 = {0,1,2,3,4};
  >
  > int[] arr2 = Arrays.copyOf(arr1, arr1.length);   ▶︎ [0,1,2,3,4]
  >
  > int[] arr3 = Arrays.copyOf(arr1, 7);   ▶︎ [0,1,2,3,4,0,0]



#### 배열의 복사 2. copyOfRange()

- 배열의 일부를 복사해서 새로운 배열을 만들어 반환

  > int[] arr1 = {0,1,2,3,4};
  >
  > int[] arr2 = Arrays.copyOfRange(arr1, 2, 4);   ▶︎ [2,3]
  >
  > int[] arr3 = Arrays.copyOfRange(arr1, 0, 7);   ▶︎ [0,1,2,3,4,0,0]



#### 배열 채우기 1. fill()

- 배열의 모든 요소를 지정된 값으로 채움

  > int[] arr = new int[5];
  >
  > Arrays.fill(arr, 9);   ▶︎ [9,9,9,9,9]



#### 배열 채우기 2. setAll()

- 배열을 채우는데 사용할 함수형 인터페이스 혹은 람다식을 매개변수로 받음

  > int[] arr = new int[5];
  >
  > Arrays.setAll(arr, (i) -> (int)(Math.random()*5)+1);   ▶︎ [1,5,2,1,3]



#### 배열의 정렬. sort()

- Comparator를 지정하지 않으면 저장하는 객체(Comparable을 구현한 클래스의 객체)에 구현된 내용에 따라 정렬

  > int[] arr1 = {3,2,0,1,4};
  >
  > Arrays.sort(arr1);   ▶︎ [0,1,2,3,4]
  >
  > String[] arr2 = {"cat", "Dog", "lion"};
  >
  > Arrays.sort(arr2);   ▶︎ [Dog, cat, lion]
  >
  > Arrays.sort(arr2, String.CASE_INSENSITIVE_ORDER);    ▶︎ [cat, Dog, lion]



#### 배열의 검색. binarySearch()

- 배열에 저장된 요소를 검색할 때 사용. 배열에서 지정된 값이 저장된 위치(index)를 찾아서 반환

  - 배열의 검색할 범위를 반복적으로 절반씩 줄여가며 검색
  - 반드시 배열이 정렬된 상태이어야 함
  - 검색한 값과 일치하는 요소들이 여러 개 있을 시 이 중에서 어떤 것의 위치가 반환될 지 알 수 없음

  > int[] arr = {3,2,0,1,4};
  >
  > int idx = Arrays.binarySearch(arr, 2);    ▶︎ idx = -5    // 정렬이 안된 상태이므로 잘못된 결과
  >
  > Arrays.sort(arr);
  >
  > idx = Arrays.binarySearch(arr, 2);    ▶︎ idx = 2    // 정렬이 된 상태이므로 올바른 결과



#### 문자열의 비교 1. equals()

- 일차원 배열 두 개에 저장된 모든 요소를 비교해서 같으면 true, 다르면 false를 반환



#### 문자열의 비교 2. deepEquals()

- 다차원 배열 두 개에 저장된 모든 요소를 비교해서 같으면 true, 다르면 false를 반환

  > String [] [] str2D1 = new String [] [] {{"aaa", "bbb"}, {"AAA", "BBB"}};
  >
  > String [] [] str2D2 = new String [] [] {{"aaa", "bbb"}, {"AAA", "BBB"}};
  >
  > Arrays.equals(str2D1, str2D2);    ▶︎ false
  >
  > Arrays.deepEquals(str2D1, str2D2);    ▶︎ true



#### 문자열의 출력 1. toString()

- 일차원 배열의 모든 요소를 문자열로 출력
- 매개변수가 모든 기본형 배열과 참조형 배열 별로 하나씩 정의되어 있음
  - boolean[] a, byte[] a, char[] a, short[] a, int[] a, long[] a, float[] a, double[] a, Object[] a



#### 문자열의 출력 2. deepToString()

- 다차원 배열의 모든 요소를 문자열로 출력

  > int [] [] arr2D = {{11,12}, {21,22}};
  >
  > Arrays.deepToString(arr2D);    ▶︎ [[11,12], [21,22]]



#### 배열의 변환. asList(Object... a)

- 배열을 List에 담아서 반환

- 매개변수의 타입이 가변인수라서 배열 생성 없이 저장할 요소들만 나열 가능

  > List list1 = Arrays.asList(new Integer[]{1,2,3,4,5});
  >
  > List list2 = Arrays.asList(1,2,3,4,5);
  >
  > list2.add(6);   ▶︎ UnsupportedOperationException 예외 발생

  - 반환된 List의 크기는 변경 불가능. 따라서 요소의 추가 또는 삭제가 불가능

  > List list3 = new ArrayList(Arrays.asList(1,2,3,4,5));

  - 크기를 변경할 수 있는 List 생성 방법
