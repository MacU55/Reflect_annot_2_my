import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Class<?>> classList = Arrays.asList(AnnotatedClass1.class, AnnotatedClass2.class);
        MethodCaller methodCaller = new MethodCaller(classList);
        System.out.println(methodCaller.methodCaller("doPrint1-1"));

        System.out.println(methodCaller.methodCaller("counter"));
        System.out.println(methodCaller.methodCaller("doPrint2-2"));
    }
}
