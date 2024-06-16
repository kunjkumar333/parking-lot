package entity;

import enumuration.PaymentMode;
import enumuration.PaymentStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Bill extends BaseEntity{
    private LocalDateTime exitTime;
    private PaymentStatus paymentStatus;
    private Ticket ticket;
    private Operator operator;
    private Double amount;
    private PaymentMode paymentMode;
    private Gate gate;
}
