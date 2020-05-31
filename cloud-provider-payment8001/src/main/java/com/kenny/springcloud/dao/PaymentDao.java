package com.kenny.springcloud.dao;

import com.kenny.springcloud.entities.Payment;
import com.sun.javafx.binding.SelectBinding;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Kenny
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
