package com.definitelyscala.node.child_process

import scala.scalajs.js

@js.native
trait ExecOptions extends js.Object {
  var cwd: String = js.native
  var env: js.Any = js.native
  var shell: String = js.native
  var timeout: Double = js.native
  var maxBuffer: Double = js.native
  var killSignal: String = js.native
  var uid: Double = js.native
  var gid: Double = js.native
}
