package src.com.vivamostoles.homework03.utils;

import src.com.vivamostoles.homework03.Book;
import src.com.vivamostoles.homework03.service.AuthorFirstNamesList;
import src.com.vivamostoles.homework03.service.AuthorLastNamesList;
import src.com.vivamostoles.homework03.service.LiteraryWorks;
import src.com.vivamostoles.homework03.service.PatronymicNamesList;

import java.util.*;

public class BookGeneratorForHashSet {
    public static Set<Book> generation(int numberOfBooksToMake, int numberOfSameBooksToMake) {

        int numberOfDiffrentBooksToMake = numberOfBooksToMake - numberOfSameBooksToMake;

        Set<Book> books = new HashSet<>();

        String[] authorLastName = AuthorLastNamesList.lastNames;
        String[] authorFirstName = AuthorFirstNamesList.firstNames;
        String[] patronymicName = PatronymicNamesList.patronymicNames;
        String[] literaryWork = LiteraryWorks.literaryWorks;

        int randomValueOfLastName = new Random().nextInt(authorLastName.length);
        int randomValueOfFirstName = new Random().nextInt(authorFirstName.length);
        int randomValueOfpatronymicName = new Random().nextInt(patronymicName.length);
        int randomValueOfliteraryWork = new Random().nextInt(LiteraryWorks.literaryWorks.length);

        for (int i = 0; i < numberOfSameBooksToMake; i++) {
            books.add(
                    new Book(authorLastName[randomValueOfLastName],
                            authorFirstName[randomValueOfFirstName],
                            patronymicName[randomValueOfpatronymicName],
                            literaryWork[randomValueOfliteraryWork]));
                    }
        // System.out.println(books);}

        for (int i = 0; i < numberOfDiffrentBooksToMake; i++) {
            int randomValueOfLastName1 = new Random().nextInt(authorLastName.length);
            int randomValueOfFirstName1 = new Random().nextInt(authorFirstName.length);
            int randomValueOfpatronymicName1 = new Random().nextInt(patronymicName.length);
            int randomValueOfliteraryWork1 = new Random().nextInt(LiteraryWorks.literaryWorks.length);
            Book diffrentBooksFromGenerator = new Book(authorLastName[randomValueOfLastName1],
                    authorFirstName[randomValueOfFirstName1], patronymicName[randomValueOfpatronymicName1],
                    literaryWork[randomValueOfliteraryWork1]);
            books.add(diffrentBooksFromGenerator);
        }

        return books;
      /*  for (int i = 0; i < numberOfSameBooksToMake; i++) {
            Book sameBooksFromGenerator = new Book(authorLastName,
                    authorFirstName, patronymicName,
                    literaryWork);
            books.add(sameBooksFromGenerator);*/

        }
        public static Set <Book>  removeByLetterMenaning( Set<Book> books) {
                  Set<Character> letters = new HashSet<>(Arrays.asList('A', 'E', 'I', 'O', 'U', 'Y', 'a', 'e', 'i', 'o', 'u', 'y'));
            for (Book book : books) {
                String bookName = book.getLiteraryWork();
                Character firstLetter = bookName.charAt(0);
                if (letters.contains(firstLetter)) {
                    System.out.println("Solution task about Vowelletter>> " + bookName + " "
                            + book.getAuthorLastName() + " " + book.getAuthorFirstName() + " " + book.getPatronymicName());
                }
            }
         return books;
    }

    }

