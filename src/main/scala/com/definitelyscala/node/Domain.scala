package com.definitelyscala.node

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
trait Domain extends Events {
  def run(fn: js.Function): Unit = js.native
  def add(emitter: Events): Unit = js.native
  def remove(emitter: Events): Unit = js.native
  def bind(cb: js.Function2[Error, js.Any, Any]): js.Dynamic = js.native
  def intercept(cb: js.Function1[js.Any, Any]): js.Dynamic = js.native
  def dispose(): Unit = js.native
}
