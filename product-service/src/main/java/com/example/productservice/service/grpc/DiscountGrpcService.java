package com.example.productservice.service.grpc;

import com.example.grpc.DiscountRequest;
import com.example.grpc.DiscountResponse;

public interface DiscountGrpcService {
    DiscountResponse getDiscount(DiscountRequest discountRequest);
}
