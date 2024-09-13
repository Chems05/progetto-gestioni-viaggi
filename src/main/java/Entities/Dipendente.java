package Entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@Entity
@Table(name = "dipendenti")
public class Dipendente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String nome;
    private String cognome;
    private String email;
    private String immagineProfilo;

    @OneToMany
    private List<Prenotazione> prenotazioni; // Relazione unidirezionale
}