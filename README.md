# Java 编程千例（努力中 💪💪💪 ）

作者：张星超

顾名思义，本项目的目标是完成一千个以上的 Java 编程实例，涵盖 Java 基础知识、进阶等各方面的内容。

## Java 基础

[源码入口](java-base)

**Java 虚拟机**

1. 堆内存溢出例子 [源码](java-base/src/main/java/jvm/memory/HeapOverflow1.java)

2. 栈内存溢出例子 [源码](java-base/src/main/java/jvm/memory/StackOverflow1.java)

3. 通过局部变量模拟堆栈溢出，报错StackOverflowError [源码](java-base/src/main/java/jvm/memory/StackOverflowByLocalVariables.java)

4. 通过创建大量线程模拟内存不足，报错OutOfMemoryError [源码](java-base/src/main/java/jvm/memory/OutOfMemoryErrorByThreads.java)

**网络**

1. Socket 客户端例子 [源码](java-base/src/main/java/chao/example/network/MySocketClient.java)

2. [Socket 服务端例子](java-base/src/main/java/chao/example/network/MySocketServer.java)

3. [InetAddress 类](java-base/src/main/java/chao/example/network/InetAddressDemo.java)

4. [Socket 多客户端支持](java-base/src/main/java/chao/example/network/MultiClientSocket)

5. [TCP 半关闭 Demo](java-base/src/main/java/chao/example/network/HalfCloseDemo.java)

6. [URL、URI 用法](java-base/src/main/java/chao/example/network/UrlDemo.java)

7. [URLConnection 类 Demo](java-base/src/main/java/chao/example/network/UrlConnectionDemo.java)

8. [URLConnection 发送 Post 请求](java-base/src/main/java/chao/example/network/PostForm.java)

**JDBC**

DB 连接测试

[/java-base/src/main/java/chao/example/jdbc/TestDb.java](/java-base/src/main/java/chao/example/jdbc/TestDb.java)

**线程

线程创建

[/src/main/java/chao/example/thread/MyCreateThread](/src/main/java/chao/example/thread/MyCreateThread)

线程中断

[](/src/main/java/chao/example/thread/MyInterruptThread)

未使用锁的线程

[](/src/main/java/chao/example/thread/MyUnsyncThread)

使用 ReentrantLock 锁

[](src/main/java/chao/example/thread/MyLockThread)

使用 Condition 条件

[](src/main/java/chao/example/thread/MyConditionThread)

使用 synchronized 同步方法

[](src/main/java/chao/example/thread/MySyncThread)

**日志

Log4j 2

[](src/main/java/chao/example/logging)

**单元测试

单元测试示例

[](src/test/java/com/xingchaovv/java/example/test/TestDemo1.java)

执行过程演示

[](src/test/java/com/xingchaovv/java/example/test/TestExecutionProcedure.java)

## Java 命令和工具

[源码入口](javac-demo)

**目录**

javac 用法

[/javac-demo/javac.md](/javac-demo/javac.md)

java 用法

[/javac-demo/java.md](/javac-demo/java.md)

jar 用法

[/javac-demo/jar.md](/javac-demo/jar.md)

## Maven 项目构建例子

[源码入口](maven-app)

## Web 应用 Demo

[源码入口](webapp-demo)
