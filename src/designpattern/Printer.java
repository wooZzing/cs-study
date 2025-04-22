package designpattern;

public class Printer {

    // 1. 자신을 가리키는 객체를 static으로 하나만 만듭니다
    private static Printer instance;

    // 2. 생성자는 private → 외부에서 new Printer() 못함!
    private Printer() {}

    // 3. 객체를 꺼내 쓰는 메서드 (처음 요청 시 딱 1번만 생성)
    public static Printer getInstance() {
        if (instance == null) {
            // 객체 생성은 딱 한 번만!
            instance = new Printer();
        }
        return instance; // 그 후에는 같은 객체를 계속 반환
    }

    public void print(String msg) {
        System.out.println("출력: " + msg);
    }
}