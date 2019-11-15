package guru.springframework.domain;




import lombok.*;

import javax.persistence.*;


@Data
@NoArgsConstructor
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String description;




}


