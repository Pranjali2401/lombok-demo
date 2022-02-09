package com.LombokDemo.demo.dto;

import java.io.Serializable;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class StudentDto implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String studentName;
	private String studentClass;
}
