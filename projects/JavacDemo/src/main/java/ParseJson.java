import org.json.JSONObject;

public class ParseJson {

    public static void main(String[] args) {
        String msgStr = "{\"code\":0,\"msg\":\"success\"}";
        JSONObject msg = new JSONObject(msgStr);
        if (!msg.has("code")) {
            System.out.println("The msg has none code");
        }
        System.out.printf("The code is: %d\n", msg.getInt("code"));
        System.out.printf("The msg is: %s\n", msg.getString("msg"));
    }
}
