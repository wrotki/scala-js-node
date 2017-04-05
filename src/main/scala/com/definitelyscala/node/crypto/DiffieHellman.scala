package com.definitelyscala.node.crypto

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.crypto.Crypto._

@js.native
trait DiffieHellman extends js.Object {
  def generateKeys(): Buffer = js.native
  def generateKeys(encoding: HexBase64Latin1Encoding): String = js.native
  def computeSecret(other_public_key: Buffer): Buffer = js.native
  def computeSecret(other_public_key: String, input_encoding: HexBase64Latin1Encoding): Buffer = js.native
  def computeSecret(other_public_key: String, input_encoding: HexBase64Latin1Encoding, output_encoding: HexBase64Latin1Encoding): String = js.native
  def getPrime(): Buffer = js.native
  def getPrime(encoding: HexBase64Latin1Encoding): String = js.native
  def getGenerator(): Buffer = js.native
  def getGenerator(encoding: HexBase64Latin1Encoding): String = js.native
  def getPublicKey(): Buffer = js.native
  def getPublicKey(encoding: HexBase64Latin1Encoding): String = js.native
  def getPrivateKey(): Buffer = js.native
  def getPrivateKey(encoding: HexBase64Latin1Encoding): String = js.native
  def setPublicKey(public_key: Buffer): Unit = js.native
  def setPublicKey(public_key: String, encoding: String): Unit = js.native
  def setPrivateKey(private_key: Buffer): Unit = js.native
  def setPrivateKey(private_key: String, encoding: String): Unit = js.native
  var verifyError: Double = js.native
}