package com.elfn.recipe.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

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
public class Ingredient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String description;
  private BigDecimal amount;

  @ManyToOne
  private Recipe recipe;

  @OneToOne(fetch = FetchType.EAGER)
  private UnitOfMeasure unitOfMesure;
}
