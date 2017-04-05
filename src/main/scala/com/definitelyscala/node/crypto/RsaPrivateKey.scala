package com.definitelyscala.node.crypto

import scala.scalajs.js

@js.native
trait RsaPrivateKey extends js.Object {
  var key: String = js.native
  var passphrase: String = js.native
  var padding: Double = js.native
}