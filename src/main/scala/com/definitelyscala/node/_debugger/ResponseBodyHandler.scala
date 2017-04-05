package com.definitelyscala.node._debugger

import scala.scalajs.js

@js.native
trait ResponseBodyHandler extends js.Object {
  def apply(err: Boolean, body: js.Any): Unit = js.native
  var request_seq: Double = js.native
}