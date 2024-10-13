##  메서드(Method)

### 함수(function)   
``add(a,b) -> a + b;``   
``avg(a,b) -> (a + b)/2;``

### Method Declaration
```java
public static int add(int a, int b);
```

### Method Body
```java
{
    System.out.println(a + " + " + b + " 연산 수행");
    return a + b;
}
```

### 용어
- **Call 호출** ``add(1,2)``
- **Argument 인수** ``1, 2``
- **Parameter 매개변수** `` int a, int b``
- **Modifier 제어자** ``public``, ``static``
- **Return Type 반환 타입** ``void``, ``int``

### Method 호출과 값 전달

<span style="color:red;">중요 ! 자바는 항상 변수의 값을 복사해서 대입한다.</span>   
참조형도 마찬가지로 참조형 변수에 있는 참조값(메모리 주소)을 복사해서 대입한다.

### Method와 형변환
메서드 선언부의 매개변수(파라미터) 타입과 같아야 하지만, 자동 형변환 가능한 경우는 타입이 달라도 가능하다.

### Method 오버로딩(Overloading)
이름이 같고 매개변수 타입과 순서가 다르면 오버로딩 가능, 반환 타입은 인정하지 않는다.

### 변수명 vs 메서드명
변수: 명사, 메서드: 동사

### 메서드 사용의 장점
1. 재사용: 기능 캡슐화
2. 가독성
3. 모듈성: 관련 기능 묶음 처리
4. 유지보수: 수정 범위 줄어든다.
5. 재사용성과 확장성: 다른 프로젝트에 사용, 기존 기능 확장 가능
6. 추상화: 메서드 구현을 몰라도 된다.
7. 테스트와 디버깅 용이성