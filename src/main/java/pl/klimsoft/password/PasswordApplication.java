package pl.klimsoft.password;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class PasswordApplication implements CommandLineRunner {

	@Value( "${user}" )
	private String user;

	@Value( "${password}" )
	private String password;

	public static void main(String[] args) {
		SpringApplication.run(PasswordApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("user: " + user);
		System.out.println("password: " + password);
	}
}
