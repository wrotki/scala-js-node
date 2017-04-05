package com.definitelyscala.node.http

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.stream.{internal => stream}
import scala.scalajs.js.|

@js.native
trait ServerResponse extends stream.Writable {
  // Extended base methods
  def write(buffer: Buffer): Boolean = js.native
  def write(buffer: Buffer, cb: js.Function): Boolean = js.native
  def write(str: String, cb: js.Function): Boolean = js.native
  def write(str: String, encoding: String, cb: js.Function): Boolean = js.native
  def write(str: String, encoding: String, fd: String): Boolean = js.native
  def writeContinue(): Unit = js.native
  def writeHead(statusCode: Double, reasonPhrase: String, headers: js.Any): Unit = js.native
  def writeHead(statusCode: Double, headers: js.Any): Unit = js.native
  var statusCode: Double = js.native
  var statusMessage: String = js.native
  var headersSent: Boolean = js.native
  def setHeader(name: String, value: String | js.Array[String]): Unit = js.native
  def setTimeout(msecs: Double, callback: js.Function): ServerResponse = js.native
  var sendDate: Boolean = js.native
  def getHeader(name: String): String = js.native
  def removeHeader(name: String): Unit = js.native
  def write(chunk: js.Any, encoding: String): js.Dynamic = js.native
  def addTrailers(headers: js.Any): Unit = js.native
  var finished: Boolean = js.native
  // Extended base methods
  def end(): Unit = js.native
  def end(buffer: Buffer, cb: js.Function): Unit = js.native
  def end(str: String, cb: js.Function): Unit = js.native
  def end(str: String, encoding: String, cb: js.Function): Unit = js.native
  def end(data: js.Any, encoding: String): Unit = js.native
}