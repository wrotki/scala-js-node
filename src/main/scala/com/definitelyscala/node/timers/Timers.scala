package com.definitelyscala.node.timers

import com.definitelyscala.node.Timer

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("timers")
object Timers extends js.Object {
  def setTimeout(callback: js.Function, ms: Double, args: js.Any*): Timer = js.native
  def clearTimeout(timeoutId: Timer): Unit = js.native
  def setInterval(callback: js.Function, ms: Double, args: js.Any*): Timer = js.native
  def clearInterval(intervalId: Timer): Unit = js.native
  def setImmediate(callback: js.Function, args: js.Any*): js.Dynamic = js.native
  def clearImmediate(immediateId: js.Any): Unit = js.native
}
