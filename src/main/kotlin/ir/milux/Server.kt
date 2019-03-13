package ir.milux

import io.vertx.core.Vertx

class Server(val port : Int) {
        private val vertx = Vertx.vertx()!!
        private val server = vertx.createHttpServer()!!
    fun start(){
        server.requestHandler { request ->
            val response = request.response()
            response.putHeader("content-type", "application/json")
            response.end("{\"name\":\"milux\"}")
        }
        server.listen(port)
    }

}
