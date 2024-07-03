public class quiz02 {
    public static void main(String[] args) throws Exception {
        int height = 122;
        // height는 키를 의미합니다.

        String able = (height > 120) ? "가능합니다." : "불가능합니다.";
        //삼항연산자로 키가 120을 넘냐를 기준으로 문자열을 저장합니다.

        System.out.println("키 "+height+"cm는 탑승이"+able);
    }
}
