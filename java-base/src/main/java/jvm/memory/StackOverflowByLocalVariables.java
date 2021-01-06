package jvm.memory;

/**
 * @example 通过局部变量模拟堆栈溢出，报错StackOverflowError
 */
public class StackOverflowByLocalVariables {

    private static int stackLength;

    public void findUser() {
        stackLength++;
        int user1, user2, user3, user4, user5, user6, user7, user8, user9, user10, user11, user12, user13, user14, user15, user16, user17, user18, user19, user20, user21, user22, user23, user24, user25, user26, user27, user28, user29, user30, user31, user32, user33, user34, user35, user36, user37, user38, user39, user40, user41, user42, user43, user44, user45, user46, user47, user48, user49, user50, user51, user52, user53, user54, user55, user56, user57, user58, user59, user60, user61, user62, user63, user64, user65, user66, user67, user68, user69, user70, user71, user72, user73, user74, user75, user76, user77, user78, user79, user80, user81, user82, user83, user84, user85, user86, user87, user88, user89, user90, user91, user92, user93, user94, user95, user96, user97, user98, user99, user100;
        findUser();
    }

    /**
     * 配置 VM Options: -Xss144K
     */
    public static void main(String[] args) {
        StackOverflowByLocalVariables flow = new StackOverflowByLocalVariables();
        try {
            flow.findUser();
        } catch (Throwable t) {
            System.out.printf("stackLength: %d\n", stackLength);
            throw t;
        }

//      输出
//      stackLength: 1059
//      Exception in thread "main" java.lang.StackOverflowError
//      at jvm.memory.StackOverflowByLocalVariables.findUser(StackOverflowByLocalVariables.java:11)
    }
}