package designpattern.chapter01;

public class Main {
    public static void main(String[] args) {
        Printer p1 = Printer.getInstance(); // 첫 호출 → 객체 생성
        Printer p2 = Printer.getInstance(); // 두 번째 호출 → 기존 객체 반환

        p1.print("첫 번째 출력");
        p2.print("두 번째 출력");

        System.out.println(p1 == p2); // 두 객체가 같은지 비교
    }
}