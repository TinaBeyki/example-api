package common;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "BEYKI_PRODUCT")
public class Product{

    @Id
    private Long code;
    private String name;
    private Date fromDate;
    private Date toDate;

}
