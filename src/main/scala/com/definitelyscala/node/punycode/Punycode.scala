package com.definitelyscala.node.punycode

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("punycode")
object Punycode extends js.Object {
  def decode(string: String): String = js.native
  def encode(string: String): String = js.native
  def toUnicode(domain: String): String = js.native
  def toASCII(domain: String): String = js.native
  var ucs2: ucs2 = js.native
  var version: js.Any = js.native
}