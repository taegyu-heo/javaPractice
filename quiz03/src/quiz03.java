public class quiz03 {
    public static void main(String[] args) throws Exception {
        
        String citizenNum = "010227-1234567";
        //임의의 주민번호 데이터

        String result = citizenNum.substring(0, citizenNum.indexOf("-")+2);
        //주민번호 데이터의 0번 인덱스 부터, "-"의 인덱스 이전에+2까지 문자열 분할(시작인덱스는 include, 끝인덱스는 exclusive)

        System.out.println(result);
        //결과값 출력
    }
}
