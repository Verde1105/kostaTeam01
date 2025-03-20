import java.util.HashMap;

public class User {

  String id = "";
  String pw ="";
  String userNum = null;

  public User(String id, String pw, String userNum) {
    this.id = id;
    this.pw = pw;
    this.userNum = userNum;
  }

  public String getId() {
    return id;
  }
  public String getPw() {
    return pw;
  }
  public String getUserNum() {
    return userNum;
  }

  public HashMap<String, String> userInfo(User user) {
    HashMap<String,String> userMap = new HashMap<>();
    userMap.put("id",user.getId());
    userMap.put("pw",user.getPw());
    userMap.put("usernum",getUserNum());
    return userMap;
  }





}
