package dating.service.domain;

import dating.service.DatingCoordinatorApplication;
import dating.service.domain.DateScheduleCreated;
import dating.service.domain.DateScheduleDeleted;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "DateSchedule_table")
@Data
public class DateSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String userProfileId;

    private Address location;

    private String date;

    private String time;

    @PostPersist
    public void onPostPersist() {
        DateScheduleCreated dateScheduleCreated = new DateScheduleCreated(this);
        dateScheduleCreated.publishAfterCommit();

        DateScheduleDeleted dateScheduleDeleted = new DateScheduleDeleted(this);
        dateScheduleDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DateScheduleRepository repository() {
        DateScheduleRepository dateScheduleRepository = DatingCoordinatorApplication.applicationContext.getBean(
            DateScheduleRepository.class
        );
        return dateScheduleRepository;
    }

    public void updateDateSchedule(
        UpdateDateScheduleCommand updateDateScheduleCommand
    ) {
        //implement business logic here:

        DateScheduleUpdated dateScheduleUpdated = new DateScheduleUpdated(this);
        dateScheduleUpdated.publishAfterCommit();
    }
}
