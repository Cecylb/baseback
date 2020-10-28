package cecylb.base.baseback.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="subject")
public class Subject {

    @JoinTable(name="exam_marks",
            joinColumns = @JoinColumn(name="subj_id"),
            inverseJoinColumns = @JoinColumn(name="subj_id"))
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Marks marks;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="subj_id")
    private int id;
    private String subj_name;
    private int hour;
    private int semester;
}
