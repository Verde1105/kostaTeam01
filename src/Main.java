import java.util.*;

public class Main {

  static HashMap<String, List<HashMap<String,Object>>> userNumList = new HashMap<>();
  static List<HashMap<String,Object>> userInfoList = new ArrayList<>();
  static HashMap<String,Object> userMap = new HashMap<>();
  public static void main(String[] args) {
    UserManager userManager = new UserManager();
    User user = new User("qqqq","aaaa",userManager.userNumRan());
    Stock stock = new Stock();
    Product product = new Product();
    Order order = new Order();
    EnumMd enumMd = new EnumMd();
      Scanner sc = new Scanner(System.in);
      String login = null;

      while (true) {
        if (login == null) {
          System.out.println("1. 회원가입 /" + "2. 로그인 /" + "5. 종료하기");
        } else {
          System.out.println("1. 회원가입 /" + "2. 로그아웃 /" + "3. 종료하기");
        }
        String i = sc.nextLine();

        switch (i) {
          case "1":
//            Main.userMap.put(userManager.login(Main.userMap));
            System.out.println("회원가입이 완료되었습니다.");
            continue;
          case "2":
            login = userManager.logOut(login);
            continue;
          case "3":
            System.out.println("쇼핑몰을 나갑니다.");
            break;
          default:
            System.out.println("잘못된 입력입니다. 다시 선택해 주십시오.");
            i = "";
            continue;

        }
      }
    }
  }
