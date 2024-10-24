## 자바 메모리 구조

### 자바 메모리 구조
- 메서드 영역: 클래스 정보
    - 클래스 영역: 클래스 실행 코드(바이트 코드), ``메서드와 생성자 코드``가 존재한다.
    - static 영역: static 변수를 보관한다.
    - 런타임 상수 풀: 123, "A", 프로그램 실행에 필요한 리터럴 상수를 보관한다.
- 스택 영역: 실행 중인 메서드, 지역변수(매개변수 포함), 중간 연산 결과
  - 자바 실행 시 thread 개수 만큼 스택 영역이 할당된다.
  - method 호출할 때 마다 스택 영역에 하나의 스택 프레임이 쌓인다.
  - 스택 프레임에는 지역변수(매개변수 포함), 중간 연산 결과, 메서드 호출 정보 등을 포함한다.
- 힙 영역: 인스턴스(변수)
  - 변수의 경우 인스턴스마다 값이 다를 수 있지만, 메서드는 그렇지 않고 동일하다.
    - 따라서 힙 영역에 메서드 코드까지 따로 보관하지 않는다.
    - 메서드는 메서드 영역에서 공통으로 관리하고 실행된다.
  - GC 대상 영역으로 더 이상 참조되지 않는 객체는 제거된다.

### 스택(Stack)과 큐(Queue) 자료구조
- 자료구조란? 자료(데이터)를 어떻게 효율적으로 보관할 수 있는가
  - 스택(Stack): LIFO, Last In First Out, ``|_|``
  - 큐(Queue): FIFO, First In First Out, ``| |``

### 스택(Stack) 영역
- 자바는 스택 영역을 사용해서 메서드 호출과 지역변수(매개변수 포함)를 관리한다.
- 메서드를 계속 호출하면 스택 영역에 스택 프레임이 계속 쌓인다.
- 지역변수(매개변수 포함)는 스택 영역에서 관리한다.
- 스택 프레임이 종료되면 지역변수도 함께 제거된다.
- 스택 프레임이 모두 제거되면 프로그램도 종료된다.

### 스택(Stack)영역과 힙(Heap) 영역
- 두 영역이 같이 사용되는 경우
  - 지역변수(매개변수 포함)과 인스턴스 변수   

참고: 힙 영역 안에서 인스턴스끼리 참조하는 경우에도 GC 대상이 된다.

### static 변수, 정적 변수, 클래스 변수 - 유틸성 메서드
- 공유 변수
- 해당 클래스가 JVM에 로딩되는 순간 생성된다.
- JVM이 종료될 때 삭제된다.
- 클래스를 통해 접근(권장)하거나, 인스턴스를 통해 접근할 수도 있다.

#### (비교) 인스턴스 변수의 경우
- 객체 생성 시 힙 영역에 생성되고 참조되지 않는 객체는 GC에 의해 삭제된다.

### static 메서드, 정적 메서드, 클래스 메서드
- 공용 기능
- static 메서드는 static 메서드만 사용할 수 있다.
  - 클래스 내부의 기능을 사용할 때, static 변수, static 메서드만 사용할 수 있다.
- 모든 곳에서 ``static``을 호출할 수 있다.
  - 정적 메서드는 공용 기능이다.   
    따라서 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 호출할 수 있다.

### static import
- 정적 메서드, 정적 변수에 사용 가능