package dating.service.domain;

import dating.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "dateSchedules",
    path = "dateSchedules"
)
public interface DateScheduleRepository
    extends PagingAndSortingRepository<DateSchedule, String> {}
