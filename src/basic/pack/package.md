## 패키지
기능이 점점 추가되어서 프로그램이 커지면 어떻게 될까?   
``관련 있는 기능끼리 분류``해서 관리하자!

```java
    // 같은 패키지일 경우 패키지를 명시하지 않아도 된다.        
    Data data = new Data();
    // 다른 패키지일 경우 패키지를 명시해야 한다.
    basic.pack.a.User user = new basic.pack.a.User();
```

매번 패키지명을 적으려니 번거롭다. 방법이 없을까?

### import
```java
    import basic.pack.a.*; // basic.pack.a 패키지의 모든 클래스를 import
```

#### 클래스 이름이 같은 경우
같은 이름의 클래스가 있다면 ``import``는 둘 중 하나만 선택할 수 있다.   
자주 사용하는 클래스를 ``import``하고 나머지는 패키지를 포함한 전체 경로를 적어주면 된다.

### 패키지 규칙
- 패키지의 이름과 위치는 폴더(디렉토리) 위치와 같아야 한다.(필수)
- 패키지 이름은 ``모두 소문자``를 사용한다.(관례)
  - OS 따라서 대소문자를 구분하지 않을 수도 있으므로
- 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인 이름을 거꾸로 사용한다.(관례)
  - 예를 들어, ``com.company.myapp``
  - 여러 외부 라이브러리를 함께 사용할 경우,   
  같은 패키지에 같은 클래스 이름이 존재할 수 있으므로

### 패키지와 계층 구조
패키지는 계층 구조를 이룬다.
- a
  - b
  - c   

총 3개의 패키지 ``a``, ``a.b``, ``a.c``   
각 패키지는 서로 다른 패키지이다.

### 패키지 활용
서로 관련된 클래스는 하나의 패키지에 모으고,   
관련이 적은 클래스는 다른 패키지로 분리

``예시``
전체 구조도

- com.helloshop
  - user
    - User
    - UserService
  - product
    - Product
    - ProductService
  - order
    - Order
    - OrderService
    - OrderHistory
