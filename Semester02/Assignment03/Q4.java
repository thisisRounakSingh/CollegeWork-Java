package Semester02.Assignment03;

class Box<T> {
    T data;

    Box(T data) {
        this.data = data;
    }

    void set(T data) {
        this.data = data;
    }
}

public class Q4 {
    // Assigned On: (Untracked)
static void main() {
        Box<String> boxString = new Box<>("Hello");
        Box<String> stringRef01 = boxString;
        System.out.println("String before change: " + stringRef01.data);
        Box<String> stringRef02 = boxString;
        stringRef02.set("World");
        System.out.println("String after change via second reference: " + stringRef01.data);

        Box<Integer> boxInt = new Box<>(42);
        Box<Integer> intRef01 = boxInt;
        Box<Integer> intRef02 = boxInt;
        System.out.println("Integer before change: " + intRef01.data);
        intRef02.set(99);
        System.out.println("Integer after change via second reference: " + intRef01.data);

        Box<Object> boxObj = new Box<>(null);
        Box<Object> objRef01 = boxObj;
        Box<Object> objRef02 = boxObj;
        objRef01.set("A String in Object box");
        System.out.println("Object box contains (String): " + objRef02.data);
        objRef02.set(12345);
        System.out.println("Object box now contains (Integer): " + objRef01.data);
    }
}
