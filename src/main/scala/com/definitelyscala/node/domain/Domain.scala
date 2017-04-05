package com.definitelyscala.node.domain

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}

@js.native
@js.annotation.JSGlobal("domain.Domain")
class Domain extends events.EventEmitter {
  def run(fn: js.Function): Unit = js.native
  def add(emitter: events.EventEmitter): Unit = js.native
  def remove(emitter: events.EventEmitter): Unit = js.native
  def bind(cb: js.Function2[Error, js.Any, Any]): js.Dynamic = js.native
  def intercept(cb: js.Function1[js.Any, Any]): js.Dynamic = js.native
  def dispose(): Unit = js.native
  var members: js.Array[js.Any] = js.native
  def enter(): Unit = js.native
  def exit(): Unit = js.native
}
@js.native
@js.annotation.JSGlobal("domain")
object Domain extends js.Object {
  // import * as events from "events";
  def create(): Domain = js.native
}