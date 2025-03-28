package com.br.dio.api_bootcamp_decolatech.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_user")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  @OneToOne(cascade = CascadeType.ALL)
  private Account account;
  @OneToOne(cascade = CascadeType.ALL)
  private Card card;
  @OneToMany(cascade = CascadeType.ALL)
  private List<New> news;
  @OneToMany(cascade = CascadeType.ALL)
  private List<Feature> features;
}
