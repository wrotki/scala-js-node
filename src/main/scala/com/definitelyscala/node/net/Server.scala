package com.definitelyscala.node.net

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}

@js.native
trait Server extends events.EventEmitter {
  def listen(port: Double, hostname: String, backlog: Double, listeningListener: js.Function): Server = js.native
  def listen(port: Double, hostname: String, listeningListener: js.Function): Server = js.native
  def listen(port: Double, backlog: Double, listeningListener: js.Function): Server = js.native
  def listen(port: Double, listeningListener: js.Function): Server = js.native
  def listen(path: String, backlog: Double, listeningListener: js.Function): Server = js.native
  def listen(path: String, listeningListener: js.Function): Server = js.native
  def listen(options: ListenOptions, listeningListener: js.Function): Server = js.native
  def listen(handle: js.Any, backlog: Double, listeningListener: js.Function): Server = js.native
  def listen(handle: js.Any, listeningListener: js.Function): Server = js.native
  def close(callback: js.Function = js.native): Server = js.native
  def address(): js.Any = js.native
  def getConnections(cb: js.Function2[Error, Double, Unit]): Unit = js.native
  def ref(): Server = js.native
  def unref(): Server = js.native
  var maxConnections: Double = js.native
  var connections: Double = js.native
  /**
   * events.EventEmitter
   *   1. close
   *   2. connection
   *   3. error
   *   4. listening
   */
}
