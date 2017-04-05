package com.definitelyscala.node.assert.internal

import scala.scalajs.js
import scala.scalajs.js.RegExp

@js.native
@js.annotation.JSGlobal("assert.internal.doesNotThrow")
object doesNotThrow extends js.Object {
  def apply(block: js.Function, message: String): Unit = js.native
  def apply(block: js.Function, error: js.Function, message: String): Unit = js.native
  def apply(block: js.Function, error: RegExp, message: String): Unit = js.native
  def apply(block: js.Function, error: js.Function1[js.Any, Boolean], message: String): Unit = js.native
}
