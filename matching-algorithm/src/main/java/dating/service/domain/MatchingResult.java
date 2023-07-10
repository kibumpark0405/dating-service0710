package dating.service.domain;

import dating.service.MatchingAlgorithmApplication;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "MatchingResult_table")
@Data
public class MatchingResult {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String userProfileId;

    private String matchedPartnerId;

    private Integer matchScore;

    public static MatchingResultRepository repository() {
        MatchingResultRepository matchingResultRepository = MatchingAlgorithmApplication.applicationContext.getBean(
            MatchingResultRepository.class
        );
        return matchingResultRepository;
    }
}
