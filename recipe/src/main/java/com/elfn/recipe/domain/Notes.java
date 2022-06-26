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
public class Notes {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  //Do not need to specify a cascade here
  @OneToOne
  private Recipe recipe;

  @Lob
  private String recipeNotes;
}
