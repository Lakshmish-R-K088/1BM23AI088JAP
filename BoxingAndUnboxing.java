public class BoxingAndUnboxing {
    public static void main(String[] args) {
        // Boxing: Converting primitive data types to their corresponding wrapper classes
        Integer boxedInt = Integer.valueOf(10);
        Double boxedDouble = Double.valueOf(20.5);
        Character boxedChar = Character.valueOf('A');
        Boolean boxedBoolean = Boolean.valueOf(true);
        Float boxedFloat = Float.valueOf(30.5f);

        // Unboxing: Converting wrapper class objects back to their primitive data types
        int unboxedInt = boxedInt.intValue(); // Integer unboxing
        double unboxedDouble = boxedDouble.doubleValue(); // Double unboxing
        char unboxedChar = boxedChar.charValue(); // Character unboxing
        boolean unboxedBoolean = boxedBoolean.booleanValue(); // Boolean unboxing
        float unboxedFloat = boxedFloat.floatValue(); // Float unboxing

        // Display results
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Boxed Boolean: " + boxedBoolean);
        System.out.println("Unboxed Boolean: " + unboxedBoolean);
        System.out.println("Boxed Float: " + boxedFloat);
        System.out.println("Unboxed Float: " + unboxedFloat);
    }
}
