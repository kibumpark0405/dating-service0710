package dating.service.infra;

import dating.service.domain.*;
import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping(value="/dateSchedules")
@Transactional
public class DateScheduleController {

    @Autowired
    DateScheduleRepository dateScheduleRepository;

    @RequestMapping(
        value = "dateSchedules/{id}//date-schedules/{id}",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public DateSchedule updateDateSchedule(
        @PathVariable(value = "id") String id,
        @RequestBody UpdateDateScheduleCommand updateDateScheduleCommand,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println(
            "##### /dateSchedule/updateDateSchedule  called #####"
        );
        Optional<DateSchedule> optionalDateSchedule = dateScheduleRepository.findById(
            id
        );

        optionalDateSchedule.orElseThrow(() -> new Exception("No Entity Found")
        );
        DateSchedule dateSchedule = optionalDateSchedule.get();
        dateSchedule.updateDateSchedule(updateDateScheduleCommand);

        dateScheduleRepository.save(dateSchedule);
        return dateSchedule;
    }
}
