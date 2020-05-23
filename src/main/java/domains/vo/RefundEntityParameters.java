package domains.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 *     String data = ""
 *       + "entityId=8a8294184e736012014e78a17a5615ac"
 *       + "&amount=10.00"
 *       + "&currency=EUR"
 *       + "&paymentType=RF";
 * */

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class RefundEntityParameters {

  private String entityId;
  private String amount;
  private String currency;
  private String paymentType;

  public String parseToString(){
      StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("entityId="+this.entityId);
        stringBuilder.append("&amount="+this.amount);
        stringBuilder.append("&currency="+this.currency);
        stringBuilder.append("&paymentType="+this.paymentType);
      return stringBuilder.toString();
  }
}
