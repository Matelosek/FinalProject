package pl.coderslab.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Entity
@Table(name = "tasks")
@Getter
@Setter
@ToString
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.DATE)
    private Date date;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "airplane_id")
    private Airplane airplaneType;

    private String reqMarks;

    @NotNull
    private String taskName;

    private String description;

    private String taskType;
}
