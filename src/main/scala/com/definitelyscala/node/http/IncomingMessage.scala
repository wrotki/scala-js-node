package com.definitelyscala.node.http

import scala.scalajs.js
import com.definitelyscala.node.{Timer, http, net}
import com.definitelyscala.node.stream.{internal => stream}

@js.native
trait IncomingMessage extends stream.Readable {
  var httpVersion: String = js.native
  var httpVersionMajor: Double = js.native
  var httpVersionMinor: Double = js.native
  var connection: net.Socket = js.native
  var headers: js.Any = js.native
  var rawHeaders: js.Array[String] = js.native
  var trailers: js.Any = js.native
  var rawTrailers: js.Any = js.native
  def setTimeout(msecs: Double, callback: js.Function): Timer = js.native
  /**
   * Only valid for request obtained from http.Server.
   */
  var method: String = js.native
  /**
   * Only valid for request obtained from http.Server.
   */
  var url: String = js.native
  /**
   * Only valid for response obtained from http.ClientRequest.
   */
  var statusCode: Double = js.native
  /**
   * Only valid for response obtained from http.ClientRequest.
   */
  var statusMessage: String = js.native
  var socket: net.Socket = js.native
  def destroy(error: Error = js.native): Unit = js.native
}
