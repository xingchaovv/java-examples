package util;

import chao.chaoframe.util.JvmUtil;

public class JvmUtilTest {

    public static void main(String[] args) {
        JvmUtil.JarInfo jarInfo = JvmUtil.getJarInfo(JvmUtilTest.class);
        System.out.println(jarInfo);
    }

}
