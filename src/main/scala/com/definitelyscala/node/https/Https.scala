package com.definitelyscala.node.https

import scala.scalajs.js
import com.definitelyscala.node.http
@js.native
@js.annotation.JSGlobal("https")
object Https extends js.Object {
  // import * as tls from "tls";
  // import * as events from "events";
  // import * as http from "http";
  def createServer(options: ServerOptions, requestListener: js.Function = js.native): Server = js.native
  def request(options: RequestOptions, callback: js.Function1[http.IncomingMessage, Unit] = js.native): http.ClientRequest = js.native
  def get(options: RequestOptions, callback: js.Function1[http.IncomingMessage, Unit] = js.native): http.ClientRequest = js.native
  var globalAgent: Agent = js.native
}