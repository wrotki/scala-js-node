package com.definitelyscala.node.cluster

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}

// the handle is a net.Socket or net.Server object, or undefined.
@js.native
trait Cluster extends events.EventEmitter {
  var Worker: Worker = js.native
  def disconnect(callback: js.Function = js.native): Unit = js.native
  def fork(env: js.Any = js.native): Worker = js.native
  var isMaster: Boolean = js.native
  var isWorker: Boolean = js.native
  // TODO: cluster.schedulingPolicy
  var settings: ClusterSettings = js.native
  def setupMaster(settings: ClusterSetupMasterSettings = js.native): Unit = js.native
  var worker: Worker = js.native
  var workers: js.Dictionary[Worker] = js.native
  /**
   * events.EventEmitter
   *   1. disconnect
   *   2. exit
   *   3. fork
   *   4. listening
   *   5. message
   *   6. online
   *   7. setup
   */
  def emit(event: String, listener: js.Function): Boolean = js.native
}
@js.native
@js.annotation.JSGlobal("cluster")
object Cluster extends js.Object {
  //import * as child from "child_process";
  //import * as events from "events";
  //import * as net from "net";
  // interfaces
  def disconnect(callback: js.Function = js.native): Unit = js.native
  def fork(env: js.Any = js.native): Worker = js.native
  var isMaster: Boolean = js.native
  var isWorker: Boolean = js.native
  // TODO: cluster.schedulingPolicy
  var settings: ClusterSettings = js.native
  def setupMaster(settings: ClusterSetupMasterSettings = js.native): Unit = js.native
  var worker: Worker = js.native
  /**
   * events.EventEmitter
   *   1. disconnect
   *   2. exit
   *   3. fork
   *   4. listening
   *   5. message
   *   6. online
   *   7. setup
   */
  def addListener(event: String, listener: js.Function): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  def emit(event: String, listener: js.Function): Boolean = js.native
  def on(event: String, listener: js.Function): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  def once(event: String, listener: js.Function): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  def removeListener(event: String, listener: js.Function): Cluster = js.native
  def removeAllListeners(event: String = js.native): Cluster = js.native
  def setMaxListeners(n: Double): Cluster = js.native
  def getMaxListeners(): Double = js.native
  def listeners(event: String): js.Array[js.Function] = js.native
  def listenerCount(`type`: String): Double = js.native
  def prependListener(event: String, listener: js.Function): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  def prependOnceListener(event: String, listener: js.Function): Cluster = js.native
  // the handle is a net.Socket or net.Server object, or undefined.
  def eventNames(): js.Array[String] = js.native
}
