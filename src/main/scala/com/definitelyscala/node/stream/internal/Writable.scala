package com.definitelyscala.node.stream.internal

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}
import com.definitelyscala.node.WritableStream
import org.scalajs.dom.raw._

@js.native
@js.annotation.JSGlobal("stream.internal.Writable")
class Writable protected () extends events.EventEmitter {
  def this(opts: WritableOptions = js.native) = this()
  var writable: Boolean = js.native
  protected def _write(chunk: js.Any, encoding: String, callback: js.Function): Unit = js.native
  def write(chunk: js.Any, cb: js.Function): Boolean = js.native
  def write(chunk: js.Any, encoding: String, cb: js.Function): Boolean = js.native
  def end(chunk: js.Any, cb: js.Function): Unit = js.native
  def end(chunk: js.Any, encoding: String, cb: js.Function): Unit = js.native
  /**
   * Event emitter
   * The defined events on documents including:
   *   1. close
   *   2. drain
   *   3. error
   *   4. finish
   *   5. pipe
   *   6. unpipe
   */
}
