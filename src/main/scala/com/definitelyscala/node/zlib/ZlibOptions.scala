package com.definitelyscala.node.zlib

import scala.scalajs.js

@js.native
trait ZlibOptions extends js.Object {
  var flush: Double = js.native
  // default: zlib.constants.Z_NO_FLUSH
  var finishFlush: Double = js.native
  // default: zlib.constants.Z_FINISH
  var chunkSize: Double = js.native
  // default: 16*1024
  var windowBits: Double = js.native
  var level: Double = js.native
  // compression only
  var memLevel: Double = js.native
  // compression only
  var strategy: Double = js.native
  // compression only
  var dictionary: js.Any = js.native
}