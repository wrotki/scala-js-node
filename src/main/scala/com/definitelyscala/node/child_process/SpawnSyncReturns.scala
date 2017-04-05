package com.definitelyscala.node.child_process

import scala.scalajs.js

// specify `null`.
@js.native
trait SpawnSyncReturns[T] extends js.Object {
  var pid: Double = js.native
  var output: js.Array[String] = js.native
  var stdout: T = js.native
  var stderr: T = js.native
  var status: Double = js.native
  var signal: String = js.native
  var error: Error = js.native
}