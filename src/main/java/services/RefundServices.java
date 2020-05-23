package services;

import com.google.gson.Gson;
import domains.vo.RefundEntityParameters;
import domains.vo.RefundResponse;
import domains.vo.RefundResponseEntity;
import domains.vo.ResultEntity;
import util.http.HandleHttp;

public class RefundServices {

    public RefundResponse filterParameters(String json){
      Gson gson = new Gson();
      RefundResponseEntity entity = gson.fromJson(json, RefundResponseEntity.class);
      ResultEntity rs = entity.getResult();
      String id = entity.getId();
      String code = rs.getCode();
      String description = rs.getDescription();
      RefundResponse response = new RefundResponse(id,code,description);
      return response;
    }

    public static RefundResponse createRefundRequest(String id){
      RefundEntityParameters refundEntityParameters = new RefundEntityParameters(
        System.getenv("entity_id"),
        "10.00",
        "EUR",
        "RF"
      );
      HandleHttp handle = new HandleHttp();
      return handle.doPostRequest(refundEntityParameters, id);
    }
}
