class A {

    public void show() {
        System.out.println("In A show");
    }

}

public class zAnonimusInnerClass {
    public static void main(String[] args) {

        A obj = new A() {
            public void show() {
                System.out.println("In Anonomous show");
            }
        }; // no class name file but consider as inner class

        obj.show();

    }
}
