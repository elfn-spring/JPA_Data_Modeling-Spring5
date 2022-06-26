package com.elfn.recipe.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

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
public class Recipe {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private Integer prepTime;
  private Integer cookTime;
  private Integer servings;
  private String source;
  private String url;
  private String directions;

  // TODO: 26/06/2022
  //private Difficulty difficulty;

 //The @Lob annotation specifies that the database
  // should store the property as Large Object.
  @Lob
  private Byte[] image;

  // CASCADE  Control how state changes are cascaded
  //from parent objects to child objects
  @OneToOne(cascade = CascadeType.ALL)
  private Notes notes;

// ALL Applies all cascade options (REMOVE, DETACH)
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "recipe")
  private Set<Ingredient> ingredients;

}
