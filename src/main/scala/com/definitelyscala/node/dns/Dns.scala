package com.definitelyscala.node.dns

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("dns")
object Dns extends js.Object {
  def lookup(domain: String, family: Double, callback: js.Function3[Error, String, Double, Unit]): String = js.native
  def lookup(domain: String, callback: js.Function3[Error, String, Double, Unit]): String = js.native
  def resolve(domain: String, rrtype: String, callback: js.Function2[Error, js.Array[String], Unit]): js.Array[String] = js.native
  def resolve(domain: String, callback: js.Function2[Error, js.Array[String], Unit]): js.Array[String] = js.native
  def resolve4(domain: String, callback: js.Function2[Error, js.Array[String], Unit]): js.Array[String] = js.native
  def resolve6(domain: String, callback: js.Function2[Error, js.Array[String], Unit]): js.Array[String] = js.native
  def resolveMx(domain: String, callback: js.Function2[Error, js.Array[MxRecord], Unit]): js.Array[String] = js.native
  def resolveTxt(domain: String, callback: js.Function2[Error, js.Array[String], Unit]): js.Array[String] = js.native
  def resolveSrv(domain: String, callback: js.Function2[Error, js.Array[String], Unit]): js.Array[String] = js.native
  def resolveNs(domain: String, callback: js.Function2[Error, js.Array[String], Unit]): js.Array[String] = js.native
  def resolveCname(domain: String, callback: js.Function2[Error, js.Array[String], Unit]): js.Array[String] = js.native
  def reverse(ip: String, callback: js.Function2[Error, js.Array[String], Unit]): js.Array[String] = js.native
  def setServers(servers: js.Array[String]): Unit = js.native
  //Error codes
  var NODATA: String = js.native
  var FORMERR: String = js.native
  var SERVFAIL: String = js.native
  var NOTFOUND: String = js.native
  var NOTIMP: String = js.native
  var REFUSED: String = js.native
  var BADQUERY: String = js.native
  var BADNAME: String = js.native
  var BADFAMILY: String = js.native
  var BADRESP: String = js.native
  var CONNREFUSED: String = js.native
  var TIMEOUT: String = js.native
  var EOF: String = js.native
  var FILE: String = js.native
  var NOMEM: String = js.native
  var DESTRUCTION: String = js.native
  var BADSTR: String = js.native
  var BADFLAGS: String = js.native
  var NONAME: String = js.native
  var BADHINTS: String = js.native
  var NOTINITIALIZED: String = js.native
  var LOADIPHLPAPI: String = js.native
  var ADDRGETNETWORKPARAMS: String = js.native
  var CANCELLED: String = js.native
}