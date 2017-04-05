package com.definitelyscala.node.stream.internal

import com.definitelyscala.node.ReadableStream

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("stream.internal.Readable")
class Readable protected () extends ReadableStream {
  def this(opts: ReadableOptions = js.native) = this()
  protected def _read(size: Double): Unit = js.native
  def setEncoding(encoding: String): js.Dynamic = js.native
  def unshift(chunk: js.Any): Unit = js.native
  def push(chunk: js.Any, encoding: String = js.native): Boolean = js.native
  /**
   * Event emitter
   * The defined events on documents including:
   *   1. close
   *   2. data
   *   3. end
   *   4. readable
   *   5. error
   */
}
