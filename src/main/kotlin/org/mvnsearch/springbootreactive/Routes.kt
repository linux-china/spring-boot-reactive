package org.mvnsearch.springbootreactive

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.router

/**
 * Routes
 *
 * @author linux_china
 */
@Configuration
open class Routes {

    @Bean
    open fun routesBean() = router {
        GET("/hi") {
            ok().syncBody("good morning早上好")
        }

    }
}