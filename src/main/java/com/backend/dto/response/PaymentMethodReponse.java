package com.backend.dto.response;

import com.backend.util.DateTimeSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PaymentMethodReponse {

    private Long id;

    private String code;

    private String method;

    private BigDecimal total;

    @JsonSerialize(using = DateTimeSerializer.class)
    private Date paymentTime;

    private String note;

    private Integer status;
}
