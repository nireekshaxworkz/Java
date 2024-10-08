package com.xworkz.stream;

import java.util.concurrent.Callable;
import java.util.function.*;

public class FunctionalInterface {

    1. Supplier<T>

    Supplier<String> supplier = () -> "Hello, World!";
System.out.println(supplier.get()); // Outputs: Hello, World!

2. Consumer<T>

    Consumer<String> consumer = s -> System.out.println(s);
consumer.accept("Hello, Consumer!"); // Outputs: Hello, Consumer!

3. Function<T, R>

    Function<Integer, String> function = num -> "Number: " + num;
System.out.println(function.apply(5)); // Outputs: Number: 5

4. Predicate<T>

    Predicate<Integer> isEven = num -> num % 2 == 0;
System.out.println(isEven.test(4)); // Outputs: true

5. UnaryOperator<T>

    UnaryOperator<Integer> square = x -> x * x;
System.out.println(square.apply(3)); // Outputs: 9

6. BinaryOperator<T>

    BinaryOperator<Integer> add = (a, b) -> a + b;
System.out.println(add.apply(2, 3)); // Outputs: 5

7. BiFunction<T, U, R>

    BiFunction<String, String, String> concat = (a, b) -> a + b;
System.out.println(concat.apply("Hello, ", "BiFunction!")); // Outputs: Hello, BiFunction!

8. BiConsumer<T, U>

    BiConsumer<String, Integer> printKeyValue = (key, value) -> System.out.println(key + ": " + value);
printKeyValue.accept("Age", 30); // Outputs: Age: 30

9. BiPredicate<T, U>

    BiPredicate<Integer, Integer> isSumGreaterThanTen = (a, b) -> (a + b) > 10;
System.out.println(isSumGreaterThanTen.test(4, 7)); // Outputs: true

10. Supplier<Double>

    Supplier<Double> randomSupplier = () -> Math.random();
System.out.println(randomSupplier.get()); // Outputs: A random double value

11. Consumer<Double>

    Consumer<Double> printDouble = d -> System.out.println("Double value: " + d);
printDouble.accept(10.5); // Outputs: Double value: 10.5

12. Function<Double, String>

    Function<Double, String> doubleToString = d -> "Value: " + d;
System.out.println(doubleToString.apply(5.5)); // Outputs: Value: 5.5
    [11:01 am, 8/10/2024] Divya Xworkz: 13. Predicate<String>

    Predicate<String> isNotEmpty = s -> s != null && !s.isEmpty();
System.out.println(isNotEmpty.test("Hello")); // Outputs: true

14. UnaryOperator<String>

    UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
System.out.println(toUpperCase.apply("hello")); // Outputs: HELLO

15. BinaryOperator<String>

    BinaryOperator<String> concatStrings = (a, b) -> a + " " + b;
System.out.println(concatStrings.apply("Hello", "World")); // Outputs: Hello World

16. BiFunction<Integer, Integer, Integer>

    BiFunction<Integer, Integer, Integer> addIntegers = (a, b) -> a + b;
System.out.println(addIntegers.apply(10, 20)); // Outputs: 30

17. BiConsumer<String, String>

    BiConsumer<String, String> printBoth = (a, b) -> System.out.println(a + " and " + b);
printBoth.accept("Hello", "World"); // Outputs: Hello and World

18. BiPredicate<String, String>

    BiPredicate<String, String> areEqual = (a, b) -> a.equals(b);
System.out.println(areEqual.test("Java", "Java")); // Outputs: true

19. IntConsumer

    IntConsumer printInt = i -> System.out.println("Int value: " + i);
printInt.accept(100); // Outputs: Int value: 100

20. LongConsumer

    LongConsumer printLong = l -> System.out.println("Long value: " + l);
printLong.accept(100L); // Outputs: Long value: 100

21. DoubleConsumer

    DoubleConsumer printDouble = d -> System.out.println("Double value: " + d);
printDouble.accept(99.99); // Outputs: Double value: 99.99

22. IntFunction<R>

    IntFunction<String> intToString = i -> "Number: " + i;
System.out.println(intToString.apply(7)); // Outputs: Number: 7

23. LongFunction<R>

    LongFunction<String> longToString = l -> "Long: " + l;
System.out.println(longToString.apply(123456789L)); // Outputs: Long: 123456789
    24. DoubleFunction<R>

    DoubleFunction<String> doubleToString = d -> "Double: " + d;
System.out.println(doubleToString.apply(45.67)); // Outputs: Double: 45.67

25. IntPredicate

    IntPredicate isPositive = i -> i > 0;
System.out.println(isPositive.test(10)); // Outputs: true

26. LongPredicate

    LongPredicate isEven = l -> l % 2 == 0;
System.out.println(isEven.test(8L)); // Outputs: true

27. DoublePredicate

    DoublePredicate isGreaterThanTen = d -> d > 10.0;
System.out.println(isGreaterThanTen.test(15.5)); // Outputs: true

28. IntUnaryOperator

    IntUnaryOperator square = i -> i * i;
System.out.println(square.applyAsInt(5)); // Outputs: 25

29. LongUnaryOperator

    LongUnaryOperator increment = l -> l + 1;
System.out.println(increment.applyAsLong(99L)); // Outputs: 100

30. DoubleUnaryOperator

    DoubleUnaryOperator half = d -> d / 2;
System.out.println(half.applyAsDouble(20.0)); // Outputs: 10.0

31. IntBinaryOperator

    IntBinaryOperator multiply = (a, b) -> a * b;
System.out.println(multiply.applyAsInt(4, 5)); // Outputs: 20

32. LongBinaryOperator

    LongBinaryOperator addLongs = (a, b) -> a + b;
System.out.println(addLongs.applyAsLong(100L, 200L)); // Outputs: 300

33. DoubleBinaryOperator

    DoubleBinaryOperator divide = (a, b) -> a / b;
System.out.println(divide.applyAsDouble(20.0, 4.0)); // Outputs: 5.0

34. ToIntFunction<T>

    ToIntFunction<String> stringLength = s -> s.length();
System.out.println(stringLength.applyAsInt("Hello")); // Outputs: 5

35. ToLongFunction<T>

    ToLongFunction<String> stringToLong = s -> Long.parseLong(s);
System.out.println(stringToLong.applyAsLong("123456")); // Outputs: 123456

36. ToDoubleFunction<T>

    ToDoubleFunction<String> parseDouble = s -> Double.parseDouble(s);
System.out.println(parseDouble.applyAsDouble("99.99")); // Outputs: 99.99

37. ToIntBiFunction<T, U>

    ToIntBiFunction<String, String> sumLengths = (a, b) -> a.length() + b.length();
System.out.println(sumLengths.applyAsInt("Hello", "World")); // Outputs: 10

38. ToLongBiFunction<T, U>

    ToLongBiFunction<String, String> concatenateAndParse = (a, b) -> Long.parseLong(a + b);
System.out.println(concatenateAndParse.applyAsLong("12", "34")); // Outputs: 1234

39. ToDoubleBiFunction<T, U>

    ToDoubleBiFunction<Integer, Integer> average = (a, b) -> (a + b) / 2.0;
System.out.println(average.applyAsDouble(8, 12)); // Outputs: 10.0

40. BiFunction<String, Integer, String>

    BiFunction<String, Integer, String> combine = (s, i) -> s + " " + i;
System.out.println(combine.apply("Age:", 25)); // Outputs: Age: 25

41. BiConsumer<Integer, Integer>

    BiConsumer<Integer, Integer> printSum = (a, b) -> System.out.println(a + b);
printSum.accept(10, 20); // Outputs: 30

42. Runnable

    Runnable runnable = () -> System.out.println("Running in a thread!");
new Thread(runnable).start(); // Outputs: Running in a thread!

43. Callable<V>

    Callable<String> callable = () -> {
        Thread.sleep(1000);
        return "Callable Result";
    };
try {
        System.out.println(callable.call()); // Outputs: Callable Result after 1 second
    } catch (Exception e) {
        e.printStackTrace();
    }

}
