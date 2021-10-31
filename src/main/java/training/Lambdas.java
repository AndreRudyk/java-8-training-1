package training;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * Welcome to the lambdas training
 * <p>
 * Please, implement all the methods and pass all the tests
 * <p>
 * More info in spanish: https://www.adictosaltrabajo.com/2015/12/04/expresiones-lambda-con-java-8/
 * More info in english: https://www.baeldung.com/java-8-functional-interfaces
 */
public class Lambdas {

    /*
    Supplier
     */
    public Supplier<Integer> getASupplierThatProvidesTheCurrentYear() {
        // TODO
        return () -> LocalDate.now().getYear();
    }

    public void printCurrentYear() {
        System.out.println(this.getASupplierThatProvidesTheCurrentYear());
    }


    /*
    Consumer
     */
    public Consumer<String> getAConsumerThatPrintsAString() {
        // TODO
        return System.out::println;
    }

    public void printValue(final String value) {
        getAConsumerThatPrintsAString().accept(value);
    }


    /*
    Function
     */
    public Function<String, Integer> getAFunctionThatCountsTheNumberOfCharactersOfAString() {
        // TODO
        return String::length;
    }

    public void printNumberOfCharacters(final String myString) {
        // TODO
        System.out.println(getAFunctionThatCountsTheNumberOfCharactersOfAString().apply(myString));
    }


    /*
    Predicate
     */
    public Predicate<Integer> getAPredicateThatDetectsAnEvenNumber() {
        // TODO
        return (x) -> x % 2 == 0;
    }

    public void printWhetherANumberIsEvenOrNot(final Integer number) {
        // TODO
        System.out.println(getAPredicateThatDetectsAnEvenNumber().test(number));
    }


    /*
    UnaryOperator
     */
    public UnaryOperator<String> getAUnaryOperatorThatTransformsAStringToUpperCase() {
        // TODO
        return String::toUpperCase;
    }

    public void printAStringToUpperCase(final String myString) {
        // TODO
        System.out.println(getAUnaryOperatorThatTransformsAStringToUpperCase().apply(myString));
    }


    /*
    Runnable
     */
    public Runnable getARunnableThatPrintsHelloWorld() {
        // TODO
        return () -> System.out.println("HELLO WORLD!");
    }

    public Thread getAThreadThatPrintsHelloWorld() {
        // TODO
        return new Thread(this.getARunnableThatPrintsHelloWorld());
    }


    /*
    Custom Functional Interface
     */
    public Calculator getACalculatorThatSumsTwoNumbers() {
        // TODO
        return Integer::sum;
    }

    public Calculator getACalculatorThatMultipliesTwoNumbers() {
        // TODO
        return (x, y) -> x * y;
    }

    @FunctionalInterface
    public interface Calculator {
        int calculate(int x, int y);
    }
}
