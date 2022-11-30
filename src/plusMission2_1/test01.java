//package plusMission2_1;// @ author ninaaano
//
///*
//n명이 참가하는 끝말잇기 게임을 프로그램으로 만들어봅시다~
//처음 시작 단어는 "기러기" 입니다.
//n명의 참가자들은 순서대로 자신의 단어를 입력하면 됩니다.
//끝말잇기에서 끝말이 틀린 경우 게임을 끝내고 게임에서 진 참가자를 화면에 출력해주시죠!
//
//끝말잇기 게임을 시작합니다!!
//게임에 참여하는 인원은 몇명입니까>> 3
//참가자 이름을 입력해주세요. >> shine
//참가자 이름을 입력해주세요. >> honux
//참가자 이름을 입력해주세요. >> silver
//시작 단어는 "기러기"입니다.
//shine>> 기차
//honux>> 차관
//silver>> 관자
//shine>> 저장고
//shine이 졌습니다.
//
//혹시 해보고 싶다면 추가로 시간초 제한 기능도 있으면 좋을것 같군요?
// */
//
//import java.util.Scanner;
//
///*
//- 게임 시작을 출력하는 메소드
//- 게임에 참여하는 인원 [n], 이름은 String[] 배열에 저장
//- 시작단어 sout "기러기"
//- 사용자가 입력한 단어 검사
//    - 마지막 단어 체크
//    - 첫 글자가 이전 사용자가 입력한 마지막 글자가 맞는지 확인
//    - 숫자가 들어오면 예외처리. 다시 입력받거나 패배처리
//- 다른 단어가 들어오면 패배처리
//
//
//
// */
//public class test01 {
//    // 입력받는 값을 관리한다.
//    public class Input {
//
//        public static void input() {
//            Scanner sc = new Scanner(System.in);
//            int userCount = sc.nextInt();
//            int[] userArray = new int[userCount];
//            String userName = sc.nextLine();
//            String[] userNameArray;
//        }
//
//    }
//
//    // 입력받은 유저를 관리한다
//    public class User {
//
//    }
//
//    // 게임 진행 내용, 출력 결과 반환
//    public class Game {
//
//        public static void gameStart() {
//            System.out.println("끝말 잇기 게임을 시작합니다");
//        }
//
//        public static void inputUserNumber() {
//            System.out.print("게임에 참여하는 인원은 몇명입니까?");
//        }
//
//    }
//
//    // 기회가 되면 시간초 세는 메소드까지 구현
//    public class TimeOut {
//
//    }
//
//}
