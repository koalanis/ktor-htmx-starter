package com.example.plugins

import html
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
fun Application.configureViewRouting() {
    routing {
        get("/") {
            call.respondText(html(), ContentType.Text.Html)
        }

        post("/clicked") {
            call.respondText("<div>clicked</div>", ContentType.Text.Plain)
        }
        // Static plugin. Try to access `/static/index.html`
        static("/static") {
            resources("static")
        }
    }
}

fun Application.configureApiRouting() {
    routing {
        get("/api") {
            call.respondText("{\"name\": \"Hello World!\"}", ContentType.Application.Json)
        }
    }
}
