package java_base_lang.dostatic;

import java_base_lang.dostatic.tool.MyTool;

import static java.lang.System.out;
import static java.lang.Integer.*;
// import static chao.example.lang.doimport.dostatic.tool.MyTool.VER;

class Use
{
    public static void main(String[] args) {
        out.println(MAX_VALUE);
        out.println(MyTool.VER);
        out.println(MyTool.STATUS);
        out.println(MyTool.checkStatus());
    }
}
