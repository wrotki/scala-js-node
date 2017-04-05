package com.definitelyscala.node.https

import com.definitelyscala.node.tls
import scala.scalajs.js

@js.native
trait ServerOptions extends js.Object {
  var pfx: js.Any = js.native
  var key: js.Any = js.native
  var passphrase: String = js.native
  var cert: js.Any = js.native
  var ca: js.Any = js.native
  var crl: js.Any = js.native
  var ciphers: String = js.native
  var honorCipherOrder: Boolean = js.native
  var requestCert: Boolean = js.native
  var rejectUnauthorized: Boolean = js.native
  var NPNProtocols: js.Any = js.native
  var SNICallback: js.Function2[String, js.Function2[Error, tls.SecureContext, Any], Any] = js.native
}
