## 반복문

- while
- do-while
- for
- 중첩반복문

### while vs for
### for
#### 장점:
1. 초기화, 조건 체크, 반복 후의 작업을 한 줄에서 처리할 수 있어 편리하다.
2. 정해진 횟수만큼의 반복을 수행하는 경우에 사용하기 적합하다.
3. 루프 변수의 범위가 for 루프 블록에 제한되므로, 다른 곳에서 이 변수를 실수로 변경할 가능성이 낮다.

#### 단점:
1. 루프의 조건이 루프 내부에서 변경되는 경우, 관리하기 어렵다.
2. 복잡한 조건의 반복문을 작성하기에는 while문이 더 적합할 수 있다.

### while
#### 장점:
1. 루프의 조건이 루프 내부에서 변경되는 경우, 관리하기 편하다.
2. for 루프보다 더 복잡한 조건과 시나리오에 적합하다.
3. 조건이 충족되는 동안 계속해서 루프를 실행하며, 종료 시점을 명확하게 알 수 없는 경우에 유용하다.

#### 단점:
1. 초기화, 조건 체크, 반복 후의 작업이 분산되어 있어 코드를 이해하거나 작성하기 어려울 수 있다.
2. 루프 변수가 while 블록 바깥에서도 접근 가능하므로, 이 변수를 실수로 변경하는 상황이 발생할 수 있다.

#### 결론:
정해진 횟수만큼 반복, 로직이 간단할 경우 for문   
조건이 루프 내부에서 변경, 실행 횟수를 단정할 수 없는 경우 while   
-> for문으로 해결하기 어려우면 while문도 고려