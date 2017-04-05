package com.definitelyscala.node.https

import scala.scalajs.js
import com.definitelyscala.node.http

@js.native
trait RequestOptions extends http.RequestOptions {
  var pfx: js.Any = js.native
  var key: js.Any = js.native
  var passphrase: String = js.native
  var cert: js.Any = js.native
  var ca: js.Any = js.native
  var ciphers: String = js.native
  var rejectUnauthorized: Boolean = js.native
  var secureProtocol: String = js.native
}