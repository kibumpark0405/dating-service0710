package dating.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateDateScheduleCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String id;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String userProfileId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Address location;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String date;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String time;
}
