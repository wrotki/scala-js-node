package com.definitelyscala.node.cluster

import scala.scalajs.js
import com.definitelyscala.node.net
// the handle is a net.Socket or net.Server object, or undefined.

@js.native
@js.annotation.JSGlobal("cluster.workers")
object workers extends js.Object {
  @js.annotation.JSBracketAccess
  def apply(index: String): Worker = js.native
  @js.annotation.JSBracketAccess
  def update(index: String, v: Worker): Unit = js.native
}