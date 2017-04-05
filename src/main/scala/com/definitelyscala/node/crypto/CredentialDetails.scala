package com.definitelyscala.node.crypto

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait CredentialDetails extends js.Object {
  var pfx: String = js.native
  var key: String = js.native
  var passphrase: String = js.native
  var cert: String = js.native
  var ca: String | js.Array[String] = js.native
  var crl: String | js.Array[String] = js.native
  var ciphers: String = js.native
}