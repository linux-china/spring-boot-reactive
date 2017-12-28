package org.mvnsearch.springbootreactive

import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import reactor.core.publisher.Mono
import reactor.core.publisher.toMono

/**
 * portal controller
 *
 * @author leijuan
 */
@Controller
class PortalController {

    @GetMapping("/")
    fun index(request: ServerHttpRequest, model: Model): Mono<String> {
        model.addAttribute("nick", "雷卷")
        return "index".toMono()
    }
}