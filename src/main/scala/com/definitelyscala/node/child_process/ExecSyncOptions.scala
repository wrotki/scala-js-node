package com.definitelyscala.node.child_process

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import scala.scalajs.js.|

@js.native
trait ExecSyncOptions extends js.Object {
  var cwd: String = js.native
  var input: String | Buffer = js.native
  var stdio: js.Any = js.native
  var env: js.Any = js.native
  var shell: String = js.native
  var uid: Double = js.native
  var gid: Double = js.native
  var timeout: Double = js.native
  var killSignal: String = js.native
  var maxBuffer: Double = js.native
  var encoding: String = js.native
}