## # Collections

- 컬렉션과 관련된 메서드 제공
  - *Collection*은 인터페이스 & *Collections*는 클래스
  - fill(), copy(), sort(), binarySearch()는 Arrays와 같은 기능을 함



#### 컬렉션의 동기화 메서드

- **동기화** : 멀티 쓰레드 프로그래밍에서 하나의 객체를 여러 쓰레드가 동시에 접근할 수 있으므로 데이터의 무결성을 유지하기 위해, 쓰레드가 공유하는 객체에 필요한 작업

  > static Collection ***synchronized***Collection(Collection c)
  >
  > static List ***synchronized***List(List l)
  >
  > static Set ***synchronized***Set(Set s)
  >
  > static Map ***synchronized***Map(Map m)



#### 컬렉션의 변경불가 메서드

- 컬렉션에 저장된 데이터를 보호하기 위해 컬렉션을 읽기 전용으로 만들 때 사용

  - 멀티 쓰레드 프로그래밍에서 여러 쓰레드가 하나의 컬렉션을 공유하다보면 데이터가 손상될 수 있음

  > static Collection ***unmodifiable***Collection(Collection c)
  >
  > static List ***unmodifiable***List(List l)
  >
  > static Set ***unmodifiable***Set(Set s)
  >
  > static Map ***unmodifiable***Map(Map m)



#### 싱글톤 컬렉션 메서드

- 단 하나의 객체만을 저장하는 컬렉션을 만들 때 사용

  - 매개변수로 저장할 요소를 지정하면 해당 요소를 저장하는 컬렉션을 반환하며, 반환된 컬렉션은 변경 불가능

  > static List ***singleton***List(Object o)
  >
  > static Set ***singleton***(Object o)      _※ singletonSet이 아님_
  >
  > static Map ***singleton***Map(Object key, Object value)



#### 단일 컬렉션 메서드

- 컬렉션에 지정된 종류의 객체만 저장할 수 있도록 제한할 때 사용

  - JDK1.5부터 도입된 지네릭스(generics)로 간단히 처리할 수 있으나, 이전에 작성된 코드와의 호환성 때문에 필요

  > static Collection ***checked***Collection(Collection c, Class type)
  >
  > static List ***checked***List(List l, Class type)
  >
  > static Set ***checked***Set(Set s, Class type)
  >
  > static Map ***checked***Map(Map m, Class keyType, Class valueType)



#### 기타 메서드

> ***import static*** **java.util.Collections.*;**     ▶︎ 정적 메서드를 더욱 쉽게 사용하기 위해 import static 지원
>
> 
>
> class Example {
>
> ​		public static void main(String[] args) {
>
> ​				List list = new ArrayList();
>
> ​				***// 메서드 앞에 Collections.가 붙어야 하나, import static으로 생략 가능***
>
> ​				addAll(list, 1, 2, 3, 4, 5);     ▶︎ list에 1,2,3,4,5를 요소로 추가
>
> ​				rotate(list, 2);      ▶︎ list의 요소들을 오른쪽으로 두 칸씩 이동. [4, 5, 1, 2, 3]
>
> ​				swap(list, 0, 2);       ▶︎ list의 요소 중 첫 번째와 세 번째를 교환
>
> ​				shuffle(list);      ▶︎ list의 요소 위치들을 임의로 변경
>
> ​				sort(list);       ▶︎ 정렬
>
> ​				sort(list, reverseOrder());        ▶︎ 역순 정렬 - reverse(list);
>
> ​				int idx = binarySearch(list, 3);       ▶︎ 3이 저장된 위치를 반환
>
> ​				max(list); / min(list)      ▶︎ list에서 가장 큰 / 작은 요소 반환
>
> 
>
> ​				List newList = nCopies(list.size(), 2); ▶︎ list와 같은 크기의 newList를 생성하고 2로 채움. 결과는 변경불가
>
> ​				disjoint(list, newList);    ▶︎ 공통요소가 없으면 true
>
> ​				copy(list, newList);     ▶︎ newList의 요소들을 list에 복사하기
>
> ​				replaceAll(list, 2, 1);     ▶︎ list의 요소 중 2를 1로 모두 바꾸기
>
> ​		}
>
> }