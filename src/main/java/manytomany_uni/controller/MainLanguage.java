package manytomany_uni.controller;

import java.util.ArrayList;
import java.util.List;

import manytomany_uni.dto.Language;
import manytomany_uni.dto.Person;

public class MainLanguage {
	public static void main(String[] args) {
		Language language=new Language();
		language.setId(1);
		language.setName("kannada");
		language.setOrigin("karnataka");
		language.setCountry("india");
		Language language1=new Language();
		language1.setId(1);
		language1.setName("kannada");
		language1.setOrigin("karnataka");
		language1.setCountry("india");
		List<Language> list=new ArrayList<Language>();
		Person person=new Person();
		person.setId(1);
		person.setName("gani");
		person.setPhone(99786);
		person.setAdress("bellari");
		person.setList(list);
	}
}
