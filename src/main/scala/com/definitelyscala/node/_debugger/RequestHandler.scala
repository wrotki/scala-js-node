package com.definitelyscala.node._debugger

import scala.scalajs.js

@js.native
trait RequestHandler extends js.Object {
  def apply(err: Boolean, body: Message, res: Packet): Unit = js.native
  var request_seq: Double = js.native
}