package cecylb.base.baseback.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="university")
public class University {

    @JoinTable
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Student> students;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="univ_id")
    private int id;
    private String univ_name;
    private int rating;
    private String city;
}
