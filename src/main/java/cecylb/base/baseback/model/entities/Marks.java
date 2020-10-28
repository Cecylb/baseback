package cecylb.base.baseback.model.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="exam_marks")
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="exam_id")
    private int id;
    private int student_id;
    private int subj_id;
    private int mark;
    private Date exam_date;
}
