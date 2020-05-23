package com.refund.Refund;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;
import io.vertx.core.json.Json;
import io.vertx.ext.web.Router;
import services.RefundServices;

public class MainVerticle extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    Router router = Router.router(vertx);
    router.get("/refund/:id").handler(context ->{
      String id = context.request().getParam("id");
      context.response().putHeader("content-type", "application/json; charset=utf-8").end(Json.encodePrettily(RefundServices.createRefundRequest(id)));
    });
    vertx.createHttpServer().requestHandler(router).listen(8882);
  }
}
