public class App {
    public static void main(String[] args) throws Exception {
        String name = "나코딩";
        String id = "010227-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : " +  getHiddenData(name, 1));
        System.out.println("주민등록번호 : " +  getHiddenData(id, 8));
        System.out.println("전화번호 : " +  getHiddenData(phone, 9));
    }

    public static String getHiddenData(String data, int index){
        //0 <= index 이라고 가정
        if (index == 0){
            data = "*".repeat(data.length());
            return data;
        }

        data = data.substring(0, index)+
               "*".repeat(data.substring(index).length());
        return data;      
               
    }
}
