package com.definitelyscala.node._debugger

import scala.scalajs.js

@js.native
trait Packet extends js.Object {
  var raw: String = js.native
  var headers: js.Array[String] = js.native
  var body: Message = js.native
}