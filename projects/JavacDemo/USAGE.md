# Javac 命令用法 Demo

JavacDemo 为一个独立的 Java 项目，用于演示 javac 用法。源码目录为 [/projects/JavacDemo](/projects/JavacDemo) 。

---

编译指定 Java 源文件，生成到指定目录，按照包结构

```
% javac -d target/classes src/main/java/JavacDemo/*.java
```

编译时指定类路径（项目中依赖的三方类库）

```
% javac \
-classpath libraries/json-20200518.jar \
-d target/classes \
src/main/java/*/*.java src/main/java/*/*/*.java
```

显示编译详情

```
% javac \
-classpath libraries/json-20200518.jar \
-d target/classes \
-verbose \
src/main/java/*/*.java src/main/java/*/*/*.java
```

通过指定参数文件来编译

```
% javac @build1_args
```

仅编译部分文件，依赖的部分类从target目录查找

```
javac \
-classpath target/classes:libraries/json-20200518.jar \
-d target/classes \
src/main/java/*/*.java
```
