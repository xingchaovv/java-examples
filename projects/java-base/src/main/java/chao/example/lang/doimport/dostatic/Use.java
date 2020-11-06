package chao.example.lang.doimport.dostatic;

import static java.lang.System.out;
import static java.lang.Integer.*;
// import static chao.example.lang.doimport.dostatic.tool.MyTool.VER;
import static chao.example.lang.doimport.dostatic.tool.MyTool.*;

class Use
{
    public static void main(String[] args) {
        out.println(MAX_VALUE);
        out.println(VER);
        out.println(STATUS);
        out.println(checkStatus());
    }
}
