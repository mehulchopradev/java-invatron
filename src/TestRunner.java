import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class TestRunner {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the full package name.classname of the class you want me to run for u: ");
        String fullClassName = scanner.nextLine();

        // String class name -> Class
        Class classToRun = Class.forName(fullClassName);
        Object o = classToRun.newInstance();

        Map<Integer, Method> methodMap = new TreeMap<>();

        Method[] methods = classToRun.getDeclaredMethods();
        for (Method method: methods) {
            Test testAnnotation = method.getDeclaredAnnotation(Test.class);
            if (testAnnotation != null) {
                methodMap.put(testAnnotation.priority(), method);
            }
        }

        Collection<Method> methodsToRun = methodMap.values();
        methodsToRun.forEach(method -> {
            method.setAccessible(true);
            try {
                method.invoke(o);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });
    }
}
