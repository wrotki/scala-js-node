package com.definitelyscala.node.tls

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import scala.scalajs.js.|

@js.native
trait SecureContextOptions extends js.Object {
  var pfx: String | Buffer = js.native
  var key: String | Buffer = js.native
  var passphrase: String = js.native
  var cert: String | Buffer = js.native
  var ca: String | Buffer = js.native
  var crl: String | js.Array[String] = js.native
  var ciphers: String = js.native
  var honorCipherOrder: Boolean = js.native
}