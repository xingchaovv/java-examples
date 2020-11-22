package lang.interfaceusage;

interface MyInterface {

    default int doStuff() {
        return 42;
    }
}
