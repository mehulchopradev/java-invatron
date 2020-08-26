import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PainlessMain {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the full package name.classname of the class you want me to run for u: ");
        String fullClassName = scanner.nextLine();

        System.out.println("Please enter the name of the starter method from the class: ");
        String methodName = scanner.nextLine();

        // String class name -> Class
        Class classToRun = Class.forName(fullClassName);

        Object o = classToRun.newInstance(); // new Hello()

        Method method = classToRun.getDeclaredMethod(methodName); // start()
        method.setAccessible(true); // useful when trying to invoke private methods using reflection
        method.invoke(o); // new Hello().start()
    }
}
