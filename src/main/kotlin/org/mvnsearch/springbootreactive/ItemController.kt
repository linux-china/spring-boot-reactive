package org.mvnsearch.springbootreactive

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

/**
 * item controller
 *
 * @author linux_china
 */

data class Item(var id: Long, var name: String)

@RestController
class ItemController {

    @RequestMapping("/item/{id}")
    fun show(@PathVariable("id") id: Long): Mono<Item> {
        return Mono.just(Item(id, "item-${id}"))
    }
}