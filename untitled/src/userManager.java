import java.util.HashMap;
import java.util.Scanner;

public class userManager {

  public static String userNumRan() {
    int ran1 = 0;
    int ran2 = 0;
    int longRan = 0;
    String num = "";
    String num1 = "";
    String num2 = "";
    String num3 = "";

    ran1 = (int) (Math.random() * 100);
    ran2 = (int) (Math.random() * 100);
    longRan = (int) (Math.random() * 100000 + 10000);

    if (ran1 < 10) {
      num1 = "00" + ran1;
    } else {
      num1 = "0" + ran1;
    }
    if (ran2 < 10) {
      num2 = "-00" + ran2;
    } else {
      num2 = "-0" + ran2;
    }
    if (longRan < 100000) {
      num3 = "-0" + longRan;
    } else {
      num3 = "-" + longRan;
    }
    num = num1 + num2 + num3;
    return num;
  }

  public static String login(HashMap<String, Object> userMap) {
    String loginYn = null;
    Scanner sc = new Scanner(System.in);
    System.out.println("로그인하시겠습니까?");
    System.out.print("아이디 : ");
    String userId = sc.nextLine();
    System.out.print("비밀번호 : ");
    String userPw = sc.nextLine();

    for (int i =0; i <= userMap.size(); i++) {
      if (userId.equals(userMap.get("id"))) {
        if (userMap.get("pw").equals(userPw)) {
          System.out.println("로그인 되었습니다.");
          return loginYn = userMap.get("회원번호").toString();
        } else {
          System.out.println("잘못된 비밀번호 입니다.");
          return loginYn;
        }
      } else if (userMap.get("id").equals(null)) {
        System.out.println("존재하지 않는 id 입니다.");
      }
    }
    return loginYn;
  }

  public String logOut(String login) {
    if (login != null) {
      login = null;
      System.out.println("로그아웃하였습니다.");
      return login;
    }
    login = userManager.login(Main.userMap);
    if (login == null) {
      System.out.println("로그인에 실패하였습니다. 홈으로 돌아갑니다.");
    }
    return login;
  }

}
