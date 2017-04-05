package com.definitelyscala.node._debugger

import scala.scalajs.js

@js.native
trait ScriptDesc extends js.Object {
  var name: String = js.native
  var id: Double = js.native
  var isNative: Boolean = js.native
  var handle: Double = js.native
  var `type`: String = js.native
  var lineOffset: Double = js.native
  var columnOffset: Double = js.native
  var lineCount: Double = js.native
}