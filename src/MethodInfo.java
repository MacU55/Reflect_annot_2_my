public class MethodInfo {
    private Object instanceHandler;
    private String methodName;

    public Object getInstanceHandler() {
        return instanceHandler;
    }

    public void setInstanceHandler(Object instanceHandler) {
        this.instanceHandler = instanceHandler;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public MethodInfo(Object instanceHandler, String methodName) {
        this.instanceHandler = instanceHandler;
        this.methodName = methodName;
    }
}
