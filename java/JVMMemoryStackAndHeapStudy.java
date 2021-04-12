public class JVMMemoryStackAndHeapStudy {
    public static void main(String[] args) {
        // stack에 age(10)이 생김. 원시타입의 데이터이므로 값이 함께 할당.
        int age = 10;

        // increaseAge 함수가 호출되면서 인자로 넘겨받은 값 age를 복사하여 전달.
        // 인자인 age 또한 원시타입의 데이터이므로 stack에 할당된 공간에 값이 할당됨.
        // 인자로 복사된 age의 값만 바꾸고 다른 행위가 없으므로 기존 age에 반영이 안됨. 출력 결과는 10!
        increaseAge1(age);
        System.out.println(age);

        // 처음 stack에 생성된 age에 메서드 increaseAge2 결과값이 재할당되므로 11이 됨
        age = increaseAge2(age);
        System.out.println(age);

        // stack에 레퍼런스 변수 person이 쌓이고, heap에 new Person(11) 생성
        // 생성자 인자로 age(11)를 복사하여 전달, 생성자 메서드의 결과로 12가 person의 인스턴스 필드 변수 age에 할당
        // person의 인스턴스 필드 변수 age(12)는 heap에 올라감.
        Person person = new Person(age);
        System.out.println(person.age);

        // 기존에 생성된 person을 복사한 인자 person이라는 참조변수가 새롭게 stack에 쌓이고,
        // 그 person은 기존에 heap에 생성된 person을 참조한다.
        // person의 age 값에 1을 더했기 때문에 increaseAge3 함수가 종료되더라도 원본 person의 age 값은 1이 증가한 13!
        // increaseAge3 함수가 종료되면 stack에 쌓였던 복사된 person은 pop되어 사라진다.
        increaseAge3(person);
        System.out.println(person.age);

        // 불변객체인 String과 마찬가지로, Wrapper class도 불변이다.
        // 그래서 heap에 있는 같은 객체를 참조하고 있어도 새로운 연산이 적용되면 새로운 객체가 heap에 새롭게 할당.
        // 그리고 인자로 복사된 stack의 참조변수는 새롭게 할당된 객체를 가리킨다.
        Integer a = 10;
        System.out.println("Before: " + a);
        changeInteger(a);
        System.out.println("After: " + a);
    }

    private static void increaseAge1(int age) {
        age += 1;
    }

    private static int increaseAge2(int age) {
        age += 1;
        return age;
    }

    private static void increaseAge3(Person person) {
        person.age++;
    }

    static class Person {
        int age;

        Person(int age) {
            this.age = age + 1;
        }
    }

    private static void changeInteger(Integer param) {
        param += 10;
    }
}