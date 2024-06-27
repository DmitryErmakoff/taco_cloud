package sia.taco_cloud.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter @Setter @Builder
@Table(name = "ingredient")
@AllArgsConstructor
@NoArgsConstructor
public class Ingredient {

    @Id
    private String id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Type type;


    public enum Type {
        WRAP,
        PROTEIN,
        VEGGIES,
        CHEESE,
        SAUCE
    }
}

