package com.kenny.springcloud.service;

import com.kenny.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Kenny
 */

public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
