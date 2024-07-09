# Questions:

### Easy:
1. Write a Java program to create a new thread using Lambda expression.
2. Write a Java program to use the 'forEach' method with a Lambda expression.
    - Input: ["Red", "Green", "Blue"]
    - Expected Output: "Red Green Blue"
3. Write a Java program to implement a simple Lambda expression that accepts an integer and returns its square.
    - Input: 5
    - Expected Output: 25
4. Write a Java program to use the 'Predicate' functional interface with a lambda expression.
    - Input: [1, 2, 3, 4, 5], n -> n%2 == 0
    - Expected Output: [2, 4]
5. Write a Java program to use the 'Function' functional interface with a lambda expression.
    - Input: [1, 2, 3, 4, 5], n -> n * n
    - Expected Output: [1, 4, 9, 16, 25]
6. Write a Java program to use the 'Supplier' functional interface with a lambda expression.
    - Input: () -> "Hello, World!"
    - Expected Output: "Hello, World!"
7. Write a Java program to use the 'UnaryOperator' functional interface with a lambda expression.
    - Input: [1, 2, 3, 4, 5], n -> n * 2
    - Expected Output: [2, 4, 6, 8, 10]
8. Write a Java program to use the 'BinaryOperator' functional interface with a lambda expression.
    - Input: BinaryOperator<Integer> add = (a, b) -> a + b; add.apply(1, 2);
    - Expected Output: 3
9. Write a Java program to use the 'BiConsumer' functional interface with a lambda expression.
    - Input: BiConsumer<String, String> concat = (a, b) -> System.out.println(a + b); concat.accept("Hello, ", "World!");
    - Expected Output: "Hello, World!"
10. Write a Java program to convert a list of integers into a stream, filter out all the even numbers, and collect the result into a new list.
     - Input: [1, 2, 3, 4, 5]
     - Expected Output: [1, 3, 5]
11. Write a Java program to convert a list of strings into a stream, map each string to its length, and collect the result into a new list.
     - Input: ["Red", "Green", "Blue"]
     - Expected Output: [3, 5, 4]
12. Write a Java program to convert a list of integers into a stream and find the average of the integers.
     - Input: [1, 2, 3, 4, 5]
     - Expected Output: 3.0

### Medium:
1. Write a Java program to use the 'filter' method with a Lambda expression to remove elements from a stream.
    - Input: [1, 2, 3, 4, 5], n -> n%2 == 0
    - Expected Output: [2, 4]
2. Write a Java program to use the 'map' method with a Lambda expression to transform elements in a stream.
    - Input: [1, 2, 3, 4, 5], n -> n * n
    - Expected Output: [1, 4, 9, 16, 25]
3. Write a Java program to use the 'reduce' method with a Lambda expression to compute the product of elements in a stream.
    - Input: [1, 2, 3, 4, 5]
    - Expected Output: 120
4. Write a Java program to use the 'Consumer' functional interface with a lambda expression.
    - Input: ["Red", "Green", "Blue"], System.out::println
    - Expected Output: "Red Green Blue"
5. Write a Java program to use the 'Optional' class with a lambda expression.
    - Input: Optional.of("Hello, World!"), System.out::println
    - Expected Output: "Hello, World!"
6. Write a Java program to use the 'Stream.of' method with a lambda expression.
    - Input: Stream.of(1, 2, 3, 4, 5).map(n -> n * n).collect(Collectors.toList())
    - Expected Output: [1, 4, 9, 16, 25]
7. Write a Java program to use the 'BiPredicate' functional interface with a lambda expression.
    - Input: BiPredicate<Integer, String> condition = (i, s) -> i > 20 && s.startsWith("R"); condition.test(30, "Red");
    - Expected Output: true
8. Write a Java program to use the 'ToIntFunction' functional interface with a lambda expression.
    - Input: ToIntFunction<String> length = s -> s.length(); length.applyAsInt("Hello");
    - Expected Output: 5
9. Write a Java program to use the 'DoubleUnaryOperator' functional interface with a lambda expression.
    - Input: DoubleUnaryOperator square = d -> d * d; square.applyAsDouble(5.0);
    - Expected Output: 25.0
10. Write a Java program to convert a list of strings into a stream, filter out all the strings that start with a "B", and collect the result into a new list.
     - Input: ["Red", "Green", "Blue", "Black"]
     - Expected Output: ["Red", "Green"]
11. Write a Java program to convert a list of integers into a stream, map each integer to its square, and collect the result into a new list.
     - Input: [1, 2, 3, 4, 5]
     - Expected Output: [1, 4, 9, 16, 25]
12. Write a Java program to convert a list of strings into a stream and find the string with the maximum length.
     - Input: ["Red", "Green", "Blue"]
     - Expected Output: "Green"
    
### Hard:
1. Write a Java program to use the 'collect' method with a Lambda expression to convert a stream to a list.
    - Input: [1, 2, 3, 4, 5]
    - Expected Output: [1, 2, 3, 4, 5]
2. Write a Java program to use the 'sorted' method with a Lambda expression to sort a stream.
    - Input: [5, 4, 3, 2, 1]
    - Expected Output: [1, 2, 3, 4, 5]
3. Write a Java program to use the 'flatMap' method with a Lambda expression to flatten a stream of lists.
    - Input: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    - Expected Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
4. Write a Java program to use the 'Comparator' functional interface with a lambda expression to sort a list of strings by length.
    - Input: ["Red", "Green", "Blue"]
    - Expected Output: ["Red", "Blue", "Green"]
5. Write a Java program to use the 'Callable' functional interface with a lambda expression.
    - Input: () -> { Thread.sleep(1000); return "Hello, World!"; }
    - Expected Output: "Hello, World!" after 1 second
6. Write a Java program to use the 'BiFunction' functional interface with a lambda expression.
    - Input: BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; add.apply(1, 2);
    - Expected Output: 3
7. Write a Java program to use the 'ToDoubleBiFunction' functional interface with a lambda expression.
    - Input: ToDoubleBiFunction<Integer, Integer> divide = (a, b) -> a / b; divide.applyAsDouble(10, 2);
    - Expected Output: 5.0
8. Write a Java program to use the 'IntStream.range' method with a lambda expression.
    - Input: IntStream.range(1, 5).map(n -> n * n).sum();
    - Expected Output: 30
9. Write a Java program to use the 'Stream.generate' method with a lambda expression.
    - Input: Stream.generate(() -> "Hello, World!").limit(5).collect(Collectors.toList());
    - Expected Output: ["Hello, World!", "Hello, World!", "Hello, World!", "Hello, World!", "Hello, World!"]
10. Write a Java program to convert a list of integers into a stream, filter out all the numbers that are not divisible by 3, map the remaining numbers to their cubes, and collect the result into a new list.
     - Input: [1, 2, 3, 4, 5, 6]
     - Expected Output: [27, 216]
11. Write a Java program to convert a list of strings into a stream, sort the strings in reverse order, and collect the result into a new list.
     - Input: ["Red", "Green", "Blue"]
     - Expected Output: ["Red", "Green", "Blue"]
12. Write a Java program to convert a list of integers into a stream, find the sum of the square of all the numbers.
     - Input: [1, 2, 3, 4, 5]
     - Expected Output: 55
