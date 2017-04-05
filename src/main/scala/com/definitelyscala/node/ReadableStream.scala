package com.definitelyscala.node

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait ReadableStream extends EventEmitter {
  var readable: Boolean = js.native
  def read(size: Double = js.native): String | Buffer = js.native
  def setEncoding(encoding: String | Null): js.Dynamic = js.native
  def pause(): js.Dynamic = js.native
  def resume(): js.Dynamic = js.native
  def isPaused(): Boolean = js.native
  def pipe[T <: WritableStream](destination: T, options: js.Any = js.native): T = js.native
  def unpipe[T <: WritableStream](destination: T = js.native): js.Dynamic = js.native
  def unshift(chunk: String): Unit = js.native
  def unshift(chunk: Buffer): Unit = js.native
  def wrap(oldStream: ReadableStream): ReadableStream = js.native
}
