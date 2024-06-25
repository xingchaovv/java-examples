
import chao.chaoutil.JvmUtil;

import java.io.IOException;

/**
 * 获取当前 Class 文件信息、所在 Jar 信息
 */
public class Example1107 {

    public static void main(String[] args) throws IOException {
        Example1107 example1107 = new Example1107();
        JvmUtil.JarInfo jarInfo = JvmUtil.getJarInfo(example1107.getClass());
        System.out.println(jarInfo);
    }

/* 测试方法

% java -cp "../../chaoutil/target/chaoutil-1.0-SNAPSHOT.jar:java-base-1.0-SNAPSHOT.jar" Example1107
JarInfo{fileSize=224374, creationTime=Fri Jun 21 15:43:37 CST 2024, modifiedTime=Fri Jun 21 17:29:43 CST 2024}

*/
}
