public class Main1 {
    public static void main(String[] args) {
        // ---------primitive data types---------
        byte b = 100;
        short s = 30000;
        int i = 100000;
        long l = 1000000000;

        float f = 3.14f;
        double d = 3.141592655359;

        char c = 'A';
        boolean flag = true;

        // ------------Non-primitive Data types------------

        String str = "Hello, Java";
        int[] arr = {1,2,3,4,5};
        Integer wrapperInt = Integer.valueOf(50); //wrapper class
        StringBuilder sb = new StringBuilder("java"); // class object

        // -------------Output--------------------

        System.out.println("byte: " + b);
        System.out.println("short: "+ s);
        System.out.println("int: " + i);
        System.out.println("long: "+ l);
        System.out.println("float: "+ f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        System.out.println("String: " + str);
        System.out.println("Array: ");
        for (int num: arr) {
            System.out.println(num + " ");
        }
        System.out.println();

        System.out.println("wrapper Integer: " + wrapperInt);
        System.out.println("StringBuilder: " + sb);



    }
}