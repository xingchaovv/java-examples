package chao.example.lang.interfaceusage;

interface MyInterface {

    default int doStuff() {
        return 42;
    }
}
