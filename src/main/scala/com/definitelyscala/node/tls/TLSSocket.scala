package com.definitelyscala.node.tls

import scala.scalajs.js
import com.definitelyscala.node.events.{internal => events}
import com.definitelyscala.node.net
import com.definitelyscala.node.stream.{internal => stream}

@js.native
@js.annotation.JSGlobal("tls.TLSSocket")
class TLSSocket protected () extends stream.Duplex {
  def this(socket: net.Socket, options: js.Any = js.native) = this()
  /**
   * Construct a new tls.TLSSocket object from an existing TCP socket.
   */
  /**
   * Returns the bound address, the address family name and port of the underlying socket as reported by
   * the operating system.
   * @returns {any} - An object with three properties, e.g. { port: 12346, family: 'IPv4', address: '127.0.0.1' }.
   */
  def address(): js.Any = js.native
  /**
   * A boolean that is true if the peer certificate was signed by one of the specified CAs, otherwise false.
   */
  var authorized: Boolean = js.native
  /**
   * The reason why the peer's certificate has not been verified.
   * This property becomes available only when tlsSocket.authorized === false.
   */
  var authorizationError: Error = js.native
  /**
   * Static boolean value, always true.
   * May be used to distinguish TLS sockets from regular ones.
   */
  var encrypted: Boolean = js.native
  /**
   * Returns an object representing the cipher name and the SSL/TLS protocol version of the current connection.
   * @returns {CipherNameAndProtocol} - Returns an object representing the cipher name
   * and the SSL/TLS protocol version of the current connection.
   */
  def getCipher(): CipherNameAndProtocol = js.native
  /**
   * Returns an object representing the peer's certificate.
   * The returned object has some properties corresponding to the field of the certificate.
   * If detailed argument is true the full chain with issuer property will be returned,
   * if false only the top certificate without issuer property.
   * If the peer does not provide a certificate, it returns null or an empty object.
   * @param {boolean} detailed - If true; the full chain with issuer property will be returned.
   * @returns {any} - An object representing the peer's certificate.
   */
  def getPeerCertificate(detailed: Boolean = js.native): js.Any = js.native
  /**
   * Could be used to speed up handshake establishment when reconnecting to the server.
   * @returns {any} - ASN.1 encoded TLS session or undefined if none was negotiated.
   */
  def getSession(): js.Dynamic = js.native
  /**
   * NOTE: Works only with client TLS sockets.
   * Useful only for debugging, for session reuse provide session option to tls.connect().
   * @returns {any} - TLS session ticket or undefined if none was negotiated.
   */
  def getTLSTicket(): js.Dynamic = js.native
  /**
   * The string representation of the local IP address.
   */
  var localAddress: String = js.native
  /**
   * The numeric representation of the local port.
   */
  var localPort: String = js.native
  /**
   * The string representation of the remote IP address.
   * For example, '74.125.127.100' or '2001:4860:a005::68'.
   */
  var remoteAddress: String = js.native
  /**
   * The string representation of the remote IP family. 'IPv4' or 'IPv6'.
   */
  var remoteFamily: String = js.native
  /**
   * The numeric representation of the remote port. For example, 443.
   */
  var remotePort: Double = js.native
  /**
   * Initiate TLS renegotiation process.
   *
   * NOTE: Can be used to request peer's certificate after the secure connection has been established.
   * ANOTHER NOTE: When running as the server, socket will be destroyed with an error after handshakeTimeout timeout.
   * @param {TlsOptions} options - The options may contain the following fields: rejectUnauthorized,
   * requestCert (See tls.createServer() for details).
   * @param {Function} callback - callback(err) will be executed with null as err, once the renegotiation
   * is successfully completed.
   */
  def renegotiate(options: TlsOptions, callback: js.Function1[Error, Any]): js.Dynamic = js.native
  /**
   * Set maximum TLS fragment size (default and maximum value is: 16384, minimum is: 512).
   * Smaller fragment size decreases buffering latency on the client: large fragments are buffered by
   * the TLS layer until the entire fragment is received and its integrity is verified;
   * large fragments can span multiple roundtrips, and their processing can be delayed due to packet
   * loss or reordering. However, smaller fragments add extra TLS framing bytes and CPU overhead,
   * which may decrease overall server throughput.
   * @param {number} size - TLS fragment size (default and maximum value is: 16384, minimum is: 512).
   * @returns {boolean} - Returns true on success, false otherwise.
   */
  def setMaxSendFragment(size: Double): Boolean = js.native
  /**
   * events.EventEmitter
   * 1. OCSPResponse
   * 2. secureConnect
   */
}
