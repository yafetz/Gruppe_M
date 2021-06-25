package Server.Modell;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "quizbearbeitenquestion")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class QuizBearbeitetQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("korrekt")
    private Boolean korrekt;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "question_id", nullable = false)
    @JsonProperty("question")
    private QuizQuestion question;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name= "nutzer_Id", nullable = false)
    private Nutzer nutzer;

    @Override
    public String toString() {
        return "QuizBearbeitetQuestion{" +
                "id=" + id +
                ", korrekt=" + korrekt +
                ", question=" + question +
                ", nutzer=" + nutzer +
                '}';
    }
}