package nextstep.fp;

import java.util.List;

public class Lambda {
    static Conditional conditional;

    public static void printAllOld(List<Integer> numbers) {
        System.out.println("printAllOld");

        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void printAllLambda(List<Integer> numbers) {
        System.out.println("printAllLambda");

        numbers.forEach(System.out::println);
    }

    public static void runThread() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from thread");
            }
        }).start();
    }

    public static int sumAllEven(List<Integer> numbers) {
        conditional = number -> number % 2 == 0;
        return numbers.stream()
                .filter(number -> conditional.isOk(number))
                .reduce(0, (x,y) -> x+y);

    }

    public static int sumAllOverThree(List<Integer> numbers) {
        //int total = 0;
        conditional = number -> number > 3;
        return numbers.stream()
                .filter(number -> conditional.isOk(number))
                .reduce(0, (x,y) -> x+y);
//        for (int number : numbers) {
//            if (conditional.isOk(number)) {
//                total += number;
//            }
//        }
//        return total;
    }

    public static int sumAll(List<Integer> numbers) {
        conditional = number -> true;
        return numbers.stream()
                .filter(number -> conditional.isOk(number))
                .reduce(0, (x,y) -> x+y);

    }


}
