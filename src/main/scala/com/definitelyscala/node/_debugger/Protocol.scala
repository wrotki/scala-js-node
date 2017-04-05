package com.definitelyscala.node._debugger

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("_debugger.Protocol")
class Protocol extends js.Object {
  var res: Packet = js.native
  var state: String = js.native
  def execute(data: String): Unit = js.native
  def serialize(rq: Request): String = js.native
  var onResponse: js.Function1[Packet, Unit] = js.native
}