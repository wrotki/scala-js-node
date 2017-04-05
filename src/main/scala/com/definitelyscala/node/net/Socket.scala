package com.definitelyscala.node.net

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.events.{internal => events}
import com.definitelyscala.node.stream.{internal => stream}

@js.native
@js.annotation.JSGlobal("net.Socket")
class Socket protected () extends stream.Duplex {
  def this(options: js.Any = js.native) = this()
  // Extended base methods
  def write(buffer: Buffer): Boolean = js.native
  def write(buffer: Buffer, cb: js.Function): Boolean = js.native
  def write(str: String, cb: js.Function): Boolean = js.native
  def write(str: String, encoding: String, fd: String): Boolean = js.native
  def connect(port: Double, host: String, connectionListener: js.Function): Unit = js.native
  def connect(path: String, connectionListener: js.Function): Unit = js.native
  var bufferSize: Double = js.native
  def destroy(): Unit = js.native
  def setTimeout(timeout: Double, callback: js.Function = js.native): Unit = js.native
  def setNoDelay(noDelay: Boolean = js.native): Unit = js.native
  def setKeepAlive(enable: Boolean = js.native, initialDelay: Double = js.native): Unit = js.native
  def address(): js.Any = js.native
  def unref(): Unit = js.native
  def ref(): Unit = js.native
  var remoteAddress: String = js.native
  var remoteFamily: String = js.native
  var remotePort: Double = js.native
  var localAddress: String = js.native
  var localPort: Double = js.native
  var bytesRead: Double = js.native
  var bytesWritten: Double = js.native
  var destroyed: Boolean = js.native
  // Extended base methods
  def end(data: js.Any, encoding: String): Unit = js.native
  /**
   * events.EventEmitter
   *   1. close
   *   2. connect
   *   3. data
   *   4. drain
   *   5. end
   *   6. error
   *   7. lookup
   *   8. timeout
   */
}
