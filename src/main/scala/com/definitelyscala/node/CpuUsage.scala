package com.definitelyscala.node

import scala.scalajs.js

@js.native
trait CpuUsage extends js.Object {
  var user: Double = js.native
  var system: Double = js.native
}