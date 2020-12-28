package JavacDemoB;

import JavacDemoB.tool.ToolA;
import org.json.JSONObject;

public class ParseJson2 {

    public static void main(String[] args) {
        String msgStr = "{\"code\":0,\"msg\":\"success\"}";
        JSONObject msg = new JSONObject(msgStr);
        if (!msg.has("code")) {
            System.out.println("The msg has none code");
        }
        System.out.printf("The code is: %d", msg.getInt("code"));
    }

    private void callToolA1()
    {
        ToolA.ToolA1();
    }
}
