package com.elfn.recipe.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

/**
 * @PROJECT recipe
 * @Author Elimane on 29/06/2022
 */

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Category {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;

  @ManyToMany(mappedBy = "categories")
  private Set<Recipe> recipes;
}
