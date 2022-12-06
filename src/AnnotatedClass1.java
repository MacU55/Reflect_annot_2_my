public class AnnotatedClass1 {

    private int counter = 7;

    @TargetMapping(getStringValue = "doPrint1-1")
    public String doPrint1(){
        return "invocation of method doPrint1, class AnnotatedClass1";
    }

    @TargetMapping(getStringValue = "doPrint2-1")
    public String doPrint2(){
        return "invocation of method doPrint2, class AnnotatedClass1";
    }

    @TargetMapping(getStringValue = "counter")
    public int count(){
        return counter++;
     }

}
