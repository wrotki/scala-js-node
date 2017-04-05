package com.definitelyscala.node

import scala.scalajs.js

@js.native
trait MemoryUsage extends js.Object {
  var rss: Double = js.native
  var heapTotal: Double = js.native
  var heapUsed: Double = js.native
}