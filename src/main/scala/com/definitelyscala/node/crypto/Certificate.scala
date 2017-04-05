package com.definitelyscala.node.crypto

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import scala.scalajs.js.|

@js.native
@js.annotation.JSGlobal("crypto.Certificate")
class Certificate extends js.Object {
  def exportChallenge(spkac: String | Buffer): Buffer = js.native
  def exportPublicKey(spkac: String | Buffer): Buffer = js.native
  def verifySpkac(spkac: Buffer): Boolean = js.native
}

@js.native
@js.annotation.JSGlobal("crypto.Certificate")
object Certificate extends js.Object {
  def apply(): Certificate = js.native
}