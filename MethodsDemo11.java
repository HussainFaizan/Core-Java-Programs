import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodsDemo11 {
  public static void printMethods(String name) throws Exception {
    Class c = Class.forName(name);

    Method m[] = c.getDeclaredMethods();

    System.out.println("the methods of " + name + " class are");

    for (int i = 0; i < m.length; ++i) {
      String mname = m[i].getName();
      String rtype = m[i].getReturnType().getName();
      Class params[] = m[i].getParameterTypes();
      Class exp[] = m[i].getExceptionTypes();
      int x = m[i].getModifiers();
      if (Modifier.isPublic(x))
        System.out.print("public  ");
      if (Modifier.isProtected(x))
        System.out.print("protected  ");
      if (Modifier.isPrivate(x))
        System.out.print("private  ");
      if (Modifier.isStatic(x))
        System.out.print("static  ");
      if (Modifier.isFinal(x))
        System.out.print("final  ");
      if (Modifier.isAbstract(x))
        System.out.print("abstract  ");
      if (Modifier.isNative(x))
        System.out.print("native  ");
      if (Modifier.isSynchronized(x))
        System.out.print("synchronized  ");
      System.out.print(rtype + "   " + mname + "(");

      for (int k = 0; k < params.length; ++k) {
        System.out.print(params[k].getName() + "   ");
      } // innfer for1
      System.out.print(")");
      if (exp.length != 0) {
        System.out.print("throws");
        for (int x1 = 0; x1 < exp.length; ++x1) {
          System.out.print(exp[x1].getName() + "  ");
        } // inner for2
      } // if
      System.out.println();
    } // outer for
  }

  public static void main(String args[]) throws Exception {
    printMethods(args[0]);
  }// main
}// class
