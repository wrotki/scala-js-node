package com.definitelyscala.node._debugger

import scala.scalajs.js

@js.native
trait Breakpoint extends js.Object {
  var id: Double = js.native
  var scriptId: Double = js.native
  var script: ScriptDesc = js.native
  var line: Double = js.native
  var condition: String = js.native
  var scriptReq: String = js.native
}