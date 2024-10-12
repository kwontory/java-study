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