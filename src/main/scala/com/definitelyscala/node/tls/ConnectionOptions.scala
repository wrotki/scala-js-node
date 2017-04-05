package com.definitelyscala.node.tls

import scala.scalajs.js
import com.definitelyscala.node.Buffer
import com.definitelyscala.node.net
import scala.scalajs.js.|

@js.native
trait ConnectionOptions extends js.Object {
  var host: String = js.native
  var port: Double = js.native
  var socket: net.Socket = js.native
  var pfx: String | Buffer = js.native
  var key: String | js.Array[String] | Buffer | js.Array[Buffer] = js.native
  var passphrase: String = js.native
  var cert: String | js.Array[String] | Buffer | js.Array[Buffer] = js.native
  var ca: String | Buffer | js.Array[String | Buffer] = js.native
  var rejectUnauthorized: Boolean = js.native
  var NPNProtocols: js.Array[String | Buffer] = js.native
  var servername: String = js.native
  var path: String = js.native
  var ALPNProtocols: js.Array[String | Buffer] = js.native
  var checkServerIdentity: js.Function2[String, String | Buffer | js.Array[String | Buffer], Any] = js.native
  var secureProtocol: String = js.native
  var secureContext: Object = js.native
  var session: Buffer = js.native
  var minDHSize: Double = js.native
}