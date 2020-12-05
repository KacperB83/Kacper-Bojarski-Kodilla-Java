package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;
import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        World world = new World();
        Continent europe = world.addContinent(new Continent("Europe"));
        europe.addCountry(new Country("Poland", new BigDecimal(38000000)));
        europe.addCountry(new Country("France", new BigDecimal(66990000)));
        europe.addCountry(new Country("Austria", new BigDecimal(8859000)));
        europe.addCountry(new Country("Croatia", new BigDecimal(4058000)));

        Continent asia = world.addContinent(new Continent("Europe"));
        asia.addCountry(new Country("China", new BigDecimal(1393000000)));
        asia.addCountry(new Country("Russia", new BigDecimal(144500000)));
        asia.addCountry(new Country("India", new BigDecimal(1353800000)));
        asia.addCountry(new Country("Sri Lanka", new BigDecimal(21670000)));

        Continent africa = world.addContinent(new Continent("Africa"));
        africa.addCountry(new Country("RPA", new BigDecimal(57780000)));
        africa.addCountry(new Country("Egypt", new BigDecimal(98420000)));
        africa.addCountry(new Country("Nigeria", new BigDecimal(131850000)));
        africa.addCountry(new Country("Ethiopia", new BigDecimal(75000000)));

        System.out.println(asia.getListOfCountries());
        System.out.println(world.getContinents().size());

       // System.out.println(world.getPeopleQuantity());

        /*Forum forumUsersDirectory = new Forum();
        Map<Integer, ForumUser> theResultListOfUsers = forumUsersDirectory.getList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getBirthDate().isAfter(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserId, forumUser -> forumUser));

        System.out.println("# elements: " + theResultListOfUsers.size());
        theResultListOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/


        /*BookDirectory theBookDirectory = new BookDirectory();
        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n", "<<", ">>"));

        System.out.println(theResultStringOfBooks);*/

       /* Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultMapOfBooks.size());
        theResultMapOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);*/


       /* List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toList());

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.stream()
                .forEach(System.out::println);*/


       /* People.getList().stream()
                .filter(s -> s.length()>11)
                .map(s -> s.toUpperCase())
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
//                .map(String::toUpperCase)
//                .forEach(s -> System.out.println(s));
        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/



        /*PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Text", (text -> "ABC "+text+" ABC"));
        poemBeautifier.beautify("Text", (text -> text.toUpperCase()));
        poemBeautifier.beautify("Text", (text -> "####--- "+text+" ---####"));
        poemBeautifier.beautify("Text", (text ->
                text.charAt(0)+" "+ text.charAt(1)+" "+
                text.charAt(2)+" "+ text.charAt(3)));*/


       /* ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas.");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references.");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subbBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::devideAByB);
        /*System.out.println("Welcome to module 7 - Stream");

        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);*/
    }
}
