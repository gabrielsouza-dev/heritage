package exercise3;
//Exercise class 4 - object-oriented programming with Java

public class RunApplication {
    
    public static void main(String[] args) {
        
        MotherClass[] classes = new MotherClass[]{new ChildClass(), new ChildClass1(), new MotherClass()};

        for (MotherClass mClass : classes) {
            mClass.Method();
        }

        System.out.println("");

        for (MotherClass mClass : classes) {
            mClass.Method1();
        }

        System.out.println("");

        ChildClass1 cClass = new ChildClass1();
        cClass.Method1();

    }

}
