package com.definitelyscala.node._debugger

import scala.scalajs.js

@js.native
trait BreakpointMessageBody extends js.Object {
  var `type`: String = js.native
  var target: Double = js.native
  var line: Double = js.native
}