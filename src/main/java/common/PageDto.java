package common;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class PageDto implements Serializable {

    private int pageNumber;
    private int pageSize;


}
