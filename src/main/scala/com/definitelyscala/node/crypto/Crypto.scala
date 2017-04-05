package com.definitelyscala.node.crypto

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import scala.scalajs.js.|
@js.native
@js.annotation.JSGlobal("crypto")
object Crypto extends js.Object {
  var fips: Boolean = js.native
  def createCredentials(details: CredentialDetails): Credentials = js.native
  def createHash(algorithm: String): Hash = js.native
  def createHmac(algorithm: String, key: String | Buffer): Hmac = js.native
  type Utf8AsciiLatin1Encoding = String
  type HexBase64Latin1Encoding = String
  type Utf8AsciiBinaryEncoding = String
  type HexBase64BinaryEncoding = String
  type ECDHKeyFormat = String
  def createCipher(algorithm: String, password: js.Any): Cipher = js.native
  def createCipheriv(algorithm: String, key: js.Any, iv: js.Any): Cipher = js.native
  def createDecipher(algorithm: String, password: js.Any): Decipher = js.native
  def createDecipheriv(algorithm: String, key: js.Any, iv: js.Any): Decipher = js.native
  def createSign(algorithm: String): Signer = js.native
  def createVerify(algorith: String): Verify = js.native
  def createDiffieHellman(prime_length: Double, generator: Double = js.native): DiffieHellman = js.native
  def createDiffieHellman(prime: Buffer): DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding): DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: Double | Buffer): DiffieHellman = js.native
  def createDiffieHellman(prime: String, prime_encoding: HexBase64Latin1Encoding, generator: String, generator_encoding: HexBase64Latin1Encoding): DiffieHellman = js.native
  def getDiffieHellman(group_name: String): DiffieHellman = js.native
  def pbkdf2(password: String | Buffer, salt: String | Buffer, iterations: Double, keylen: Double, digest: String, callback: js.Function2[Error, Buffer, Any]): Unit = js.native
  def pbkdf2Sync(password: String | Buffer, salt: String | Buffer, iterations: Double, keylen: Double, digest: String): Buffer = js.native
  def randomBytes(size: Double): Buffer = js.native
  def randomBytes(size: Double, callback: js.Function2[Error, Buffer, Unit]): Unit = js.native
  def pseudoRandomBytes(size: Double): Buffer = js.native
  def pseudoRandomBytes(size: Double, callback: js.Function2[Error, Buffer, Unit]): Unit = js.native
  def publicEncrypt(public_key: String | RsaPublicKey, buffer: Buffer): Buffer = js.native
  def privateDecrypt(private_key: String | RsaPrivateKey, buffer: Buffer): Buffer = js.native
  def privateEncrypt(private_key: String | RsaPrivateKey, buffer: Buffer): Buffer = js.native
  def publicDecrypt(public_key: String | RsaPublicKey, buffer: Buffer): Buffer = js.native
  def getCiphers(): js.Array[String] = js.native
  def getCurves(): js.Array[String] = js.native
  def getHashes(): js.Array[String] = js.native
  def createECDH(curve_name: String): ECDH = js.native
  def timingSafeEqual(a: Buffer, b: Buffer): Boolean = js.native
  var DEFAULT_ENCODING: String = js.native
}
