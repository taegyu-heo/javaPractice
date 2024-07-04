public class quiz04 {//주차요금계산기
    public static void main(String[] args) throws Exception {
       
        String carType = "경차";
        //대상 차량이 할인 대상 차량인지 확인하는 변수

        int hour = 30;
        //주차 시간

        int pee = 0;
        //주차 요금

        //(일반차량 기준)주차 요금 계산하는 조건문
        if (hour <= 7){
            pee = hour*4000;
        }
        else if (7 < hour && hour < 24){
            pee = 30000;
        }
        else if ((hour % 24) <= 7 ){
            pee = (hour/24)*30000 + (hour%24)*4000;
        }
        else {
            pee = (hour/24 + 1)*30000;
        }

        //계산된 주차요금을 carType에 따라 할인하여 다시 산정하는 조건문
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

        //주차 요금 출력
        System.out.println(carType + "의 " + hour + "시간 주차요금은 " + pee + "입니다.");
    }
}

/*
 최초 시도 시에 주차 요금 계산하는 if-else문에서 2가지 오류가 있었음
 1. 시간을 계산하여 조건을 분기하는 부분에서 나머지 연산자를 쓸 곳에 몫 연산자 등을 사용함.
 2. 요금계산시에 일최대요금을 제외한 부분에서 나머지 시간에 시간당 요금을 곱해서 더해야 했는데, 
    전체 시간에 대해 시간당 요금을 곱함
 */
