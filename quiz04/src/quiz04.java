public class quiz04 {
    public static void main(String[] args) throws Exception {
       
        String carType = "경차";

        int hour = 30;

        int pee = 0;

        if (hour <= 7){
            pee = hour*4000;
        }
        else if (7 < hour && hour < 24){
            pee = 30000;
        }
        else if ((hour - hour/24) <= 7 ){
            pee = (hour/24)*30000 + hour*4000;
            System.out.println("pee" + pee);
        }
        else {
            pee = (hour/24 + 1)*30000;
            System.out.println("pee" + pee);
        }

        switch (carType) {
            case "경차" :
                pee = pee/2;
                break;
            case "장애인 차량" :
                pee = pee/2;
                break;
            default :
                break;
        }

        System.out.println(carType + "의 " + hour + "시간 주차요금은 " + pee + "입니다.");
    }
}
