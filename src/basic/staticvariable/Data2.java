package basic.staticvariable;

public class Data2 {
    public String name;

    public Data2(String name, Counter counter) { // data2와 관련된 기능을 위해서 별도의 Counter 클래스가 필요하다.
        this.name = name;
        counter.count++;
    }
}
