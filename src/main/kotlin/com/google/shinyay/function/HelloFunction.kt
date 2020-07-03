package com.google.shinyay.function

import org.springframework.stereotype.Component
import java.util.function.Function

@Component
class HelloFunction : Function<String, String> {
    override fun apply(input: String): String = "Hello, $input !"
}