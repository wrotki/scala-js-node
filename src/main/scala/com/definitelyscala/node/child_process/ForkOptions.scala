package com.definitelyscala.node.child_process

import scala.scalajs.js

// specify `null`.
@js.native
trait ForkOptions extends js.Object {
  var cwd: String = js.native
  var env: js.Any = js.native
  var execPath: String = js.native
  var execArgv: js.Array[String] = js.native
  var silent: Boolean = js.native
  var uid: Double = js.native
  var gid: Double = js.native
}