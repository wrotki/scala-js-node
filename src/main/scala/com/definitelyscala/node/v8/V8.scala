package com.definitelyscala.node.v8

import scala.scalajs.js
import com.definitelyscala.node.v8.V8.DoesZapCodeSpaceFlag
@js.native
@js.annotation.JSGlobal("v8")
object V8 extends js.Object {
  //** Signifies if the --zap_code_space option is enabled or not.  1 == enabled, 0 == disabled. */
  type DoesZapCodeSpaceFlag = Double
  def getHeapStatistics(): HeapInfo = js.native
  def getHeapSpaceStatistics(): js.Array[HeapSpaceInfo] = js.native
  def setFlagsFromString(flags: String): Unit = js.native
}