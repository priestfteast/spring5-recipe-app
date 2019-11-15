package guru.springframework.domain;



import lombok.*;

import javax.persistence.*;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Ingredient {

    public Ingredient(String description, BigDecimal ammount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.ammount = ammount;
        this.uom = uom;
        this.recipe = recipe;
    }

    public Ingredient(String description, BigDecimal ammount, UnitOfMeasure uom) {
        this.description = description;
        this.ammount = ammount;
        this.uom = uom;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private BigDecimal ammount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;

}
