package org.mvnsearch.springbootreactive

import org.springframework.cloud.function.context.FunctionScan
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.function.Function

/**
 * cloud functions
 *
 * @author linux_china
 */
@Configuration
@FunctionScan
class CloudFunctions {
    @Bean
    fun uppercase(): Function<String, String> {
        return Function { it.toUpperCase() }
    }
}