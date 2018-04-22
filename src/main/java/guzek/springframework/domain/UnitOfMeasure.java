package guzek.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Pawel on 14.04.2018.
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

}