package com.swypex.example

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class SwypexExampleApplication

fun main(args: Array<String>) {
    runApplication<SwypexExampleApplication>(*args)
}
