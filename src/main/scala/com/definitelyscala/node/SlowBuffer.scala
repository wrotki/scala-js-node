package com.definitelyscala.node

import scala.scalajs.js

@js.native
@js.annotation.JSGlobal("SlowBuffer")
object SlowBuffer extends js.Object {
  def isBuffer(obj: js.Any): Boolean = js.native
  def byteLength(string: String, encoding: String = js.native): Double = js.native
  def concat(list: js.Array[Buffer], totalLength: Double = js.native): Buffer = js.native
}
