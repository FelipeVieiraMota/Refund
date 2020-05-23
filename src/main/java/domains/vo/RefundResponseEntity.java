package domains.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RefundResponseEntity {
  private String id;
  private String referencedId;
  private String paymentType;
  private ResultEntity result;
  private String buildNumber;
  private String timestamp;
  private String ndc;

}
