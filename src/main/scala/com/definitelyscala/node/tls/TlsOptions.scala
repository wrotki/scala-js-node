package com.definitelyscala.node.tls

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import scala.scalajs.js.|

@js.native
trait TlsOptions extends js.Object {
  var host: String = js.native
  var port: Double = js.native
  var pfx: String | js.Array[Buffer] = js.native
  var key: String | js.Array[String] | Buffer | js.Array[js.Any] = js.native
  var passphrase: String = js.native
  var cert: String | js.Array[String] | Buffer | js.Array[Buffer] = js.native
  var ca: String | js.Array[String] | Buffer | js.Array[Buffer] = js.native
  var crl: String | js.Array[String] = js.native
  var ciphers: String = js.native
  var honorCipherOrder: Boolean = js.native
  var requestCert: Boolean = js.native
  var rejectUnauthorized: Boolean = js.native
  var NPNProtocols: js.Array[String] | Buffer = js.native
  var SNICallback: js.Function2[String, js.Function2[Error, SecureContext, Any], Any] = js.native
  var ecdhCurve: String = js.native
  var dhparam: String | Buffer = js.native
  var handshakeTimeout: Double = js.native
  var ALPNProtocols: js.Array[String] | Buffer = js.native
  var sessionTimeout: Double = js.native
  var ticketKeys: js.Any = js.native
  var sessionIdContext: String = js.native
  var secureProtocol: String = js.native
}