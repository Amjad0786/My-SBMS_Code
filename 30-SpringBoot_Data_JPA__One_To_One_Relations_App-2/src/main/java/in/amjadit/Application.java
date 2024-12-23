package in.amjadit;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import in.amjad.repository.PassportPersonRepository;
import in.amjad.repository.PersonRepository;
import in.amjadit.entity.PassportPerson;
import in.amjadit.entity.Person;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "in.amjad.repository")
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		PersonRepository personRepo = context.getBean(PersonRepository.class);

		PassportPersonRepository passportPersonRepository = context.getBean(PassportPersonRepository.class);

		/*
		 * Person p = new Person(); p.setPersonName("Amjad"); p.setGender("Male");
		 * 
		 * PassportPerson passport = new PassportPerson();
		 * passport.setPassNum("KUA2728721KK"); passport.setIssueDate(LocalDate.now());
		 * passport.setExpiryDate(LocalDate.now().plusYears(10));
		 * 
		 * p.setPassport(passport); passport.setPerson(p);
		 * 
		 * personRepo.save(p); 
		 */
		
		//personRepo.findById(01);
		
		personRepo.deleteById(1);

		System.out.println("Record Inserted .....");
	}

}
