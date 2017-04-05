package com.definitelyscala.node.child_process

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}
import com.definitelyscala.node.stream.{internal => stream}

@js.native
trait ChildProcess extends events.EventEmitter {
  var stdin: stream.Writable = js.native
  var stdout: stream.Readable = js.native
  var stderr: stream.Readable = js.native
  var stdio: js.Tuple3[stream.Writable, stream.Readable, stream.Readable] = js.native
  var pid: Double = js.native
  def kill(signal: String = js.native): Unit = js.native
  def send(message: js.Any, sendHandle: js.Any = js.native): Boolean = js.native
  var connected: Boolean = js.native
  def disconnect(): Unit = js.native
  def unref(): Unit = js.native
  def ref(): Unit = js.native
  /**
   * events.EventEmitter
   * 1. close
   * 2. disconnet
   * 3. error
   * 4. exit
   * 5. message
   */
}
