package com.elfn.recipe.domain;

import lombok.*;

import javax.persistence.*;

/**
 * @PROJECT recipe
 * @Author Elimane on 26/06/2022
 */
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UnitOfMeasure {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;

}
