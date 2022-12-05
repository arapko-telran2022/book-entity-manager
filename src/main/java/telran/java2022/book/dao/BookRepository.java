package telran.java2022.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import telran.java2022.book.model.Book;

public interface BookRepository {
	
	Stream<Book> findByPublisherPublisherName(String publisherName);
	
	Stream<Book> findByAuthorsName(String authorName);

	boolean existsById(String isbn);

	Book save(Book book);

	Optional<Book> findById(String isbn);

	void delete(Book book);
	
	void deleteById(String isbn);
	
}
