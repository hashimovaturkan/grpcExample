package com.example.productservice.service;

import com.example.grpc.DiscountRequest;
import com.example.grpc.DiscountResponse;
import com.example.productservice.service.grpc.DiscountGrpcServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DiscountService {
    private final DiscountGrpcServiceImpl discountGrpcService;

    public String getDiscount(){
        DiscountResponse response = discountGrpcService.getDiscount(DiscountRequest.newBuilder().setWord("test").build());
        return response.getWord();
    }

}
