package com.definitelyscala.node.http

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.stream.{internal => stream}
import scala.scalajs.js.|

@js.native
trait ClientRequest extends stream.Writable {
  // Extended base methods
  def write(buffer: Buffer): Boolean = js.native
  def write(buffer: Buffer, cb: js.Function): Boolean = js.native
  def write(str: String, cb: js.Function): Boolean = js.native
  def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
  def write(str: String, encoding: String, fd: String): Boolean = js.native
  def write(chunk: js.Any, encoding: String): Unit = js.native
  def abort(): Unit = js.native
  def setTimeout(timeout: Double, callback: js.Function = js.native): Unit = js.native
  def setNoDelay(noDelay: Boolean = js.native): Unit = js.native
  def setSocketKeepAlive(enable: Boolean = js.native, initialDelay: Double = js.native): Unit = js.native
  def setHeader(name: String, value: String | js.Array[String]): Unit = js.native
  def getHeader(name: String): String = js.native
  def removeHeader(name: String): Unit = js.native
  def addTrailers(headers: js.Any): Unit = js.native
  // Extended base methods
  def end(): Unit = js.native
  def end(buffer: Buffer, cb: js.Function): Unit = js.native
  def end(str: String, cb: js.Function): Unit = js.native
  def end(str: String, encoding: String, cb: js.Function): Unit = js.native
  def end(data: js.Any, encoding: String): Unit = js.native
}