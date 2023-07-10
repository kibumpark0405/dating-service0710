package dating.service.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateDateScheduleCommand {

    private String id;
    private String userProfileId;
    private Address location;
    private String date;
    private String time;
}
