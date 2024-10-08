package Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Entity
@Table(name = "viaggi")
public class Viaggio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String destinazione;
    private LocalDate data;
    private String stato; // "in programma" o "completato"
}
