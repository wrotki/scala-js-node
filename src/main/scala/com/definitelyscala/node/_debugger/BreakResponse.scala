package com.definitelyscala.node._debugger

import scala.scalajs.js

@js.native
trait BreakResponse extends js.Object {
  var script: ScriptDesc = js.native
  var exception: ExceptionInfo = js.native
  var sourceLine: Double = js.native
  var sourceLineText: String = js.native
  var sourceColumn: Double = js.native
}