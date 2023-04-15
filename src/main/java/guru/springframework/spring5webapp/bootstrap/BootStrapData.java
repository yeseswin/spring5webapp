package guru.springframework.spring5webapp.bootstrap;

<<<<<<< HEAD
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

=======
>>>>>>> tempbranch
import guru.springframework.spring5webapp.domain.Author;
import guru.springframework.spring5webapp.domain.Book;
import guru.springframework.spring5webapp.domain.Publisher;
import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
<<<<<<< HEAD

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

=======
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 12/23/19.
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("Started in Bootstrap");

        Publisher publisher = new Publisher();
        publisher.setName("SFG Publishing");
        publisher.setCity("St Petersburg");
        publisher.setState("FL");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count());

        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("Domain Driven Design", "123123");
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        ddd.setPublisher(publisher);
        publisher.getBooks().add(ddd);

        authorRepository.save(eric);
        bookRepository.save(ddd);
        publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "3939459459");
        rod.getBooks().add(noEJB);
        noEJB.getAuthors().add(rod);

        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
        publisherRepository.save(publisher);

        System.out.println("Number of Books: " + bookRepository.count());
        System.out.println("Publisher Number of Books: " + publisher.getBooks().size());
    }
>>>>>>> tempbranch
}
