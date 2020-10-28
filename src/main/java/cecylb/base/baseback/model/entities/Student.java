package cecylb.base.baseback.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
public class Student {

    //@JoinTable
    //@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //private List<Subject> subjects;

    //@JoinTable
    //@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //private List<Marks> marks;

    @Id
    @Column(name="student_id")
    private int id;
    private String surname;
    private String name;
    private int stipend;
    private int kurs;
    private String city;
    private Date birthday;
    private int univ_id;
}
