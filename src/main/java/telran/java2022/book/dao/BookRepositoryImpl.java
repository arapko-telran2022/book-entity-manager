package telran.java2022.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import telran.java2022.book.model.Book;

@Repository
public class BookRepositoryImpl implements BookRepository {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public Stream<Book> findByPublisherPublisherName(String publisherName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Stream<Book> findByAuthorsName(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String isbn) {
		return em.find(Book.class, isbn) != null;
	}

	@Override
//	@Transactional
	public Book save(Book book) {
		em.persist(book);
//		em.merge(book);
		return book;
	}

	@Override
	public Optional<Book> findById(String isbn) {
		return Optional.ofNullable(em.find(Book.class, isbn));
	}

	@Override
	@Transactional
	public void delete(Book book) {
		em.remove(book);

	}

	@Override
	@Transactional
	public void deleteById(String isbn) {
		Book book = em.find(Book.class, isbn);
		em.remove(book);
	}

}
