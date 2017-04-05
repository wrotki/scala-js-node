package com.definitelyscala.node.cluster

import scala.scalajs.js

@js.native
trait ClusterSettings extends js.Object {
  var execArgv: js.Array[String] = js.native
  // default: process.execArgv
  var exec: String = js.native
  var args: js.Array[String] = js.native
  var silent: Boolean = js.native
  var stdio: js.Array[js.Any] = js.native
  var uid: Double = js.native
  var gid: Double = js.native
}