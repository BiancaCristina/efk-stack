package com.github.biancacristina

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.github.biancacristina")
		.start()
}

