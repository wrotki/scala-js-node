package com.definitelyscala.node.crypto

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.crypto.Crypto._

@js.native
trait ECDH extends js.Object {
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding): String = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): String = js.native
  def computeSecret(other_public_key: Buffer): Buffer = js.native
  def computeSecret(other_public_key: String, input_encoding: HexBase64Latin1Encoding): Buffer = js.native
  def computeSecret(other_public_key: String, input_encoding: HexBase64Latin1Encoding, output_encoding: HexBase64Latin1Encoding): String = js.native
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): String = js.native
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): String = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding, format: ECDHKeyFormat): String = js.native
  def setPrivateKey(private_key: Buffer): Unit = js.native
  def setPrivateKey(private_key: String, encoding: HexBase64Latin1Encoding): Unit = js.native
}