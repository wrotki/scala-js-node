package com.definitelyscala.node.stream.internal

import com.definitelyscala.node.ReadWriteStream

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("stream.internal.Transform")
class Transform protected () extends ReadWriteStream {
  def this(opts: TransformOptions = js.native) = this()
  protected def _transform(chunk: js.Any, encoding: String, callback: js.Function): Unit = js.native
  protected def _flush(callback: js.Function): Unit = js.native
  def setEncoding(encoding: String): js.Dynamic = js.native
  def unshift(chunk: js.Any): Unit = js.native
  def push(chunk: js.Any, encoding: String = js.native): Boolean = js.native
  def write(chunk: js.Any, cb: js.Function): Boolean = js.native
  def write(chunk: js.Any, encoding: String, cb: js.Function): Boolean = js.native
  def end(chunk: js.Any, cb: js.Function): Unit = js.native
  def end(chunk: js.Any, encoding: String, cb: js.Function): Unit = js.native
}
