package cecylb.base.baseback.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="lecturer")
public class Lecturer {

    @JoinTable(name="subj_lect",
            joinColumns = @JoinColumn(name="lecturer_id"),
            inverseJoinColumns = @JoinColumn(name="subj_id"))
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Subject subject;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="lecturer_id")
    private int id;
    private String surname;
    private String name;
    private String city;
    private int univ_id;
}
