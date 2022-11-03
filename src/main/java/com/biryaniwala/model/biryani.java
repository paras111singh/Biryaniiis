package com.biryaniwala.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="biryani_table")
public class biryani {

	@Id
	private int biryaniId;
	private String biryaniType;
	private String biryaniName;
	private int biryaniPrice;
	private String biryaniDesc;
	
	
	
}