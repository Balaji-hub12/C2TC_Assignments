package DaySix.Usingfinal;

public class FinalVariable {

    // final instance variable must be initialized
    final int x = 100;

    // Declare a static blank final variable.
    final static int Y;

    // Declare & initialize static final variable.
    final static int Z = 10;

    // instance method
    void change() {
        // Cannot reassign final variable `x` or `Z`
        // x = 30; // ❌ Error: cannot assign a value to final variable x
        // Z = 200; // ❌ Error: cannot assign a value to final variable Z
    }

    @Override
    public String toString() {
        return "FinalVariable [x=" + x + ", Y=" + Y + "]";
    }

    // Declare a static block to initialize the final static variable.
    static {
        Y = 20; // ✅ Legal: initializing static final variable
        // Z = 100; // ❌ Error: already initialized above, can't reassign
        System.out.println("Value of Y: " + Y);
    }
}
