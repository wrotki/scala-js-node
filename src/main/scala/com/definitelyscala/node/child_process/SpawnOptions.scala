package com.definitelyscala.node.child_process

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait SpawnOptions extends js.Object {
  var cwd: String = js.native
  var env: js.Any = js.native
  var stdio: js.Any = js.native
  var detached: Boolean = js.native
  var uid: Double = js.native
  var gid: Double = js.native
  var shell: Boolean | String = js.native
}