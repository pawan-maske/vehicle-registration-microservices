package com.onboardingservice.VO;

import com.onboardingservice.model.Ecu;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private Ecu ecu;
    private Vehicle vehicle;
}
