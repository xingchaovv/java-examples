# java 命令用法 Demo

JavacDemo 为一个独立的 Java 项目，用于演示 java、javac 等命令用法。源码目录为 [/projects/JavacDemo](/projects/JavacDemo) 。

---

执行指定 main 类

```
% javac -d target/classes src/main/java/JavacDemo/*.java
% java -classpath "target/classes" JavacDemo.SayHello
```

执行指定 main 类（依赖三方库）

```
% javac -classpath "libraries/json-20200518.jar" -d target/classes src/main/java/ParseJson.java
% java -classpath "target/classes:libraries/json-20200518.jar" ParseJson
```

源文件模式，直接编译运行单个源文件

```
% java src/main/java/JavacDemo/SayHello.java
```
