package com.definitelyscala.node.string_decoder

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import org.scalajs.dom.raw._

@js.native
trait NodeStringDecoder extends js.Object {
  def write(buffer: Buffer): String = js.native
  def end(buffer: Buffer = js.native): String = js.native
}