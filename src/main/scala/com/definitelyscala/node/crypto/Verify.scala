package com.definitelyscala.node.crypto

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.crypto.Crypto._
import com.definitelyscala.node.WritableStream
import scala.scalajs.js.|

@js.native
trait Verify extends WritableStream {
  def update(data: String | Buffer): Verify = js.native
  def update(data: String | Buffer, input_encoding: Utf8AsciiLatin1Encoding): Verify = js.native
  def verify(`object`: String, signature: Buffer): Boolean = js.native
  def verify(`object`: String, signature: String, signature_format: HexBase64Latin1Encoding): Boolean = js.native
}