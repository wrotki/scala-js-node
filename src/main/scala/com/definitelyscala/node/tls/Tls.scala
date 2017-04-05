package com.definitelyscala.node.tls

import com.definitelyscala.node.crypto
import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("tls")
object Tls extends js.Object {
  // import * as crypto from "crypto";
  // import * as net from "net";
  // import * as stream from "stream";
  var CLIENT_RENEG_LIMIT: Double = js.native
  var CLIENT_RENEG_WINDOW: Double = js.native
  def createServer(options: TlsOptions, secureConnectionListener: js.Function1[ClearTextStream, Unit] = js.native): Server = js.native
  def connect(options: ConnectionOptions, secureConnectionListener: js.Function0[Unit]): ClearTextStream = js.native
  def connect(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): ClearTextStream = js.native
  def connect(port: Double, options: ConnectionOptions = js.native, secureConnectListener: js.Function0[Unit] = js.native): ClearTextStream = js.native
  def createSecurePair(credentials: crypto.Credentials = js.native, isServer: Boolean = js.native, requestCert: Boolean = js.native, rejectUnauthorized: Boolean = js.native): SecurePair = js.native
  def createSecureContext(details: SecureContextOptions): SecureContext = js.native
}
