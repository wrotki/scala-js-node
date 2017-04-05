package com.definitelyscala.node.os

import scala.scalajs.js

@js.native
trait CpuInfo extends js.Object {
  var model: String = js.native
  var speed: Double = js.native
  var times: js.Any = js.native
}