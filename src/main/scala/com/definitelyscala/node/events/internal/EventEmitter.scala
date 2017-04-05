package com.definitelyscala.node.events.internal

import scala.scalajs.js
import org.scalajs.dom.raw._

@js.native
@js.annotation.JSGlobal("events.internal.EventEmitter")
class EventEmitter extends js.Object {
  // deprecated
  def addListener(event: String, listener: js.Function): js.Dynamic = js.native
  def on(event: String, listener: js.Function): js.Dynamic = js.native
  def once(event: String, listener: js.Function): js.Dynamic = js.native
  def prependListener(event: String, listener: js.Function): js.Dynamic = js.native
  def prependOnceListener(event: String, listener: js.Function): js.Dynamic = js.native
  def removeListener(event: String, listener: js.Function): js.Dynamic = js.native
  def removeAllListeners(event: String = js.native): js.Dynamic = js.native
  def setMaxListeners(n: Double): js.Dynamic = js.native
  def getMaxListeners(): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def eventNames(): js.Array[String] = js.native
  def listenerCount(`type`: String): Double = js.native
}

@js.native
@js.annotation.JSGlobal("events.internal.EventEmitter")
object EventEmitter extends js.Object {
  def listenerCount(emitter: EventEmitter, event: String): Double = js.native
  var defaultMaxListeners: Double = js.native
}
