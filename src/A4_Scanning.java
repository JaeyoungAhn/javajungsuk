import java.util.*; // scanner클래스 사용

class A4_Scanning {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int num = Integer.parseInt(input);
        System.out.println("입력내용 :"+input);
        System.out.printf("num=%d%n", num);

    }
}
