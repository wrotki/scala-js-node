package com.definitelyscala.node.vm

import scala.scalajs.js
import com.definitelyscala.node.Buffer

@js.native
trait ScriptOptions extends js.Object {
  var filename: String = js.native
  var lineOffset: Double = js.native
  var columnOffset: Double = js.native
  var displayErrors: Boolean = js.native
  var timeout: Double = js.native
  var cachedData: Buffer = js.native
  var produceCachedData: Boolean = js.native
}