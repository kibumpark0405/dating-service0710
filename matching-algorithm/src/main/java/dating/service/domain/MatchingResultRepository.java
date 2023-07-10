package dating.service.domain;

import dating.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(
    collectionResourceRel = "matchingResults",
    path = "matchingResults"
)
public interface MatchingResultRepository
    extends PagingAndSortingRepository<MatchingResult, String> {}
