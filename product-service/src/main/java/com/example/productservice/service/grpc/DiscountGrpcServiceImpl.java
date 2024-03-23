package com.example.productservice.service.grpc;

import com.example.grpc.DiscountRequest;
import com.example.grpc.DiscountResponse;
import com.example.grpc.DiscountServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class DiscountGrpcServiceImpl implements DiscountGrpcService {

    private DiscountServiceGrpc.DiscountServiceBlockingStub discountServiceBlockingStub;
    private ManagedChannel managedChannel;

    public DiscountGrpcServiceImpl(@Value("${discount.grpc.host}") String host, @Value("${discount.grpc.port}") int port){
        managedChannel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
    }

    @Override
    public DiscountResponse getDiscount(DiscountRequest discountRequest) {
        discountServiceBlockingStub = DiscountServiceGrpc.newBlockingStub(managedChannel);
        return discountServiceBlockingStub.getDiscount(discountRequest);
    }
}
