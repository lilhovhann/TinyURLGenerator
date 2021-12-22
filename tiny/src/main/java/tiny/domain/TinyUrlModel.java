package tiny.domain;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author lilith
 */
@AllArgsConstructor
@Getter
public class TinyUrlModel {
    
    private String id;
    
    private String url;
    
    private LocalDateTime createdDateTime;
}
