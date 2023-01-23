package manytomany_uni.dto;

import java.util.List;

public class Person {
	private int id;
	private String name;
	private String adress;
	private long phone;
	private List<Language> list;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public List<Language> getList() {
		return list;
	}
	public void setList(List<Language> list) {
		this.list = list;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", adress=" + adress + ", phone=" + phone + "]";
	}
	
}
