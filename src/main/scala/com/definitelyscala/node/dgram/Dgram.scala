package com.definitelyscala.node.dgram

import scala.scalajs.js
import com.definitelyscala.node.Buffer
@js.native
@js.annotation.JSGlobal("dgram")
object Dgram extends js.Object {
  // import * as events from "events";
  def createSocket(`type`: String, callback: js.Function2[Buffer, RemoteInfo, Unit]): Socket = js.native
  def createSocket(options: SocketOptions, callback: js.Function2[Buffer, RemoteInfo, Unit] = js.native): Socket = js.native
}
