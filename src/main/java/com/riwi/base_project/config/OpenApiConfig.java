package com.riwi.base_project.config;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition (
        info = @Info(
                title = "Project Documentation: Coupon\n" +
                        "Management System",
                version = "1.0",
                description = "Riwi is currently developing an e-commerce project to sell its products online.\n" +
                        "products, however, a development cell is needed to be responsible for the management\n" +
                        "and coupon redemption, for this reason your cell is asked to develop a system that\n" +
                        "Allow users to manage and redeem discount coupons."
        )
)
public class OpenApiConfig {
}
