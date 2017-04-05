package com.definitelyscala.node.cluster

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}
import com.definitelyscala.node.net
import com.definitelyscala.node.child_process.ChildProcess
import scala.scalajs.js.|

// 4, 6, -1, "udp4", "udp6"
@js.native
@js.annotation.JSGlobal("cluster.Worker")
class Worker extends events.EventEmitter {
  var id: String = js.native
  var process: ChildProcess = js.native
  var suicide: Boolean = js.native
  def send(message: js.Any, sendHandle: js.Any = js.native): Boolean = js.native
  def kill(signal: String = js.native): Unit = js.native
  def destroy(signal: String = js.native): Unit = js.native
  def disconnect(): Unit = js.native
  def isConnected(): Boolean = js.native
  def isDead(): Boolean = js.native
  var exitedAfterDisconnect: Boolean = js.native
  /**
   * events.EventEmitter
   *   1. disconnect
   *   2. error
   *   3. exit
   *   4. listening
   *   5. message
   *   6. online
   */
}
