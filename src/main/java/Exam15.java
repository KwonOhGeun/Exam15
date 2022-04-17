import java.util.Scanner;

public class Exam15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;

        System.out.printf("1.국어 2.수학 3.영어 4.과학\n");
        System.out.printf("과목번호 : ");
        a = s.nextInt();

        switch (a) {
            case 1:
                System.out.println("국어 강의실은 101호 입니다.");
            case 2:
                System.out.println("수학 강의실은 102호 입니다.");
            case 3:
                System.out.println("영어 강의실은 201호 입니다.");
            case 4:
                System.out.println("과학 강의실은 202호 입니다.");

        }
    }

}
