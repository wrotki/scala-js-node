package com.definitelyscala.node

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("NodeJS.EventEmitter")
class EventEmitter extends js.Object {
  def addListener(event: String, listener: js.Function): js.Dynamic = js.native
  def on(event: String, listener: js.Function): js.Dynamic = js.native
  def once(event: String, listener: js.Function): js.Dynamic = js.native
  def removeListener(event: String, listener: js.Function): js.Dynamic = js.native
  def removeAllListeners(event: String = js.native): js.Dynamic = js.native
  def setMaxListeners(n: Double): js.Dynamic = js.native
  def getMaxListeners(): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def emit(event: String, args: js.Any*): Boolean = js.native
  def listenerCount(`type`: String): Double = js.native
  // Added in Node 6...
  def prependListener(event: String, listener: js.Function): js.Dynamic = js.native
  def prependOnceListener(event: String, listener: js.Function): js.Dynamic = js.native
  def eventNames(): js.Array[String] = js.native
}
