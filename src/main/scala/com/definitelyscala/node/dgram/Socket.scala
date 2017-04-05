package com.definitelyscala.node.dgram

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.events.{internal => events}
import scala.scalajs.js.|

@js.native
trait Socket extends events.EventEmitter {
  def send(msg: Buffer | String | js.Array[js.Any], port: Double, address: String, callback: js.Function2[Error, Double, Unit]): Unit = js.native
  def send(msg: Buffer | String | js.Array[js.Any], offset: Double, length: Double, port: Double, address: String, callback: js.Function2[Error, Double, Unit]): Unit = js.native
  def bind(port: Double, address: String, callback: js.Function0[Unit]): Unit = js.native
  def bind(options: BindOptions, callback: js.Function): Unit = js.native
  def close(callback: js.Function0[Unit] = js.native): Unit = js.native
  def address(): AddressInfo = js.native
  def setBroadcast(flag: Boolean): Unit = js.native
  def setTTL(ttl: Double): Unit = js.native
  def setMulticastTTL(ttl: Double): Unit = js.native
  def setMulticastLoopback(flag: Boolean): Unit = js.native
  def addMembership(multicastAddress: String, multicastInterface: String = js.native): Unit = js.native
  def dropMembership(multicastAddress: String, multicastInterface: String = js.native): Unit = js.native
  def ref(): js.Dynamic = js.native
  def unref(): js.Dynamic = js.native
  /**
   * events.EventEmitter
   * 1. close
   * 2. error
   * 3. listening
   * 4. message
   */
}
