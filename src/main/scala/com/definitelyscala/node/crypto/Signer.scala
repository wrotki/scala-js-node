package com.definitelyscala.node.crypto

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.crypto.Crypto._
import com.definitelyscala.node.WritableStream
import scala.scalajs.js.|

@js.native
trait Signer extends WritableStream {
  def update(data: String | Buffer): Signer = js.native
  def update(data: String | Buffer, input_encoding: Utf8AsciiLatin1Encoding): Signer = js.native
  def sign(private_key: String | js.Any): Buffer = js.native
  def sign(private_key: String | js.Any, output_format: HexBase64Latin1Encoding): String = js.native
}