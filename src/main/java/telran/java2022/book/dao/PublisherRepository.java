package telran.java2022.book.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;

import telran.java2022.book.model.Author;
import telran.java2022.book.model.Publisher;

public interface PublisherRepository {
	
//	@Query("SELECT DISTINCT p.publisherName FROM Book b JOIN b.authors a JOIN b.publisher p WHERE a.name =:authorName")
	List<String> findPublishersByAuthor(String authorName);

	Optional<Publisher> findById(String publisher);

	Publisher save(Publisher publisher);

	boolean existsById(String publisherName);
	
	void delete(Publisher publisher);

	void deleteById(String publisherName);
	
}
