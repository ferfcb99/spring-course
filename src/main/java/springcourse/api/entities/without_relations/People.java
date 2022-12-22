package springcourse.api.entities.without_relations;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedDate;

import com.fasterxml.jackson.annotation.JsonFormat;



@Entity
public class People implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_people", nullable = false, unique = true)
	private Long id_people;
	
	@Column(name = "name", unique = false, nullable = false)
	private String name;
	
	@Column(name = "age", unique = false, nullable = false)
	private Integer age;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", shape = JsonFormat.Shape.STRING)
	@Column(name = "bornDateTime")
	@CreatedDate
	private LocalDateTime bornDateTime;
	
	public People(Long id_people, String name, Integer age, LocalDateTime bornDateTime) {
		super();
		this.id_people = id_people;
		this.name = name;
		this.age = age;
		this.bornDateTime = bornDateTime;
	}
	
	public People() {}

	public Long getId_people() {
		return id_people;
	}

	public void setId_people(Long id_people) {
		this.id_people = id_people;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public LocalDateTime getBornDateTime() {
		return bornDateTime;
	}

	public void setBornDateTime(LocalDateTime bornDateTime) {
		this.bornDateTime = bornDateTime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	

}
