package com.example.discountservice.service.grpc;

import com.example.grpc.DiscountRequest;
import com.example.grpc.DiscountResponse;
import com.example.grpc.DiscountServiceGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class DiscountGrpcServiceImpl extends DiscountServiceGrpc.DiscountServiceImplBase {

    @Override
    public void getDiscount(DiscountRequest request, StreamObserver<DiscountResponse> responseObserver) {
        responseObserver.onNext(DiscountResponse.newBuilder()
                .setWord(request.getWord()).build());
        responseObserver.onCompleted();
    }
}
