package com.definitelyscala.node.os

import scala.scalajs.js
import com.definitelyscala.node.NodeJS
import org.scalajs.dom.raw._
@js.native
@js.annotation.JSGlobal("os")
object Os extends js.Object {
  def hostname(): String = js.native
  def loadavg(): js.Array[Double] = js.native
  def uptime(): Double = js.native
  def freemem(): Double = js.native
  def totalmem(): Double = js.native
  def cpus(): js.Array[CpuInfo] = js.native
  def `type`(): String = js.native
  def release(): String = js.native
  def networkInterfaces(): js.Dictionary[js.Array[NetworkInterfaceInfo]] = js.native
  def homedir(): String = js.native
  def userInfo(options: js.Any = js.native): js.Any = js.native
  def arch(): String = js.native
  def platform(): NodeJS.Platform = js.native
  def tmpdir(): String = js.native
  var EOL: String = js.native
  def endianness(): String = js.native
}