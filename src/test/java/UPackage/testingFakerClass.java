package UPackage;

import com.github.javafaker.Faker;
import com.github.javafaker.Name;

public class testingFakerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Faker faker = new Faker();
			System.out.println(faker.name().fullName());
			System.out.println(faker.funnyName().name());
			System.out.println(faker.address().fullAddress());
			System.out.println(faker.chuckNorris().fact());
	}
}
