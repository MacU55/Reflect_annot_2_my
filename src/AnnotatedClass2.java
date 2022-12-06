public class AnnotatedClass2 {

    @TargetMapping(getStringValue = "doPrint1-2")
    public String doPrint1(){
        return "invocation of method doPrint1, class AnnotatedClass2";
    }

    @TargetMapping(getStringValue = "doPrint2-2")
    public String doPrint2(){
        return "invocation of method doPrint2, class AnnotatedClass2";
    }

}
