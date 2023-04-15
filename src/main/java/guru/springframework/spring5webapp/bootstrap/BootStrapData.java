package guru.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner{
	
	private final AuthorRepository authorRepository;
	private final BookRepository bookRepository;
	private final PublisherRepository publisherRepository;
	
	
	
	

	public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		super();
		this.authorRepository = authorRepository;
		this.bookRepository = bookRepository;
		this.publisherRepository = publisherRepository;
	}





	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Author yeseswin = new Author("Yeseswin", "Ashutosh");
		Book coursebook = new Book("Java Spring and SpringBoot","1234567");
		
		yeseswin.getBooks().add(coursebook);
		coursebook.getAuthors().add(yeseswin);
		
		authorRepository.save(yeseswin);
		bookRepository.save(coursebook);
		
		Author randomguy = new Author("Random", "Guy");
		Book randombook = new Book("Random Book", "9876543");
		
		randomguy.getBooks().add(randombook);
		randombook.getAuthors().add(randomguy);
		
		authorRepository.save(randomguy);
		bookRepository.save(randombook);
		
		System.out.println("Started in Bootstrap");
		System.out.println("Count of books - " + bookRepository.count());
		System.out.println("Count of authors - " + authorRepository.count());
		
		
		Publisher pub = new Publisher("TOSH Publications","109 My Street", "Austin", "TX", "78751");
		
		publisherRepository.save(pub);
		coursebook.setPublishers(pub);
		randombook.setPublishers(pub);
		pub.getBooks().add(coursebook);
		pub.getBooks().add(randombook);
		
		bookRepository.save(coursebook);
		bookRepository.save(randombook);
		
		publisherRepository.save(pub);
		
		System.out.println(pub.toString());

//		System.out.println(randombook.toString());
//		System.out.println(coursebook.toString());
		System.out.println(pub.getBooks().size());


	}

}
