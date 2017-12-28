package org.mvnsearch.springbootreactive

import org.springframework.http.server.reactive.ServerHttpRequest
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

/**
 * portal controller
 *
 * @author leijuan
 */
@Controller
class PortalController {

    @GetMapping("/")
    fun index(request: ServerHttpRequest, model: Model): String {
        model.addAttribute("nick", "雷卷")
        return "index"
    }
}