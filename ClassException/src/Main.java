public class Main
{
    public static void main(String[] args)
    {
        boolean isInstanceOf = getObject() instanceof DerivedClass;
        System.out.println(isInstanceOf);
        ClassExceptionTest classExceptionTest = (ClassExceptionTest) getObject();
    }

    public static Object getObject()
    {
        DerivedClass derivedClass = new DerivedClass();
        ClassExceptionTest classExceptionTest = new ClassExceptionTest();
        AnotherClass anotherClass = new AnotherClass();
        return derivedClass;
//        return classExceptionTest;
//        return anotherClass;
    }
}