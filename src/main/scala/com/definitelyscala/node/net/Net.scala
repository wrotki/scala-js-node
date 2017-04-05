package com.definitelyscala.node.net

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("net")
object Net extends js.Object {
  // import * as stream from "stream";
  // import * as events from "events";
  def createServer(connectionListener: js.Function1[Socket, Unit]): Server = js.native
  def createServer(options: js.Any = js.native, connectionListener: js.Function1[Socket, Unit] = js.native): Server = js.native
  def connect(options: js.Any, connectionListener: js.Function = js.native): Socket = js.native
  def createConnection(options: js.Any, connectionListener: js.Function = js.native): Socket = js.native
  def isIP(input: String): Double = js.native
  def isIPv4(input: String): Boolean = js.native
  def isIPv6(input: String): Boolean = js.native
}
