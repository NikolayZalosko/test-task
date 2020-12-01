package com.haulmont.testtask.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "mechanic")
@Table(name = "mechanic")
@Getter
@Setter
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "description")
	private String description;
	
	@JoinColumn(name = "client_id")
	private Client client;
	
	@JoinColumn(name = "mechanic_id")
	private Mechanic mechanic;
	
	@Column(name = "creation_date")
	private LocalDateTime creationDate;
	
	@Column(name = "completion_date")
	private LocalDateTime completionDate;
	
	@Column(name = "cost")
	private Double cost;
	
	@Column(name = "status")
	@Enumerated(EnumType.STRING)
	private Status status;

	public enum Status {
		PLANNED, COMPLETED, ACCEPTED_BY_CLIENT
	}
}
