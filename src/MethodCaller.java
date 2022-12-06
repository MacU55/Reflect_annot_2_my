import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

public class MethodCaller {
    HashMap<String, MethodInfo> map = new HashMap<>();

    public MethodCaller(List<Class<?>> classList) {
        for (Class<?> handlerInstance : classList) {
            Object newInstance;
            try {
                newInstance = handlerInstance.newInstance();
            } catch (Exception ex) {
                throw new RuntimeException("could not get new instance", ex);
            }
            for (Method method : handlerInstance.getDeclaredMethods()) {
                TargetMapping targetMapping = method.getDeclaredAnnotation(TargetMapping.class);
                if (targetMapping != null) {
                    String key = targetMapping.getStringValue();
                    MethodInfo methodInfo = new MethodInfo(newInstance, method.getName());
                    map.put(key, methodInfo);
                }
            }
        }
    }

    public Object methodCaller(String alias) {
        MethodInfo methodInfo = map.get(alias);
        Object result;

        try {
            String methodName = methodInfo.getMethodName();
            Method method = methodInfo.getInstanceHandler().getClass().getMethod(methodName);
            result = method.invoke(methodInfo.getInstanceHandler());
        } catch (Exception ex) {
            throw new RuntimeException("could not create instance", ex);
        }
        return result;
    }
}
