package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;
import src.com.vivamostoles.homework03.service.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookGenerator {
    public static List<Book> generation(int numberOfBooksToMake) {
        List<Book> books = new ArrayList(numberOfBooksToMake);
        String [] authorLastName = AuthorLastNamesList.lastNames;
        String [] authorFirstName = AuthorFirstNamesList.firstNames;
        String [] patronymicName = PatronymicNamesList.patronymicNames;
        String [] literaryWork = LiteraryWorks.literaryWorks;
        for (int i = 0; i <numberOfBooksToMake; i++){
            int randomValueOfLastName = new Random().nextInt(authorLastName.length);
            int randomValueOfFirstName = new Random().nextInt(authorFirstName.length);
            int randomValueOfpatronymicName = new Random().nextInt(patronymicName.length);
            int randomValueOfliteraryWork = new Random().nextInt(LiteraryWorks.literaryWorks.length);
            Book bookFromGenerator = new Book(authorLastName[randomValueOfLastName],
                    authorFirstName[randomValueOfFirstName], patronymicName[randomValueOfpatronymicName],
                    literaryWork[randomValueOfliteraryWork]);
                    books.add(bookFromGenerator);
            // System.out.println(books[i]);
        }
        return books;

    }
    public static String creatingRandomLine(int length){
        String resourceLine="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer intermediateValue =new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            intermediateValue.append(resourceLine.charAt(number));
        }
        System.out.println("random line from random line>>" + resourceLine);
        return intermediateValue.toString();

    }

       public static String getLineFromArray(String [] lineToStick){

            String arrayToString = String.join(" ", lineToStick);

            System.out.println("random line from array >>" + arrayToString);
          return  arrayToString;
        }

}
