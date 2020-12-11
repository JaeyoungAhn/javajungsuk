class A1_RegNum /* coding convention : 클래스명의 맨앞자리는 대문자, 변수와 메서드의 첫 글자는 소문자,
               여러단어로 이루어진경우 단어의 첫글자를 대문자, 상수는 모두 대문자로 하며 여러단어의경우 _로 구분 (cf. vs변수)
             */
{
    public static void main(String[] args) {
        /* 주민등록번호를 저장할때 어울리는 data type*/
        /* String in java is actually a non-primitive data type as it refers to an object
            기본형 8개와 참조형 / String 클래스 타입의 참조변수 regData
            참조형 변수는 null또는 객체의 주소(4byte)를 값으로 가짐
            64비트의 경우 8byte */
        long regNum = 9704021351141L;
        // long과 float의 리터럴에 접미사 각각 f와 l
        String regData = new String(""); // 비워두기가능 but char의 ''
        regData = "9704021351141";
        System.out.println(regNum);
        System.out.printf("%s", regData);
    }
}
