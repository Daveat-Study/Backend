package com.daveat.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("api/hello")
class HelloWorldController {

    @GetMapping
    fun helloworld(): String {
        return "Hello this is a rest endpoint"
    }
}