package com.google.shinyay

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringGraalvmFnNettyApplication

fun main(args: Array<String>) {
	runApplication<SpringGraalvmFnNettyApplication>(*args)
}
