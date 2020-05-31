package com.kenny.springcloud.service.impl;

import com.kenny.springcloud.dao.PaymentDao;
import com.kenny.springcloud.entities.Payment;
import com.kenny.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Kenny
 * @create 2020/5/31 20:12
 * @Classname PaymentServiceImpl
 * @Description TODO
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
