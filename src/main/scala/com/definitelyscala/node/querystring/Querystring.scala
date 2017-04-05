package com.definitelyscala.node.querystring

import scala.scalajs.js
@js.native
@js.annotation.JSGlobal("querystring")
object Querystring extends js.Object {
  def stringify[T](obj: T, sep: String = js.native, eq: String = js.native, options: StringifyOptions = js.native): String = js.native
  def parse(str: String, sep: String, eq: String, options: ParseOptions): js.Dynamic = js.native
  def parse[T](str: String, sep: String = js.native, eq: String = js.native, options: ParseOptions = js.native): T = js.native
  def escape(str: String): String = js.native
  def unescape(str: String): String = js.native
}
