package entity;

import enumuration.PaymentMode;
import lombok.Data;


@Data
public class Payment extends BaseEntity{
    private String referenceId;
    private Double amount;
    private String provider;
    private PaymentMode paymentMode;
    private Ticket ticket;
}
