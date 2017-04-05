package com.definitelyscala.node

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait WritableStream extends EventEmitter {
  var writable: Boolean = js.native
  var isTTY: Boolean = js.native
  def write(buffer: Buffer | String, cb: js.Function): Boolean = js.native
  def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
  def end(): Unit = js.native
  def end(buffer: Buffer, cb: js.Function): Unit = js.native
  def end(str: String, cb: js.Function): Unit = js.native
  def end(str: String, encoding: String, cb: js.Function): Unit = js.native
}
