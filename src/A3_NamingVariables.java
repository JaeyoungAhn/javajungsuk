public class A3_NamingVariables {
    public static void main(String[] args) {
        /* 대소문자 구문되며 길이 제한 X
        예약어 사용불가능하나 True는 true와 다름
        숫자로 시작불가능, 특수문자는 _와 $를 허용
         */
        int $ollar = 1;
        int _Dollar = 2;
        int Dol_lar = 3;
        int D$llar = 4;
        int True = 5;
        System.out.println($ollar);
        System.out.println(_Dollar);
        System.out.println(Dol_lar);
        System.out.println(D$llar);
        System.out.println(True);
    }
}
