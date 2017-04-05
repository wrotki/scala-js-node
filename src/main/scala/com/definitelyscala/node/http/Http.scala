package com.definitelyscala.node.http

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("http")
object Http extends js.Object {
  //import events from "events";
  //import net from "net";
  //import stream from "stream";
  /**
   * @deprecated Use IncomingMessage
   */
  /**
   * @deprecated Use IncomingMessage
   */
  var METHODS: js.Array[String] = js.native
  def createServer(requestListener: js.Function2[IncomingMessage, ServerResponse, Unit] = js.native): Server = js.native
  def createClient(port: Double = js.native, host: String = js.native): js.Dynamic = js.native
  def request(options: RequestOptions, callback: js.Function1[IncomingMessage, Unit] = js.native): ClientRequest = js.native
  def get(options: js.Any, callback: js.Function1[IncomingMessage, Unit] = js.native): ClientRequest = js.native
  var globalAgent: Agent = js.native
}