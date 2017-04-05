package com.definitelyscala.node.cluster

import scala.scalajs.js

@js.native
trait ClusterSetupMasterSettings extends js.Object {
  var exec: String = js.native
  // default: process.argv[1]
  var args: js.Array[String] = js.native
  // default: process.argv.slice(2)
  var silent: Boolean = js.native
  // default: false
  var stdio: js.Array[js.Any] = js.native
}