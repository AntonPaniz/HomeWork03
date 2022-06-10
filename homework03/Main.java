package src.com.vivamostoles.homework03;

import src.com.vivamostoles.homework03.service.AuthorFirstNamesList;
import src.com.vivamostoles.homework03.service.AuthorLastNamesList;
import src.com.vivamostoles.homework03.service.Bookfields;
import src.com.vivamostoles.homework03.service.LiteraryWorks;
import src.com.vivamostoles.homework03.utils.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
      //Solution part 01 of the task
     List <Book> list = BookGenerator.generation(20);
      UsingForToPrint.usingFor(list);
      System.out.println("After using remove");
      RemoveBook.removeByIndex(6, list);
      UsingForToPrint.usingFor(list);


      //Solution, part 02 of the task
       HashSet<Book> books = (HashSet<Book>) BookGeneratorForHashSet.generation(25, 6);
       UsingForToPrint.usingForHashSet(books);
        Set<Book> booksWithVowelLetter = BookGeneratorForHashSet.removeByLetterMenaning(books);

        //Solution, part 03 of the task
        SortedBook.sortBooks(books, Bookfields.NAME);
        SortedBook.sortBooks(books,Bookfields.FIRSTNAME);
        SortedBook.sortBooks(books,Bookfields.PATRONUMIC);
        SortedBook.sortBooks(books, Bookfields.LITERARYWORK);

        //Solution, part 04 of the task
        TreeSet <String> students = TreeSetCreator.generation(7);
       // UsingForToPrint.usingForTreeSet(students);
       for (String studentList : students){
         System.out.println("after creat students " + studentList); }
        TreeSetCreator.deleteStudent(students);

             // Solution, part of P.S. task
       BookGenerator.creatingRandomLine(4);
       BookGenerator.getLineFromArray(AuthorLastNamesList.lastNames);

    }
}

