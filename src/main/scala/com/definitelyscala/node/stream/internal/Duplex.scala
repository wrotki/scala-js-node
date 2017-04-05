package com.definitelyscala.node.stream.internal

import scala.scalajs.js
import com.definitelyscala.node.NodeJS._
import com.definitelyscala.node.ReadWriteStream

@js.native
@js.annotation.JSGlobal("stream.internal.Duplex")
class Duplex protected () extends Readable with ReadWriteStream {
  def this(opts: DuplexOptions = js.native) = this()
  protected def _write(chunk: js.Any, encoding: String, callback: js.Function): Unit = js.native
  def write(chunk: js.Any, cb: js.Function): Boolean = js.native
  def write(chunk: js.Any, encoding: String, cb: js.Function): Boolean = js.native
  def end(chunk: js.Any, cb: js.Function): Unit = js.native
  def end(chunk: js.Any, encoding: String, cb: js.Function): Unit = js.native
}
