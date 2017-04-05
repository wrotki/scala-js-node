package com.definitelyscala.node.buffer

import com.definitelyscala.node.SlowBuffer

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("buffer")
object Buffer extends js.Object {
  var INSPECT_MAX_BYTES: Double = js.native
  var BuffType: Buffer.type = js.native
  var SlowBuffType: SlowBuffer.type = js.native
}
