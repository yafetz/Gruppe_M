package Server.Modell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "student")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true,nullable = false, length = 7)
    private int matrikelnummer;
    @Column(nullable = false)
    private String studienfach;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="nutzerId", nullable=true)
    private Nutzer nutzerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMatrikelnummer() {
        return matrikelnummer;
    }

    public void setMatrikelnummer(int matrikelnummer) {
        matrikelnummer = matrikelnummer;
    }

    public String getStudienfach() {
        return studienfach;
    }

    public void setStudienfach(String studienfach) {
        this.studienfach = studienfach;
    }

    public Nutzer getNutzer_id() {
        return nutzerId;
    }

    public void setNutzer_id(Nutzer nutzer_id) {
        this.nutzerId = nutzer_id;
    }
}
