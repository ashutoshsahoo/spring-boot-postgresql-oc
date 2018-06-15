package in.ashu.oc.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {

	private static final long serialVersionUID = -3971790149782350219L;

	private String name;

	private int age;

	public UserDTO() {
		super();
	}

	public UserDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserDTO [getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

}
