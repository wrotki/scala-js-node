package com.definitelyscala.node.crypto

import scala.scalajs.js
import com.definitelyscala.node.{Buffer, ReadWriteStream}
import com.definitelyscala.node.NodeJS._
import com.definitelyscala.node.crypto.Crypto._

@js.native
trait Cipher extends ReadWriteStream {
  def update(data: Buffer): Buffer = js.native
  def update(data: String, input_encoding: Utf8AsciiBinaryEncoding): Buffer = js.native
  def update(data: Buffer, input_encoding: js.Any, output_encoding: HexBase64BinaryEncoding): String = js.native
  def update(data: String, input_encoding: Utf8AsciiBinaryEncoding, output_encoding: HexBase64BinaryEncoding): String = js.native
  def `final`(): Buffer = js.native
  def `final`(output_encoding: String): String = js.native
  def setAutoPadding(auto_padding: Boolean = js.native): Unit = js.native
  def getAuthTag(): Buffer = js.native
  def setAAD(buffer: Buffer): Unit = js.native
}
