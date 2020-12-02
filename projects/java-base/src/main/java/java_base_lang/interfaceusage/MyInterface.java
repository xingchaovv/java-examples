package java_base_lang.interfaceusage;

interface MyInterface {

    default int doStuff() {
        return 42;
    }
}
