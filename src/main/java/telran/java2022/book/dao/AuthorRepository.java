package telran.java2022.book.dao;

import java.util.Optional;

import telran.java2022.book.model.Author;

public interface AuthorRepository {
	Author save(Author author);

	Optional<Author> findById(String name);

	void delete(Author author);

	void deleteById(String name);
}
