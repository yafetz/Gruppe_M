package Server.Modell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name ="lehrveranstaltung")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Lehrveranstaltung {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titel;
    @Column(nullable = false)
    private String art;
    @Column(nullable = false)
    private String semester;
    @OneToMany(mappedBy = "lehrveranstaltung", fetch = FetchType.LAZY)
    private Set<Lehrmaterial> lehrmaterial;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }


}
